import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_IdZona=(Textbox) sup.getInstanciaComponente("comp_TXT_IdZona");
Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Textbox comp_TXT_idDeTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_idDeTramite");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Combobox comp_CMB_listaMotivoArchivado=(Combobox) sup.getInstanciaComponente("comp_CMB_listaMotivoArchivado");

Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

/*int idZona = Integer.parseInt(comp_TXT_IdZona.getValue());
int idDeTramite = Integer.parseInt(comp_TXT_idDeTramite.getValue());
String numeroRegistro = comp_TXT_numeroRegistro.getValue();
String cuenta = comp_TXT_cuenta.getValue();
String listaMotivoArchivado = comp_CMB_listaMotivoArchivado.getSelectedItem().getValue();
*/
//Checkbox comp_CHK_Archivo=(Checkbox) sup.getInstanciaComponente("comp_CHK_Archivo"); // SI = Control Radio // NO = Observar Revision

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

//Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
//String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");

Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion"); //MODIFICAR CON EL NOMBRE DEL BOTON FINUALIZAR
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");



//String destino = "";
Boolean iniciador = false;
Boolean adirecta = false;

// Siguiente tarea
/*if(comp_CHK_Archivo.isChecked())
{
    iniciador = false;
    adirecta = true;
    //destino = "Control Radio";

    try
    {

        java.util.List parametrosfnTicketArchivo = new java.util.ArrayList();
            parametrosfnTicketArchivo.add(idDeTramite); //tipo_Tramite / int
            parametrosfnTicketArchivo.add(cuenta); //nro_Cuenta / String
            parametrosfnTicketArchivo.add(idZona); //nro_Zona / int
            parametrosfnTicketArchivo.add(numeroRegistro); //id_Escribano / String
            parametrosfnTicketArchivo.add(numDocumentoElectronico); //nro_Expediente / String
            parametrosfnTicketArchivo.add(listaMotivoArchivado); //tipo_Motivo / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnTicketArchivo",parametrosfnTicketArchivo);
        Map return35map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return35map");
        
        //Messagebox.show("Tramite: "+idDeTramite+" cuenta: "+cuenta+" zona: "+idZona+" Registro: "+numeroRegistro+" Expediente: "+numDocumentoElectronico+" Motivo "+listaMotivoArchivado);

        
    
    }
    catch(Exception e) 
    {
        Messagebox.show("El servicio Generar Ticket Archivo no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
    }
}
else
{*/
    
    iniciador = true;
    adirecta = false;
    //destino = "Observar Revisión";
    
    java.util.List parametrosmardarNotificacion = new java.util.ArrayList();
        parametrosmardarNotificacion.add("Observa"); //asunto / String
        parametrosmardarNotificacion.add("Por favor revise su bandeja de Sayges. Se le envio una observación del tramite "+numDocumentoElectronico); //mensaje / String
        parametrosmardarNotificacion.add(new HashMap()); //valorVariablesReportes_ / java.util.Map
        parametrosmardarNotificacion.add(false); //conAdjunto / Boolean
        parametrosmardarNotificacion.add(comp_TXT_emailEscribano.getValue().trim()); //to / String
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mardarNotificacion",parametrosmardarNotificacion);
//}

// Guardar
long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);

java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
    parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);*/
    