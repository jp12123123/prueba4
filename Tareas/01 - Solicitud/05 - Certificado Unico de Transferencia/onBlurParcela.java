import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();



Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");

if(comp_IN_parcelaCUT.getValue()==null || comp_IN_parcelaCUT.getValue()==""){
    comp_IN_parcelaCUT.setValue(0);
}else if(comp_IN_parcelaCUT.getValue()<0){
    int aux = comp_IN_parcelaCUT.getValue();
    aux = aux * -1;
    comp_IN_parcelaCUT.setValue(aux);
}else if(comp_IN_parcelaCUT.getValue()==0){
    Messagebox.show("Por favor, ingrese un valor distinto de 0 en la parcela","Advertencia",null,null,null);
}else if(comp_IN_parcelaCUT.getValue()>999999){
    Messagebox.show("Por favor, ingrese un valor entre 1 y 999999 en la parcela","Advertencia",null,null,null);
    comp_IN_parcelaCUT.setValue(0);
}




