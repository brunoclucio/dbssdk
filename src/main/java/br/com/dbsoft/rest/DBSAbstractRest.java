package br.com.dbsoft.rest;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import br.com.dbsoft.message.IDBSMessages;
import br.com.dbsoft.rest.dados.DadosRestError;
import br.com.dbsoft.rest.interfaces.IIncludeAtivo;
import br.com.dbsoft.rest.interfaces.IRestError;
import br.com.dbsoft.rest.interfaces.ISearchControl;
import br.com.dbsoft.util.DBSNumber;
import br.com.dbsoft.util.DBSObject;
import br.com.dbsoft.util.DBSString;

public abstract class DBSAbstractRest {

	//METODOS PROTEGIDOS ====================================================================
	/**
	 * Preenche os campos de Paginação e Pesquisa da Interface (ISearchControl) 
	 * através dos parametros recebidos na requisição
	 * 
	 * @param pParams Parametros da Requisição
	 * @param pFilterSearchControl Interface que extende o ISearchControl
	 */
	protected void prToFilterSearchControl(MultivaluedMap<String, String> pParams, ISearchControl pFilterSearchControl) {
		//SearchControl - Sort (Ordenação)
		String xSort = DBSString.toString(pParams.getFirst("sort"), null);
		if (!DBSObject.isEmpty(xSort)) {
			pFilterSearchControl.setSort(xSort);
		}
		//SearchControl - Page (Numero da página)
		Integer xPage = DBSNumber.toInteger(pParams.getFirst("page"), null);
		if (!DBSObject.isNull(xPage)) {
			pFilterSearchControl.setPage(xPage);
		}
		//SearchControl - Offset (Inicio da pesquisa)
		Integer xOffset = DBSNumber.toInteger(pParams.getFirst("offset"), null);
		if (!DBSObject.isNull(xOffset)) {
			pFilterSearchControl.setOffset(xOffset);
		}
		//SearchControl - Size (Número de itens por página)
		Integer xSize = DBSNumber.toInteger(pParams.getFirst("size"), null);
		if (!DBSObject.isNull(xSize)) {
			pFilterSearchControl.setSize(xSize);
		}
	}
	
	protected void prToFilterIncludeAtivo(MultivaluedMap<String, String> pParam, IIncludeAtivo pFilter) {
		String xInclude = DBSString.toString(pParam.getFirst("include"));
		if (DBSObject.isEqual(xInclude, "ativo")) {
			pFilter.setIncludeAtivo(true);
		}		
	}
	
	/**
	 * Cria um Response padrão com StatusCode HTTP, os dados e lista de mensagens.
	 * @param pStatusCode
	 * @param pData
	 * @param pErrors
	 * @return
	 */
	protected Response prGetResponse(int pStatusCode, IDBSMessages pErrors, Object pData) {
		return prGetResponse(pStatusCode, pErrors, pData, null, null, null);
	}
	
	/**
	 * Cria um Response padrão com StatusCode HTTP, os dados, lista de mensagens e links de paginação.
	 * @param pStatusCode
	 * @param pData
	 * @param pErrors
	 * @param pPages
	 * @return
	 */
	protected Response prGetResponse(int pStatusCode, IDBSMessages pErrors, Object pData, Map<String, String> pPages) {
		return prGetResponse(pStatusCode, pErrors, pData, pPages, null, null);
	}
	
	/**
	 * Cria um Response padrão com StatusCode HTTP, os dados, lista de mensagens, links de paginação e MetaDados.
	 * @param pStatusCode
	 * @param pData
	 * @param pErrors
	 * @param pPages
	 * @param pMetaData
	 * @return
	 */
	protected Response prGetResponse(int pStatusCode, IDBSMessages pErrors, Object pData, Map<String, String> pPages, Map<String, Object> pMetaData) {
		return prGetResponse(pStatusCode, pErrors, pData, pPages, pMetaData, null);
	}
	
	/**
	 * Cria um Response padrão com StatusCode HTTP, os dados, lista de mensagens, links de paginação, MetaDados e Cabeçalhos extras.
	 * @param pStatusCode
	 * @param pData
	 * @param pErrors
	 * @param pPages
	 * @param pMetaData
	 * @param pExtraHeaders
	 * @return
	 */
	protected Response prGetResponse(int pStatusCode, IDBSMessages pErrors, Object pData, Map<String, String> pPages, Map<String, Object> pMetaData, Map<String, String> pExtraHeaders) {
		DBSRestReturn<Object> xRetorno = null;

		//Se o Código HTTP for 204 - No Content, não adiciona o corpo na resposta
		if (DBSObject.isEqual(pStatusCode, HttpServletResponse.SC_NO_CONTENT)) {
			xRetorno = null;
		//Se houver dados
		} else if (!DBSObject.isNull(pData)) {
			xRetorno = new DBSRestReturn<Object>(pData, null, pPages, pMetaData);
		//Se houver erros
		} else if (!DBSObject.isEmpty(pErrors)) {
			IRestError xRestError = new DadosRestError();
			xRestError.setCode(pErrors.getCurrentMessage().getMessageCode());
			xRestError.setText(pErrors.getCurrentMessage().getMessageText());
//			xRestError.setStack(pErrors.getListMessageBase());
			xRestError.setStatusCode(pStatusCode);
			xRetorno = new DBSRestReturn<Object>(null, xRestError);
		}
		
		//Cria a resposta
		Response xResponse = Response
				.status(pStatusCode)
				.entity(xRetorno)
				.type(MediaType.APPLICATION_JSON)
				.build();
		
		//Adiciona os Headers extras
		if (!DBSObject.isNull(pExtraHeaders)) {
			for (Map.Entry<String, String> xHeader : pExtraHeaders.entrySet()) {
				xResponse.getHeaders().add(xHeader.getKey(), xHeader.getValue());
			}
		}
		return xResponse;
	}
}