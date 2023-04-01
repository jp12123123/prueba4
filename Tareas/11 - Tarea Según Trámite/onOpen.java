import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//datos Escribano
Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Textbox comp_TXT_nombreEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreEscribano");
Textbox comp_TXT_apellidoEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoEscribano");
Textbox comp_TXT_domicilioEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioEscribano");
Combobox comp_CMB_zonaEscribano=(Combobox) sup.getInstanciaComponente("comp_CMB_zonaEscribano");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
comp_TXT_emailEscribano.setDisabled(true);

//datos cuenta
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");
Textbox comp_TXT_domicilioPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioPersona");

Label comp_LA_DNIPersona=(Label) sup.getInstanciaComponente("comp_LA_DNIPersona");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");
Label comp_LA_CUITPersona=(Label) sup.getInstanciaComponente("comp_LA_CUITPersona");

Textbox comp_TXT_NumCalleCUTPH=(Textbox) sup.getInstanciaComponente("comp_TXT_NumCalleCUTPH");
comp_TXT_NumCalleCUTPH.setDisabled(true);

Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");

Textbox comp_TXT_TipoIVAVendedor1=(Textbox) sup.getInstanciaComponente("comp_TXT_TipoIVAVendedor1");
String itemCombo = comp_TXT_TipoIVAVendedor1.getValue().toString();

Textbox comp_TXT_CUT_ADQUIERE_CUIT1 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT1");
Textbox comp_TXT_CUT_ADQUIERE_CUIT2 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT2");
Textbox comp_TXT_CUT_ADQUIERE_CUIT3 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT3");

Div dis_cuenta=(Div) sup.getInstanciaComponente("dis_cuenta");
Div dis_nombreCuenta=(Div) sup.getInstanciaComponente("dis_nombreCuenta");
Div dis_apellidoCuenta=(Div) sup.getInstanciaComponente("dis_apellidoCuenta");
Div dis_domicilio=(Div) sup.getInstanciaComponente("dis_domicilio");
Div dis_persona=(Div) sup.getInstanciaComponente("dis_persona");
Div dis_nombrePersona=(Div) sup.getInstanciaComponente("dis_nombrePersona");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");

//Datos Tramite
Combobox comp_CMB_tramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");

//Datos Cut

Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");
Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");
Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");
Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");
Textbox comp_TXT_AsientoCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_AsientoCUT");
Textbox comp_TXT_matriculaTomoCut=(Textbox) sup.getInstanciaComponente("comp_TXT_matriculaTomoCut");
Datebox comp_DA_fechaCut=(Datebox) sup.getInstanciaComponente("comp_DA_fechaCut");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Datebox comp_DA_fechaCut=(Datebox) sup.getInstanciaComponente("comp_DA_fechaCut");
Textbox comp_TXT_nombreTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente1");
Textbox comp_TXT_dniTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");
Textbox comp_TXT_nombreTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente2");
Textbox comp_TXT_dniTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente2");
Textbox comp_TXT_nombreTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente3");
Textbox comp_TXT_dniTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente3");
Radiogroup comp_RA_personaFisicaJuridica=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridica");
Textbox comp_TXT_personaAdquirente1Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1Nombre");
Textbox comp_TXT_personaAdquirente1DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Doublebox comp_DOU_personaAdquirente1Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente1Porcentaje");
Textbox comp_TXT_personaAdquirente2Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2Nombre");
Textbox comp_TXT_personaAdquirente2DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2DNI");
Doublebox comp_DOU_personaAdquirente2Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente2Porcentaje");
Textbox comp_TXT_personaAdquirente3Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3Nombre");
Textbox comp_TXT_personaAdquirente3DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3DNI");
Doublebox comp_DOU_personaAdquirente3Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente3Porcentaje");

Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Combobox comp_CMB_calleFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_calleFisico");
Intbox comp_IN_calleFisicoNumero=(Intbox) sup.getInstanciaComponente("comp_IN_calleFisicoNumero");
Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");
Textbox comp_TXT_manzanaFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaFisico");
Textbox comp_TXT_loteFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_loteFisicos");
Textbox comp_TXT_fraccionFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionFisicos");
Combobox comp_CMB_cpFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_cpFisico");
Checkbox comp_CHK_igualUbicacionPostalSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalSi");
Checkbox comp_CHK_igualUbicacionPostalNO=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalNO");
Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Combobox comp_CMB_callePostal=(Combobox) sup.getInstanciaComponente("comp_CMB_callePostal");
Intbox comp_IN_numeroPostal=(Intbox) sup.getInstanciaComponente("comp_IN_numeroPostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Textbox comp_TXT_manzanaPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaPostal");
Textbox comp_TXT_LotePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_LotePostal");
Textbox comp_TXT_fraccionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionPostal");
Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");
Textbox comp_TXT_numeroPlano=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroPlano");
Doublebox comp_DOU_segunTituloInmueble=(Doublebox) sup.getInstanciaComponente("comp_DOU_segunTituloInmueble");
Doublebox comp_DOU_segunPlanoInmueble=(Doublebox) sup.getInstanciaComponente("comp_DOU_segunPlanoInmueble");
Doublebox comp_DOU_supTituloTransferirM2=(Doublebox) sup.getInstanciaComponente("comp_DOU_supTituloTransferirM2");
Doublebox comp_DOU_supPlanoTrasferir=(Doublebox) sup.getInstanciaComponente("comp_DOU_supPlanoTrasferir");

