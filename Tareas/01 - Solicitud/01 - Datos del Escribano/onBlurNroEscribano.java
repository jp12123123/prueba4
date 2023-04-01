import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


import java.util.regex.Matcher;
import java.util.regex.Pattern;

Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Textbox comp_TXT_nombreEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreEscribano");
Textbox comp_TXT_apellidoEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoEscribano");
Textbox comp_TXT_domicilioEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioEscribano");
Textbox comp_TXT_idEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_idEscribano");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

//Variables

String patronOrden = "[0-9]{5}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
String orden = comp_TXT_numeroRegistro.getValue(); // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
Pattern patternOrden = Pattern.compile(patronOrden);//modificar nombre
Matcher matcherOrden = patternOrden.matcher(orden);//modificar nombre


if(!matcherOrden.matches()){
    Messagebox.show("Por favor introduzca los 5 dígitos del registro del escribano.","Advertencia",null,null,null);
    comp_TXT_numeroRegistro.setValue("-");
    comp_TXT_nombreEscribano.setValue("-");
    comp_TXT_apellidoEscribano.setValue("-");
    comp_TXT_domicilioEscribano.setValue("-");
    comp_TXT_idEscribano.setValue("-");
    comp_TXT_emailEscribano.setValue("-");
}else{
        try {
            
        
        java.util.List parametrosfnRegistroEscribano = new java.util.ArrayList();
        parametrosfnRegistroEscribano.add(comp_TXT_numeroRegistro.getValue().trim()); //escribano / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnRegistroEscribano",parametrosfnRegistroEscribano);
        Map return17mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return17mapa");

            if(return17mapa.get("items").size()==0){
            	Messagebox.show("Por favor, introduzca un número de registro valido.","Advertencia",null,null,null);  
                comp_TXT_numeroRegistro.setValue("-");
                comp_TXT_nombreEscribano.setValue("-");
                comp_TXT_apellidoEscribano.setValue("-");
                comp_TXT_domicilioEscribano.setValue("-");
                comp_TXT_idEscribano.setValue("-");
                comp_TXT_emailEscribano.setValue("-");  
            }else{
                
                       
                String apellido = return17mapa.get("items").get(0).get("mes_apellido");
                String nombre = return17mapa.get("items").get(0).get("mes_nombre");
                String domicilio = return17mapa.get("items").get(0).get("mes_domicilio");
                String id = return17mapa.get("items").get(0).get("mes_id");

                String email = return17mapa.get("items").get(0).get("mes_email");

                if(email==null || email==""){
                    
                }else{
                    comp_TXT_emailEscribano.setValue(email);
                }

                if(apellido==null || apellido=="" || nombre==null || nombre=="" || domicilio==null || domicilio=="" || id==null || id==""){
                    Messagebox.show("Datos incompletos, por favor comunicarse con el Área Técnica","Advertencia",null,null,null);
                }

                comp_TXT_nombreEscribano.setValue(nombre);
                comp_TXT_apellidoEscribano.setValue(apellido);
                comp_TXT_domicilioEscribano.setValue(domicilio);
                comp_TXT_idEscribano.setValue(id);
                
                
			}

        } catch (Exception e) {
            Messagebox.show("Servicio no disponible por el momento. Por favor intente mas tarde.","Advertencia",null,null,null);
            comp_TXT_nombreEscribano.setValue("-");
            comp_TXT_apellidoEscribano.setValue("-");
            comp_TXT_domicilioEscribano.setValue("-");
            comp_TXT_idEscribano.setValue("-");
            comp_TXT_emailEscribano.setValue("-");
        }
    
}