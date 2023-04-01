import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Listbox comp_GRID_grillDistritoUbicacion=(Listbox) sup.getInstanciaComponente("comp_GRID_grillDistritoUbicacion");
Textbox comp_TXT_idDistritoFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_idDistritoFisico");

String aux="";
String insetarVar ="";


    for (java.util.Iterator it = comp_GRID_grillDistritoUbicacion.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
        aux=li.getChildren().get(1).getLabel();
        
        if(comp_CMB_distritoFisico.getValue().trim().equals(aux)){
            insetarVar=li.getChildren().get(0).getLabel();
        }
        
        
    }    
comp_TXT_idDistritoFisico.setValue(insetarVar);