Div dis_nombreTramitente2=(Div) sup.getInstanciaComponente("dis_nombreTramitente2");
Div dis_nombreTramitente3=(Div) sup.getInstanciaComponente("dis_nombreTramitente3");
Div dis_personaAdquirente2=(Div) sup.getInstanciaComponente("dis_personaAdquirente2");
Div dis_personaAdquirente3=(Div) sup.getInstanciaComponente("dis_personaAdquirente3");

Button comp_BTN_agregarTramitente=(Button) sup.getInstanciaComponente("comp_BTN_agregarTramitente");
Button comp_BTN_eliminarTramitente=(Button) sup.getInstanciaComponente("comp_BTN_eliminarTramitente");
Button comp_BTN_agregarAdquirente=(Button) sup.getInstanciaComponente("comp_BTN_agregarAdquirente");
Button comp_BTN_eliminarAdquirente=(Button) sup.getInstanciaComponente("comp_BTN_eliminarAdquirente");


//Datos CUT PH

Textbox comp_TXT_CutPHEdificio=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHEdificio");
Combobox comp_CMB_CutPHCalle=(Combobox) sup.getInstanciaComponente("comp_CMB_CutPHCalle");
Textbox comp_TXT_CutPHPiso=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHPiso");
Textbox comp_TXT_CutPHUnidad=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHUnidad");
Textbox comp_TXT_CutPHDesignacion=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHDesignacion");

// Ocultar por defecto contenedor CUT PH
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");


Div dis_planoDigitalizado1=(Div) sup.getInstanciaComponente("dis_planoDigitalizado1");
Div dis_planchaATM1=(Div) sup.getInstanciaComponente("dis_planchaATM1");
Div dis_notaSolicitud1=(Div) sup.getInstanciaComponente("dis_notaSolicitud1");
Div dis_notaConec1=(Div) sup.getInstanciaComponente("dis_notaConec1");
Div dis_numeroCliente1=(Div) sup.getInstanciaComponente("dis_numeroCliente1");

//Bandboxs del domicilio fisico
Bandbox comp_BANDBOX_calleFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_calleFisico");
Bandbox comp_BANDBOX_barrio=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrio");
Bandbox comp_BANDBOX_cpFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpFisico");


//Bandboxs del domicilio Postal
Bandbox comp_BANDBOX_barrioPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrioPostal");
Bandbox comp_BANDBOX_cpPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpPostal");
Bandbox comp_BANDBOX_callePostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_callePostal");


//Textbox del domicilio fisico
Textbox comp_TXT_barrioFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_barrioFisico");
Textbox comp_TXT_calleFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_calleFisico");
Textbox comp_TXT_cpFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_cpFisico");

//Textboxs del domicilio postal
Textbox comp_TXT_barrioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_barrioPostal");
Textbox comp_TXT_callePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_callePostal");
Textbox comp_TXT_cpPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_cpPostal");

//Bandbox del CUTPH
Bandbox comp_BANDBOX_CutPHCalle=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_CutPHCalle");

//Textbox del CUTPH
Textbox comp_TXT_CutPHCalle=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHCalle");

//Deshabilito todos los bandboxs
//Fisico
comp_BANDBOX_calleFisico.setDisabled(true);
comp_BANDBOX_cpFisico.setDisabled(true);
comp_BANDBOX_barrio.setDisabled(true);
//Postal
comp_BANDBOX_barrioPostal.setDisabled(true);
comp_BANDBOX_cpPostal.setDisabled(true);
comp_BANDBOX_callePostal.setDisabled(true);
//CUTPH
comp_BANDBOX_CutPHCalle.setDisabled(true);

//Oculto todos los bandbox
comp_BANDBOX_calleFisico.setVisible(false);
comp_BANDBOX_cpFisico.setVisible(false);
comp_BANDBOX_barrio.setVisible(false);

comp_BANDBOX_barrioPostal.setVisible(false);
comp_BANDBOX_cpPostal.setVisible(false);
comp_BANDBOX_callePostal.setVisible(false);

comp_BANDBOX_CutPHCalle.setVisible(false);

//Des-Oculto los textboxs que guardaron los datos de los bandboxs
comp_TXT_cpFisico.setVisible(true);
comp_TXT_calleFisico.setVisible(true);
comp_TXT_barrioFisico.setVisible(true);

comp_TXT_barrioPostal.setVisible(true);
comp_TXT_callePostal.setVisible(true);
comp_TXT_cpPostal.setVisible(true);

comp_TXT_CutPHCalle.setVisible(true);

if(comp_IN_subParcelaCUT.getValue()!=0){
	cont_datosCUTPH.setVisible(true);    
}else{
  	cont_datosCUTPH.setVisible(false);    

}

//-----------------------------Disabled-----------

/*   <DATOS CUENTA>   */
Combobox comp_CMB_condicionImpositivaVendedor=(Combobox) sup.getInstanciaComponente("comp_CMB_condicionImpositivaVendedor");

Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Div dis_razonSocialPersonaNO=(Div) sup.getInstanciaComponente("dis_razonSocialPersonaNO");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");

Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_razonSocialPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_razonSocialPersonaNO");

