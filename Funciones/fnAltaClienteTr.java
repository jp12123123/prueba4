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

String type_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("type_cli"));
String dni_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("dni_cli"));
String nombre_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("nombre_cli"));
String apellido_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("apellido_cli"));
String razon_social_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("razon_social_cli"));
String tre_codigo_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("tre_codigo_cli"));
String cuit_cli=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("cuit_cli"));
String mes_id=(String)(((java.util.Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("59fnAltaClienteTr")).get("mes_id"));

ModeloComponente sup = new ModeloComponente();
OkHttpClient client = new OkHttpClient().newBuilder()
    .connectTimeout(240, TimeUnit.SECONDS)
    .writeTimeout(240, TimeUnit.SECONDS)
    .readTimeout(240, TimeUnit.SECONDS)
    .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
    .url("https://api.aysam.com.ar/test/sayges/v1/alta_cliente_v14?P_CLI_TYPE="+type_cli+"&P_DNI="+dni_cli+"&P_CUIT="+cuit_cli+"&P_APELLIDO="+apellido_cli+"&P_NOMBRE="+nombre_cli+"&P_RAZON_SOCIAL="+razon_social_cli+"&P_MES_ID="+mes_id+"&P_TRE_CODIGO="+tre_codigo_cli+"&P_CODIGO&P_MENSAJE")
    .method("POST", body)
    .build();

okhttp3.Response response = client.newCall(request).execute();

String  responseBody = response.body().string();

JSONParser parser = new JSONParser();
			
			JSONObject map = (JSONObject) parser.parse(responseBody);

			ObjectMapper jsonObj = new ObjectMapper();
			Map mapa = new java.util.HashMap();

			mapa = jsonObj.readValue(responseBody, HashMap.class);

((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).setAttribute("return34mapa",mapa);