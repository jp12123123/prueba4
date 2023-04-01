import org.zkoss.zul.*;
import modelos.builder.componentes.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.log4j.Logger;

ModeloComponente sup = new ModeloComponente();

beans.session.BeanUserWEB beanSeWeb = (beans.session.BeanUserWEB) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("userWEB");


Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

//Checkbox comp_CHK_fueraRadio=(Checkbox) sup.getInstanciaComponente("comp_CHK_fueraRadio");
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");



    String numeroCuenta ="";

    if(comp_CHK_tieneCuentaSi.isChecked()){
        numeroCuenta = comp_TXT_nroTramite.getValue();
    }else{
        numeroCuenta = comp_TXT_cli_id.getValue();
    }




   try{
        java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
            parametrosfnActualizaEstado.add(numeroCuenta); //numero_Cuenta / String
            parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
            parametrosfnActualizaEstado.add("3"); //Nro_Estado / String
           parametrosfnActualizaEstado.add(beanSeWeb.getLogin()); //P_USR_MOD / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
        Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
        
     

        
    } catch (Exception ex) {
        Messagebox.show("Web Service Actualiza Estado no esta disponible en este momento","Advertencia",null,null,null);
        Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, ex/*parametro de la exepcion*/);
        //java.util.logging.Logger.getLogger("SAYGES: \nError al cargar los estilos. Mensaje: ").log(java.util.logging.Level.SEVERE, ex.getMessage());

    }
         


        long milesegundos = 172800000;
        //long milesegundos = 120000;
        
        comp_LON_timerOculto.setValue(milesegundos);
        // Guardar
        java.util.List parametrosfnGuardar = new java.util.ArrayList();
        parametrosfnGuardar.add(false); //alIniciador / Boolean
        parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);




