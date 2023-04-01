import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;

ModeloComponente sup = new ModeloComponente();
//TEXTBOX DEL CONTENEDOR CONT_DATOSCUENTA
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");

Div dis_domicilioFisicoUbicacionSC=(Div) sup.getInstanciaComponente("dis_domicilioFisicoUbicacionSC");
Div dis_departamentoFisicoSC=(Div) sup.getInstanciaComponente("dis_departamentoFisicoSC");
Div dis_calleFisicoSC=(Div) sup.getInstanciaComponente("dis_calleFisicoSC");
Div dis_manzanaFisicoSC=(Div) sup.getInstanciaComponente("dis_manzanaFisicoSC");
Div dis_EdificioSC=(Div) sup.getInstanciaComponente("dis_EdificioSC");
Div dis_UnidadSC=(Div) sup.getInstanciaComponente("dis_UnidadSC");
Div dis_cpFisicoSC=(Div) sup.getInstanciaComponente("dis_cpFisicoSC");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");


String nombre = comp_TXT_nombrePersonaNO.getValue().trim();
nombre = nombre.toUpperCase();
comp_TXT_nombrePersonaNO.setValue(nombre);



//Reviso que si el nombre principal este vacío, cargue un guion
if(comp_TXT_nombrePersonaNO.getValue().trim().equals(null) || comp_TXT_nombrePersonaNO.getValue().trim().equals("")){
    comp_TXT_nombrePersonaNO.setValue("-");
    
}

//validacion por letra
String patronletras ="[A-Za-z]{3,10}"; //a-z minusculas A-Z Mayusculas
String let = comp_TXT_nombrePersonaNO.getValue();
Pattern patternLET = Pattern.compile(patronletras);
Matcher matcherLET = patternLET.matcher(let);


if(!matcherLET.matches() && !let.equals("-")){
    Messagebox.show("Ingrese un Nombre valido","Advertencia", null, null, null);
    comp_TXT_nombrePersonaNO.setValue("-");
     
}
