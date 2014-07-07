/**
 * 
 */
package br.com.dbsoft.util;

import org.junit.Test;

/**
 * @author Avila
 *
 */
public class TstCNPJCPF {

	String[] wLista = {"2964142000102",
						"7142852000162",
						"7341692000180",
						"36348092000142",
						"9513228000150",
						"7377136000164",
						"5209294000180",
						"20763801000116",
						"33694225000144",
						"83794925000189",
						"60745445000122",
						"758473000152",
						"5690064000185",
						"74190505000100",
						"5152318000101",
						"5060765000130",
						"62030762000198",
						"1290319000161",
						"9327035000104",
						"52572500000100",
						"1745292000154",
						"117918000115",
						"4310873000151",
						"849785000171",
						"51652493000185",
						"6017215000100",
						"12588182000142",
						"59036442000130",
						"4147095000121",
						"5997917000126",
						"31602428000138",
						"9139788000196",
						"3208310000194",
						"2053531000178",
						"7794284000184",
						"8775948000120",
						"6958674000180",
						"1359582000160",
						"51901437000137",
						"64184922000189",
						"2057035000192",
						"13069281000180",
						"7037795000151",
						"61205639000106",
						"12025090000154",
						"38050282000104",
						"2163575000150",
						"11254307000135",
						"3050502000115",
						"52350063000171",
						"2691997000107",
						"42165506000109",
						"41396359000107",
						"298818000132",
						"52386935000151",
						"63806830000120",
						"2956745000154",
						"42185769000171",
						"10636276000114",
						"29740255000172",
						"27281229000106",
						"23626575000110",
						"13807525000185",
						"16888455000125",
						"81617821000173",
						"14754093000154",
						"4867918000193",
						"89043483000115",
						"6337379000106",
						"34570556000135",
						"67634717000166",
						"26230862000102",
						"27243377000128",
						"92236215000124",
						"210471000124",
						"5471124000179",
						"2528637000180",
						"93317394000197",
						"40184046000122",
						"4709400000121",
						"54276936000179",
						"3559971000164",
						"10583758000153",
						"14381952000107",
						"47174537000131",
						"40262602000131",
						"1972741000105",
						"6096033000163",
						"62650403000133",
						"10893640000121",
						"5453629000100",
						"10756648000146",
						"2248211000173",
						"4232645000100",
						"24519787000160",
						"3243327000182",
						"17275579000106",
						"10686276000129",
						"90089921000165",
						"9631256000171",
						"38756912000160",
						"4872241000181",
						"15417635000166",
						"5452311000105",
						"89859466000150",
						"73236135000124",
						"9286707000180",
						"73727240000166",
						"7757896000105",
						"11773314000143",
						"12954848000139",
						"23562663000103",
						"3061922000105",
						"5957002000197",
						"51703924000195",
						"4253002000143",
						"6069388000163",
						"2434062000137",
						"7941643000189",
						"26678045000103",
						"61885190000166",
						"78681202000133",
						"93246528000126",
						"73676892000119",
						"49928567000111",
						"3529911000107",
						"93753580000179",
						"11245719000109",
						"11501707000106",
						"35811702000130",
						"4949981000179",
						"5858335000169",
						"782585000149",
						"9143363000150",
						"4197975000102",
						"65136863000136",
						"61366936000125",
						"47207295000135",
						"61066114000129",
						"13026685000197",
						"87924072000103",
						"11243822000110",
						"4938537000158",
						"10878062000154",
						"69105187000194",
						"12354051000109",
						"17508672000105",
						"24417669000141",
						"3378368000186",
						"1082728000172",
						"16549480000184",
						"2248213000162",
						"622637000110",
						"47204755000171",
						"23530637000195",
						"9756479000165",
						"2971670000180",
						"10448113000108",
						"7172892000157",
						"3423123000123",
						"5852458000192",
						"10830108000165",
						"1144394000114",
						"73436776000122",
						"35467968000107",
						"29417029000155",
						"14989448000194",
						"89554406000120",
						"10892343000161",
						"181183000199",
						"61065819000121",
						"42170852000177",
						"10693082000150",
						"7187085000108",
						"60881356000103",
						"29184207000145",
						"4899444000161",
						"97259600000100",
						"54933015000131",
						"24927253000173",
						"6114269000185",
						"59587063000139",
						"2206009000189",
						"655530000178",
						"8546472000156",
						"6068916000160",
						"4207191000118",
						"1218260000109",
						"89324610000154",
						"57755217000129",
						"600000000122",
						"1406419000100",
						"2924681000100",
						"7715528000196",
						"9094918000111",
						"42360339000149",
						"477796000178",
						"15305400000182",
						"3654002000192",
						"2385694000158",
						"93921393000157",
						"7851372000170",
						"2122443000180",
						"782587000138",
						"1043217000141",
						"3106656000181",
						"33179672000165",
						"1412412000100",
						"5416895000163",
						"13098174000180",
						"4618109000148",
						"62657242000100",
						"23852734000102",
						"34622217000155",
						"5502678000196",
						"2878522000116",
						"34167056000157",
						"7996655000100",
						"79370466000139",
						"5941268000141",
						"558913000128",
						"49939978000102",
						"7326840000198",
						"3805426000100",
						"3606521000185",
						"78583788000101",
						"47860515000125",
						"8469157000172",
						"3324816000169",
						"9356626000100",
						"15656807000154",
						"4167310000156",
						"7243427000160",
						"4217271000154",
						"3191208000123",
						"7048269000197",
						"2159736000132",
						"60525706000107",
						"81144818000180",
						"68323807000107",
						"1893309000110",
						"13505864000107",
						"115909000195",
						"12018605000199",
						"8020203000151",
						"7979533000106",
						"7945703000131",
						"5566854000153",
						"47194915000149",
						"92838150000197",
						"24059941000169",
						"64920416000100",
						"8347086000135",
						"1678460000136",
						"79366092000188",
						"59941765000179",
						"1530634000119",
						"7273753000110",
						"3912825000170",
						"65082513000134",
						"17171307000158",
						"12446321000101",
						"6951205000139",
						"67185280000120",
						"7435254000181",
						"2694572000143",
						"1100324000164",
						"68720242000193",
						"12085383000127",
						"5992740000175",
						"223215000171",
						"7022386000181",
						"3604238000114",
						"3352227000194",
						"52354131000170",
						"1681852000154",
						"41968512000123",
						"10292352000111",
						"58799685000168",
						"4345863000151",
						"67643825000103",
						"37465705000194",
						"7796259000130",
						"61562112000120",
						"7033317000173",
						"7139040000168",
						"4102908000167",
						"2924087000119",
						"3033599000158",
						"4404879000198",
						"1591859000185",
						"38725438000100",
						"32646846000190",
						"5465151000139",
						"5374096000171",
						"3337066000160",
						"2510250000105",
						"6997348000181",
						"5341241000118",
						"62469028000120",
						"64039860000111",
						"2063967000148",
						"4228455000110",
						"93662047000100",
						"7679313000167",
						"77998276000135",
						"2082194000147",
						"35330125000164",
						"12110347000176",
						"74006719000176",
						"12360506000190",
						"16188609000176",
						"97264493000109",
						"9253880000182",
						"90987942000106",
						"32267866000150",
						"81140576000156",
						"62641535000107",
						"1710008000104",
						"2398578000173",
						"50332527000191",
						"71753164000138",
						"72557549000192",
						"7326762000121",
						"5995487000103",
						"18692848000194",
						"3656477000118",
						"3156926000169",
						"1350715000137",
						"9285766000134",
						"7791963000108",
						"10322794000163",
						"1420601000116",
						"3566241000190",
						"66865544000124",
						"38726261000166",
						"1538850000100",
						"60902798000199",
						"16641095000162",
						"1489065000105",
						"4854084000181",
						"2009021000101",
						"37992922000132",
						"230515000188",
						"11801292000188",
						"4816686000144",
						"2796387000160",
						"13976330000169",
						"17327388000132",
						"63376180000120",
						"53825600000155",
						"95285417000154",
						"6374826000105",
						"83280859000129",
						"1343033000105",
						"72341407000193",
						"61411393000110",
						"42465302000185",
						"3192193000118",
						"51647410000160"};
	
	@Test
	public void test_CNPJ() {
		int xAUX = 0;
		for (String xCNPJ : wLista) {
			boolean xOK = DBSCNPJCPF.validarCPFCNPJ(xCNPJ);
			if (!xOK) {
				System.out.println("CNPJ " + xCNPJ + " invalido.");
				xAUX++;
			}
		}
		System.out.println("Numero de CNPJs invalidos: " + xAUX);
	}
	
	@Test
	public void teste_Duplicados() {
		int xAUX = 0;
		for (int xI = 0; xI < wLista.length; xI++) {
			String xCNPJ = wLista[xI];
			for (int xI2 = 0; xI2 < wLista.length; xI2++) {
				if (xCNPJ.equals(wLista[xI2]) && xI != xI2) {
					System.out.println("CNPJ duplicado: " + xCNPJ);
					xAUX++;
				}
			}
		}
		System.out.println("Numero de CNPJs duplicados: " + xAUX);
	}

}