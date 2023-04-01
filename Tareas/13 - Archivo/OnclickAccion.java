import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//Checkbox comp_CHK_fueraRadio=(Checkbox) sup.getInstanciaComponente("comp_CHK_fueraRadio");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

/*if(comp_CHK_fueraRadio.isChecked() && comp_CHK_tieneCuentaNo.isChecked()){
    // DATOS PARA EL WS ACTUALIZAESTADO
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
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, e/*parametro de la exepcion);
        
    }
}*/
long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);
// Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
parametrosfnGuardar.add(false); //alIniciador / Boolean
parametrosfnGuardar.add(true); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

