import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");
Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos"); 

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");




//Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
//String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");


//Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");

//beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

//String destino = "";
//Boolean iniciador = false;
//Boolean adirecta = false;

//SI TIENE CUENTA O NO, EL ESTADO ES EL MISMO [1] - Recibido PARA LA TAREA CONTROL RADIO 
// DATOS PARA EL WS ACTUALIZAESTADO



/*Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
    Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
    String usuario_modif = beanSe.getLogin();
    try{
        java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                    parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                    parametrosfnActualizaEstado.add("3"); //Nro_Estado / String
                    parametrosfnActualizaEstado.add(comp_TXT_cuenta.getValue().trim()); //numero_Cuenta / String
                    parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
				Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");

    }catch(Exception e) {
        Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, e/*parametro de la exepcion);
        
    }
	//TIMER
	long milesegundos = 14400000;
	comp_LON_timerOculto.setValue(milesegundos);
 	// Guardar
    java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(false); //alIniciador / Boolean
    parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);*/


String tipoAdjunto = "";
boolean InformeCertificado = false;



for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
{

    org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

        
   	tipoAdjunto = li.getChildren().get(6).getLabel().trim();
    
    if(tipoAdjunto.equals("Informe Certificado")){
        InformeCertificado =true;
    }
    	
}



Checkbox comp_CHK_=(Checkbox) sup.getInstanciaComponente("comp_CHK_");
if(comp_CHK_.isChecked() && !InformeCertificado){
  Messagebox.show("Por favor adjunte el informe Certificado","Advertencia",null,null,null);
}else{
    
    Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
    Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
    String usuario_modif = beanSe.getLogin();
    try{
        java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                    parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                    parametrosfnActualizaEstado.add("3"); //Nro_Estado / String
                    parametrosfnActualizaEstado.add(comp_TXT_cuenta.getValue().trim()); //numero_Cuenta / String
                    parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
				Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");

    }catch(Exception e) {
        Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, e/*parametro de la exepcion*/);
        
    }
//TIMER
long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);    
//Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
parametrosfnGuardar.add(false); //alIniciador / Boolean
parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

    
}
/*
import org.zkoss.zul.*;
import modelos.builder.componentes.*;
ModeloComponente sup = new ModeloComponente();
Checkbox comp_CHK_=(Checkbox) sup.getInstanciaComponente("comp_CHK_");

//Declarar variables
Boolean iniciador = false;
Boolean adirecta = false;
  // Comprobar a donde va
if(comp_CHK_.isChecked())
{
    iniciador = false;
    adirecta = true;
}
else
{
    iniciador = true;
    adirecta = false;
}

    try{
        Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");
		//TIMER
		long milesegundos = 14400000;
        comp_LON_timerOculto.setValue(milesegundos);
        java.util.List parametrosfnGuardar = new java.util.ArrayList();
          parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
          parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
        
    }catch(Exception e) {
        Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, e/*parametro de la exepcion);
        
    }
*/

    








