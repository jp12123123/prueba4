import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Checkbox comp_CHK_revisionCompleta=(Checkbox) sup.getInstanciaComponente("comp_CHK_revisionCompleta"); // SI = Control Radio // NO = Observar Revision

Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");

Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion"); //MODIFICAR CON EL NOMBRE DEL BOTON FINUALIZAR
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

//String destino = "";
Boolean iniciador = false;
Boolean adirecta = false;

//SI TIENE CUENTA O NO, EL ESTADO ES EL MISMO [1] - Recibido PARA LA TAREA CONTROL RADIO 
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
            Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");

}catch(Exception e) {
    Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
    comp_SAVE_accion.setDisabled(true);
}

// Siguiente tarea
if(comp_CHK_revisionCompleta.isChecked()){
    iniciador = false;
    adirecta = true;
    //destino = "Control Radio";
}
else{
    iniciador = true;
    adirecta = false;
    //destino = "Observar Revisión";
    
    
        java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
            parametrosmardarNotificacion.add("Observa"); //asunto / String
            parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico); //mensaje / String
            parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
            parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
            parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue()); //to / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);
}

// Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);