comp_CMB_condicionImpositivaVendedor.setDisabled(true);
comp_TXT_DNIPersona.setDisabled(true);
comp_TXT_CUITPersona.setDisabled(true);
comp_TXT_apellidoPersonaNO.setDisabled(true);
comp_TXT_nombrePersonaNO.setDisabled(true);
comp_TXT_razonSocialPersonaNO.setDisabled(true);

if(comp_CHK_tieneCuentaNo.isChecked()){
int valorCombo = Integer.parseInt(itemCombo); 
    dis_cuenta.setVisible(false);
    dis_nombreCuenta.setVisible(false);
    dis_apellidoCuenta.setVisible(false);
    dis_domicilio.setVisible(false);
    dis_persona.setVisible(true);
    dis_domicilioPersona.setVisible(true);

    if(comp_CMB_persona.getValue().trim().equals("Jurídica")){
        dis_apellidoPersonaNO.setVisible(false);
        dis_nombrePersonaNO.setVisible(false);
        dis_razonSocialPersonaNO.setVisible(true);
    }else{
        dis_apellidoPersonaNO.setVisible(true);
        dis_nombrePersonaNO.setVisible(true);
        dis_razonSocialPersonaNO.setVisible(false);
    }

    switch(valorCombo){
        case 1:
            if(comp_CMB_persona.getValue().trim().equals("Jurídica")){
                dis_dniPersona.setVisible(false);
            }else{
                dis_dniPersona.setVisible(true);
            }
            dis_cuitPersona.setVisible(true);
            break;
        case 2:
            dis_dniPersona.setVisible(true);
            dis_cuitPersona.setVisible(true);
            break;
        case 4:
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            break;
        case 6:
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            break;
        case 7:
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            break;
    }
}else if(comp_CHK_tieneCuentaSi.isChecked()){
    dis_cuenta.setVisible(true);
    dis_nombreCuenta.setVisible(true);
    dis_apellidoCuenta.setVisible(true);
    dis_domicilio.setVisible(true);
    dis_persona.setVisible(false);
    dis_dniPersona.setVisible(false);
    dis_cuitPersona.setVisible(false);
    dis_nombrePersonaNO.setVisible(false);
    dis_domicilioPersona.setVisible(false);
    dis_apellidoPersonaNO.setVisible(false);
    dis_razonSocialPersonaNO.setVisible(false);
}
/*   >DATOS CUENTA<   */

/*   <CUT>   */
Combobox comp_CMB_condImposTrans=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposTrans");
Textbox comp_TXT_apellidoTransmitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente1");
Textbox comp_TXT_apellidoTransmitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente2");
Textbox comp_TXT_apellidoTransmitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente3");

Combobox comp_CMB_condImposAdq=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposAdq");
Textbox comp_TXT_apellidoAdquirente1=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente1");
Textbox comp_TXT_apellidoAdquirente2=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente2");
Textbox comp_TXT_apellidoAdquirente3=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente3");

Radiogroup comp_RA_personaFisicaJuridicaTr=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridicaTr");
Label comp_LA_nombreTramitente1=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente1");
Label comp_LA_dniTramitente1=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente1");
Label comp_LA_nombreTramitente2=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente2");
Label comp_LA_dniTramitente2=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente2");
Label comp_LA_nombreTramitente3=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente3");
Label comp_LA_dniTramitente3=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente3");
Textbox comp_TXT_dniTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");
Textbox comp_TXT_dniTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente2");
Textbox comp_TXT_dniTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente3");
Textbox comp_TXT_idPersonaFisicaTramitente=(Textbox) sup.getInstanciaComponente("comp_TXT_idPersonaFisicaTramitente");
Textbox comp_TXT_apellidoTransmitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente1");
Textbox comp_TXT_apellidoTransmitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente2");
Textbox comp_TXT_apellidoTransmitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente3");
Label comp_LA_apellidoTrans1=(Label) sup.getInstanciaComponente("comp_LA_apellidoTrans1");
Label comp_LA_apellidoTransmitente2=(Label) sup.getInstanciaComponente("comp_LA_apellidoTransmitente2");
Label comp_LA_apellidoTransmitente3=(Label) sup.getInstanciaComponente("comp_LA_apellidoTransmitente3");

Radiogroup comp_RA_personaFisicaJuridica=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridica");
Label comp_LA_personaAdquirente1Nombre=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente1Nombre");
Label comp_LA_personaAdquirente1DNI=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente1DNI");
Label comp_LA_personaAdquirente2=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente2");
Label comp_LA_personaAdquirente2DNI=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente2DNI");
Label comp_LA_personaAdquirente3Nombre=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente3Nombre");
Label comp_LA_personaAdquirente3DNI=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente3DNI");
Textbox comp_TXT_personaAdquirente1DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Textbox comp_TXT_personaAdquirente2DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2DNI");
Textbox comp_TXT_personaAdquirente3DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3DNI");
Textbox comp_TXT_idPersonaFisicaJuridicaAdquirente=(Textbox) sup.getInstanciaComponente("comp_TXT_idPersonaFisicaJuridicaAdquirente");
Textbox comp_TXT_tipoPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_tipoPersona");
Label comp_LA_apellidoAdquierente1=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquierente1");
Textbox comp_TXT_apellidoAdquirente1=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente1");
Label comp_LA_apellidoAdquirente2=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquirente2");
Textbox comp_TXT_apellidoAdquirente2=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente2");
Label comp_LA_apellidoAdquirente3=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquirente3");
Textbox comp_TXT_apellidoAdquirente3=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente3");

