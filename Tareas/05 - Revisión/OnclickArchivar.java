import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import org.zkoss.zk.ui.util.Clients;
import java.io.File;
import java.util.*;
import java.io.IOException;
import org.bonitasoft.engine.bpm.flownode.ActivityInstance; 
import org.bonitasoft.engine.bpm.flownode.ArchivedActivityInstance; 

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_IdZona=(Textbox) sup.getInstanciaComponente("comp_TXT_IdZona");
Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Textbox comp_TXT_idDeTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_idDeTramite");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Combobox comp_CMB_listaMotivoArchivado=(Combobox) sup.getInstanciaComponente("comp_CMB_listaMotivoArchivado");


Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

int idZona = Integer.parseInt(comp_TXT_IdZona.getValue());
int idDeTramite = Integer.parseInt(comp_TXT_idDeTramite.getValue());
String numeroRegistro = comp_TXT_numeroRegistro.getValue();
//String cuenta = comp_TXT_cuenta.getValue();
String cuenta = "";
String listaMotivoArchivado = comp_CMB_listaMotivoArchivado.getSelectedItem().getValue();

Checkbox comp_CHK_Archivo=(Checkbox) sup.getInstanciaComponente("comp_CHK_Archivo"); // SI = Control Radio // NO = Observar Revision

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

Window winBuilder=(Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");

Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion"); //MODIFICAR CON EL NOMBRE DEL BOTON FINUALIZAR
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1)  org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");


//CHECKBOX DEL CONTENEDOR CONT_CHECKBOX
//Checkbox comp_CHK_revisionCompleta=(Checkbox) sup.getInstanciaComponente("comp_CHK_revisionCompleta");
Checkbox comp_CHK_Archivo=(Checkbox) sup.getInstanciaComponente("comp_CHK_Archivo");


String revision = comp_CMB_listaMotivoArchivado.getValue().toString();

//String destino = "";
Boolean iniciador = false;
Boolean adirecta = false;

if(!comp_TXT_cuenta.getValue().equals("-")){
    
    cuenta = comp_TXT_cuenta.getValue();
}

if(comp_CHK_Archivo.isChecked()){
org.zkoss.zul.Messagebox.show("¿Seguro que desea Archivar?", "Atención", org.zkoss.zul.Messagebox.YES | org.zkoss.zul.Messagebox.NO, org.zkoss.zul.Messagebox.QUESTION, new org.zkoss.zk.ui.event.EventListener(){
        public void onEvent(org.zkoss.zk.ui.event.Event evt) {
            switch (((Integer) evt.getData()).intValue()) {
                case Messagebox.YES:
                  // Guardar
                    
                    iniciador = false;
                    adirecta = true;
                       //destino = "Control Radio";

              try
              {

                  java.util.List parametrosfnTicketArchivo = new java.util.ArrayList();
                     parametrosfnTicketArchivo.add(cuenta.trim()); //nro_Cuenta / String
                     parametrosfnTicketArchivo.add(numeroRegistro.trim()); //id_Escribano / String
                     parametrosfnTicketArchivo.add(numDocumentoElectronico.trim()); //nro_Expediente / String
                     parametrosfnTicketArchivo.add(listaMotivoArchivado.trim()); //tipo_Motivo / String
                      parametrosfnTicketArchivo.add(idDeTramite); //tipo_Tramite / int
                      parametrosfnTicketArchivo.add(idZona); //nro_Zona / int
                      
                      
                     
                  new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnTicketArchivo",parametrosfnTicketArchivo);
                  Map return35map=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return35map");
                 
              
                  
                  
                    
                 // Messagebox.show("Tramite: "+idDeTramite+" cuenta: "+cuenta+" zona: "+idZona+" Registro: "+numeroRegistro+" Expediente: "+numDocumentoElectronico+" Motivo "+listaMotivoArchivado);
                    
                   
                    
                   
                    Messagebox.show("Nro de Ticket:  "+ return35map.get("P_NRO_TICKET"));


        
    
             }
             catch(Exception e) 
                {
                  Messagebox.show("El servicio Generar Ticket Archivo no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
                    comp_SAVE_accion.setDisabled(true);
                 }
                    
                    
                  long milesegundos = 172800000;
                  comp_LON_timerOculto.setValue(milesegundos);

                  java.util.List parametrosfnGuardar = new java.util.ArrayList();
                      parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
                      parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
                  new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
                   
                   
                    String mensaje = "";
                    mensaje="Se Archivara el Documento Electronico por el motivo: " + revision;
                    Messagebox.show(mensaje,"Información", null, null, null);
                    
                    
                   
    	
            }
        }
    });
           
}



