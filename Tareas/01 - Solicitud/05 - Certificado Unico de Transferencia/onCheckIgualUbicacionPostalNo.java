
import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Checkbox comp_CHK_igualUbicacionPostalSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalSi");
Checkbox comp_CHK_igualUbicacionPostalNO=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalNO");

Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Combobox comp_CMB_callePostal=(Combobox) sup.getInstanciaComponente("comp_CMB_callePostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");
Textbox comp_TXT_manzanaPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaPostal");
Textbox comp_TXT_LotePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_LotePostal");
Textbox comp_TXT_fraccionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionPostal");
Textbox comp_TXT_numeroPlano=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroPlano");
Intbox comp_IN_numeroPostal=(Intbox) sup.getInstanciaComponente("comp_IN_numeroPostal");

Bandbox comp_BANDBOX_callePostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_callePostal");
Bandbox comp_BANDBOX_barrioPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrioPostal");
Bandbox comp_BANDBOX_cpPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpPostal");

//Textboxs del domicilio postal
Textbox comp_TXT_barrioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_barrioPostal");
Textbox comp_TXT_callePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_callePostal");
Textbox comp_TXT_cpPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_cpPostal");


Textbox comp_TXT_idDepartamentoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idDepartamentoPostal");
Textbox comp_TXT_idDistritoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idDistritoPostal");
Textbox comp_TXT_idCallePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idCallePostal");
Textbox comp_TXT_idBarrioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idBarrioPostal");


Textbox comp_TXT_idCodigoPostal2=(Textbox) sup.getInstanciaComponente("comp_TXT_idCodigoPostal2");

//TEXBOX UNIDADPOSTAL DEL CONTENEDOR CONT_CERTUNICTRANSFERENCIA
Textbox comp_TXT_UnidadPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_UnidadPostal");
Textbox comp_TXT_DesignacionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_DesignacionPostal");

//COMBOBOX UNIDADPOSTAL DEL CONTENEDOR CONT_CERTUNICTRANSFERENCIA
Combobox comp_CMB_DestinoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_DestinoPostal");

//TEXTBOX EDIFICIOPOSTAL DEL CONTENEDOR CONT_CERTUNICTRANSFERENCIA
Textbox comp_TXT_EdificioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_EdificioPostal");
Textbox comp_TXT_PisoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_PisoPostal");
Textbox comp_TXT_DepatoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_DepatoPostal");


comp_TXT_idCodigoPostal2.setValue("-");


if(comp_CHK_igualUbicacionPostalNO.isChecked()){
    comp_CHK_igualUbicacionPostalSi.setChecked(false);

    comp_CMB_departamentoPostal.setValue("-");
    comp_CMB_distritoPostals.setValue("-");
    comp_CMB_callePostal.setValue("-");
    comp_CMB_barrioPostal.setValue("-");
    comp_CMB_barrioPostal.setValue("-");
    comp_CMB_cpPostal.setValue("-");
    comp_TXT_manzanaPostal.setValue("-");
    comp_TXT_LotePostal.setValue("-");
    comp_TXT_fraccionPostal.setValue("-");
    comp_IN_numeroPostal.setValue(0);
    //comp_TXT_numeroPlano.setValue("0");
    comp_TXT_idDepartamentoPostal.setValue("-");
    comp_TXT_idDistritoPostal.setValue("-");
    comp_TXT_idCallePostal.setValue("-");
    comp_TXT_idBarrioPostal.setValue("-");
    comp_BANDBOX_cpPostal.setValue("");
    comp_BANDBOX_barrioPostal.setValue("");
    comp_BANDBOX_callePostal.setValue("");
    
    comp_CMB_departamentoPostal.setDisabled(false);
    comp_CMB_distritoPostals.setDisabled(false);
    comp_CMB_callePostal.setDisabled(false);
    comp_CMB_barrioPostal.setDisabled(false);
    comp_CMB_barrioPostal.setDisabled(false);
    comp_CMB_cpPostal.setDisabled(false);
    comp_BANDBOX_cpPostal.setDisabled(false);
    comp_BANDBOX_barrioPostal.setDisabled(false);
    comp_BANDBOX_callePostal.setDisabled(false);
    comp_TXT_manzanaPostal.setDisabled(false);
    comp_TXT_LotePostal.setDisabled(false);
    comp_TXT_fraccionPostal.setDisabled(false);
	comp_IN_numeroPostal.setDisabled(false);
    //comp_TXT_numeroPlano.setDisabled(false);
    //UNIDAD POSTAL
    comp_TXT_UnidadPostal.setDisabled(false);
    comp_TXT_DesignacionPostal.setDisabled(false);
    comp_CMB_DestinoPostal.setDisabled(false);
    //EDIFICIO POSTAL
    comp_TXT_EdificioPostal.setDisabled(false);
    comp_TXT_PisoPostal.setDisabled(false);
    comp_TXT_DepatoPostal.setDisabled(false);
    
    comp_TXT_barrioPostal.setValue("");
    comp_TXT_callePostal.setValue("");
    comp_TXT_cpPostal.setValue("");
    
    comp_TXT_idCodigoPostal2.setValue("-");

}