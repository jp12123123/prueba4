import modelos.builder.componentes.*;  
import org.zkoss.zul.*;
  
ModeloComponente sup = new ModeloComponente();

Bandbox comp_BANDBOX_cpFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpFisico");
Textbox comp_TXT_cpFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_cpFisico");
Listbox comp_GRID_codigoPostal=(Listbox) sup.getInstanciaComponente("comp_GRID_codigoPostal");
Textbox comp_TXT_idCodigoPostalFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_idCodigoPostalFisico");

String aux=comp_BANDBOX_cpFisico.getValue();
  
comp_TXT_cpFisico.setValue(aux);



//desde aca





String insetarVar ="";
String auxi ="";

    for (java.util.Iterator it = comp_GRID_codigoPostal.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
        auxi=li.getChildren().get(1).getLabel().trim();
        
        
        
        if(comp_TXT_cpFisico.getValue().trim().equals(auxi)){
            insetarVar=li.getChildren().get(0).getLabel();
            
        }
        
        
    }    


comp_TXT_idCodigoPostalFisico.setValue(insetarVar);


