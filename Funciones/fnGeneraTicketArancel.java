import org.zkoss.zul.*;
import Java.io.*;
import Java.net.*;
import Java.util.*;
import java.util.Base64;
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

ModeloComponente sup = new ModeloComponente();

String responseBody = "";

String Nro_Cuenta=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Nro_Cuenta"));
String Nro_CLI_ID=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Nro_CLI_ID"));
String Nro_Escribano=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Nro_Escribano"));
String Id_Tramite=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Id_Tramite"));
String Id_Zona=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Id_Zona"));
String Observaciones=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("Observaciones"));
String domicilio=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("52fnGeneraTicketArancel")).get("domicilio"));

//Messagebox.show(domicilio);

String domicilioC = Base64.getEncoder().encodeToString(domicilio.getBytes()); 
String ObservacionesC = Base64.getEncoder().encodeToString(Observaciones.getBytes());

//Messagebox.show(domicilioC);

String direccion = "https://api.aysam.com.ar/test/sayges/v1/genera_tramite_ticket_arancel?P_CUENTA="+Nro_Cuenta+"&P_CLI_ID="+ Nro_CLI_ID +"&P_ARE_ID="+Id_Zona+"&P_TTM_CODIGO="+Id_Tramite+"&P_MES_ID="+Nro_Escribano+"&P_OBSERVACIONES="+ObservacionesC+"&P_DOM_INMUEBLE="+domicilioC+"&P_NRO_TICKET&P_NUMERO&P_OBL_ID";


    HttpResponse response = Unirest.post(direccion).asJson();

         	responseBody = response.getBody().toString(); 
			
            JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);		

((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return26mapa",mapa);