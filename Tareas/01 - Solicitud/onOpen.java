import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//componentes
Combobox comp_CMB_zonaEscribano=(Combobox) sup.getInstanciaComponente("comp_CMB_zonaEscribano");
Textbox comp_TXT_nombreEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreEscribano");
Textbox comp_TXT_apellidoEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoEscribano");
Textbox comp_TXT_domicilioEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioEscribano");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Listbox comp_GRID_grillaZonaEscribano=(Listbox) sup.getInstanciaComponente("comp_GRID_grillaZonaEscribano");
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Groupbox cont_requisitosTramitess=(Groupbox) sup.getInstanciaComponente("cont_requisitosTramitess");

Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_condicionImpositivaVendedor=(Combobox) sup.getInstanciaComponente("comp_CMB_condicionImpositivaVendedor");

Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");

Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");

Checkbox comp_CHK_igualUbicacionPostalSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalSi");
Checkbox comp_CHK_igualUbicacionPostalNO=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalNO");

Div dis_supPlanoTrasferir=(Div) sup.getInstanciaComponente("dis_supPlanoTrasferir");
Div dis_superficieInmueble=(Div) sup.getInstanciaComponente("dis_superficieInmueble");
Div dis_segunTituloInmueble=(Div) sup.getInstanciaComponente("dis_segunTituloInmueble");
Div dis_segunPlanoInmueble=(Div) sup.getInstanciaComponente("dis_segunPlanoInmueble");
Div dis_superficieATransferir=(Div) sup.getInstanciaComponente("dis_superficieATransferir");
Div dis_supTituloTransferir=(Div) sup.getInstanciaComponente("dis_supTituloTransferir");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");
Div dis_condicionImpositiva=(Div) sup.getInstanciaComponente("dis_condicionImpositiva");
Div dis_razonSocialPersonaNO=(Div) sup.getInstanciaComponente("dis_razonSocialPersonaNO");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");

Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Combobox comp_CMB_callePostal=(Combobox) sup.getInstanciaComponente("comp_CMB_callePostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");
Textbox comp_TXT_manzanaPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaPostal");
Textbox comp_TXT_LotePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_LotePostal");
Textbox comp_TXT_fraccionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionPostal");
Intbox comp_IN_numeroPostal=(Intbox) sup.getInstanciaComponente("comp_IN_numeroPostal");

Combobox comp_CMB_tramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");

Listbox comp_GRID_tramiteGrilla=(Listbox) sup.getInstanciaComponente("comp_GRID_tramiteGrilla");

Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_condImposTrans=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposTrans");
Combobox comp_CMB_condImposAdq=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposAdq");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");

Listbox comp_GRID_GrillasAuxDepartamentoDomicilio=(Listbox) sup.getInstanciaComponente("comp_GRID_GrillasAuxDepartamentoDomicilio");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");

Listbox comp_GRID_departamentoCatastro=(Listbox) sup.getInstanciaComponente("comp_GRID_departamentoCatastro");

Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");

Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");
Combobox comp_CMB_cpFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_cpFisico");

Textbox comp_TXT_idPersonaFisicaJuridicaAdquirente=(Textbox) sup.getInstanciaComponente("comp_TXT_idPersonaFisicaJuridicaAdquirente");

Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Listbox comp_GRID_grillDistro=(Listbox) sup.getInstanciaComponente("comp_GRID_grillDistro");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");

Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");

Listbox comp_GRID_codigoPostal=(Listbox) sup.getInstanciaComponente("comp_GRID_codigoPostal");

Listbox comp_GRID_barrios=(Listbox) sup.getInstanciaComponente("comp_GRID_barrios");

Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

Div dis_cuenta=(Div) sup.getInstanciaComponente("dis_cuenta");
Div dis_nombreCuenta=(Div) sup.getInstanciaComponente("dis_nombreCuenta");
Div dis_apellidoCuenta=(Div) sup.getInstanciaComponente("dis_apellidoCuenta");
Div dis_domicilio=(Div) sup.getInstanciaComponente("dis_domicilio");
Div dis_persona=(Div) sup.getInstanciaComponente("dis_persona");
//Div dis_nombrePersona=(Div) sup.getInstanciaComponente("dis_nombrePersona");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Div dis_2daTarea=(Div) sup.getInstanciaComponente("dis_2daTarea");