comp_CMB_condImposTrans.setDisabled(true);
comp_TXT_apellidoTransmitente1.setDisabled(true);
comp_TXT_apellidoTransmitente2.setDisabled(true);
comp_TXT_apellidoTransmitente3.setDisabled(true);
comp_CMB_condImposAdq.setDisabled(true);
comp_TXT_apellidoAdquirente1.setDisabled(true);
comp_TXT_apellidoAdquirente2.setDisabled(true);
comp_TXT_apellidoAdquirente3.setDisabled(true);

if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0)
{ //fisica
    comp_LA_nombreTramitente1.setValue("Nombre:");
	comp_LA_nombreTramitente2.setValue("Nombre:");
	comp_LA_nombreTramitente3.setValue("Nombre:");
	comp_LA_apellidoTrans1.setStyle("display: inline;");
	comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
	comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
	comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
	comp_LA_apellidoTransmitente2.setStyle("display: inline;");
	comp_LA_apellidoTransmitente3.setStyle("display: inline;");
	comp_LA_dniTramitente1.setValue("DNI:");
	comp_LA_dniTramitente2.setValue("DNI:");
	comp_LA_dniTramitente3.setValue("DNI:");
} 
else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1)
{  //juridica
    comp_LA_nombreTramitente1.setValue("Razón Social:");
	comp_LA_nombreTramitente2.setValue("Razón Social:");
	comp_LA_nombreTramitente3.setValue("Razón Social:");
	comp_LA_apellidoTrans1.setStyle("display: none;");
	comp_TXT_apellidoTransmitente2.setStyle("display: none;");
	comp_TXT_apellidoTransmitente3.setStyle("display: none;");
	comp_LA_apellidoTransmitente2.setStyle("display: none;");
	comp_TXT_apellidoTransmitente1.setStyle("display: none;");
	comp_LA_apellidoTransmitente3.setStyle("display: none;");
	comp_TXT_apellidoTransmitente1.setStyle("display: none;");
	comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
	comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
	comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
}

//Segunda parte: Adquirente
if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){ //fisica
    comp_LA_personaAdquirente1Nombre.setValue("Nombre:");
    comp_LA_personaAdquirente2.setValue("Nombre:");
    comp_LA_personaAdquirente3Nombre.setValue("Nombre:");
    comp_LA_apellidoAdquierente1.setStyle("display: inline;");
    comp_LA_apellidoAdquirente2.setStyle("display: inline;");
    comp_LA_apellidoAdquirente3.setStyle("display: inline;");
    comp_TXT_apellidoAdquirente1.setStyle("display: inline;");
    comp_TXT_apellidoAdquirente2.setStyle("display: inline;");
    comp_TXT_apellidoAdquirente3.setStyle("display: inline;");
    comp_LA_personaAdquirente1DNI.setValue("DNI:");
    comp_LA_personaAdquirente2DNI.setValue("DNI:");
    comp_LA_personaAdquirente3DNI.setValue("DNI:");
    comp_TXT_personaAdquirente1DNI.setVisible(true);
    comp_TXT_personaAdquirente2DNI.setVisible(true);
    comp_TXT_personaAdquirente3DNI.setVisible(true);
    comp_TXT_CUT_ADQUIERE_CUIT1.setVisible(false);
    comp_TXT_CUT_ADQUIERE_CUIT2.setVisible(false);
    comp_TXT_CUT_ADQUIERE_CUIT3.setVisible(false);
    
} else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){  //juridica
    comp_LA_personaAdquirente1Nombre.setValue("Razón Social:");
    comp_LA_personaAdquirente2.setValue("Razón Social:");
    comp_LA_personaAdquirente3Nombre.setValue("Razón Social:");
    comp_LA_personaAdquirente1DNI.setValue("CUIL/CUIT:");
    comp_LA_personaAdquirente2DNI.setValue("CUIL/CUIT:");
    comp_LA_personaAdquirente3DNI.setValue("CUIL/CUIT:");
    comp_TXT_personaAdquirente1DNI.setVisible(false);
    comp_TXT_personaAdquirente2DNI.setVisible(false);
    comp_TXT_personaAdquirente3DNI.setVisible(false);
    comp_TXT_CUT_ADQUIERE_CUIT1.setVisible(true);
    comp_TXT_CUT_ADQUIERE_CUIT2.setVisible(true);
    comp_TXT_CUT_ADQUIERE_CUIT3.setVisible(true);
    comp_LA_apellidoAdquierente1.setStyle("display: none;");
    comp_LA_apellidoAdquirente2.setStyle("display: none;");
    comp_LA_apellidoAdquirente3.setStyle("display: none;");
    comp_TXT_apellidoAdquirente1.setStyle("display: none;");
    comp_TXT_apellidoAdquirente2.setStyle("display: none;");
    comp_TXT_apellidoAdquirente3.setStyle("display: none;");
}
/*   >CUT<   */

