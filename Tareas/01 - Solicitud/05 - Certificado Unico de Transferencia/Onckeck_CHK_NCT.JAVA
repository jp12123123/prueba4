import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


//CONTENEDORES
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");

//CHECKBOX
Checkbox comp_CHK_NCT=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCT");
Checkbox comp_CHK_NCG=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCG");

//DIV
Div dis_nomCatastralGeoreferenciada=(Div) sup.getInstanciaComponente("dis_nomCatastralGeoreferenciada");
Div dis_departamento_GEO=(Div) sup.getInstanciaComponente("dis_departamento_GEO");

Div dis_nomCatastral=(Div) sup.getInstanciaComponente("dis_nomCatastral");
Div dis_departamento=(Div) sup.getInstanciaComponente("dis_departamento");
Div dis_sectorCUT=(Div) sup.getInstanciaComponente("dis_sectorCUT");

//INTBOX
Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");
Intbox comp_IN_DVCata=(Intbox) sup.getInstanciaComponente("comp_IN_DVCata");
Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");
Intbox comp_IN_digitoVerificador=(Intbox) sup.getInstanciaComponente("comp_IN_digitoVerificador");
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");
Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");




if(comp_CHK_NCT.isChecked()){
    comp_CHK_NCG.setChecked(false);
    dis_nomCatastral.setVisible(true);
	dis_departamento.setVisible(true);
	dis_sectorCUT.setVisible(true);
    
    dis_nomCatastralGeoreferenciada.setVisible(false);
	dis_departamento_GEO.setVisible(false);
    
    //Si se check esta desahabilitado y vuelve a habilitarlo, se setean nuevamente todos los datos
    comp_IN_sectorCUT.setValue(0);
    comp_IN_manzanaCut.setValue(0);
    comp_IN_parcelaCUT.setValue(0);
    comp_IN_subParcelaCUT.setValue(0);
	comp_IN_DVCata.setValue(0); 
    //Si el check esta deshabilitado y vuelve a habilitarlo, se oculta el Contenedor DATOS CUT PHP
    cont_datosCUTPH.setVisible(false);
    
}else{
    
    dis_nomCatastral.setVisible(true);
	dis_departamento.setVisible(false);
	dis_sectorCUT.setVisible(false);
    dis_nomCatastralGeoreferenciada.setVisible(true);
	dis_departamento_GEO.setVisible(false);
    
    //Si el check esta deshabilitado y vuelve a habilitarlo, se oculta el Contenedor DATOS CUT PHP
    cont_datosCUTPH.setVisible(false);
}



