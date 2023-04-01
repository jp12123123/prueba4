import org.zkoss.zul.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

//String mensajeParametro="";


Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");
Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");
Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");
Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");

Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

//mensajeParametro = "Departamento "+comp_CMB_departamentoCUT.getValue()+" Distrito "+comp_CMB_distritoCUT.getValue()/*+" Sector "+ comp_IN_sectorCUT.geValue().toString()+" Manzana "+ comp_IN_manzanaCut.geValue().toString()+" Parcela "+ comp_IN_parcelaCUT.geValue().toString()+" Subparcela "+ comp_IN_subParcelaCUT.geValue().toString()*/;


Textbox comp_TXT_AsientoCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_AsientoCUT");
Textbox comp_TXT_nroTicket=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTicket");
Textbox comp_TXT_matriculaTomoCut=(Textbox) sup.getInstanciaComponente("comp_TXT_matriculaTomoCut");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");
Datebox comp_DA_fechaCut=(Datebox) sup.getInstanciaComponente("comp_DA_fechaCut");
//String nroTicket = comp_TXT_nroTicket.getValue().trim();

mensajeParametro = mensajeParametro+" Asiento "+ comp_TXT_AsientoCUT.getValue()+" Matricula "+ comp_TXT_matriculaTomoCut.getValue()+" Departamento Dominio"+ comp_CMB_departamentoDominioInput.getValue();

Textbox comp_TXT_nombreTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente1");
Textbox comp_TXT_dniTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");


Textbox comp_TXT_personaAdquirente1Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1Nombre");
Textbox comp_TXT_personaAdquirente1DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Doublebox comp_DOU_personaAdquirente1Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente1Porcentaje");
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Button comp_SAVE_accion=(Button) sup.getInstanciaComponente("comp_SAVE_accion");

//Messagebox.show(mensajeParametro);

Textbox comp_TXT_nroEscrituraCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_nroEscrituraCUT");
Textbox comp_TXT_nroFolioCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_nroFolioCUT");
Checkbox comp_CHK_banderaGrabaCUT=(Checkbox) sup.getInstanciaComponente("comp_CHK_banderaGrabaCUT");
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");

beans.session.BeanUserWEB beanSeWeb = (beans.session.BeanUserWEB) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("userWEB");
//String usuario_modif = beanSeWeb.getLogin();
Textbox comp_TXT_nroTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_nroTramite");
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");


