import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Checkbox comp_CHK_realizoPago=(Checkbox) sup.getInstanciaComponente("comp_CHK_realizoPago");
Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

//Declarar variables
Boolean iniciador = false;
Boolean adirecta = false;

// Comprobar a donde va
if(comp_CHK_realizoPago.isChecked())
{
    iniciador = false;
    adirecta = true;
}
else
{
    iniciador = true;
    adirecta = false;
}

/*if(comp_CHK_realizoPago.isChecked()){
    
    //SI TIENE O NO CUENTA [1] - Recibido
    // DATOS PARA EL WS ACTUALIZAESTADO
    Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
    Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
    String usuario_modif = beanSe.getLogin();
    try{
        java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                    parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                    parametrosfnActualizaEstado.add("1"); //Nro_Estado / String
                    parametrosfnActualizaEstado.add(comp_TXT_cuenta.getValue().trim()); //numero_Cuenta / String
                    parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
                Map return31mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return31mapa");

    }catch(Exception e) {
        Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
    }
    
}else{    
	
    java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
        parametrosmardarNotificacion.add("Observa"); //asunto / String
        parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico+" por falta de pago."); //mensaje / String
        parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
        parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
        parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue()); //to / String
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);   
}*/

// Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);