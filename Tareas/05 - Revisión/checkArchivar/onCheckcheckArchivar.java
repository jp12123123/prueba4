import org.zkoss.zul.*;
import modelos.builder.componentes.*;


ModeloComponente sup = new ModeloComponente();


//CHECKBOX
Checkbox comp_CHK_Archivo=(Checkbox) sup.getInstanciaComponente("comp_CHK_Archivo");

//Combobox
Combobox comp_CMB_listaMotivoArchivado=(Combobox) sup.getInstanciaComponente("comp_CMB_listaMotivoArchivado");

//Botones
Button comp_SAVE_archivar=(Button) sup.getInstanciaComponente("comp_SAVE_archivar");
Button comp_BTN_cancelar=(Button) sup.getInstanciaComponente("comp_BTN_cancelar");
Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");

//CONTENEDOR CHECK
Groupbox cont_checkBox=(Groupbox) sup.getInstanciaComponente("cont_checkBox");



if(comp_CHK_Archivo.isChecked()){
    cont_checkBox.setVisible(false);
        
    //lista
    comp_CMB_listaMotivoArchivado.setVisible(true);
    //Boton cancelar
    comp_BTN_cancelar.setDisabled(true);
    //Boton  enviar tramite
    comp_SAVE_accion.setDisabled(true);
    //Boton Archivar
    comp_SAVE_archivar.setDisabled(false);
     comp_SAVE_archivar.setVisible(true);
    
}else{
    
    cont_checkBox.setVisible(true);
   //lista
    comp_CMB_listaMotivoArchivado.setVisible(false);
    //Boton cancelar
    comp_BTN_cancelar.setDisabled(false);
    //Boton  enviar tramite
    comp_SAVE_accion.setDisabled(false);
    //Boton Archivar
    comp_SAVE_archivar.setVisible(false);
   
}
