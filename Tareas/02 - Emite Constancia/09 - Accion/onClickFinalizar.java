import org.zkoss.zul.*;
import Java.io.*;
import Java.net.*;
import Java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jackson.map.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import org.zkoss.zul.*;
import org.zkoss.zk.ui.util.Clients;
import java.io.File;
import java.io.IOException;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import kong.unirest.*;
import java.io.*;
import modelos.builder.componentes.*;

import org.apache.log4j.Logger;


ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Listbox grillaZona=(Listbox) sup.getInstanciaComponente("comp_GRID_grillaZonaEscribano");
Textbox comp_TXT_idEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_idEscribano");
Combobox comboZona=(Combobox) sup.getInstanciaComponente("comp_CMB_zonaEscribano");
Listbox grillaTramite=(Listbox) sup.getInstanciaComponente("comp_GRID_tramiteGrilla");
Combobox comboTramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");

Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Textbox comp_TXT_nroTicket=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTicket");
Textbox comp_TXT_nroTramite2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite2da");
Textbox comp_TXT_nroTicket2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTicket2da");
Textbox comp_TXT_auxiliarNroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_auxiliarNroTramite");
Textbox comp_TXT_auxiliarNroTicket=(Textbox) sup.getInstanciaComponente("comp_TXT_auxiliarNroTicket");


Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos"); 
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");
Textbox comp_TXT_domicilioPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioPersona");
Textbox comp_TXT_razonSocialPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_razonSocialPersonaNO");
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
//Declarar variables
Boolean iniciador = false;
Boolean adirecta = false;
Textbox comp_TXT_nroOBL=(Textbox) sup.getInstanciaComponente("comp_TXT_nroOBL");
Window winProceso = (Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getFirstPage().getFellowIfAny("winProceso");
Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");
//Usuario (para saber si es interno o web). Traemos los dos. Luego utilizaremos el que no esté nulo.
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");
Textbox comp_TXT_nombreEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreEscribano");
Textbox comp_TXT_apellidoEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoEscribano");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Window winBuilder = (Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");

//Nuevos datos API Ticket
Textbox comp_TXT_idBarrioFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_idBarrioFisicoSC");
Textbox comp_TXT_idCalleFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_idCalleFisicoSC");
Textbox comp_TXT_idDistritoFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_idDistritoFisicoSC");
Textbox comp_TXT_idCodigoPostalFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_idCodigoPostalFisicoSC");
Textbox comp_TXT_idDepartamentoFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_idDepartamentoFisicoSC");
Intbox comp_IN_calleFisicoNumeroSC=(Intbox) sup.getInstanciaComponente("comp_IN_calleFisicoNumeroSC");
Textbox comp_TXT_DepatoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_DepatoSC");
Textbox comp_TXT_PisoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_PisoSC");
Textbox comp_TXT_EdificioSC=(Textbox) sup.getInstanciaComponente("comp_TXT_EdificioSC");
Textbox comp_TXT_manzanaFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaFisicoSC");
Textbox comp_TXT_fraccionFisicosSC=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionFisicosSC");
Textbox comp_TXT_loteFisicosSC=(Textbox) sup.getInstanciaComponente("comp_TXT_loteFisicosSC");
Textbox comp_TXT_Unidad=(Textbox) sup.getInstanciaComponente("comp_TXT_Unidad");
Textbox comp_TXT_Designacion=(Textbox) sup.getInstanciaComponente("comp_TXT_Designacion");
Combobox comp_CMB_Destino=(Combobox) sup.getInstanciaComponente("comp_CMB_Destino");
//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

Textbox comp_TXT_nroCuenta2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroCuenta2da");

long nb = (Long)  winBuilder.getAttribute("procesoID");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");
String compTram = "";
String valorTram = "";
String compTram1 = comboTramite.getValue();
String compZona = "";
String valorZona = "";
String compZona1 = comboZona.getValue();
String numCuenta = "";
String cliId = "";
String numEscribano = comp_TXT_idEscribano.getValue();
String nombre_Escribano = comp_TXT_apellidoEscribano.getValue() + " " + comp_TXT_nombreEscribano.getValue();
String nombre_Titular = comp_TXT_apellidoCuenta.getValue() + " " + comp_TXT_nombreCuenta.getValue();
String titularSinCuenta = comp_TXT_apellidoPersonaNO.getValue()+", "+comp_TXT_nombrePersonaNO.getValue();
String titularEmpresa = comp_TXT_razonSocialPersonaNO.getValue();
String titularReporte = "";
String nombre_Usuario = beanSe.getApellido() + " " + beanSe.getNombre();
String usuario_modif = beanSe.getLogin();
String domicilioWS = "";