Div dis_nombreTramitente2=(Div) sup.getInstanciaComponente("dis_nombreTramitente2");
Div dis_nombreTramitente3=(Div) sup.getInstanciaComponente("dis_nombreTramitente3");

Div dis_personaAdquirente2=(Div) sup.getInstanciaComponente("dis_personaAdquirente2");
Div dis_personaAdquirente3=(Div) sup.getInstanciaComponente("dis_personaAdquirente3");

dis_dniPersona.setVisible(false);
dis_cuitPersona.setVisible(false);
dis_condicionImpositiva.setVisible(false);
dis_nombrePersonaNO.setVisible(false);
dis_apellidoPersonaNO.setVisible(false);
dis_razonSocialPersonaNO.setVisible(false);
dis_domicilioPersona.setVisible(false);
cont_requisitosTramitess.setVisible(false);
// Ocultar por defecto tramitentes 2/3 del CUT
dis_nombreTramitente2.setVisible(false);
dis_nombreTramitente3.setVisible(false);
dis_2daTarea.setVisible(false);

// Ocultar por defecto adquirentes 2/3 del CUT
dis_personaAdquirente2.setVisible(false);
dis_personaAdquirente3.setVisible(false);

//Combos de solo lectura
comp_CMB_zonaEscribano.setReadonly(true);
comp_CMB_departamentoCUT.setReadonly(true);
comp_CMB_distritoCUT.setReadonly(true);
comp_CMB_departamentoDominioInput.setReadonly(true);
comp_CMB_departamentoFisico.setReadonly(true);
comp_CMB_distritoFisico.setReadonly(true);
comp_CMB_departamentoPostal.setReadonly(true);
comp_CMB_distritoPostals.setReadonly(true);
comp_CMB_condicionImpositivaVendedor.setReadonly(true);
comp_CMB_condicionImpositivaVendedor.setStyle("background-color: white");

Bandbox comp_BANDBOX_callePostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_callePostal");

//Bandbox barrio instanciacion
org.zkoss.zul.Bandbox comp_BANDBOX_barrio=(org.zkoss.zul.Bandbox) new  modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_barrio");

org.zkoss.zul.Listbox listboxBusqueda=(org.zkoss.zul.Listbox) comp_BANDBOX_barrio.getAttribute("listbox");
listboxBusqueda.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
org.zkoss.zul.Listitem item = listboxBusqueda.getSelectedItem();
String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
comp_BANDBOX_barrio.setValue(valor);
comp_BANDBOX_barrio.close(); 
}
});
org.zkoss.zul.Textbox textBusqueda=(org.zkoss.zul.Textbox) comp_BANDBOX_barrio.getAttribute("textbox");
// org.zkoss.zul.Button buttonBusqueda=(org.zkoss.zul.Button) comp_BANDBOX_barrio.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_barrio.getAttribute("button");

buttonBusqueda.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
listboxBusqueda.getItems().clear();
    
int x = comp_CMB_BarrioFisicos.getItemCount();
for (int i = 0; i < x; i++)
{
    String test = comp_CMB_BarrioFisicos.getItemAtIndex(i).getValue();
    
    if (test.matches("(?i).*"+textBusqueda.getValue()+"(.*)"))
    {
  
        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);
                        
        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda);
            
    }
}

}
});

//Bandbox barrio Postal instanciacion
org.zkoss.zul.Bandbox comp_BANDBOX_barrioPostal=(org.zkoss.zul.Bandbox) new  modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_barrioPostal");

