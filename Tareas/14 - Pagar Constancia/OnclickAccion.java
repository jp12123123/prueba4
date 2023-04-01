
import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

/*Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");

Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

boolean variable = false;
String name = "";

for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

       	name = li.getChildren().get(6).getLabel(); // Obetenemos el nombre 
    
    	if(name.equals("Arancel")){
            variable = true;
        }
}

if(!variable && comp_CHK_tieneCuentaNo.isChecked() ){
 	Messagebox.show("Por favor adjunte el arancel ","Advertencia",null,null,null);   
}else{
    long milesegundos = 900000;
    comp_LON_timerOculto.setValue(milesegundos);
    java.util.List parametrosfnGuardar = new java.util.ArrayList();
        parametrosfnGuardar.add(false); //alIniciador / Boolean
        parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

}*/


//ESTA PARTE ES DE PRUEBA 12/1/2023


    long milesegundos = 172800000;
    comp_LON_timerOculto.setValue(milesegundos);
    java.util.List parametrosfnGuardar = new java.util.ArrayList();
        parametrosfnGuardar.add(false); //alIniciador / Boolean
        parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);


    
