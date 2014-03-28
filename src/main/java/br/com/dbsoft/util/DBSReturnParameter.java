package br.com.dbsoft.util;

/**
 * Artifício para enviar e retornar valor como parametro.
 * @author ricardo.villar
 *
 */
public class DBSReturnParameter {

	private Object wValue = null;
	
	public DBSReturnParameter() {}
	
	public DBSReturnParameter(Object pObject) {
		wValue = pObject;
	}
	public Object getValue() {
		return wValue;
	}
	public void setValue(Object pValue) {
		wValue = pValue;
	}
}