/*   <SUBPARCELA>   */
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");
Div dis_numeroPlano=(Div) sup.getInstanciaComponente("dis_numeroPlano");
Div dis_supPlanoTrasferir=(Div) sup.getInstanciaComponente("dis_supPlanoTrasferir");
Div dis_supTituloTransferir=(Div) sup.getInstanciaComponente("dis_supTituloTransferir");
Div dis_superficieATransferir=(Div) sup.getInstanciaComponente("dis_superficieATransferir");
Div dis_segunPlanoInmueble=(Div) sup.getInstanciaComponente("dis_segunPlanoInmueble");
Div dis_segunTituloInmueble=(Div) sup.getInstanciaComponente("dis_segunTituloInmueble");
Div dis_superficieInmueble=(Div) sup.getInstanciaComponente("dis_superficieInmueble");

if(comp_IN_subParcelaCUT.getValue()!=0){
	cont_datosCUTPH.setVisible(true); 
    dis_numeroPlano.setVisible(false);   
    dis_supPlanoTrasferir.setVisible(false);
    dis_supTituloTransferir.setVisible(false);
    dis_superficieATransferir.setVisible(false);
    dis_segunPlanoInmueble.setVisible(false);
    dis_segunTituloInmueble.setVisible(false);
    dis_superficieInmueble.setVisible(false);
}else{
  	cont_datosCUTPH.setVisible(false);    
    dis_numeroPlano.setVisible(true);
    dis_supPlanoTrasferir.setVisible(true);
    dis_supTituloTransferir.setVisible(true);
    dis_superficieATransferir.setVisible(true);
    dis_segunPlanoInmueble.setVisible(true);
    dis_segunTituloInmueble.setVisible(true);
    dis_superficieInmueble.setVisible(true);
}
/*   >SUBPARCELA<   */

comp_TXT_numeroRegistro.setDisabled(true);
comp_TXT_nombreEscribano.setDisabled(true);
comp_TXT_apellidoEscribano.setDisabled(true);
comp_TXT_domicilioEscribano.setDisabled(true);
comp_CMB_zonaEscribano.setDisabled(true);


comp_CHK_tieneCuentaSi.setDisabled(true);
comp_CHK_tieneCuentaNo.setDisabled(true);
comp_TXT_cuenta.setDisabled(true);
comp_TXT_nombreCuenta.setDisabled(true);
comp_TXT_apellidoCuenta.setDisabled(true);
comp_TXT_domicilioCuenta.setDisabled(true);
comp_CMB_persona.setDisabled(true);
comp_TXT_nombrePersonaNO.setDisabled(true);
comp_TXT_DNIPersona.setDisabled(true);
comp_TXT_CUITPersona.setDisabled(true);


comp_CMB_tramite.setDisabled(true);



comp_CMB_departamentoCUT.setDisabled(true);

Comboitem item = new Comboitem();                
item.setLabel(comp_CMB_departamentoCUT.getValue());
item.setValue(comp_CMB_departamentoCUT.getValue());
item.setParent(comp_CMB_departamentoCUT); 

comp_CMB_departamentoCUT.setValue(comp_CMB_departamentoCUT.getValue());

comp_CMB_distritoCUT.setDisabled(true);


Comboitem item0 = new Comboitem();                
item0.setLabel(comp_CMB_distritoCUT.getValue());
item0.setValue(comp_CMB_distritoCUT.getValue());
item0.setParent(comp_CMB_distritoCUT); 

comp_CMB_distritoCUT.setValue(comp_CMB_distritoCUT.getValue());


comp_IN_sectorCUT.setDisabled(true);
comp_IN_manzanaCut.setDisabled(true);
comp_IN_parcelaCUT.setDisabled(true);
comp_IN_subParcelaCUT.setDisabled(true);
comp_TXT_AsientoCUT.setDisabled(true);
comp_TXT_matriculaTomoCut.setDisabled(true);
comp_DA_fechaCut.setDisabled(true);

comp_CMB_departamentoDominioInput.setDisabled(true);
Comboitem item1 = new Comboitem();                
item1.setLabel(comp_CMB_departamentoDominioInput.getValue());
item1.setValue(comp_CMB_departamentoDominioInput.getValue());
item1.setParent(comp_CMB_departamentoDominioInput); 

comp_DA_fechaCut.setDisabled(true);
comp_TXT_nombreTramitente1.setDisabled(true);
comp_TXT_dniTramitente1.setDisabled(true);
comp_TXT_nombreTramitente2.setDisabled(true);
comp_TXT_dniTramitente2.setDisabled(true);
comp_TXT_nombreTramitente3.setDisabled(true);
comp_TXT_dniTramitente3.setDisabled(true);

for(i=1;i<=comp_RA_personaFisicaJuridica.getItemCount();i++)
{
  org.zkoss.zul.Radio radio = comp_RA_personaFisicaJuridica.getItemAtIndex(i-1);
  radio.setDisabled(true);
}

