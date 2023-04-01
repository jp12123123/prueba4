import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.logging.Level;
import java.util.logging.Logger;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");

Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");

beans.session.BeanUser1 beanSe = (beans.session.BeanUser1) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

//DATOS DE DATOS TRAMITE
Label comp_LA_nroCuenta=(Label) sup.getInstanciaComponente("comp_LA_nroCuenta");
Textbox comp_TXT_nroCuenta2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroCuenta2da");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nroCuenta2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroCuenta2da");



String numeroCuenta ="";

if(comp_CHK_tieneCuentaSi.isChecked()){
    numeroCuenta = comp_TXT_nroTramite.getValue();
   

}else{
    numeroCuenta = comp_TXT_cli_id.getValue();
}


//

//SI TIENE O NO CUENTA [2] - Emitido
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
}
 if(comp_CHK_tieneCuentaSi.isChecked()){
    
long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);

java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(false); //alIniciador / Boolean
    parametrosfnGuardar.add(true); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
     
         
    }else if(comp_CHK_tieneCuentaNo.isChecked() && !comp_TXT_nroCuenta2da.getValue().equals("-")){
    
long milesegundos = 172800000;
comp_LON_timerOculto.setValue(milesegundos);

java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(false); //alIniciador / Boolean
    parametrosfnGuardar.add(true); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
     
         
    }else{
     Messagebox.show("Ingrese un numero de Cuenta","Advertencia",null,null,null);
     
 }