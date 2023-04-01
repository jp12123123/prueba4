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
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.xml.ws.Response;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Request;

import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

String id_cut=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("56fnGrabaCUT")).get("id_cut"));

    //UnirestInstance unirest = Unirest.primaryInstance();

	//UnirestInstance unirest = Unirest.primaryInstance();
	
	            /*    UnirestInstance unirest = Unirest.primaryInstance();
                    //unirest.config().connectTimeout(500000);


        HttpResponse response = unirest.post("http://10.10.0.111:8085/ords/manantial/TDigitalApis/graba_cut?P_ID_CUT="+id_cut+"&P_CODIGO&P_MENSAJE")
        .asJson();

String  responseBody = response.getBody().toString();

JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);*/

ModeloComponente sup = new ModeloComponente();
OkHttpClient client = new OkHttpClient().newBuilder()
    .connectTimeout(240, TimeUnit.SECONDS)
    .writeTimeout(240, TimeUnit.SECONDS)
    .readTimeout(240, TimeUnit.SECONDS)
    .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
    .url("https://api.aysam.com.ar/test/sayges/v1/graba_cut?P_ID_CUT="+id_cut+"&P_CODIGO&P_MENSAJE")
    .method("POST", body)
    .build();

okhttp3.Response response = client.newCall(request).execute();
//Messagebox.show(response.body().string());

String  responseBody = response.body().string();

JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);

((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return39mapa",mapa);