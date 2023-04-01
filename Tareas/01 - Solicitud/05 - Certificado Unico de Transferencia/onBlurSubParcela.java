import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");

Combobox comp_CMB_tramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");

Div dis_planoDigitalizado=(Div) sup.getInstanciaComponente("dis_planoDigitalizado");
Div dis_planchaATM=(Div) sup.getInstanciaComponente("dis_planchaATM");
Div dis_notaSolicitud=(Div) sup.getInstanciaComponente("dis_notaSolicitud");
Div dis_notaUbicacionConexión =(Div) sup.getInstanciaComponente("dis_notaUbicacionConexión ");
Div dis_numeroCliente=(Div) sup.getInstanciaComponente("dis_numeroCliente");

Div dis_supPlanoTrasferir=(Div) sup.getInstanciaComponente("dis_supPlanoTrasferir");
Div dis_superficieInmueble=(Div) sup.getInstanciaComponente("dis_superficieInmueble");
Div dis_segunTituloInmueble=(Div) sup.getInstanciaComponente("dis_segunTituloInmueble");
Div dis_segunPlanoInmueble=(Div) sup.getInstanciaComponente("dis_segunPlanoInmueble");
Div dis_superficieATransferir=(Div) sup.getInstanciaComponente("dis_superficieATransferir");
Div dis_supTituloTransferir=(Div) sup.getInstanciaComponente("dis_supTituloTransferir");

Textbox comp_TXT_numeroPlano=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroPlano");
Label comp_LA_numeroPlano=(Label) sup.getInstanciaComponente("comp_LA_numeroPlano");

Div dis_planoDigitalizado1=(Div) sup.getInstanciaComponente("dis_planoDigitalizado1");
Div dis_planchaATM1=(Div) sup.getInstanciaComponente("dis_planchaATM1");
Div dis_notaSolicitud1=(Div) sup.getInstanciaComponente("dis_notaSolicitud1");
Div dis_notaConec1=(Div) sup.getInstanciaComponente("dis_notaConec1");
Div dis_numeroCliente1=(Div) sup.getInstanciaComponente("dis_numeroCliente1");

Groupbox cont_requisitosTramitess=(Groupbox) sup.getInstanciaComponente("cont_requisitosTramitess");
Groupbox cont_certUnicoTransferencia=(Groupbox) sup.getInstanciaComponente("cont_certUnicoTransferencia");


// Verificacion de valores incorecctos
if(comp_IN_subParcelaCUT.getValue()==null || comp_IN_subParcelaCUT.getValue()==""){
    comp_IN_subParcelaCUT.setValue(0);
}else if(comp_IN_subParcelaCUT.getValue()<0){
    int aux = comp_IN_subParcelaCUT.getValue();
    aux = aux * -1;
    comp_IN_subParcelaCUT.setValue(aux);
//}else if(comp_IN_subParcelaCUT.getValue()==0){
  //  Messagebox.show("Por favor, ingrese un valor distinto de 0 en la Sub-parcela","Advertencia",null,null,null);
}else if(comp_IN_subParcelaCUT.getValue()>9999){
    Messagebox.show("Por favor, ingrese un valor entre 1 y 9999 en la Sub-parcela","Advertencia",null,null,null);
    comp_IN_subParcelaCUT.setValue(0);
}

// Habilitar contenedor datosCUTPH
if(comp_IN_subParcelaCUT.getValue()!=0){
    cont_datosCUTPH.setVisible(true);
    dis_supPlanoTrasferir.setVisible(false);
    dis_superficieInmueble.setVisible(false);
    dis_segunTituloInmueble.setVisible(false);
    dis_segunPlanoInmueble.setVisible(false);
    dis_superficieATransferir.setVisible(false);
    dis_supTituloTransferir.setVisible(false);
    comp_TXT_numeroPlano.setVisible(false);
    comp_LA_numeroPlano.setVisible(false);
    
}else{
    cont_datosCUTPH.setVisible(false);
    dis_supPlanoTrasferir.setVisible(true);
    dis_superficieInmueble.setVisible(true);
    dis_segunTituloInmueble.setVisible(true);
    dis_segunPlanoInmueble.setVisible(true);
    dis_superficieATransferir.setVisible(true);
    dis_supTituloTransferir.setVisible(true);
    comp_TXT_numeroPlano.setVisible(true);
    comp_LA_numeroPlano.setVisible(true);

}

// Codigo adaptado desde comp_CMB_tramite
if(comp_CMB_tramite.getSelectedIndex() == 1){
    
    if(comp_IN_subParcelaCUT.getValue()==0){
        
        dis_planoDigitalizado.setVisible(true);
        dis_planoDigitalizado1.setVisible(true);
        dis_planchaATM.setVisible(false);
        dis_planchaATM1.setVisible(false);
        cont_requisitosTramitess.setVisible(true);
    }else{
                    
        dis_planoDigitalizado.setVisible(false);  
        dis_planoDigitalizado1.setVisible(false); 
        dis_planchaATM.setVisible(false);
        dis_planchaATM1.setVisible(false);
        cont_requisitosTramitess.setVisible(false);
    }
    
}
else if(comp_CMB_tramite.getSelectedIndex() == 2){
    
    if(comp_IN_subParcelaCUT.getValue()==0){
        dis_planoDigitalizado.setVisible(true); 
        dis_planoDigitalizado1.setVisible(true);
        dis_planchaATM.setVisible(false);
        dis_planchaATM1.setVisible(false);
        cont_requisitosTramitess.setVisible(true);
    }else{
        dis_planoDigitalizado.setVisible(false);    
        dis_planoDigitalizado1.setVisible(false);
        dis_planchaATM.setVisible(false);
        dis_planchaATM1.setVisible(false);
        cont_requisitosTramitess.setVisible(false);
    }
}