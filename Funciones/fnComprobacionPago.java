import org.zkoss.zul.*;
import Java.io.*;
import Java.net.*;
import Java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jackson.map.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import org.zkoss.zul.*;
import org.zkoss.zk.ui.util.Clients;
import java.io.File;
import java.io.IOException;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import modelos.builder.componentes.*;

import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


String OBL_ID=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("54fnComprobacionPago")).get("OBL_ID"));

 String responseBody = "";
String direccion = "https://api.aysam.com.ar/test/sayges/v1/comprobacion_pago?p_obl_id="+OBL_ID;
//HttpResponse response = Unirest.post("http://10.10.0.111:8085/ords/manantial/TDigitalApis/genera_tramite_ticket_arancel?P_CUENTA=08000021560001&P_CLI_ID=&P_ARE_ID=326&P_TTM_CODIGO=1&P_MES_ID=99&P_OBSERVACIONES=Prueba%20alta%20de%20tr%C3%A1mite%20POSTMAN&P_NRO_TICKET&P_NUMERO&P_OBL_ID").asString();

        


HttpResponse response = Unirest.get(direccion)
                    /*.header("Accept", "application/json")
                    .header("Content-Type", "application/json")
    				.header("Transfer-Encoding","chunked")*/
                    .asJson();


         	responseBody = response.getBody().toString(); 
         
         
			
            	JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			
			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);
			
		



((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return32map",mapa);