//Parametros Nuevos
String Bar_Id = "";
String Cal_Id = "";
String Cpa_Id = "";
String Dis_Id = "";
String Puerta = "";
String Ph_Dto = "";
String Dep_Codigo = "";
String Dom_Manzana = "";
String Dom_Lote = "";
String Dom_Fraccion = "";
String Ph_Cal_Edificio = "";
String Ph_Piso = "";
String Dpc_Unidad = "";
String Dpc_Designacion = "";
String Dpc_Destino = "";

//Obtener Nro_CLI_ID
if(comp_CHK_tieneCuentaSi.isChecked()){
     numCuenta = comp_TXT_cuenta.getValue();
    comp_TXT_nroCuenta2da.setValue(comp_TXT_cuenta.getValue());
    domicilioWS = comp_TXT_domicilioCuenta.getValue();
    cliId = "";
    iniciador = false;
    adirecta = true;
}else{
    numCuenta = "";
    cliId = comp_TXT_cli_id.getValue();
    domicilioWS = comp_TXT_domicilioPersona.getValue();
    
    //Nuevos datos API Ticket
    Bar_Id = comp_TXT_idBarrioFisicoSC.getValue();
    Cal_Id = comp_TXT_idCalleFisicoSC.getValue();
    Cpa_Id = comp_TXT_idCodigoPostalFisicoSC.getValue();
    Dis_Id = comp_TXT_idDistritoFisicoSC.getValue();
    Puerta = comp_IN_calleFisicoNumeroSC.getValue().toString();
    Ph_Dto = comp_TXT_DepatoSC.getValue();
    Dep_Codigo = comp_TXT_idDepartamentoFisicoSC.getValue();
    Dom_Manzana = comp_TXT_manzanaFisicoSC.getValue();
    Dom_Lote = comp_TXT_loteFisicosSC.getValue();
    Dom_Fraccion = comp_TXT_fraccionFisicosSC.getValue();
    Ph_Cal_Edificio = comp_TXT_EdificioSC.getValue();
    Ph_Piso = comp_TXT_PisoSC.getValue();
    Dpc_Unidad = comp_TXT_Unidad.getValue();
    Dpc_Designacion = comp_TXT_Designacion.getValue();
    Dpc_Destino = comp_CMB_Destino.getValue();
    
    iniciador = true;
    adirecta = false;
}

boolean FacturaC= true;

