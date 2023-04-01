import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Textbox comp_TXT_matriculaTomoCut=(Textbox) sup.getInstanciaComponente("comp_TXT_matriculaTomoCut");
String patronOrden = "[\\w]{1,10}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
String orden = comp_TXT_matriculaTomoCut.getValue(); // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
Pattern patternOrden = Pattern.compile(patronOrden);//modificar nombre
Matcher matcherOrden = patternOrden.matcher(orden);//modificar nombre

if(!matcherOrden.matches()){
	

	Messagebox.show("Por favor, ingrese el Matricula/Tomo correctamente","Advertencia",null,null,null);
}