//Variables para el Reporte
Combobox comboTramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");
Textbox comp_TXT_nombreEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreEscribano");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_apellidoEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoEscribano");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
beans.session.BeanUser1 beanSe = (beans.session.BeanUser1) org.zkoss.zk.ui.Sessions.getCurrent().getAttribute("user");
Window winBuilder = (Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder");
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_razonSocialPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_razonSocialPersonaNO");
Textbox comp_TXT_nroCuenta2da=(Textbox) sup.getInstanciaComponente("comp_TXT_nroCuenta2da");

long nb = (Long)  winBuilder.getAttribute("procesoID");
String numDocumentoElectronico= (String) winBuilder.getAttribute("nexp");
String nombre_Escribano = comp_TXT_apellidoEscribano.getValue() + " " + comp_TXT_nombreEscribano.getValue();
String nombre_Titular = comp_TXT_apellidoCuenta.getValue() + " " + comp_TXT_nombreCuenta.getValue();
String nombre_Usuario = beanSe.getApellido() + " " + beanSe.getNombre();
String titularReporte = "";
String titularEmpresa = comp_TXT_razonSocialPersonaNO.getValue();
String titularSinCuenta = comp_TXT_apellidoPersonaNO.getValue()+", "+comp_TXT_nombrePersonaNO.getValue();



String numeroCuenta ="";

if(comp_CHK_tieneCuentaSi.isChecked()){
    numeroCuenta = comp_TXT_nroTramite.getValue().trim();
}else{
    numeroCuenta = comp_TXT_cli_id.getValue().trim();
}


String nroTicket = comp_TXT_nroTicket.getValue().trim();

/*if(comp_TXT_nroEscrituraCUT.getValue().trim().equals("-") || comp_TXT_nroEscrituraCUT.getValue().trim().equals("--") || comp_TXT_nroEscrituraCUT.getValue().trim().equals("---")){
    Messagebox.show("Por favor ingrese el Número de Escritura","Advertencia",null,null,null);
}else if(comp_TXT_nroFolioCUT.getValue().trim().equals("-") || comp_TXT_nroFolioCUT.getValue().trim().equals("--") || comp_TXT_nroFolioCUT.getValue().trim().equals("---")){
    Messagebox.show("Por favor ingrese el Número de Folio","Advertencia",null,null,null);
}else {
    comp_SAVE_accion.setDisabled(true);*/
    

     /*try {
        java.util.List parametrosfnGrabarSinCerrar = new java.util.ArrayList();
            parametrosfnGrabarSinCerrar.add(false); //alIniciador / Boolean
            parametrosfnGrabarSinCerrar.add(false); //asignacionDirecta / Boolean
            parametrosfnGrabarSinCerrar.add(true); //grabar / Boolean
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGrabarSinCerrar",parametrosfnGrabarSinCerrar);
        
        java.util.List parametrosfnGrabaCUT = new java.util.ArrayList();
        parametrosfnGrabaCUT.add(nroTicket); //id_cut / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGrabaCUT",parametrosfnGrabaCUT);
		Map return32mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return32mapa");
        String codigoDevuelto = return32mapa.get("P_CODIGO").trim().toString();
        String mensajeDevuelto = return32mapa.get("P_MENSAJE").trim().toString();
        if(codigoDevuelto.equals("1")){
            Messagebox.show("El servicio no guardó correctamente sus datos. Por favor comuníquese con el área técnica.","Advertencia",null,null,null);
        }else{*/
            
           try{
                /*java.util.List parametrosfnActualizaEstado = new java.util.ArrayList();
                    parametrosfnActualizaEstado.add(comp_TXT_nroTramite.getValue()); //Nro_Tramite / String
                    parametrosfnActualizaEstado.add("4"); //Nro_Estado / String
                    parametrosfnActualizaEstado.add(numeroCuenta); //numero_Cuenta / String
                    parametrosfnActualizaEstado.add(usuario_modif); //P_USR_MOD / String
                new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnActualizaEstado",parametrosfnActualizaEstado);
                Map return28mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return28mapa");
                */
                
                //***CODIGO PARA EL REPORTE
                if(comp_CHK_tieneCuentaSi.isChecked())
                {
                    Map valorVariablesReportes = new java.util.HashMap();
                    valorVariablesReportes.put("nro_Tramite", comp_TXT_nroTramite.getValue());
                    valorVariablesReportes.put("tipo_Tramite", comboTramite.getValue());
                    valorVariablesReportes.put("escribania", nombre_Escribano);
                    valorVariablesReportes.put("cuenta", comp_TXT_cuenta.getValue());
                    valorVariablesReportes.put("domicilio", comp_TXT_domicilioCuenta.getValue());
                    valorVariablesReportes.put("titular",nombre_Titular);
                    //valorVariablesReportes.put("recibido_Por", nombre_Usuario);
                    //valorVariablesReportes.put("area", beanSe.getGrupo());
                    valorVariablesReportes.put("nro_Ticket", comp_TXT_nroTicket.getValue());
                    //valorVariablesReportes.put("url", urlRepor);
                    //valorVariablesReportes.put("url", "-");
                    valorVariablesReportes.put("numeroEE", numDocumentoElectronico);
                    
                    //Nuevos parametros
                    valorVariablesReportes.put("nro_Escritura", comp_TXT_nroEscrituraCUT.getValue());
                    valorVariablesReportes.put("nro_Folio", comp_TXT_nroFolioCUT.getValue());
                    
                    List parametros = new java.util.ArrayList();
                    parametros.add(valorVariablesReportes);
                    parametros.add("constancia_AYSAM1_1.jrxml");
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
                        parametrosmandarNotificacionConReporte.add("constancia_AYSAM1_1.jrxml"); //reporte / String
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
                     
                    /*if(comp_TXT_cuenta.getValue().equals("-")){
                        valorVariablesReportes.put("cuenta", "-");
                    }else{/
                        
                    }*/
                    valorVariablesReportes.put("cuenta", comp_TXT_nroCuenta2da.getValue());
                    valorVariablesReportes.put("domicilio", "-");
                    valorVariablesReportes.put("titular",titularReporte);
                    //valorVariablesReportes.put("recibido_Por", nombre_Usuario);
                    //valorVariablesReportes.put("area", beanSe.getGrupo());
                    valorVariablesReportes.put("nro_Ticket", comp_TXT_nroTicket.getValue());
                    //valorVariablesReportes.put("url", urlRepor);
                    //valorVariablesReportes.put("url", "-");
                    valorVariablesReportes.put("numeroEE", numDocumentoElectronico);
                    
                    //Nuevos parametros
                    valorVariablesReportes.put("nro_Escritura", comp_TXT_nroEscrituraCUT.getValue());
                    valorVariablesReportes.put("nro_Folio", comp_TXT_nroFolioCUT.getValue());
                    
                    
            
                    List parametros = new java.util.ArrayList();
                    parametros.add(valorVariablesReportes);
                    parametros.add("constancia_AYSAM1_1.jrxml");
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
                        parametrosmandarNotificacionConReporte.add(comp_TXT_emailEscribano.getValue().trim()); //to / String
                        parametrosmandarNotificacionConReporte.add("constancia_AYSAM1_1.jrxml"); //reporte / String
                    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mandarNotificacionConReporte",parametrosmandarNotificacionConReporte);
            
                }
                //FIN**
 
            } catch (Exception ex) {
                Messagebox.show("El servicio ActualizaEstado no se encuentra disponible. Por favor, comuníquese con el área técnica","Advertencia",null,null,null);
                //Logger.getLogger(modelos.builder.eventos.ModeloEventos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //TIMER
            
			long milesegundos = 172800000;
            comp_LON_timerOculto.setValue(milesegundos);


            java.util.List parametrosfnGuardar = new java.util.ArrayList();
                parametrosfnGuardar.add(false); //alIniciador / Boolean
                parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
            
            Messagebox.show("Su solicitud de Confirmación de Escritura fue exitosa. Muchas gracias");
            
            
            //REPORTE
            
            //PARAMETROS DEL REPORTE


                    
            //IMPRIMIR REPORTE
             
                    
                    
            //FECHA PARA EL REPORTE
            

            //ADJUNTAR REPORTE
             
            
            /*MANDAR NOTIFICACIÓN
            java.util.List parametrosmandarNotificacionConReporte = new java.util.ArrayList();
            parametrosmandarNotificacionConReporte.add("Constancia de Finalización de Trámite");
            parametrosmandarNotificacionConReporte.add("Estimado Usuario: le enviamos la constancia de finalización del trámite. <br>Saludos Cordiales"); 
            parametrosmandarNotificacionConReporte.add(); //variables del reporte, vacio por ahora
            parametrosmandarNotificacionConReporte.add(); //correo, vacio por ahora
            parametrosmandarNotificacionConReporte.add(); //nombre del reporte, vacio por ahora 
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("mandarNotificacionConReporte",parametrosmandarNotificacionConReporte);*/
            
        //}
   /* }catch(Exception e){
        Messagebox.show("El servicio GrabarCut no está disponible por el momento. Por favor comuníquese con el área técnica.","Advertencia",null,null,null);

        //comp_TXT_nroEscrituraCUT.setValue("-");
        //comp_TXT_nroFolioCUT.setValue("-");
    }*/
//}


//ESTE ANDA
/*long milesegundos = 14400000;
            comp_LON_timerOculto.setValue(milesegundos);


            java.util.List parametrosfnGuardar = new java.util.ArrayList();
                parametrosfnGuardar.add(false); //alIniciador / Boolean
                parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
            new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);
            
            Messagebox.show("Su solicitud de Confirmación de Escritura fue exitosa. Muchas gracias");*/