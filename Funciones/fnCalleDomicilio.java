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

import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();



   String responseBody = "";
String codigo=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("50fnCalleDomicilio")).get("codigo"));


String direccion = "https://api.aysam.com.ar/test/sayges/v1/calles_domicilio?p_dep_codigo=";

        direccion = direccion + codigo;


HttpResponse response = Unirest.get(direccion)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .asJson();


         	responseBody = response.getBody().toString(); 
         
         
			
            	JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			
			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);
			
		




((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return24map",mapa);