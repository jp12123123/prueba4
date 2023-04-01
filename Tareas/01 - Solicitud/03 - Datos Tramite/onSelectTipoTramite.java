import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Div dis_planoDigitalizado=(Div) sup.getInstanciaComponente("dis_planoDigitalizado");
Div dis_planchaATM=(Div) sup.getInstanciaComponente("dis_planchaATM");
Div dis_notaSolicitud=(Div) sup.getInstanciaComponente("dis_notaSolicitud");
Div dis_notaUbicacionConexión =(Div) sup.getInstanciaComponente("dis_notaUbicacionConexión ");
Div dis_numeroCliente=(Div) sup.getInstanciaComponente("dis_numeroCliente");

Textbox comp_TXT_idDeTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_idDeTramite");
//en los adjuntos

Div dis_planoDigitalizado1=(Div) sup.getInstanciaComponente("dis_planoDigitalizado1");
Div dis_planchaATM1=(Div) sup.getInstanciaComponente("dis_planchaATM1");
Div dis_notaSolicitud1=(Div) sup.getInstanciaComponente("dis_notaSolicitud1");
Div dis_notaConec1=(Div) sup.getInstanciaComponente("dis_notaConec1");
Div dis_numeroCliente1=(Div) sup.getInstanciaComponente("dis_numeroCliente1");

Listbox comp_GRID_tramiteGrilla=(Listbox) sup.getInstanciaComponente("comp_GRID_tramiteGrilla");

Combobox comp_CMB_tramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");

Groupbox cont_requisitosTramitess=(Groupbox) sup.getInstanciaComponente("cont_requisitosTramitess");
Groupbox cont_certUnicoTransferencia=(Groupbox) sup.getInstanciaComponente("cont_certUnicoTransferencia");

Checkbox comp_CHK_tramtie67=(Checkbox) sup.getInstanciaComponente("comp_CHK_tramtie67");
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");

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



if(valor.equals("")||valor.equals(null)){

/*}else if(!comp_CHK_propiedadHorizontalSi.isChecked() && !comp_CHK_propiedadHorizontalNo.isChecked()){   
    Messagebox.show("Por favor seleccione alguna de las casillas de propiedad horizontal","Advertencia",null,null,null);
    comp_CMB_tramite.setValue("-");*/
}else{

    	comp_TXT_idDeTramite.setValue(valor);
    int a =Integer.parseInt(valor);    
    
    switch(a){
            
            case 1:
            	// if(comp_IN_subParcelaCUT.getValue()==0){
                // 	dis_planoDigitalizado.setVisible(true);
                //     dis_planoDigitalizado1.setVisible(true);
                // 	// dis_planchaATM.setVisible(true);
                //     // dis_planchaATM1.setVisible(true);
                //     cont_requisitosTramitess.setVisible(true);
                // }else{
                    
                //     dis_planoDigitalizado.setVisible(false);  
                //     dis_planoDigitalizado1.setVisible(false); 
                // 	dis_planchaATM.setVisible(false);
                //     dis_planchaATM1.setVisible(false);
                //     cont_requisitosTramitess.setVisible(false);
                // }
                dis_planoDigitalizado.setVisible(true);
                dis_planoDigitalizado1.setVisible(true);
            	dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
                dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
            	cont_requisitosTramitess.setVisible(true);
            	cont_certUnicoTransferencia.setVisible(true);
            	comp_CHK_tramtie67.setChecked(false);
            
            	break;
            case 2:
                // if(comp_IN_subParcelaCUT.getValue()==0){
                // 	dis_planoDigitalizado.setVisible(true); 
                //     dis_planoDigitalizado1.setVisible(true);
                // 	dis_planchaATM.setVisible(true);
                //     dis_planchaATM1.setVisible(true);
                //     cont_requisitosTramitess.setVisible(true);
                // }else{
                //     dis_planoDigitalizado.setVisible(false);    
                //     dis_planoDigitalizado1.setVisible(false);
                // 	dis_planchaATM.setVisible(false);
                //     dis_planchaATM1.setVisible(false);
                //     cont_requisitosTramitess.setVisible(false);
                // }
                dis_planoDigitalizado.setVisible(true); 
                dis_planoDigitalizado1.setVisible(true);
                dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
            	dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
            	cont_requisitosTramitess.setVisible(true);
            	cont_certUnicoTransferencia.setVisible(true);
            	comp_CHK_tramtie67.setChecked(false);
                break;
            case 3:
                dis_planoDigitalizado.setVisible(true);
           		dis_planoDigitalizado1.setVisible(true);
                dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
                dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
            	cont_requisitosTramitess.setVisible(true);
                cont_certUnicoTransferencia.setVisible(false);
            	comp_CHK_tramtie67.setChecked(false);

            	break;
            case 4:
                dis_planoDigitalizado.setVisible(true);
              	dis_planoDigitalizado1.setVisible(true);
                dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
                dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
            	cont_requisitosTramitess.setVisible(true);
            	cont_certUnicoTransferencia.setVisible(false);
            	comp_CHK_tramtie67.setChecked(false);
                break;
            case 5:
                dis_planoDigitalizado.setVisible(true);
            	dis_planoDigitalizado1.setVisible(true);
            	dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
            	dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
				cont_requisitosTramitess.setVisible(true);
            	cont_certUnicoTransferencia.setVisible(false);
            	comp_CHK_tramtie67.setChecked(false);
            	break;
            case 11:
                dis_planoDigitalizado.setVisible(false);
            	dis_planoDigitalizado1.setVisible(false);
            	dis_planchaATM.setVisible(false);
                dis_planchaATM1.setVisible(false);
            	dis_notaSolicitud.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaUbicacionConexión.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente.setVisible(false);
                dis_numeroCliente1.setVisible(false);
                cont_requisitosTramitess.setVisible(true);
            	cont_certUnicoTransferencia.setVisible(false);
            	comp_CHK_tramtie67.setChecked(true);

                break;
            case 12:
                cont_requisitosTramitess.setVisible(false);
            	dis_planoDigitalizado1.setVisible(false);
                dis_planchaATM1.setVisible(false);
                dis_notaSolicitud1.setVisible(false);
                dis_notaConec1.setVisible(false);
                dis_numeroCliente1.setVisible(false);
            	cont_certUnicoTransferencia.setVisible(false);
            	comp_CHK_tramtie67.setChecked(true);
                cont_requisitosTramitess.setVisible(false);
            	break;
    }
}