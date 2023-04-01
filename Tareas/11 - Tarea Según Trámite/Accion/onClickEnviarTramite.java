import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Checkbox comp_CHK_fueraRadio=(Checkbox) sup.getInstanciaComponente("comp_CHK_fueraRadio");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
//DISTRIBUCIONES
Div dis_listaRevision=(Div) sup.getInstanciaComponente("dis_listaRevision");
//CHECK
Checkbox comp_CHK_Revision=(Checkbox) sup.getInstanciaComponente("comp_CHK_Revision");
//BOTONES
Button comp_SAVE_ArchivarT=(Button) sup.getInstanciaComponente("comp_SAVE_ArchivarT");
Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");
Button comp_BTN_cancelar=(Button) sup.getInstanciaComponente("comp_BTN_cancelar");

beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");

Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos"); 

boolean InformeCertificado = false;

for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
    {

        org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

        
   		tipoAdjunto = li.getChildren().get(6).getLabel().trim();
    
    	if(tipoAdjunto.equals("Informe Certificado")){
            InformeCertificado =true;
        }
    	
}

//if(comp_CHK_fueraRadio.isChecked() && comp_CHK_tieneCuentaNo.isChecked()){
    // DATOS PARA EL WS ACTUALIZAESTADO
    
//}



boolean adjuntos = false ;

//Guardar
java.util.List parametrosfnGuardar = new java.util.ArrayList();
    parametrosfnGuardar.add(false); //alIniciador / Boolean
    parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
