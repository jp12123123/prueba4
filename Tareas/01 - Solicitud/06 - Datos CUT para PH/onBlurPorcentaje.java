import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();




Doublebox comp_DOU_CutPHPorcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHPorcentaje");

double aux = comp_DOU_CutPHPorcentaje.getValue();

if(aux<0){
    aux = aux *-1;
    comp_DOU_CutPHSupCubPropia.setValue(aux);
}

if(aux>100 || aux==0){
    Messagebox.show("Por favor ingrese un porcentaje valido en Datos del CUT para PH","Advertencia",null,null,null);
}
