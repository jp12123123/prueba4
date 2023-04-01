import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();




Doublebox comp_DOU_CutPHSupCubTotal=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubTotal");

double aux = comp_DOU_CutPHSupCubTotal.getValue();

if(aux<0){
    aux = aux *-1;
    comp_DOU_CutPHSupCubPropia.setValue(aux);
}

if(aux>99999999.99 || aux==0){
    Messagebox.show("Por favor ingrese un número valido en Superficie Cubierta Total en Datos del CUT para PH","Advertencia",null,null,null);
}


