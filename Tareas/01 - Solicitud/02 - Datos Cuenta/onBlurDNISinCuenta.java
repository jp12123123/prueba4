import org.zkoss.zul.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelos.builder.componentes.*;


ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");

String value = comp_TXT_DNIPersona.getValue().trim();
if(value.equals("") || value.equals(null) ){
    comp_TXT_DNIPersona.setValue("-");
}

String patronOrden = "[0-9]{8}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
String orden = comp_TXT_DNIPersona.getValue(); // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
Pattern patternOrden = Pattern.compile(patronOrden);//modificar nombre
Matcher matcherOrden = patternOrden.matcher(orden);//modificar nombre


if(comp_TXT_DNIPersona.getValue().trim().equals("-")){
    
}else if(comp_CMB_persona.getValue().trim().equals("Física")){
    if(!matcherOrden.matches()){
        Messagebox.show("Por favor, ingrese los ocho dígitos del DNI","Advertencia",null,null,null);
    }
}
