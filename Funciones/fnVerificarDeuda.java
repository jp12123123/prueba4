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

ModeloComponente sup = new ModeloComponente();

String id_cut=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("57fnVerificaDeuda")).get("id_cut"));

        HttpResponse response = Unirest.post("https://api.aysam.com.ar/test/sayges/v1/verificar_deuda?P_ID_CUT="+id_cut+"&P_CODIGO&P_MENSAJE")
        .asJson();

String  responseBody = response.getBody().toString();

JSONParser parser = new JSONParser();
            
            JSONObject map = (JSONObject) parser.parse(responseBody);

            ObjectMapper jsonObj = new ObjectMapper();
            Map mapa = new java.util.HashMap();

            mapa = jsonObj.readValue(responseBody, HashMap.class);

((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return38mapa",mapa);