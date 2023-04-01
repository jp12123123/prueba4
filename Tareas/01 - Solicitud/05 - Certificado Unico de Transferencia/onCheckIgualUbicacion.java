
import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Checkbox comp_CHK_igualUbicacionPostalSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalSi");
Checkbox comp_CHK_igualUbicacionPostalNO=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalNO");

//ubicacion fisica
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Combobox comp_CMB_calleFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_calleFisico");
Intbox comp_IN_calleFisicoNumero=(Intbox) sup.getInstanciaComponente("comp_IN_calleFisicoNumero");
Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");
Textbox comp_TXT_manzanaFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaFisico");
Textbox comp_TXT_loteFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_loteFisicos");
Textbox comp_TXT_fraccionFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionFisicos");
Combobox comp_CMB_cpFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_cpFisico");

Bandbox comp_BANDBOX_calleFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_calleFisico");
Bandbox comp_BANDBOX_barrio=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrio");
Bandbox comp_BANDBOX_cpFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpFisico");

//ubicacion postal

Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Combobox comp_CMB_callePostal=(Combobox) sup.getInstanciaComponente("comp_CMB_callePostal");
Intbox comp_IN_numeroPostal=(Intbox) sup.getInstanciaComponente("comp_IN_numeroPostal");
Combobox comp_CMB_barrioPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_barrioPostal");
Textbox comp_TXT_fraccionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionPostal");
Textbox comp_TXT_LotePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_LotePostal");
Textbox comp_TXT_manzanaPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaPostal");
Combobox comp_CMB_cpPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_cpPostal");

Bandbox comp_BANDBOX_callePostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_callePostal");
Bandbox comp_BANDBOX_barrioPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrioPostal");
Bandbox comp_BANDBOX_cpPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpPostal");


//Textboxs del domicilio postal
Textbox comp_TXT_barrioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_barrioPostal");
Textbox comp_TXT_callePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_callePostal");
Textbox comp_TXT_cpPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_cpPostal");



//grillas
Listbox comp_GRID_GrillasAuxDepartamentoDomicilio=(Listbox) sup.getInstanciaComponente("comp_GRID_GrillasAuxDepartamentoDomicilio");
Listbox comp_GRID_grillDistritoPostal=(Listbox) sup.getInstanciaComponente("comp_GRID_grillDistritoPostal");
Listbox comp_GRID_callePOstal=(Listbox) sup.getInstanciaComponente("comp_GRID_callePOstal");


//ID de departamento, distrito, calle y barrio
Textbox comp_TXT_idComboFisicoDepartamento=(Textbox) sup.getInstanciaComponente("comp_TXT_idComboFisicoDepartamento");
Textbox comp_TXT_idDistritoFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_idDistritoFisico");
Textbox comp_TXT_idCalleFisica=(Textbox) sup.getInstanciaComponente("comp_TXT_idCalleFisica");
Textbox comp_TXT_idBarrioFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_idBarrioFisico");
Textbox comp_TXT_idDepartamentoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idDepartamentoPostal");
Textbox comp_TXT_idDistritoPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idDistritoPostal");
Textbox comp_TXT_idCallePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idCallePostal");
Textbox comp_TXT_idBarrioPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_idBarrioPostal");


int auxi = comp_IN_calleFisicoNumero.getValue();

Textbox comp_TXT_idCodigoPostal2=(Textbox) sup.getInstanciaComponente("comp_TXT_idCodigoPostal2");
Textbox comp_TXT_idCodigoPostalFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_idCodigoPostalFisico");