if(!FacturaC){
    Messagebox.show("Por favor adjunte la factura","Advertencia",null,null,null);
}else{
    
    //Obtener Id_Tramite
    for (java.util.Iterator it = grillaTramite.getItems().iterator(); it.hasNext();){//se le cambia el nombre a la grilla que se quiera recorrer
            org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
            compTram = li.getChildren().get(1).getLabel().trim(); // obtengo el valor del campo de la columna 2 

            if(compTram1.equals(compTram)){
               valorTram = li.getChildren().get(0).getLabel().trim();
            }
    }

    //Obtener Id_Zona
    for (java.util.Iterator it = grillaZona.getItems().iterator(); it.hasNext();){//se le cambia el nombre a la grilla que se quiera recorrer
            org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
            compZona = li.getChildren().get(1).getLabel().trim(); // obtengo el valor del campo de la columna 2 

            if(compZona1.equals(compZona)){
               valorZona = li.getChildren().get(0).getLabel().trim();
            }
    }
    
    Listbox comp_Observaciones=(Listbox) new  modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_Observaciones");
    int dei = 1;
    String ejemplo ="";
    String observaWS = "";
    int i = comp_Observaciones.getItemCount();

    if(i>0){
        for (java.util.Iterator it = comp_Observaciones.getItems().iterator(); it.hasNext();)
            {
                org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

                if(dei==1){
                    ejemplo = li.getChildren().get(0).getLabel().trim(); 
                    observaWS = ejemplo;
                }
                dei=2;
            }
    }

    if(ejemplo == "" || ejemplo == null){
        observaWS = "S/O";
    }else{
       	observaWS = ejemplo;
    }
        try {

            //Messagebox.show("numcuenta: "+numCuenta+" cliid: "+cliId+" numEscr: "+numEscribano+" valorTramite: "+valorTram+" valorZona: "+valorZona+" observa "+ejemplo);
            /*Messagebox.show("numcuenta: "+numCuenta+" cliid: "+cliId+" numEscr: "+numEscribano+" valorTramite: "+valorTram+" valorZona: "+valorZona+" observa "+ejemplo + "Domicilio Cuenta: "+domicilioWS+
                           "barrio "+Bar_Id+ "calle "+ Cal_Id+"distrito "+Dis_Id+"Puerta "+Puerta+"Codigo Postal "+Cpa_Id+"DPTO "+Ph_Dto+"Dep codigo "+Dep_Codigo+"Manzana "+Dom_Manzana+
                            "Lote "+Dom_Lote+"Fraccion "+Dom_Fraccion+"Edificio "+Ph_Cal_Edificio+"Piso "+Ph_Piso+"Unidad "+Dpc_Unidad+"Designacion "+Dpc_Designacion+"Destino "+Dpc_Destino);*/
            
            java.util.List parametrosfnGeneraTicketArancel = new java.util.ArrayList();
                parametrosfnGeneraTicketArancel.add(numCuenta.trim()); //Nro_Cuenta / String
                parametrosfnGeneraTicketArancel.add(cliId.trim()); //Nro_CLI_ID / String
                parametrosfnGeneraTicketArancel.add(numEscribano.trim()); //Nro_Escribano / String
                parametrosfnGeneraTicketArancel.add(valorTram.trim()); //Id_Tramite / String
                parametrosfnGeneraTicketArancel.add(valorZona.trim()); //Id_Zona / String
                parametrosfnGeneraTicketArancel.add(observaWS.trim()); //Observaciones / String
                parametrosfnGeneraTicketArancel.add(domicilioWS.trim()); //domicilio / String
                
                //Parametros Nuevos
                
                parametrosfnGeneraTicketArancel.add(Bar_Id.trim()); //P_Bar_Id / String
                parametrosfnGeneraTicketArancel.add(Cal_Id.trim()); //P_Cal_Id / String
                parametrosfnGeneraTicketArancel.add(Cpa_Id.trim()); //P_Cpa_Id / String
                parametrosfnGeneraTicketArancel.add(Dis_Id.trim()); //P_Dis_Id / String
                parametrosfnGeneraTicketArancel.add(Puerta.trim()); //P_Puerta / String
                parametrosfnGeneraTicketArancel.add(Ph_Dto.trim()); //P_Ph_Dto / String
                parametrosfnGeneraTicketArancel.add(Dep_Codigo.trim()); //P_Dep_Codigo / String
                parametrosfnGeneraTicketArancel.add(Dom_Manzana.trim()); //P_Dom_Manzana / String
                parametrosfnGeneraTicketArancel.add(Dom_Lote.trim()); //P_Dom_Lote / String
                parametrosfnGeneraTicketArancel.add(Dom_Fraccion.trim()); //P_Dom_Fraccion / String
                parametrosfnGeneraTicketArancel.add(Ph_Cal_Edificio.trim()); //P_Ph_Cal_Edificio / String
                parametrosfnGeneraTicketArancel.add(Ph_Piso.trim()); //P_Ph_Piso / String
                parametrosfnGeneraTicketArancel.add(Dpc_Unidad.trim()); //P_Dpc_Unidad / String
                parametrosfnGeneraTicketArancel.add(Dpc_Designacion.trim()); //P_Dpc_Designacion / String
                parametrosfnGeneraTicketArancel.add(Dpc_Destino.trim()); //P_Dpc_Destino / String

            
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGeneraTicketArancel",parametrosfnGeneraTicketArancel);
            Map return27mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return27mapa");
            
            
           
        	comp_TXT_nroOBL.setValue(return27mapa.get("P_OBL_ID"));
            comp_TXT_nroTramite.setValue(return27mapa.get("P_NUMERO"));
            comp_TXT_nroTicket.setValue(return27mapa.get("P_NRO_TICKET"));
            comp_TXT_nroTicket2da.setValue(return27mapa.get("P_NRO_TICKET"));
            comp_TXT_nroTramite2da.setValue(return27mapa.get("P_NUMERO"));
            comp_TXT_auxiliarNroTicket.setValue(return27mapa.get("P_NRO_TICKET"));
            comp_TXT_auxiliarNroTramite.setValue(return27mapa.get("P_NUMERO"));
             

            try {
                java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                parametrosfnActualizaEstado.add("1"); //Nro_Estado / String
                parametrosfnActualizaEstado.add(comp_TXT_cuenta.getValue().trim()); //numero_Cuenta / String
                parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
            Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
            
            try {
                String urlRepor = "https://www.aysam.com.ar/ov/IMPRIME_FACTURAD?p_compro_id="+return27mapa.get("P_OBL_ID").toString()+"&p_funcion=WEBC_0001$OBLIGACIONES.QUERYLIST";
                
            
                if(comp_CHK_tieneCuentaSi.isChecked())
                {
                  
                    Map valorVariablesReportes = new java.util.HashMap();
                    valorVariablesReportes.put("nro_Tramite", comp_TXT_nroTramite.getValue());
                    valorVariablesReportes.put("tipo_Tramite", comboTramite.getValue());
                    valorVariablesReportes.put("escribania", nombre_Escribano);
                    valorVariablesReportes.put("cuenta", comp_TXT_cuenta.getValue());
                    valorVariablesReportes.put("domicilio", comp_TXT_domicilioCuenta.getValue());
                    valorVariablesReportes.put("titular",nombre_Titular);
                    valorVariablesReportes.put("recibido_Por", nombre_Usuario);
                    valorVariablesReportes.put("area", beanSe.getGrupo());
                    valorVariablesReportes.put("nro_Ticket", comp_TXT_nroTicket.getValue());
                    valorVariablesReportes.put("url", urlRepor);
                    valorVariablesReportes.put("numeroEE", numDocumentoElectronico);
                    
                    List parametros = new java.util.ArrayList();
                    parametros.add(valorVariablesReportes);
                    parametros.add("constancia_AYSAM1.jrxml");
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnImprimirSelReporte",parametros);
            
                    //Una vez creado el reporte lo adjuntamos a la grilla
                    org.zkoss.util.media.AMedia reporteCreado=(org.zkoss.util.media.AMedia) winBuilder.getAttribute("return13reporteF");
                    
                    String idComp=(String) comp_UP_adjuntos.getAttribute("componente_id"); 
                    new controladores.ControladorAdjuntos().getAdjuntos(comp_UP_adjuntos, idComp, null, nb, nb, true, 0, false, true, false);
            
                    //Buscamos la fecha actual y le restamos un día para asegurarnos de que la carátula quede adjunta en el primer lugar de la grilla. Tine que ser la foja 1 del expediente.
                    java.text.SimpleDateFormat formatoDeFecha = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    java.util.Locale zona = new java.util.Locale("es", "AR");
                    java.util.Calendar calendario = java.util.Calendar.getInstance();
                    calendario.add(java.util.Calendar.DAY_OF_YEAR, -1);
                    java.util.Date ayer = calendario.getTime();
                    String fechaAyer = formatoDeFecha.format(ayer);
            
                    //Adjuntamos el archivo a la grilla
                    new controladores.ControladorAdjuntos().adjuntarListbox(reporteCreado, comp_UP_adjuntos, false, 0, 0, "", null, fechaAyer, "tipo", "1", false,false);
            
                    //Recordemos que ya hemos guardado la tarea, así que volvemos a guardar la grilla de forma manual. La variable solo la creamos porque esta función devuele un string.
                    String ruta =  new controladores.ControladorAdjuntos().guardarAdjuntos(comp_UP_adjuntos, nb, idComp, nb);
                    
                     java.util.List parametrosmandarNotificacionConReporte = new java.util.ArrayList();
                        parametrosmandarNotificacionConReporte.add("Constancia de Tramite"); //asunto / String
                        parametrosmandarNotificacionConReporte.add("Se le adjunta la constancia de inicio de trámite. Correspondiente al Expediente Electrónico "+numDocumentoElectronico); //mensaje / String
                        parametrosmandarNotificacionConReporte.add(valorVariablesReportes); //valorVariablesReportes / java.util.Map
                        parametrosmandarNotificacionConReporte.add(comp_TXT_emailEscribano.getValue()); //to / String
                        parametrosmandarNotificacionConReporte.add("constancia_AYSAM1.jrxml"); //reporte / String
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mandarNotificacionConReporte",parametrosmandarNotificacionConReporte);
                    
                }
                else
                {

                    if(comp_CMB_persona.getValue().trim().equals("Jurídica")){
                        titularReporte = titularEmpresa;
                    }else{
                        titularReporte = titularSinCuenta;
                    }
                    
                    Map valorVariablesReportes = new java.util.HashMap();
                    valorVariablesReportes.put("nro_Tramite", comp_TXT_nroTramite.getValue());
                    valorVariablesReportes.put("tipo_Tramite", comboTramite.getValue());
                    valorVariablesReportes.put("escribania", nombre_Escribano);
                    valorVariablesReportes.put("cuenta", "-");
                    valorVariablesReportes.put("domicilio", "-");
                    valorVariablesReportes.put("titular",titularReporte);
                    valorVariablesReportes.put("recibido_Por", nombre_Usuario);
                    valorVariablesReportes.put("area", beanSe.getGrupo());
                    valorVariablesReportes.put("nro_Ticket", comp_TXT_nroTicket.getValue());
                    valorVariablesReportes.put("url", urlRepor);
                    valorVariablesReportes.put("numeroEE", numDocumentoElectronico);
            
                    List parametros = new java.util.ArrayList();
                    parametros.add(valorVariablesReportes);
                    parametros.add("constancia_AYSAM1.jrxml");
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnImprimirSelReporte",parametros);
            
                    //Una vez creado el reporte lo adjuntamos a la grilla
                    org.zkoss.util.media.AMedia reporteCreado=(org.zkoss.util.media.AMedia) winBuilder.getAttribute("return13reporteF");
                    String idComp=(String) comp_UP_adjuntos.getAttribute("componente_id"); 
                    new controladores.ControladorAdjuntos().getAdjuntos(comp_UP_adjuntos, idComp, null, nb, nb, true, 0, false, true, false);
            
                    //Buscamos la fecha actual y le restamos un día para asegurarnos de que la carátula quede adjunta en el primer lugar de la grilla. Tine que ser la foja 1 del expediente.
                    java.text.SimpleDateFormat formatoDeFecha = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    java.util.Locale zona = new java.util.Locale("es", "AR");
                    java.util.Calendar calendario = java.util.Calendar.getInstance();
                    calendario.add(java.util.Calendar.DAY_OF_YEAR, -1);
                    java.util.Date ayer = calendario.getTime();
                    String fechaAyer = formatoDeFecha.format(ayer);
            
                    //Adjuntamos el archivo a la grilla
                    new controladores.ControladorAdjuntos().adjuntarListbox(reporteCreado, comp_UP_adjuntos, false, 0, 0, "", null, fechaAyer, "tipo", "1", false,false);
            
                    //Recordemos que ya hemos guardado la tarea, así que volvemos a guardar la grilla de forma manual. La variable solo la creamos porque esta función devuele un string.
                    String ruta =  new controladores.ControladorAdjuntos().guardarAdjuntos(comp_UP_adjuntos, nb, idComp, nb);
            
                     java.util.List parametrosmandarNotificacionConReporte = new java.util.ArrayList();
                        parametrosmandarNotificacionConReporte.add("Constancia de Tramite"); //asunto / String
                        parametrosmandarNotificacionConReporte.add("Se le adjunta la constancia de inicio de trámite. Correspondiente al Expediente Electrónico "+numDocumentoElectronico); //mensaje / String
                        parametrosmandarNotificacionConReporte.add(valorVariablesReportes); //valorVariablesReportes / java.util.Map
                        parametrosmandarNotificacionConReporte.add(comp_TXT_emailEscribano.getValue()); //to / String
                        parametrosmandarNotificacionConReporte.add("constancia_AYSAM1.jrxml"); //reporte / String
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mandarNotificacionConReporte",parametrosmandarNotificacionConReporte);
            
                }

                    //comp_TXT_nroTramite.setValue(return27mapa.get("P_NUMERO"));
                    //comp_TXT_nroTicket.setValue(return27mapa.get("P_NRO_TICKET"));

                    //Messagebox.show("Tramite: " + comp_TXT_nroTramite.getValue() + ", Ticket: " + comp_TXT_nroTicket.getValue());
                    // Guardar
                	long milesegundos = 172800000;
                    comp_LON_timerOculto.setValue(milesegundos);
                    java.util.List parametrosfnGuardar = new java.util.ArrayList();
                    parametrosfnGuardar.add(iniciador); //alIniciador / Boolean
                    parametrosfnGuardar.add(adirecta); //asignacionDirecta / Boolean
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

                  } catch (Exception ir) {
                        Messagebox.show("El servicio ImprimirReporte no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
                        comp_SAVE_accion.setDisabled(true);
                
                }
            } catch (Exception ae) {
                Messagebox.show("El servicio ActualizaEstado no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
                
                comp_SAVE_accion.setDisabled(true);
            }
        } catch (Exception gta) {
            Messagebox.show("El servicio GeneraTicketArancel no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.","Advertencia",null,null,null);
           
            //java.util.logging.Logger.getLogger("SAYGES: \nError al cargar los estilos. Mensaje: ").log(java.util.logging.Level.SEVERE, gta.getMessage());
            
            comp_SAVE_accion.setDisabled(true);
        }
}

