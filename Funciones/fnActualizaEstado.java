import org.zkoss.zul.*;
import Java.io.*;
import Java.net.*;
import Java.util.*;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
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
import kong.unirest.*;
import java.io.*;

import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


String Nro_Tramite=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("53fnActualizaEstado")).get("Nro_Tramite"));

String Nro_Estado=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("53fnActualizaEstado")).get("Nro_Estado"));


String numero_Cuenta=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("53fnActualizaEstado")).get("numero_Cuenta"));

String P_USR_MOD=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("53fnActualizaEstado")).get("P_USR_MOD"));

String direccion = "https://api.aysam.com.ar/test/sayges/v1/actualiza_estado?NRO_TRAMITE="+Nro_Tramite+"&NUEVO_ESTADO="+Nro_Estado;

direccion = "https://api.aysam.com.ar/test/sayges/v1/actualiza_estado?P_CUENTA="+numero_Cuenta+"&P_NUMERO="+Nro_Tramite+"&P_ESTADO="+Nro_Estado+"&P_USR_MOD="+P_USR_MOD+"&CODIGO&MENSAJE";

HttpResponse response = Unirest.put(direccion)
                   // .header("Accept", "application/json")
                   // .header("Content-Type", "application/json")
                    .asJson();


String  responseBody = response.getBody().toString();



            	JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			
			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);
			




((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return31mapa",mapa);




