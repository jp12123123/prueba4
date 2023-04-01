import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.logging.Level;
import java.util.logging.Logger;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Checkbox comp_CHK_libreDeuda=(Checkbox) sup.getInstanciaComponente("comp_CHK_libreDeuda"); // SI = Emite Libre Deuda // NO = Observa Deuda

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");


Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");
Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos"); 
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");
//Declarar variables
Boolean iniciador = false;
Boolean adirecta = false;


Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

Checkbox comp_CHK_fueraRadio=(Checkbox) sup.getInstanciaComponente("comp_CHK_fueraRadio");
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");
String estado = "3";


    String numeroCuenta ="";

    if(comp_CHK_tieneCuentaSi.isChecked()){
        numeroCuenta = comp_TXT_nroTramite.getValue();
    }else{
        numeroCuenta = comp_TXT_cli_id.getValue();
    }

if(comp_CHK_libreDeuda.isChecked()){
    estado = "2";
}else{
    estado = "3";
}

        

// Comprobar a donde va
if(comp_CHK_libreDeuda.isChecked())
{
    iniciador = false;
    adirecta = true;
}
else
{
    iniciador = true;
    adirecta = false;
}

// Guardar
boolean InformeCertificado= false;
String tipoAdjunto="";

for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

        
   		tipoAdjunto = li.getChildren().get(6).getLabel().trim();
    
    	if(tipoAdjunto.equals("Informe Certificado")){
            InformeCertificado =true;
        }
    	
}

/*if(!InformeCertificado && !comp_CHK_libreDeuda.isChecked()){
    Messagebox.show("Por favor agregue el Informe Certificado","Advertencia",null,null,null);
    
}else{*/
    
     try{
        java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
            parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
            parametrosfnActualizaEstado.add(estado); //Nro_Estado / String
            parametrosfnActualizaEstado.add(numeroCuenta); //numero_Cuenta / String
            parametrosfnActualizaEstado.add(beanSe.getLogin()); //P_USR_MOD / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
        Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
    } catch (Exception ex) {
        Messagebox.show("Web Service Actualiza Estado no esta disponible en este momento","Advertencia",null,null,null);
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, ex/*parametro de la exepcion*/);

    }
    
    if(iniciador){
        
        //Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

       // Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
        //String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");

          java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
                    parametrosmardarNotificacion.add("Observa"); //asunto / String
                    parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico); //mensaje / String
                    parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
                    parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
                    parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue()); //to / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);
        
    }
    
	long milesegundos = 172800000;
    //long milesegundos = 120000;
    comp_LON_timerOculto.setValue(milesegundos);
    java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
    parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

    // Si pasa a observacion, notificar 
    /*if(!comp_CHK_libreDeuda.isChecked()){

        java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
        parametrosmardarNotificacion.add("Observa Deuda"); //asunto / String
        parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico+" para realizarle modificaciones."); //mensaje / String
        parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
        parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
        parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue()); //to / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);
    }*/

//}