comp_TXT_personaAdquirente1Nombre.setDisabled(true);
comp_TXT_personaAdquirente1DNI.setDisabled(true);
comp_DOU_personaAdquirente1Porcentaje.setDisabled(true);
comp_TXT_personaAdquirente2Nombre.setDisabled(true);
comp_TXT_personaAdquirente2DNI.setDisabled(true);
comp_DOU_personaAdquirente2Porcentaje.setDisabled(true);
comp_TXT_personaAdquirente3Nombre.setDisabled(true);
comp_TXT_personaAdquirente3DNI.setDisabled(true);
comp_DOU_personaAdquirente3Porcentaje.setDisabled(true);


comp_CMB_departamentoFisico.setDisabled(true);
comp_CMB_distritoFisico.setDisabled(true);
comp_CMB_calleFisico.setDisabled(true);
comp_IN_calleFisicoNumero.setDisabled(true);
comp_CMB_BarrioFisicos.setDisabled(true);
comp_TXT_manzanaFisico.setDisabled(true);
comp_TXT_loteFisicos.setDisabled(true);
comp_TXT_fraccionFisicos.setDisabled(true);
comp_CMB_cpFisico.setDisabled(true);
comp_CHK_igualUbicacionPostalSi.setDisabled(true);
comp_CHK_igualUbicacionPostalNO.setDisabled(true);
comp_CMB_departamentoPostal.setDisabled(true);
comp_CMB_distritoPostals.setDisabled(true);
comp_CMB_callePostal.setDisabled(true);
comp_IN_numeroPostal.setDisabled(true);
comp_CMB_barrioPostal.setDisabled(true);
comp_TXT_manzanaPostal.setDisabled(true);
comp_TXT_LotePostal.setDisabled(true);
comp_TXT_fraccionPostal.setDisabled(true);
comp_CMB_cpPostal.setDisabled(true);
comp_TXT_numeroPlano.setDisabled(true);
comp_DOU_segunTituloInmueble.setDisabled(true);
comp_DOU_segunPlanoInmueble.setDisabled(true);
comp_DOU_supTituloTransferirM2.setDisabled(true);
comp_DOU_supPlanoTrasferir.setDisabled(true);

comp_TXT_CutPHEdificio.setDisabled(true);
comp_CMB_CutPHCalle.setDisabled(true);
comp_TXT_CutPHPiso.setDisabled(true);
comp_TXT_CutPHUnidad.setDisabled(true);
comp_TXT_CutPHDesignacion.setDisabled(true);

//configuracion de los combos
Comboitem item = new Comboitem();                
item.setLabel(comp_CMB_zonaEscribano.getValue());
item.setValue(comp_CMB_zonaEscribano.getValue());
item.setParent(comp_CMB_zonaEscribano); 

comp_CMB_zonaEscribano.setValue(comp_CMB_zonaEscribano.getValue());
comp_CMB_tramite.setValue(comp_CMB_tramite.getValue());
comp_CMB_departamentoCUT.setValue(comp_CMB_departamentoCUT.getValue());
comp_CMB_distritoCUT.setValue(comp_CMB_distritoCUT.getValue());
comp_CMB_departamentoDominioInput.setValue(comp_CMB_departamentoDominioInput.getValue());
comp_CMB_departamentoFisico.setValue(comp_CMB_departamentoFisico.getValue());
comp_CMB_distritoFisico.setValue(comp_CMB_distritoFisico.getValue());
comp_CMB_calleFisico.setValue(comp_CMB_calleFisico.getValue());
comp_CMB_BarrioFisicos.setValue(comp_CMB_BarrioFisicos.getValue());
comp_CMB_cpFisico.setValue(comp_CMB_cpFisico.getValue());
comp_CMB_departamentoPostal.setValue(comp_CMB_departamentoPostal.getValue());
comp_CMB_distritoPostals.setValue(comp_CMB_distritoPostals.getValue());
comp_CMB_callePostal.setValue(comp_CMB_callePostal.getValue());
comp_CMB_barrioPostal.setValue(comp_CMB_barrioPostal.getValue());
comp_CMB_cpPostal.setValue(comp_CMB_cpPostal.getValue());
comp_CMB_CutPHCalle.setValue(comp_CMB_CutPHCalle.getValue());
comp_TXT_domicilioPersona.setDisabled(true);


Textbox comp_TXT_CutPHDestino=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHDestino");
Datebox comp_DA_fechaCut=(Datebox) sup.getInstanciaComponente("comp_DA_fechaCut");
Doublebox comp_DOU_CutPHSupCubPropia=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubPropia");
Doublebox comp_DOU_CutPHSupCubComun=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubComun");
Doublebox comp_DOU_CutPHSupCubTotal=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubTotal");
Doublebox comp_DOU_CutPHPorcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHPorcentaje");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");


comp_TXT_CutPHDestino.setDisabled(true);
comp_DOU_CutPHSupCubPropia.setDisabled(true);
comp_DOU_CutPHSupCubComun.setDisabled(true);
comp_DOU_CutPHSupCubTotal.setDisabled(true);
comp_DOU_CutPHPorcentaje.setDisabled(true);
comp_TXT_emailEscribano.setDisabled(true);
comp_DA_fechaCut.setDisabled(true);