if(comp_CHK_igualUbicacionPostalSi.isChecked()){
    
    if(comp_CMB_departamentoFisico.getValue().trim().equals("-")){
        Messagebox.show("Por favor, elija un departamento en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
    }else if(comp_CMB_distritoFisico.getValue().trim().equals("-")){
        Messagebox.show("Por favor, elija un distrito en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
    /*}else if(comp_CMB_calleFisico.getValue().trim().equals("-")){
        Messagebox.show("Por favor, elija una calle en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);**/
    /*}else if(comp_BANDBOX_calleFisico.getValue().isEmpty()){
        Messagebox.show("Por favor, elija una calle en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
    }else if(comp_BANDBOX_barrio.getValue().isEmpty()){
        Messagebox.show("Por favor elija un barrio en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
        
	}else if(auxi==0){        
    	Messagebox.show("Por favor, un numero de calle en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);*/
        
    /*}else if(comp_CMB_BarrioFisicos.getValue().trim().equals("-")){
        Messagebox.show("Por favor ingrese elija un barrio en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);*/
        
    /* }else if(comp_TXT_manzanaFisico.getValue().trim().equals("-")){
        Messagebox.show("Por favor, ingrese una manzana en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
        
         }else if(comp_TXT_loteFisicos.getValue().trim().equals("-")){
        Messagebox.show("Por favor, ingrese un lote en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);
        
         }else if(comp_TXT_fraccionFisicos.getValue().trim().equals("-")){
        Messagebox.show("Por favor, ingreseuna fracción en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);*/
        
         /*}else if(comp_CMB_cpFisico.getValue().trim().equals("-")){
        Messagebox.show("Por favor, elija un Código Postal en el Domicilio Fisico/ubicación");
        comp_CHK_igualUbicacionPostalSi.setChecked(false);*/
    	/*}else if(comp_BANDBOX_cpFisico.getValue().isEmpty()){
            Messagebox.show("Por favor, elija un Código Postal en el Domicilio Fisico/ubicación");
            comp_CHK_igualUbicacionPostalSi.setChecked(false);
        */
        
    }else{
        String valor="";

         for (java.util.Iterator it = comp_GRID_GrillasAuxDepartamentoDomicilio.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    	{

            org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
            if(comp_CMB_departamentoFisico.getValue().equals(li.getChildren().get(1).getLabel())){
            	valor= li.getChildren().get(0).getLabel();
            }

        }
		
        
        comp_CMB_departamentoPostal.setValue(comp_CMB_departamentoFisico.getValue());
        comp_IN_numeroPostal.setValue(comp_IN_calleFisicoNumero.getValue());
        comp_CMB_barrioPostal.setValue(comp_CMB_BarrioFisicos.getValue());

        if(comp_BANDBOX_barrio.getValue()==null || comp_BANDBOX_barrio.getValue().equals("") || comp_BANDBOX_barrio.getValue()==""){
            
        }else{   
			comp_BANDBOX_barrioPostal.setValue(comp_BANDBOX_barrio.getValue());
			comp_TXT_barrioPostal.setValue(comp_BANDBOX_barrio.getValue());
                		
        }
        
        
		
		
		
		comp_TXT_idDepartamentoPostal.setValue(comp_TXT_idComboFisicoDepartamento.getValue());
		comp_TXT_idDistritoPostal.setValue(comp_TXT_idDistritoFisico.getValue());
		comp_TXT_idCallePostal.setValue(comp_TXT_idCalleFisica.getValue());
		comp_TXT_idBarrioPostal.setValue(comp_TXT_idBarrioFisico.getValue());
                            

        comp_TXT_manzanaPostal.setValue(comp_TXT_manzanaFisico.getValue());
        comp_TXT_LotePostal.setValue(comp_TXT_loteFisicos.getValue());
        comp_TXT_fraccionPostal.setValue(comp_TXT_fraccionFisicos.getValue());
        
         if(comp_BANDBOX_cpFisico.getValue()==null || comp_BANDBOX_cpFisico.getValue().equals("") || comp_BANDBOX_cpFisico.getValue()==""){
            
        }else{  
        
        comp_CMB_cpPostal.setValue(comp_CMB_cpFisico.getValue());
        comp_BANDBOX_cpPostal.setValue(comp_BANDBOX_cpFisico.getValue());
		comp_TXT_cpPostal.setValue(comp_BANDBOX_cpFisico.getValue());
         }
        comp_CHK_igualUbicacionPostalNO.setChecked(false);
        		
    

comp_TXT_idCodigoPostal2.setValue(comp_TXT_idCodigoPostalFisico.getValue());
        
        comp_GRID_grillDistritoPostal.getItems().clear();
	comp_GRID_callePOstal.getItems().clear();
    
    comp_CMB_distritoPostals.getItems().clear();
    
    Comboitem item9 = new Comboitem();                
            item9.setLabel("-");
            item9.setValue("-");
            item9.setParent(comp_CMB_distritoPostals); 
    
    
    comp_CMB_callePostal.getItems().clear();
    
    
    Comboitem item10 = new Comboitem();                
            item10.setLabel("-");
            item10.setValue("-");
            item10.setParent(comp_CMB_callePostal); 

    
    

    comp_GRID_grillDistritoPostal.getItems().clear();
    comp_GRID_callePOstal.getItems().clear();
    
    try {
        
        java.util.List parametrosfnLocalidadesDomicilio = new java.util.ArrayList();
            parametrosfnLocalidadesDomicilio.add(valor); //codigo / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnLocalidadesDomicilio",parametrosfnLocalidadesDomicilio);
        Map return20map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return20map");


        for (int i = 0; i < return20map.get("items").size(); i++) {
            String ver = return20map.get("items").get(i).get("loc_descripcion");
			String identificador=return20map.get("items").get(i).get("loc_codigo").toString();

            Comboitem item = new Comboitem();                
            item.setLabel(ver);
            item.setValue(ver);
            item.setParent(comp_CMB_distritoPostals); 
            
            
            Listitem item31 = new Listitem();

            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificador);
                    cell1.setParent(item31);

            org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
                    cell2.setParent(item31);
            org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
                    cell3.setParent(item31);

            comp_GRID_grillDistritoPostal.appendChild(item31);

            


        }
            
     } catch (Exception e) {
     	Messagebox.show("Servicio de localidades domicilio no disponible","Advertencia",null,null,null);
     }
    
    try {
        
       java.util.List parametrosfnCalleDomicilio = new java.util.ArrayList();
            parametrosfnCalleDomicilio.add(valor); //codigo / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnCalleDomicilio",parametrosfnCalleDomicilio);
        Map return24map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return24map");


        for (int i = 0; i < return24map.get("items").size(); i++) {
            String ver = return24map.get("items").get(i).get("cal_descripcion");
			String identificadore=return24map.get("items").get(i).get("cal_codigo").toString();

            Comboitem item = new Comboitem();                
            item.setLabel(ver);
            item.setValue(ver);
            item.setParent(comp_CMB_callePostal); 

            Listitem item35 = new Listitem();

            org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificadore);
                    cell1.setParent(item35);


            org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
                    cell2.setParent(item35);
            
            org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("ver");
                    cell3.setParent(item35);

            comp_GRID_callePOstal.appendChild(item35);

        }
            
     } catch (Exception e) {
     	Messagebox.show("Servicio de localidades domicilio no disponible","Advertencia",null,null,null);
     }
        
        comp_CMB_distritoPostals.setValue(comp_CMB_distritoFisico.getValue());
    	comp_CMB_callePostal.setValue(comp_CMB_calleFisico.getValue());
         if(comp_BANDBOX_calleFisico.getValue()==null || comp_BANDBOX_calleFisico.getValue().equals("") || comp_BANDBOX_calleFisico.getValue()==""){
            
        }else{  
            comp_BANDBOX_callePostal.setValue(comp_BANDBOX_calleFisico.getValue());
            comp_TXT_callePostal.setValue(comp_BANDBOX_calleFisico.getValue());
         }
        
        comp_CMB_departamentoPostal.setDisabled(true);
        comp_CMB_distritoPostals.setDisabled(true);
        //comp_CMB_callePostal.setDisabled(true);
        comp_BANDBOX_callePostal.setDisabled(true);
        comp_IN_numeroPostal.setDisabled(true);
        //comp_CMB_barrioPostal.setDisabled(true);
        comp_TXT_fraccionPostal.setDisabled(true);
        comp_TXT_LotePostal.setDisabled(true);
        comp_TXT_manzanaPostal.setDisabled(true);
        //comp_CMB_cpPostal.setDisabled(true);
        comp_BANDBOX_cpPostal.setDisabled(true);
    	comp_BANDBOX_barrioPostal.setDisabled(true);

    } 
    
   


  
}














