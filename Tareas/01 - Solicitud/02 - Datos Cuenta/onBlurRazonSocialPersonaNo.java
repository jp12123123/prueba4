import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;

ModeloComponente sup = new ModeloComponente();

//TEXTBOX DEL CONTENEDOR CONT_DATOSCUENTA
Textbox comp_TXT_razonSocialPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_razonSocialPersonaNO");

String razon = comp_TXT_razonSocialPersonaNO.getValue().trim();
razon = razon.toUpperCase();
comp_TXT_razonSocialPersonaNO.setValue(razon);

//Reviso que si la razon social  este vacío, cargue un guion
if(comp_TXT_razonSocialPersonaNO.getValue().trim().equals(null) || comp_TXT_razonSocialPersonaNO.getValue().trim().equals("")){
    comp_TXT_razonSocialPersonaNO.setValue("-");
}

//validacion por letra
String patronletras ="[A-Za-z]{3,30}"; //a-z minusculas A-Z Mayusculas
String let = comp_TXT_razonSocialPersonaNO.getValue();
Pattern patternLET = Pattern.compile(patronletras);
Matcher matcherLET = patternLET.matcher(let);


if(!matcherLET.matches() && !let.equals("-")){
    Messagebox.show("Ingrese una Razon Social valida","Advertencia", null, null, null);
   comp_TXT_razonSocialPersonaNO.setValue("-");
}