Listbox comp_GRID_tramiteGrilla=(Listbox) sup.getInstanciaComponente("comp_GRID_tramiteGrilla");

String comparar=comp_CMB_tramite.getValue();
String comparar2="";
String valor="";

for (java.util.Iterator it = comp_GRID_tramiteGrilla.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

       comparar2 = li.getChildren().get(1).getLabel().trim(); // obtengo el valor del campo de la columna 9 


    
		if(comparar.equals(comparar2)){
           valor = li.getChildren().get(0).getLabel().trim();
            
        }

}


Groupbox cont_certUnicoTransferencia=(Groupbox) sup.getInstanciaComponente("cont_certUnicoTransferencia");


if(valor.equals("1") || valor.equals("2")){
    cont_certUnicoTransferencia.setVisible(true);
}else{
    cont_certUnicoTransferencia.setVisible(false);
}

Button comp_BTN_agregarTramitente=(Button) sup.getInstanciaComponente("comp_BTN_agregarTramitente");
Button comp_BTN_eliminarTramitente=(Button) sup.getInstanciaComponente("comp_BTN_eliminarTramitente");

comp_BTN_agregarTramitente.setVisible(false);
comp_BTN_eliminarTramitente.setVisible(false);


Groupbox cont_requisitosTramitess=(Groupbox) sup.getInstanciaComponente("cont_requisitosTramitess");

cont_requisitosTramitess.setVisible(false);

int a =Integer.parseInt(valor);    
    
    switch(a){
            
            case 1:
            	if(comp_IN_subParcelaCUT.getValue() == 0){
                    dis_planoDigitalizado1.setVisible(true);
                    dis_planchaATM1.setVisible(true);
                }else{
                    
                    dis_planoDigitalizado1.setVisible(false); 
                    dis_planchaATM1.setVisible(false);
                }
                
	            dis_notaSolicitud1.setVisible(false);
	            dis_notaConec1.setVisible(false);
	            dis_numeroCliente1.setVisible(false);
	            
            	break;
            case 2:
                if(comp_IN_subParcelaCUT.getValue() == 0){
                    dis_planoDigitalizado1.setVisible(true);
                    dis_planchaATM1.setVisible(true);
                }else{
                    dis_planoDigitalizado1.setVisible(false);
                    dis_planchaATM1.setVisible(false);
                }
		        dis_notaSolicitud1.setVisible(false);
		        dis_notaConec1.setVisible(false);
		        dis_numeroCliente1.setVisible(false);
                break;
            case 3:
           		dis_planoDigitalizado1.setVisible(true);
           		dis_planchaATM1.setVisible(true);
          		dis_notaSolicitud1.setVisible(true);
            	dis_notaConec1.setVisible(false);
            	dis_numeroCliente1.setVisible(false);

            	break;
            case 4:
              	dis_planoDigitalizado1.setVisible(true);
            	dis_planchaATM1.setVisible(true);
           		dis_notaSolicitud1.setVisible(true);
            	dis_notaConec1.setVisible(true);
            	dis_numeroCliente1.setVisible(false);
                break;
            case 5:
                
            	dis_planoDigitalizado1.setVisible(true);
       		    dis_planchaATM1.setVisible(true);
            	dis_notaSolicitud1.setVisible(true);
            	dis_notaConec1.setVisible(false);
            	dis_numeroCliente1.setVisible(false);
            	break;
            case 11:
            	dis_planoDigitalizado1.setVisible(false);
                dis_planchaATM1.setVisible(false);
            	dis_notaSolicitud1.setVisible(false);
            	dis_notaConec1.setVisible(false);
            	dis_numeroCliente1.setVisible(true);

                break;
            case 12:
            	dis_planoDigitalizado1.setVisible(false);
                dis_planchaATM1.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente1.setVisible(false);
            	break;
            
    }

// Ocultar por defecto tramitentes 2/3 del CUT y Botones Agregar/eliminar
if(comp_TXT_nombreTramitente2.getValue().equals("-") && comp_TXT_dniTramitente2.getValue().equals("-")){
	dis_nombreTramitente2.setVisible(false);
	
}
if(comp_TXT_nombreTramitente3.getValue().equals("-") && comp_TXT_dniTramitente3.getValue().equals("-")){
	dis_nombreTramitente3.setVisible(false);
}

comp_BTN_agregarTramitente.setVisible(false);
comp_BTN_eliminarTramitente.setVisible(false);

// Ocultar por defecto adquirentes 2/3 del CUT y Botones Agregar/eliminar
if(comp_TXT_personaAdquirente2Nombre.getValue().equals("-") && comp_TXT_personaAdquirente2DNI.getValue().equals("-")){
	dis_personaAdquirente2.setVisible(false);
}

if(comp_TXT_personaAdquirente3Nombre.getValue().equals("-") && comp_TXT_personaAdquirente3DNI.getValue().equals("-")){
	dis_personaAdquirente3.setVisible(false);
}

comp_BTN_agregarAdquirente.setVisible(false);
comp_BTN_eliminarAdquirente.setVisible(false);
            




