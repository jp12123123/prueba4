import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
Div dis_cuenta=(Div) sup.getInstanciaComponente("dis_cuenta");
Div dis_nombreCuenta=(Div) sup.getInstanciaComponente("dis_nombreCuenta");
Div dis_apellidoCuenta=(Div) sup.getInstanciaComponente("dis_apellidoCuenta");
Div dis_domicilio=(Div) sup.getInstanciaComponente("dis_domicilio");
Div dis_persona=(Div) sup.getInstanciaComponente("dis_persona");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");
Div dis_condicionImpositiva=(Div) sup.getInstanciaComponente("dis_condicionImpositiva");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Textbox comp_TXT_domicilioPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioPersona");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");

//DISTRIBUCIONES DE CONTENEDOR DATOS CUENTA
Div dis_condicionImpositiva=(Div) sup.getInstanciaComponente("dis_condicionImpositiva");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Div dis_persona=(Div) sup.getInstanciaComponente("dis_persona");

//DISTRIBUCIONES DE NO TENER CUENTA CHECK
Div dis_domicilioFisicoUbicacionSC=(Div) sup.getInstanciaComponente("dis_domicilioFisicoUbicacionSC");
Div dis_departamentoFisicoSC=(Div) sup.getInstanciaComponente("dis_departamentoFisicoSC");
Div dis_calleFisicoSC=(Div) sup.getInstanciaComponente("dis_calleFisicoSC");
Div dis_manzanaFisicoSC=(Div) sup.getInstanciaComponente("dis_manzanaFisicoSC");
Div dis_EdificioSC=(Div) sup.getInstanciaComponente("dis_EdificioSC");
Div dis_UnidadSC=(Div) sup.getInstanciaComponente("dis_UnidadSC");
Div dis_cpFisicoSC=(Div) sup.getInstanciaComponente("dis_cpFisicoSC");

//DISTRIBUCION DEL CONTENEDOR DATOSCUENTA
Div dis_razonSocialPersonaNO=(Div) sup.getInstanciaComponente("dis_razonSocialPersonaNO");

//DISTRIBUCIONES DE DATOS TRAMITE
Label comp_LA_nroCuenta=(Label) sup.getInstanciaComponente("comp_LA_nroCuenta");
Textbox comp_TXT_nroCuenta2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroCuenta2da");

//CONTENEDOR DATOS CUENTA
//LISTAR
Combobox comp_CMB_condicionImpositivaVendedor=(Combobox) sup.getInstanciaComponente("comp_CMB_condicionImpositivaVendedor");
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
//TEXBOX
Textbox comp_TXT_TipoIVAVendedor1=(Textbox) sup.getInstanciaComponente("comp_TXT_TipoIVAVendedor1");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");

if(comp_CHK_tieneCuentaNo.isChecked()){
     
    //En caso de desahabilitar y volver a habilitar el check vuleve por defectos al Consumidor Final
    comp_CMB_condicionImpositivaVendedor.setValue("Consumidor Final");
	comp_CMB_persona.setValue("Física");  
    comp_TXT_TipoIVAVendedor1.setValue("1");
    
    comp_TXT_DNIPersona.setValue("-");
	comp_TXT_apellidoPersonaNO.setValue("-");
	comp_TXT_nombrePersonaNO.setValue("-");
    
        
    comp_CHK_tieneCuentaSi.setChecked(false);
    dis_cuenta.setVisible(false);
    dis_nombreCuenta.setVisible(false);
    dis_apellidoCuenta.setVisible(false);
    dis_domicilio.setVisible(false);
    dis_persona.setVisible(true);
    dis_nombrePersonaNO.setVisible(true);
    dis_condicionImpositiva.setVisible(true);
    dis_apellidoPersonaNO.setVisible(true);
    dis_dniPersona.setVisible(true);
	dis_cuitPersona.setVisible(false);
    dis_razonSocialPersonaNO.setVisible(false);
    comp_TXT_cuenta.setValue("-");
    comp_TXT_nombreCuenta.setValue("-");
    comp_TXT_apellidoCuenta.setValue("-");
    comp_TXT_domicilioCuenta.setValue("-");  
    
    //MOSTRAR DOMICILIO FÍSICO PARA PERSONAS SIN CUENTA
    dis_domicilioFisicoUbicacionSC.setVisible(true);
    dis_departamentoFisicoSC.setVisible(true);
    dis_calleFisicoSC.setVisible(true);
    dis_manzanaFisicoSC.setVisible(true);
    dis_EdificioSC.setVisible(true);
    dis_UnidadSC.setVisible(true);
    dis_cpFisicoSC.setVisible(true);
    
    //OCULTAR NUMERO DE CUENTA
    comp_LA_nroCuenta.setVisible(false);
	comp_TXT_nroCuenta2da.setVisible(false);
    
    
}else{
    dis_condicionImpositiva.setVisible(false);
    dis_persona.setVisible(false);
    dis_dniPersona.setVisible(false);
    dis_cuitPersona.setVisible(false); //
    dis_apellidoPersonaNO.setVisible(false);
    dis_nombrePersonaNO.setVisible(false);
    dis_razonSocialPersonaNO.setVisible(false); //
    //domicilio
    dis_domicilioFisicoUbicacionSC.setVisible(false);
    dis_departamentoFisicoSC.setVisible(false);
    dis_calleFisicoSC.setVisible(false);
    dis_manzanaFisicoSC.setVisible(false);
    dis_EdificioSC.setVisible(false);
    dis_UnidadSC.setVisible(false);
    dis_cpFisicoSC.setVisible(false);
    
    //OCULTAR NUMERO DE CUENTA
    comp_LA_nroCuenta.setVisible(false);
	comp_TXT_nroCuenta2da.setVisible(false);
    
}

