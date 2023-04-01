import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Listbox comp_GRID_GrillasAuxDepartamentoDomicilio=(Listbox) sup.getInstanciaComponente("comp_GRID_GrillasAuxDepartamentoDomicilio");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Textbox comp_TXT_idDepartamento=(Textbox) sup.getInstanciaComponente("comp_TXT_idDepartamento");

String auxCombo=comp_CMB_departamentoDominioInput.getValue().trim();
String variableGrilla ="";
String valor="";
    for (java.util.Iterator it = comp_GRID_GrillasAuxDepartamentoDomicilio.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {
		
     	org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
        variableGrilla = li.getChildren().get(1).getLabel().trim();
        
        if(variableGrilla.equals(auxCombo)){
            valor = li.getChildren().get(0).getLabel().trim();
        }
        
        
    }


comp_TXT_idDepartamento.setValue(valor);