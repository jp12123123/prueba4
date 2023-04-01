import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;


ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");

//Reviso que si el nombre principal este vacío, cargue un guion
if(comp_TXT_nombreCuenta.getValue().trim().equals(null) || comp_TXT_nombreCuenta.getValue().trim().equals("")){
    comp_TXT_nombreCuenta.setValue("-");
    
}

//validacion por letra
String patronletras ="[A-Za-z]{3,10}"; //a-z minusculas A-Z Mayusculas
String let = comp_TXT_nombreCuenta.getValue();
Pattern patternLET = Pattern.compile(patronletras);
Matcher matcherLET = patternLET.matcher(let);


if(!matcherLET.matches() && !let.equals("-")){
    Messagebox.show("Ingrese un Nombre valido","Advertencia", null, null, null);
    comp_TXT_nombreCuenta.setValue("-");
     
}