org.zkoss.zul.Listbox listboxBusqueda2=(org.zkoss.zul.Listbox) comp_BANDBOX_barrioPostal.getAttribute("listbox");
listboxBusqueda2.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
org.zkoss.zul.Listitem item = listboxBusqueda2.getSelectedItem();
String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
comp_BANDBOX_barrioPostal.setValue(valor);
comp_BANDBOX_barrioPostal.close(); 
}
});
org.zkoss.zul.Textbox textBusqueda2=(org.zkoss.zul.Textbox) comp_BANDBOX_barrioPostal.getAttribute("textbox");
// org.zkoss.zul.Button buttonBusqueda2=(org.zkoss.zul.Button) comp_BANDBOX_barrioPostal.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda2=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_barrioPostal.getAttribute("button");

buttonBusqueda2.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
listboxBusqueda2.getItems().clear();
    
int x = comp_CMB_BarrioFisicos.getItemCount();
for (int i = 0; i < x; i++)
{
    String test = comp_CMB_BarrioFisicos.getItemAtIndex(i).getValue();
    
    if (test.matches("(?i).*"+textBusqueda2.getValue()+"(.*)"))
    {
  
        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);
                        
        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda2);
            
    }
}

}
});

//Bandbox codigo postal fisico instanciacion
org.zkoss.zul.Bandbox comp_BANDBOX_cpFisico=(org.zkoss.zul.Bandbox) new  modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_cpFisico");

org.zkoss.zul.Listbox listboxBusqueda3=(org.zkoss.zul.Listbox) comp_BANDBOX_cpFisico.getAttribute("listbox");
listboxBusqueda3.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
org.zkoss.zul.Listitem item = listboxBusqueda3.getSelectedItem();
String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
comp_BANDBOX_cpFisico.setValue(valor);
comp_BANDBOX_cpFisico.close(); 
}
});
org.zkoss.zul.Textbox textBusqueda3=(org.zkoss.zul.Textbox) comp_BANDBOX_cpFisico.getAttribute("textbox");
// org.zkoss.zul.Button buttonBusqueda3=(org.zkoss.zul.Button) comp_BANDBOX_cpFisico.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda3=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_cpFisico.getAttribute("button");

buttonBusqueda3.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
listboxBusqueda3.getItems().clear();
    
int x = comp_CMB_cpFisico.getItemCount();
for (int i = 0; i < x; i++)
{
    String test = comp_CMB_cpFisico.getItemAtIndex(i).getValue();
    
    if (test.matches("(?i).*"+textBusqueda3.getValue()+"(.*)"))
    {
  
        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);
                        
        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda3);
            
    }
}

}
});

//Bandbox codigo postal no fisico instanciacion
org.zkoss.zul.Bandbox comp_BANDBOX_cpPostal=(org.zkoss.zul.Bandbox) new  modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_cpPostal");

org.zkoss.zul.Listbox listboxBusqueda4=(org.zkoss.zul.Listbox) comp_BANDBOX_cpPostal.getAttribute("listbox");
listboxBusqueda4.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
org.zkoss.zul.Listitem item = listboxBusqueda4.getSelectedItem();
String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
comp_BANDBOX_cpPostal.setValue(valor);
comp_BANDBOX_cpPostal.close(); 
}
});
org.zkoss.zul.Textbox textBusqueda4=(org.zkoss.zul.Textbox) comp_BANDBOX_cpPostal.getAttribute("textbox");
// org.zkoss.zul.Button buttonBusqueda4=(org.zkoss.zul.Button) comp_BANDBOX_cpPostal.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda4=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_cpPostal.getAttribute("button");

buttonBusqueda4.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
listboxBusqueda4.getItems().clear();
    
int x = comp_CMB_cpPostal.getItemCount();
for (int i = 0; i < x; i++)
{
    String test = comp_CMB_cpPostal.getItemAtIndex(i).getValue();
    
    if (test.matches("(?i).*"+textBusqueda4.getValue()+"(.*)"))
    {
  
        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);
                        
        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda4);
            
    }
}

}
});



comp_CMB_departamentoCUT.setReadonly(true);
comp_CMB_condImposTrans.setReadonly(true);
comp_CMB_condImposAdq.setReadonly(true);
comp_CMB_distritoCUT.setReadonly(true);
comp_CMB_departamentoFisico.setReadonly(true);

