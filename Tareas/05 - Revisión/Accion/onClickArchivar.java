import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import org.zkoss.zk.ui.util.Clients;
import java.io.File;
import java.util.*;
import java.io.IOException;
import org.bonitasoft.engine.bpm.flownode.ActivityInstance; 
import org.bonitasoft.engine.bpm.flownode.ArchivedActivityInstance; 


ModeloComponente sup = new ModeloComponente();

//COMBOBOX DEL CONTENEDOR CONT_CHECKBOX
Combobox comp_CMB_listaMotivoArchivado=(Combobox) sup.getInstanciaComponente("comp_CMB_listaMotivoArchivado");

//CHECKBOX DEL CONTENEDOR CONT_CHECKBOX
Checkbox comp_CHK_revisionCompleta=(Checkbox) sup.getInstanciaComponente("comp_CHK_revisionCompleta");



String revision = comp_CMB_listaMotivoArchivado.getValue().toString();




if(comp_CHK_revisionCompleta.isChecked()){
org.zkoss.zul.Messagebox.show("¿Seguro que desea Archivar?", "Atención", org.zkoss.zul.Messagebox.YES | org.zkoss.zul.Messagebox.NO, org.zkoss.zul.Messagebox.QUESTION, new org.zkoss.zk.ui.event.EventListener(){
        public void onEvent(org.zkoss.zk.ui.event.Event evt) {
            switch (((Integer) evt.getData()).intValue()) {
                case Messagebox.YES:
                   java.util.List parametrosfnGuardar = new java.util.ArrayList();
                        parametrosfnGuardar.add(false); //alIniciador / Boolean
                        parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

                   
                    String mensaje = "";
                    mensaje="Se Archivara el Documento Electronico por el motivo: " + revision;
                    Messagebox.show(mensaje,"Información", null, null, null);
                    
                    
                   
    	
            }
        }
    });
           
}
