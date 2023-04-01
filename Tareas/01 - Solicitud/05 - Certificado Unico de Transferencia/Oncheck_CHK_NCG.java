import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//CONTENEDOR DATOS PH
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");

//CHECKBOX CONTENEDOR CERTIFICADO UNICO DE TRANSFERENCIA
Checkbox comp_CHK_NCG=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCG");
Checkbox comp_CHK_NCT=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCT");

//DIV CONTENEDOR CERTIFICADO UNICO DE TRANSFERENCIA
Div dis_nomCatastral=(Div) sup.getInstanciaComponente("dis_nomCatastral");
Div dis_departamento=(Div) sup.getInstanciaComponente("dis_departamento");
Div dis_sectorCUT=(Div) sup.getInstanciaComponente("dis_sectorCUT");

Div dis_nomCatastralGeoreferenciada=(Div) sup.getInstanciaComponente("dis_nomCatastralGeoreferenciada");
Div dis_departamento_GEO=(Div) sup.getInstanciaComponente("dis_departamento_GEO");

//INTBOX DEL CONTENEDOR CERTIFICADO UNICO DE TRANSFERENCIA
Intbox comp_IN_DVGeo=(Intbox) sup.getInstanciaComponente("comp_IN_DVGeo");
Intbox comp_IN_coordX=(Intbox) sup.getInstanciaComponente("comp_IN_coordX");
Intbox comp_IN_subParcelaCUT_GEO=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT_GEO");
Intbox comp_IN_coordY=(Intbox) sup.getInstanciaComponente("comp_IN_coordY");

if(comp_CHK_NCG.isChecked()){
    comp_CHK_NCT.setChecked(false);
    
    dis_nomCatastralGeoreferenciada.setVisible(true);
	dis_departamento_GEO.setVisible(true);
    dis_nomCatastral.setVisible(false);
	dis_departamento.setVisible(false);
	dis_sectorCUT.setVisible(false);
    
    //Si se check esta desahabilitado y vuelve a habilitarlo, se setean nuevamente todos los datos
    comp_IN_DVGeo.setValue(0);
	comp_IN_coordX.setValue(0);
	comp_IN_subParcelaCUT_GEO.setValue(0);
	comp_IN_coordY.setValue(0);
    //Si el check esta deshabilitado y vuelve a habilitarlo, se oculta el Contenedor DATOS CUT PHP
    cont_datosCUTPH.setVisible(false);
    

}else{
    comp_CHK_NCT.setChecked(false);
    
    dis_nomCatastralGeoreferenciada.setVisible(true);
	dis_departamento_GEO.setVisible(false);
    dis_nomCatastral.setVisible(true);
	dis_departamento.setVisible(false);
	dis_sectorCUT.setVisible(false);
    
    //Si el check esta deshabilitado y vuelve a habilitarlo, se oculta el Contenedor DATOS CUT PHP
    cont_datosCUTPH.setVisible(false);
}