comp_CMB_persona.setReadonly(true);
comp_CMB_persona.setStyle("background-color: white");

comp_CMB_departamentoFisico.setStyle("background-color: white");
comp_CMB_departamentoCUT.setStyle("background-color: white");
comp_CMB_condImposTrans.setStyle("background-color: white");
comp_CMB_condImposAdq.setStyle("background-color: white");
comp_CMB_distritoCUT.setStyle("background-color: white");


comp_CMB_departamentoDominioInput.setReadonly(true);
comp_CMB_departamentoPostal.setReadonly(true);

comp_CMB_departamentoDominioInput.setStyle("background-color: white");
comp_CMB_departamentoPostal.setStyle("background-color: white");

comp_CMB_zonaEscribano.setReadonly(true);
comp_TXT_nombreEscribano.setReadonly(true);
comp_TXT_apellidoEscribano.setReadonly(true);
comp_TXT_domicilioEscribano.setReadonly(true);
//comp_TXT_emailEscribano.setReadonly(true);
//comp_TXT_emailEscribano.setStyle("background-color: white");
comp_TXT_domicilioEscribano.setStyle("background-color: white");
comp_CMB_zonaEscribano.setStyle("background-color: white");
comp_TXT_nombreEscribano.setStyle("background-color: white");
comp_TXT_apellidoEscribano.setStyle("background-color: white");



comp_TXT_nombreCuenta.setReadonly(true);
comp_TXT_apellidoCuenta.setReadonly(true);
comp_TXT_domicilioCuenta.setReadonly(true);
comp_CMB_tramite.setReadonly(true);

comp_CMB_tramite.setStyle("background-color: white");

comp_TXT_nombreCuenta.setStyle("background-color: white");
comp_TXT_apellidoCuenta.setStyle("background-color: white");
comp_TXT_domicilioCuenta.setStyle("background-color: white");

Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
//Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
//Label comp_LA_DNIPersona=(Label) sup.getInstanciaComponente("comp_LA_DNIPersona");
//Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");
//Label comp_LA_CUITPersona=(Label) sup.getInstanciaComponente("comp_LA_CUITPersona");
Textbox comp_TXT_numeroPlano=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroPlano");

Comboitem item = new Comboitem();                
    item.setLabel("-");
    item.setValue("-");
    item.setParent(comp_CMB_zonaEscribano);
comp_CMB_zonaEscribano.setValue("-");


Comboitem item10 = new Comboitem();                
    item10.setLabel("-");
    item10.setValue("-");
    item10.setParent(comp_CMB_departamentoDominioInput);
comp_CMB_departamentoDominioInput.setValue("-");

Comboitem item11 = new Comboitem();                
    item11.setLabel("-");
    item11.setValue("-");
    item11.setParent(comp_CMB_departamentoFisico);
comp_CMB_departamentoFisico.setValue("-");

dis_cuenta.setVisible(false);
dis_nombreCuenta.setVisible(false);
dis_apellidoCuenta.setVisible(false);
dis_domicilio.setVisible(false);
dis_persona.setVisible(false);
//dis_nombrePersona.setVisible(false);
dis_nombrePersonaNO.setVisible(false);

/*if(comp_CMB_persona.getSelectedIndex()==0){
    dis_dniPersona.setVisible(true);
    //comp_LA_DNIPersona.setVisible(true);
	dis_cuitPersona.setVisible(false);
    //comp_LA_CUITPersona.setVisible(false);
} 
else if(comp_CMB_persona.getSelectedIndex()==1){
    dis_dniPersona.setVisible(false);
    //comp_LA_DNIPersona.setVisible(false);
    dis_cuitPersona.setVisible(true);
    //comp_LA_CUITPersona.setVisible(true);
}*/

