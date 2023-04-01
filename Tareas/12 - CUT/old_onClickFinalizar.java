import org.zkoss.zul.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

String mensajeParametro="";


Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");
Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");
Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");
Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");

mensajeParametro = "Departamento "+comp_CMB_departamentoCUT.getValue()+" Distrito "+comp_CMB_distritoCUT.getValue()/*+" Sector "+ comp_IN_sectorCUT.geValue().toString()+" Manzana "+ comp_IN_manzanaCut.geValue().toString()+" Parcela "+ comp_IN_parcelaCUT.geValue().toString()+" Subparcela "+ comp_IN_subParcelaCUT.geValue().toString()*/;


Textbox comp_TXT_AsientoCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_AsientoCUT");
Textbox comp_TXT_nroTicket=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTicket");
Textbox comp_TXT_matriculaTomoCut=(Textbox) sup.getInstanciaComponente("comp_TXT_matriculaTomoCut");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Datebox comp_DA_fechaCut=(Datebox) sup.getInstanciaComponente("comp_DA_fechaCut");
String nroTicket = comp_TXT_nroTicket.getValue().trim();

mensajeParametro = mensajeParametro+" Asiento "+ comp_TXT_AsientoCUT.getValue()+" Matricula "+ comp_TXT_matriculaTomoCut.getValue()+" Departamento Dominio"+ comp_CMB_departamentoDominioInput.getValue();

Textbox comp_TXT_nombreTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente1");
Textbox comp_TXT_dniTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");


Textbox comp_TXT_personaAdquirente1Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1Nombre");
Textbox comp_TXT_personaAdquirente1DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Doublebox comp_DOU_personaAdquirente1Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente1Porcentaje");
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");

//Messagebox.show(mensajeParametro);

Textbox comp_TXT_nroEscrituraCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_nroEscrituraCUT");
Textbox comp_TXT_nroFolioCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_nroFolioCUT");
Checkbox comp_CHK_banderaGrabaCUT=(Checkbox) sup.getInstanciaComponente("comp_CHK_banderaGrabaCUT");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

beans.session.BeanUserWEB beanSeWeb = (beans.session.BeanUserWEB) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("userWEB");
String usuario_modif = beanSeWeb.getLogin();
Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");

String numeroCuenta ="";

if(comp_CHK_tieneCuentaSi.isChecked()){
    numeroCuenta = comp_TXT_nroTramite.getValue().trim();
}else{
    numeroCuenta = comp_TXT_cli_id.getValue().trim();
}


String nroTicket = comp_TXT_nroTicket.getValue().trim();

if(comp_TXT_nroEscrituraCUT.getValue().trim().equals("-") || comp_TXT_nroEscrituraCUT.getValue().trim().equals("--") || comp_TXT_nroEscrituraCUT.getValue().trim().equals("---")){
    Messagebox.show("Por favor ingrese el Número de Escritura","Advertencia",null,null,null);
}else if(comp_TXT_nroFolioCUT.getValue().trim().equals("-") || comp_TXT_nroFolioCUT.getValue().trim().equals("--") || comp_TXT_nroFolioCUT.getValue().trim().equals("---")){
    Messagebox.show("Por favor ingrese el Número de Folio","Advertencia",null,null,null);
}else {
       
    try {

        java.util.List parametrosfnGrabarSinCerrar = new java.util.ArrayList();
            parametrosfnGrabarSinCerrar.add(false); //alIniciador / Boolean
            parametrosfnGrabarSinCerrar.add(false); //asignacionDirecta / Boolean
            parametrosfnGrabarSinCerrar.add(true); //grabar / Boolean
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGrabarSinCerrar",parametrosfnGrabarSinCerrar);

        comp_SAVE_accion.setDisabled(true);
          
        java.util.List parametrosfnGrabaCUT = new java.util.ArrayList();
        parametrosfnGrabaCUT.add(nroTicket); //id_cut / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGrabaCUT",parametrosfnGrabaCUT);
		Map return32mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return32mapa");

        String codigoDevuelto = return32mapa.get("P_CODIGO").trim().toString();
        String mensajeDevuelto = return32mapa.get("P_MENSAJE").trim().toString();
       
        if(codigoDevuelto.equals("1")){
            Messagebox.show("El servicio no guardó correctamente sus datos. Por favor comuníquese con el área técnica.","Advertencia",null,null,null);
        }else{
            java.util.List parametrosfnGuardar = new java.util.ArrayList();
                parametrosfnGuardar.add(false); //alIniciador / Boolean
                parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
            
            Messagebox.show("Su solicitud de Confirmación de Escritura fue exitosa. Muchas gracias");
            
            try{
                java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                    parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                    parametrosfnActualizaEstado.add("4"); //Nro_Estado / String
                    parametrosfnActualizaEstado.add(numeroCuenta); //numero_Cuenta / String
                    parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
                Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
            } catch (Exception ex) {
                Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
                //Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }catch(Exception e){
        Messagebox.show("El servicio GrabarCut no está disponible por el momento. Por favor comuníquese con el área técnica.","Advertencia",null,null,null);

        comp_TXT_nroEscrituraCUT.setValue("-");
        comp_TXT_nroFolioCUT.setValue("-");
    }
}