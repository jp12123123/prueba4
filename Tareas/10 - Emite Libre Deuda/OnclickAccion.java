import org.zkoss.zul.*;
import modelos.builder.componentes.*;

import java.util.logging.Level;
import java.util.logging.Logger;

ModeloComponente sup = new ModeloComponente();

Checkbox comp_CHK_Tramite1o2=(Checkbox) sup.getInstanciaComponente("comp_CHK_Tramite1o2");
Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos"); 
Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

//Declarar variables
Boolean iniciador = false;
Boolean adirecta = false;

beans.session.BeanUser1 beanSe = (beans.session.BeanUser1) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");


boolean InformeCertificado= false;
String tipoAdjunto="";

for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

        
   		tipoAdjunto = li.getChildren().get(6).getLabel().trim();
    
    	if(tipoAdjunto.equals("Libre Deuda")){
            InformeCertificado =true;
        }
    	
}

// Comprobar a donde va
if(comp_CHK_Tramite1o2.isChecked())
{
    iniciador = true;
    adirecta = false;
}
else
{
    iniciador = false;
    adirecta = true;
}

//if(!InformeCertificado){
    //Messagebox.show("Por favor adjunte el Libre Deuda","Advertencia",null,null,null);
//}else{
    if(comp_CHK_Tramite1o2.isChecked()){
    		Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

       		Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
        	String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");

          	java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
                    parametrosmardarNotificacion.add("Observa"); //asunto / String
                    parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico); //mensaje / String
                    parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
                    parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
                    parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue()); //to / String
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);
        
        
        String numeroCuenta ="";

        if(comp_CHK_tieneCuentaSi.isChecked()){
            numeroCuenta = comp_TXT_nroTramite.getValue();
        }else{
            numeroCuenta = comp_TXT_cli_id.getValue();
        }




        try{
            java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                parametrosfnActualizaEstado.add("3"); //Nro_Estado / String
                parametrosfnActualizaEstado.add(numeroCuenta); //numero_Cuenta / String
                parametrosfnActualizaEstado.add(beanSe.getLogin()); //P_USR_MOD / String
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
            Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
        } catch (Exception ex) {
            Messagebox.show("Web Service Actualiza Estado no esta disponible en este momento","Advertencia",null,null,null);
            Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, ex/*parametro de la exepcion*/);

        }
        
        
    }
    

long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);

    // Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
    
    //}