if(comp_CHK_tieneCuentaNo.isChecked()){
    dis_cuenta.setVisible(false);
    dis_nombreCuenta.setVisible(false);
    dis_apellidoCuenta.setVisible(false);
    dis_domicilio.setVisible(false);
    dis_persona.setVisible(true);
    //dis_nombrePersona.setVisible(true);
}
else if(comp_CHK_tieneCuentaSi.isChecked()){
    dis_cuenta.setVisible(false);
    dis_nombreCuenta.setVisible(false);
    dis_apellidoCuenta.setVisible(false);
    dis_domicilio.setVisible(false);
    dis_persona.setVisible(false);
    //dis_nombrePersona.setVisible(false);
}

    comp_CMB_departamentoPostal.setDisabled(true);
    comp_CMB_distritoPostals.setDisabled(true);
    comp_CMB_callePostal.setDisabled(true);
    comp_CMB_barrioPostal.setDisabled(true);
    comp_CMB_barrioPostal.setDisabled(true);
    comp_CMB_cpPostal.setDisabled(true);
    //comp_BANDBOX_cpPostal.setDisabled(true);
    //comp_BANDBOX_callePostal.setDisabled(true);
    //comp_BANDBOX_barrioPostal.setDisabled(true);
    comp_TXT_manzanaPostal.setDisabled(true);
    comp_TXT_LotePostal.setDisabled(true);
    comp_TXT_fraccionPostal.setDisabled(true);
    comp_IN_numeroPostal.setDisabled(true);
    //comp_TXT_numeroPlano.setDisabled(true);

