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
import kong.unirest.*;
import java.io.*;

import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

String type_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("55fnAltaCliente")).get("type_cli"));
String dnicuit_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("55fnAltaCliente")).get("dnicuit_cli"));
String nombre_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("55fnAltaCliente")).get("nombre_cli"));
String id_Escribano=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("55fnAltaCliente")).get("id_Escribano"));



HttpResponse response = Unirest.post("https://api.aysam.com.ar/test/sayges/v1/alta_cliente?P_CLI_TYPE="+type_cli+"&P_DNICUIT="+dnicuit_cli+"&P_NOMBRE="+nombre_cli+"&P_MES_ID="+id_Escribano+"&P_CODIGO&P_MENSAJE")
                    //.header("Accept", "application/json")
                    //.header("Content-Type", "application/json")
                    .asJson();

String  responseBody = response.getBody().toString();


         
         
			
            	JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			
			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);
			
		
((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return33mapa",mapa);



