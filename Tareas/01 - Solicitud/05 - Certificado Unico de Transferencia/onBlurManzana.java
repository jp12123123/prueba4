import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");



if(comp_IN_manzanaCut.getValue()==null || comp_IN_manzanaCut.getValue()==""){
    comp_IN_manzanaCut.setValue(0);
}else if(comp_IN_manzanaCut.getValue()<0){
    int aux = comp_IN_manzanaCut.getValue();
    aux = aux * -1;
    comp_IN_manzanaCut.setValue(aux);
}else if(comp_IN_manzanaCut.getValue()==0){
    Messagebox.show("Por favor, ingrese un valor distinto de 0 en la manzana","Advertencia",null,null,null);
}else if(comp_IN_manzanaCut.getValue()>9999){
    Messagebox.show("Por favor, ingrese un valor entre 1 y 9999 en la manzana","Advertencia",null,null,null);
    comp_IN_manzanaCut.setValue(0);
}


