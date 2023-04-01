
import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();





Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");

if(comp_IN_sectorCUT.getValue()==null || comp_IN_sectorCUT.getValue()==""){
    comp_IN_sectorCUT.setValue(0);
}else if(comp_IN_sectorCUT.getValue()<0){
    int aux = comp_IN_sectorCUT.getValue();
    aux = aux * -1;
    comp_IN_sectorCUT.setValue(aux);
}else if(comp_IN_sectorCUT.getValue()==0){
    Messagebox.show("Por favor ingrese un valor distinto de 0 en el sector","Advertencia",null,null,null);
}else if(comp_IN_sectorCUT.getValue()>9999){
    Messagebox.show("Por favor ingrese un valor entre 1 y 9999 en el sector","Advertencia",null,null,null);
    comp_IN_sectorCUT.setValue(0);
}