comp_CMB_departamentoDominioInput.setDisabled(true);
Comboitem item1 = new Comboitem();
item1.setLabel(comp_CMB_departamentoDominioInput.getValue());
item1.setValue(comp_CMB_departamentoDominioInput.getValue());
item1.setParent(comp_CMB_departamentoDominioInput);


comp_CMB_departamentoFisico.setDisabled(true);
Comboitem item18 = new Comboitem();
item18.setLabel(comp_CMB_departamentoFisico.getValue());
item18.setValue(comp_CMB_departamentoFisico.getValue());
item18.setParent(comp_CMB_departamentoFisico);
comp_CMB_distritoFisico.setDisabled(true);
Comboitem item17 = new Comboitem();
item17.setLabel(comp_CMB_distritoFisico.getValue());
item17.setValue(comp_CMB_distritoFisico.getValue());
item17.setParent(comp_CMB_distritoFisico);
comp_CMB_calleFisico.setDisabled(true);
Comboitem item16 = new Comboitem();
item16.setLabel(comp_CMB_calleFisico.getValue());
item16.setValue(comp_CMB_calleFisico.getValue());
item16.setParent(comp_CMB_calleFisico);
comp_CMB_BarrioFisicos.setDisabled(true);
Comboitem item15 = new Comboitem();
item15.setLabel(comp_CMB_BarrioFisicos.getValue());
item15.setValue(comp_CMB_BarrioFisicos.getValue());
item15.setParent(comp_CMB_BarrioFisicos);
comp_CMB_cpFisico.setDisabled(true);
Comboitem item14 = new Comboitem();
item14.setLabel(comp_CMB_cpFisico.getValue());
item14.setValue(comp_CMB_cpFisico.getValue());
item14.setParent(comp_CMB_cpFisico);
comp_CMB_departamentoPostal.setDisabled(true);
Comboitem item13 = new Comboitem();
item13.setLabel(comp_CMB_departamentoPostal.getValue());
item13.setValue(comp_CMB_departamentoPostal.getValue());
item13.setParent(comp_CMB_departamentoPostal);
comp_CMB_distritoPostals.setDisabled(true);
Comboitem item12 = new Comboitem();
item12.setLabel(comp_CMB_distritoPostals.getValue());
item12.setValue(comp_CMB_distritoPostals.getValue());
item12.setParent(comp_CMB_distritoPostals);
comp_CMB_callePostal.setDisabled(true);
Comboitem item11 = new Comboitem();
item11.setLabel(comp_CMB_callePostal.getValue());
item11.setValue(comp_CMB_callePostal.getValue());
item11.setParent(comp_CMB_callePostal);


Comboitem item2 = new Comboitem();
item2.setLabel(comp_CMB_tramite.getValue());
item2.setValue(comp_CMB_tramite.getValue());
item2.setParent(comp_CMB_tramite); 

comp_CMB_tramite.setValue(comp_CMB_tramite.getValue());


Comboitem item3 = new Comboitem();
item3.setLabel(comp_CMB_departamentoDominioInput.getValue());
item3.setValue(comp_CMB_departamentoDominioInput.getValue());
item3.setParent(comp_CMB_departamentoDominioInput); 

comp_CMB_departamentoDominioInput.setValue(comp_CMB_departamentoDominioInput.getValue());


Comboitem item3 = new Comboitem();
item3.setLabel(comp_CMB_CutPHCalle.getValue());
item3.setValue(comp_CMB_CutPHCalle.getValue());
item3.setParent(comp_CMB_CutPHCalle); 

comp_CMB_CutPHCalle.setValue(comp_CMB_CutPHCalle.getValue());


Comboitem item5 = new Comboitem();
item5.setLabel(comp_CMB_zonaEscribano.getValue());
item5.setValue(comp_CMB_zonaEscribano.getValue());
item5.setParent(comp_CMB_zonaEscribano); 

comp_CMB_zonaEscribano.setValue(comp_CMB_zonaEscribano.getValue());


comp_CMB_barrioPostal.setDisabled(true);
Comboitem item10 = new Comboitem();
item10.setLabel(comp_CMB_barrioPostal.getValue());
item10.setValue(comp_CMB_barrioPostal.getValue());
item10.setParent(comp_CMB_barrioPostal);
comp_CMB_CutPHCalle.setDisabled(true);
Comboitem item9 = new Comboitem();
item9.setLabel(comp_CMB_CutPHCalle.getValue());
item9.setValue(comp_CMB_CutPHCalle.getValue());
item9.setParent(comp_CMB_CutPHCalle);


Comboitem item25 = new Comboitem();
item25.setLabel(comp_CMB_cpPostal.getValue());
item25.setValue(comp_CMB_cpPostal.getValue());
item25.setParent(comp_CMB_cpPostal);


Radiogroup comp_RA_personaFisicaJuridicaTr = (Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridicaTr");

for(i=1;i<=comp_RA_personaFisicaJuridicaTr.getItemCount();i++)
{
  org.zkoss.zul.Radio radio = comp_RA_personaFisicaJuridicaTr.getItemAtIndex(i-1);
  radio.setDisabled(true);
}
Groupbox cont_checkBox=(Groupbox) sup.getInstanciaComponente("cont_checkBox");


cont_checkBox.setVisible(false);