try {
            java.util.List parametrosfnListaZonas = new java.util.ArrayList();
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnListaZonas",parametrosfnListaZonas);
            Map return15mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return15mapa");



            for (int i = 0; i < return15mapa.get("items").size(); i++) {
                String ver = return15mapa.get("items").get(i).get("are_descripcion");
                String identificador = return15mapa.get("items").get(i).get("are_id").toString();

                Comboitem item = new Comboitem();                
                item.setLabel(ver);
                item.setValue(ver);
                item.setParent(comp_CMB_zonaEscribano);

                Listitem item2 = new Listitem();

                org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificador);
                        cell1.setParent(item2);

                org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
                        cell2.setParent(item2);

               org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
                        cell3.setParent(item2);
                
                comp_GRID_grillaZonaEscribano.appendChild(item2);

            }





} catch (Exception e) {
        
        Messagebox.show("El servicio de zona no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}

Comboitem item = new Comboitem();                
                item.setLabel("-");
                item.setValue("-");
                item.setParent(comp_CMB_tramite);

comp_CMB_tramite.setValue("-");  


try{

    java.util.List parametrosfnTramites = new java.util.ArrayList();
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnTramites",parametrosfnTramites);
    Map return17mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return17mapa");
    
    
    for (int i = 0; i < return17mapa.get("items").size(); i++) {
                String ver = return17mapa.get("items").get(i).get("ttm_descripcion");
                String identificador = return17mapa.get("items").get(i).get("ttm_codigo").toString();

                Comboitem item = new Comboitem();                
                item.setLabel(ver);
                item.setValue(ver);
                item.setParent(comp_CMB_tramite);
                
                Listitem item2 = new Listitem();

                org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificador);
                        cell1.setParent(item2);

                org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
                        cell2.setParent(item2);
        
                 org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
                        cell3.setParent(item2); 
              
           
        

                comp_GRID_tramiteGrilla.appendChild(item2);
        
        
    }
    
      
} catch (Exception e) {
        
        Messagebox.show("El servicio de lista tramite no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}




try{

    java.util.List parametrosfndepartamentosDomicilio = new java.util.ArrayList();
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fndepartamentosDomicilio",parametrosfndepartamentosDomicilio);
    Map return21map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return21map");
    
    
    for (int i = 0; i < return21map.get("items").size(); i++) {
                String ver = return21map.get("items").get(i).get("dep_descripcion");
                String identificador = return21map.get("items").get(i).get("dep_codigo").toString();

                Comboitem item = new Comboitem();                
                item.setLabel(ver);
                item.setValue(ver);
                item.setParent(comp_CMB_departamentoDominioInput);
        
                Comboitem item2 = new Comboitem();                
                item2.setLabel(ver);
                item2.setValue(ver);
                item2.setParent(comp_CMB_departamentoPostal);
        
        
                Comboitem item3 = new Comboitem();                
                item3.setLabel(ver);
                item3.setValue(ver);
                item3.setParent(comp_CMB_departamentoFisico);
                
        
                Listitem item4 = new Listitem();

                org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificador);
                        cell1.setParent(item4);

                org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
                        cell2.setParent(item4);
        
                 org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
                        cell3.setParent(item4);
        

                comp_GRID_GrillasAuxDepartamentoDomicilio.appendChild(item4);
                
    
                
    }   

    
} catch (Exception e) {
        
        Messagebox.show("El servicio de departamentos no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}




Comboitem item6 = new Comboitem();
item6.setValue("-");
item6.setLabel("-");
item6.setParent(comp_CMB_departamentoCUT);
//comp_CMB_departamentoCUT.setValue("-");

Comboitem item5 = new Comboitem();
item5.setValue("-");
item5.setLabel("-");
item5.setParent(comp_CMB_distritoCUT);

comp_CMB_departamentoCUT.setValue("-");
comp_CMB_distritoCUT.setValue("-");
//comp_CMB_distritoCUT.setValue("-");

/*
java.util.List parametrosfnPostalesDomicilio = new java.util.ArrayList();
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnPostalesDomicilio",parametrosfnPostalesDomicilio);
Map return21map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return21map");


String ver = return21map.get("items").get(i).get("dep_descripcion");


Messagebox.show(""+ver);
*/






try{
        java.util.List parametrosfnDepartamentos_Catastro = new java.util.ArrayList();
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnDepartamentos_Catastro",parametrosfnDepartamentos_Catastro);
        Map return23map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return23map");
    
  
    
    if(return23map.get("items").size()>0){
        for (int i = 0; i < return23map.get("items").size(); i++) {
            String descripcion = return23map.get("items").get(i).get("descripcion_dep").toString();
            String identificadorID =return23map.get("items").get(i).get("codigo_dep").toString();
            Comboitem item7 = new Comboitem();
            item7.setValue(descripcion);
            item7.setLabel(descripcion);
            item7.setParent(comp_CMB_departamentoCUT);
        
         Listitem item9 = new Listitem();

          org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(identificadorID);
            cell2.setParent(item9);
          org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell(descripcion);
            cell3.setParent(item9);
          org.zkoss.zul.Listcell cell4 = new org.zkoss.zul.Listcell("-");
            cell4.setParent(item9);  
            
                   
            
        
        comp_GRID_departamentoCatastro.appendChild(item9);
        
        }
       
    }
    
}catch (Exception e) {
         Messagebox.show("El servicio de Departamentos Catastro no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}

try{
        
        java.util.List parametrosfnDistritos_Catastro = new java.util.ArrayList();
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnDistritos_Catastro",parametrosfnDistritos_Catastro);
        Map return24map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return24map");

  

    
    if(return24map.get("items").size()>0){
        for (int i = 0; i < return24map.get("items").size(); i++) {
            String descripcion = return24map.get("items").get(i).get("descripcion_dis").toString();
            String identificadorID =return24map.get("items").get(i).get("codigo_dis").toString();
            Comboitem item7 = new Comboitem();
            item7.setValue(descripcion);
            item7.setLabel(descripcion);
            item7.setParent(comp_CMB_distritoCUT);
        
         Listitem item9 = new Listitem();

          org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(identificadorID);
            cell2.setParent(item9);
          org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell(descripcion);
            cell3.setParent(item9);
          org.zkoss.zul.Listcell cell4 = new org.zkoss.zul.Listcell("-");
            cell4.setParent(item9);  
            
            
        comp_GRID_grillDistro.appendChild(item9);
        
        }
       
    }
    
}catch (Exception e) {
         Messagebox.show("El servicio de Distritos Catastro no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}



try{
        

        java.util.List parametrosfnPostalesDomicilio = new java.util.ArrayList();
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnPostalesDomicilio",parametrosfnPostalesDomicilio);
        Map return20map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return20map");

  

    
    if(return20map.get("items").size()>0){
        for (int i = 0; i < return20map.get("items").size(); i++) {
            String descripcion = return20map.get("items").get(i).get("pos_descripcion").toString();
            String identificadorID =return20map.get("items").get(i).get("pos_codigo").toString();
            
            Comboitem item7 = new Comboitem();
            item7.setValue(descripcion);
            item7.setLabel(descripcion);
            item7.setParent(comp_CMB_cpPostal);
            

            Comboitem item8 = new Comboitem();
            item8.setValue(descripcion);
            item8.setLabel(descripcion);
            item8.setParent(comp_CMB_cpFisico);
        
         Listitem item9 = new Listitem();

          org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(identificadorID);
            cell2.setParent(item9);
          org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell(descripcion);
            cell3.setParent(item9);
          org.zkoss.zul.Listcell cell4 = new org.zkoss.zul.Listcell("-");
            cell4.setParent(item9);  
            
        
        comp_GRID_codigoPostal.appendChild(item9);
            
            Listitem itemBandbox3 = new Listitem();
            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(descripcion);
                        
            itemBandbox3.appendChild(cell1);
            itemBandbox3.setParent(listboxBusqueda3);

            Listitem itemBandbox4 = new Listitem();
            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(descripcion);
                        
            itemBandbox4.appendChild(cell1);
            itemBandbox4.setParent(listboxBusqueda4);
            
        }
       
    }
    
}catch (Exception e) {
         Messagebox.show("El servicio de codigo postal no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}

try{
        

      java.util.List parametrosfnBarrioDomicilio = new java.util.ArrayList();
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnBarrioDomicilio",parametrosfnBarrioDomicilio);
Map return26map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return26map");

    
    if(return26map.get("items").size()>0){
        for (int i = 0; i < return26map.get("items").size(); i++) {
            String descripcion = return26map.get("items").get(i).get("bar_descripcion").toString();
            String identificadorID =return26map.get("items").get(i).get("bar_codigo").toString();
            
          
            Comboitem item8 = new Comboitem();
            item8.setValue(descripcion);
            item8.setLabel(descripcion);
            item8.setParent(comp_CMB_BarrioFisicos);
            
            Comboitem item9 = new Comboitem();
            item9.setValue(descripcion);
            item9.setLabel(descripcion);
            item9.setParent(comp_CMB_barrioPostal);
            
            
           Listitem item10 = new Listitem();

            org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(identificadorID);
            cell2.setParent(item10);
             org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell(descripcion);
            cell3.setParent(item10);
            org.zkoss.zul.Listcell cell4 = new org.zkoss.zul.Listcell("-");
            cell4.setParent(item10);
            
            
        
            comp_GRID_barrios.appendChild(item10);
            
            Listitem itemBandbox = new Listitem();
            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(descripcion);
                        
            itemBandbox.appendChild(cell1);
            itemBandbox.setParent(listboxBusqueda);

            Listitem itemBandbox2 = new Listitem();
            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(descripcion);
                        
            itemBandbox2.appendChild(cell1);
            itemBandbox2.setParent(listboxBusqueda2);
            
            
        }
       
    }
    
}catch (Exception e) {
         Messagebox.show("El servicio de Barrios no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
        comp_SAVE_accion.setDisabled(true);
}


Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");
Combobox comp_CMB_cpFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_cpFisico");

comp_CMB_BarrioFisicos.setReadonly(true);
comp_CMB_distritoFisico.setReadonly(true);
comp_CMB_BarrioFisicos.setReadonly(true);
comp_CMB_cpFisico.setReadonly(true);

comp_CMB_BarrioFisicos.setStyle("background-color: white");
comp_CMB_distritoFisico.setStyle("background-color: white");
comp_CMB_BarrioFisicos.setStyle("background-color: white");
comp_CMB_cpFisico.setStyle("background-color: white");




Comboitem item13 = new Comboitem();                
    item13.setLabel("-");
    item13.setValue("-");
    item13.setParent(comp_CMB_BarrioFisicos);
comp_CMB_BarrioFisicos.setValue("-");


Comboitem item14 = new Comboitem();                
    item14.setLabel("-");
    item14.setValue("-");
    item14.setParent(comp_CMB_distritoFisico);
comp_CMB_distritoFisico.setValue("-");


Comboitem item15 = new Comboitem();                
    item15.setLabel("-");
    item15.setValue("-");
    item15.setParent(comp_CMB_BarrioFisicos);
comp_CMB_BarrioFisicos.setValue("-");



Comboitem item16 = new Comboitem();                
    item16.setLabel("-");
    item16.setValue("-");
    item16.setParent(comp_CMB_cpFisico);
comp_CMB_cpFisico.setValue("-");

Comboitem item17 = new Comboitem();                
    item17.setLabel("-");
    item17.setValue("-");
    item17.setParent(comp_CMB_departamentoPostal);
comp_CMB_departamentoPostal.setValue("-");



Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Combobox comp_CMB_callePostal=(Combobox) sup.getInstanciaComponente("comp_CMB_callePostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");
Combobox comp_CMB_CutPHCalle=(Combobox) sup.getInstanciaComponente("comp_CMB_CutPHCalle");



comp_CMB_distritoPostals.setReadonly(true);
comp_CMB_callePostal.setReadonly(true);
comp_CMB_barrioPostal.setReadonly(true);
comp_CMB_cpPostal.setReadonly(true);
//comp_BANDBOX_cpPostal.setReadonly(true);
//comp_BANDBOX_callePostal.setReadonly(true);
//comp_BANDBOX_barrioPostal.setReadonly(true);
comp_CMB_CutPHCalle.setReadonly(true);


comp_CMB_distritoPostals.setStyle("background-color: white");
comp_CMB_callePostal.setStyle("background-color: white");
comp_CMB_barrioPostal.setStyle("background-color: white");
comp_CMB_cpPostal.setStyle("background-color: white");
comp_CMB_CutPHCalle.setStyle("background-color: white");




Comboitem item18 = new Comboitem();                
    item18.setLabel("-");
    item18.setValue("-");
    item18.setParent(comp_CMB_distritoPostals);
comp_CMB_distritoPostals.setValue("-");


Comboitem item19 = new Comboitem();                
    item19.setLabel("-");
    item19.setValue("-");
    item19.setParent(comp_CMB_callePostal);
comp_CMB_callePostal.setValue("-");


Comboitem item20 = new Comboitem();                
    item20.setLabel("-");
    item20.setValue("-");
    item20.setParent(comp_CMB_barrioPostal);
comp_CMB_barrioPostal.setValue("-");

Comboitem item21 = new Comboitem();                
    item21.setLabel("-");
    item21.setValue("-");
    item21.setParent(comp_CMB_cpPostal);
comp_CMB_cpPostal.setValue("-");

Comboitem item22 = new Comboitem();                
    item22.setLabel("-");
    item22.setValue("-");
    item22.setParent(comp_CMB_CutPHCalle);
comp_CMB_CutPHCalle.setValue("-");


Groupbox cont_requisitosTramitess=(Groupbox) sup.getInstanciaComponente("cont_requisitosTramitess");
Groupbox cont_certUnicoTransferencia=(Groupbox) sup.getInstanciaComponente("cont_certUnicoTransferencia");
Groupbox cont_datosCUTPH=(Groupbox) sup.getInstanciaComponente("cont_datosCUTPH");

cont_requisitosTramitess.setVisible(false);
cont_certUnicoTransferencia.setVisible(false);
cont_datosCUTPH.setVisible(false);



Combobox comp_CMB_calleFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_calleFisico");


Comboitem item22 = new Comboitem();                
    item22.setLabel("-");
    item22.setValue("-");
    item22.setParent(comp_CMB_calleFisico);
comp_CMB_calleFisico.setValue("-");


comp_CMB_calleFisico.setReadonly(true);
comp_CMB_calleFisico.setStyle("background-color: white");

Textbox comp_TXT_tipoPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_tipoPersona");
comp_TXT_tipoPersona.setValue("PFI");