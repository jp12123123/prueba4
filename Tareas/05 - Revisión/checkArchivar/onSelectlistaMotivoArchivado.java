import java.util.regex.Matcher;
import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;


ModeloComponente sup = new ModeloComponente();

//COMBOBOX DEL CONTENEDOR CONT_CHECKARCHIVAR
Combobox comp_CMB_listaMotivoArchivado=(Combobox) sup.getInstanciaComponente("comp_CMB_listaMotivoArchivado");

//BUTTON DEL CONTENEDOR CONT_ACCION
Button comp_SAVE_archivar=(Button) sup.getInstanciaComponente("comp_SAVE_archivar");




if(comp_CMB_listaMotivoArchivado.getValue().equals("-")){
   Messagebox.show("Ingrese un Elemento de la Lista Valido","Advertencia", null, null, null);
    
    comp_SAVE_archivar.setDisabled(true);
}else {
    
    comp_SAVE_archivar.setDisabled(false);
}
