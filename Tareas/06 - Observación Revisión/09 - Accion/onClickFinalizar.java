import org.zkoss.zul.*;
import modelos.builder.componentes.*;

import org.zkoss.zk.ui.util.Clients;
import org.bonitasoft.engine.bpm.flownode.ActivityInstance; 
//import org.bonitasoft.engine.bpm.flownode.ArchivedActivityInstance; 
import java.util.*;
import java.io.File.*;

ModeloComponente sup = new ModeloComponente();

//datos Escribano

Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_numeroRegistro=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroRegistro");
Combobox comp_CMB_zonaEscribano=(Combobox) sup.getInstanciaComponente("comp_CMB_zonaEscribano");
Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");
Textbox comp_TXT_idEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_idEscribano");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Textbox comp_TXT_TipoIVAVendedor1=(Textbox) sup.getInstanciaComponente("comp_TXT_TipoIVAVendedor1");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");
Textbox comp_TXT_razonSocialPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_razonSocialPersonaNO");
Textbox comp_TXT_TipoIVAVendedor1=(Textbox) sup.getInstanciaComponente("comp_TXT_TipoIVAVendedor1");
Textbox comp_TXT_tipoIVAVendedor=(Textbox) sup.getInstanciaComponente("comp_TXT_tipoIVAVendedor");
Textbox comp_TXT_condImposComprador=(Textbox) sup.getInstanciaComponente("comp_TXT_condImposComprador");

//datos Cuenta
Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");

Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");

//Tramite
Combobox comp_CMB_tramite=(Combobox) sup.getInstanciaComponente("comp_CMB_tramite");
Textbox comp_TXT_idDeTramite=(Textbox) sup.getInstanciaComponente("comp_TXT_idDeTramite");

Listbox comp_GRID_tramiteGrilla=(Listbox) sup.getInstanciaComponente("comp_GRID_tramiteGrilla");

//Nomenclatura Catastral
Combobox comp_CMB_departamentoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT");
Combobox comp_CMB_distritoCUT=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoCUT");
Intbox comp_IN_sectorCUT=(Intbox) sup.getInstanciaComponente("comp_IN_sectorCUT");
Intbox comp_IN_manzanaCut=(Intbox) sup.getInstanciaComponente("comp_IN_manzanaCut");
Intbox comp_IN_parcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_parcelaCUT");

//Nomenclatura Catastral GEO
Combobox comp_CMB_departamentoCUT_GEO=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoCUT_GEO");
Intbox comp_IN_subParcelaCUT_GEO=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT_GEO");

//Inscripcion Dominio
Textbox comp_TXT_AsientoCUT=(Textbox) sup.getInstanciaComponente("comp_TXT_AsientoCUT");
Textbox comp_TXT_matriculaTomoCut=(Textbox) sup.getInstanciaComponente("comp_TXT_matriculaTomoCut");
Combobox comp_CMB_departamentoDominioInput=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoDominioInput");

//Transmitente/Hipotecario
Textbox comp_TXT_nombreTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente1");
Textbox comp_TXT_dniTramitente1=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");

Textbox comp_TXT_nombreTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente2");
Textbox comp_TXT_dniTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente2");

Textbox comp_TXT_nombreTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente3");
Textbox comp_TXT_dniTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente3");

//Adquiriente/Hipotecante
Textbox comp_TXT_personaAdquirente1Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1Nombre");
Textbox comp_TXT_personaAdquirente1DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Doublebox comp_DOU_personaAdquirente1Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente1Porcentaje");

Textbox comp_TXT_personaAdquirente2Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2Nombre");
Textbox comp_TXT_personaAdquirente2DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2DNI");
Doublebox comp_DOU_personaAdquirente2Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente2Porcentaje");

Textbox comp_TXT_personaAdquirente3Nombre=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3Nombre");
Textbox comp_TXT_personaAdquirente3DNI=(Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3DNI");
Doublebox comp_DOU_personaAdquirente3Porcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_personaAdquirente3Porcentaje");

Div dis_nombreTramitente2=(Div) sup.getInstanciaComponente("dis_nombreTramitente2");
Div dis_nombreTramitente3=(Div) sup.getInstanciaComponente("dis_nombreTramitente3");
Div dis_personaAdquirente2=(Div) sup.getInstanciaComponente("dis_personaAdquirente2");
Div dis_personaAdquirente3=(Div) sup.getInstanciaComponente("dis_personaAdquirente3");
Textbox comp_TXT_condImposComprador=(Textbox) sup.getInstanciaComponente("comp_TXT_condImposComprador");
Textbox comp_TXT_tipoIVAVendedor = (Textbox) sup.getInstanciaComponente("comp_TXT_tipoIVAVendedor");
Combobox comp_CMB_condImposTrans=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposTrans");


Combobox comp_CMB_condImposAdq=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposAdq");
Textbox comp_TXT_CUT_ADQUIERE_CUIT1 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT1");
Textbox comp_TXT_CUT_ADQUIERE_CUIT2 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT2");
Textbox comp_TXT_CUT_ADQUIERE_CUIT3 = (Textbox) sup.getInstanciaComponente("comp_TXT_CUT_ADQUIERE_CUIT3");

//Domicilio Sin Cuenta
Combobox comp_CMB_departamentoFisicoSC=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisicoSC");
Combobox comp_CMB_distritoFisicoSC=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisicoSC");
Intbox comp_IN_calleFisicoNumeroSC=(Intbox) sup.getInstanciaComponente("comp_IN_calleFisicoNumeroSC");
Textbox comp_TXT_manzanaFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaFisicoSC");
Textbox comp_TXT_fraccionFisicosSC=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionFisicosSC");
Textbox comp_TXT_loteFisicosSC=(Textbox) sup.getInstanciaComponente("comp_TXT_loteFisicosSC");
Textbox comp_TXT_EdificioSC=(Textbox) sup.getInstanciaComponente("comp_TXT_EdificioSC");
Textbox comp_TXT_DepatoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_DepatoSC");
Textbox comp_TXT_PisoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_PisoSC");
Textbox comp_TXT_Unidad=(Textbox) sup.getInstanciaComponente("comp_TXT_Unidad");
Textbox comp_TXT_Designacion=(Textbox) sup.getInstanciaComponente("comp_TXT_Designacion");
Combobox comp_CMB_Destino=(Combobox) sup.getInstanciaComponente("comp_CMB_Destino");


Bandbox comp_BANDBOX_cpFisicoSC=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpFisicoSC");
Bandbox comp_BANDBOX_calleFisicoSC=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_calleFisicoSC");
Bandbox comp_BANDBOX_barrioSC=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrioSC");


//Domicilio Fisico Ubicacion
Combobox comp_CMB_departamentoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Combobox comp_CMB_distritoFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Combobox comp_CMB_calleFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_calleFisico");
Bandbox comp_BANDBOX_calleFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_calleFisico");
Intbox comp_IN_calleFisicoNumero=(Intbox) sup.getInstanciaComponente("comp_IN_calleFisicoNumero");
Combobox comp_CMB_BarrioFisicos=(Combobox) sup.getInstanciaComponente("comp_CMB_BarrioFisicos");
Bandbox comp_BANDBOX_barrio=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrio");
Textbox comp_TXT_manzanaFisico=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaFisico");
Textbox comp_TXT_loteFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_loteFisicos");
Textbox comp_TXT_fraccionFisicos=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionFisicos");
Combobox comp_CMB_cpFisico=(Combobox) sup.getInstanciaComponente("comp_CMB_cpFisico");
Bandbox comp_BANDBOX_cpFisico=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpFisico");

//Domicilio Postal/Fiscal
Checkbox comp_CHK_igualUbicacionPostalSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalSi");
Checkbox comp_CHK_igualUbicacionPostalNO=(Checkbox) sup.getInstanciaComponente("comp_CHK_igualUbicacionPostalNO");
Combobox comp_CMB_departamentoPostal=(Combobox) sup.getInstanciaComponente("comp_CMB_departamentoPostal");
Combobox comp_CMB_distritoPostals=(Combobox) sup.getInstanciaComponente("comp_CMB_distritoPostals");
Bandbox comp_BANDBOX_callePostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_callePostal");
Intbox comp_IN_numeroPostal=(Intbox) sup.getInstanciaComponente("comp_IN_numeroPostal");
Bandbox comp_BANDBOX_barrioPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_barrioPostal");
Textbox comp_TXT_manzanaPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_manzanaPostal");
Textbox comp_TXT_LotePostal=(Textbox) sup.getInstanciaComponente("comp_TXT_LotePostal");
Textbox comp_TXT_fraccionPostal=(Textbox) sup.getInstanciaComponente("comp_TXT_fraccionPostal");
Bandbox comp_BANDBOX_cpPostal=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_cpPostal");
Textbox comp_TXT_numeroPlano=(Textbox) sup.getInstanciaComponente("comp_TXT_numeroPlano");

//Superficie del Inmueble - Superficie a Transferir
Doublebox comp_DOU_segunTituloInmueble=(Doublebox) sup.getInstanciaComponente("comp_DOU_segunTituloInmueble");
Doublebox comp_DOU_segunPlanoInmueble=(Doublebox) sup.getInstanciaComponente("comp_DOU_segunPlanoInmueble");
Doublebox comp_DOU_supTituloTransferirM2=(Doublebox) sup.getInstanciaComponente("comp_DOU_supTituloTransferirM2");
Doublebox comp_DOU_supPlanoTrasferir=(Doublebox) sup.getInstanciaComponente("comp_DOU_supPlanoTrasferir");

//Subparcela
Intbox comp_IN_subParcelaCUT=(Intbox) sup.getInstanciaComponente("comp_IN_subParcelaCUT");

//Datos CUT PH
/*Textbox comp_TXT_CutPHEdificio=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHEdificio");
Combobox comp_CMB_CutPHCalle=(Combobox) sup.getInstanciaComponente("comp_CMB_CutPHCalle");
Bandbox comp_BANDBOX_CutPHCalle=(Bandbox) sup.getInstanciaComponente("comp_BANDBOX_CutPHCalle");
Textbox comp_TXT_CutPHPiso=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHPiso");
Textbox comp_TXT_CutPHUnidad=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHUnidad");
Textbox comp_TXT_CutPHDesignacion=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHDesignacion");
Textbox comp_TXT_CutPHDestino=(Textbox) sup.getInstanciaComponente("comp_TXT_CutPHDestino");*/
Doublebox comp_DOU_CutPHSupCubPropia=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubPropia");
Doublebox comp_DOU_CutPHSupCubComun=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubComun");
Doublebox comp_DOU_CutPHSupCubTotal=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHSupCubTotal");
Doublebox comp_DOU_CutPHPorcentaje=(Doublebox) sup.getInstanciaComponente("comp_DOU_CutPHPorcentaje");

//Adjuntos
Listbox comp_UP_adjuntos=(Listbox) sup.getInstanciaComponente("comp_UP_adjuntos");


//Si no tiene cuenta, obtengo el CLI ID
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_cli_id=(Textbox) sup.getInstanciaComponente("comp_TXT_cli_id");

//COMPONENTES CHECK
Checkbox comp_CHK_NCG=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCG");
Checkbox comp_CHK_NCT=(Checkbox) sup.getInstanciaComponente("comp_CHK_NCT");

//INICIO CARGAR UBICACIÓN
Textbox comp_TXT_IdZona=(Textbox) sup.getInstanciaComponente("comp_TXT_IdZona");

//TIMER
Longbox comp_LON_timerOculto=(Longbox) sup.getInstanciaComponente("comp_LON_timerOculto");

//TEXT DE LOS BANBOX
Textbox comp_TXT_calleFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_calleFisicoSC");
Textbox comp_TXT_barrioFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_barrioFisicoSC");
Textbox comp_TXT_cpFisicoSC=(Textbox) sup.getInstanciaComponente("comp_TXT_cpFisicoSC");

//
boolean impositiva = false;

if(comp_TXT_TipoIVAVendedor1.equals("") || comp_TXT_TipoIVAVendedor1.equals("-"))
{
    impositiva = true;
}


String itemVendedor = comp_CMB_condImposTrans.getValue().toString();

String itemComprador = comp_CMB_condImposAdq.getValue().toString();




//CODIGO
boolean auxTramite = false;
boolean nCuenta = false;
boolean planchaATM = false;
boolean plano = false;
boolean notaSolicitud = false;
boolean ubicacionConeccion = false;

boolean sumaPorcentaje = false;
boolean adjuntoPlano = false;
boolean adjuntoPlancha = false;
boolean adjuntoNotaSolicitud = false;
boolean adjuntoNotaUbicacion = false;
boolean adjuntoNumeroCliente = false;

String numeros ="";
String tipoAdjunto ="";


String typePers = "";




//FIN CARGAR UBICACION

if(comp_CHK_tieneCuentaNo.isChecked())
{
    if(comp_CMB_persona.getSelectedIndex()==0)
    {
        typePers = "PFI";
    }
    else
    {
        typePers = "PJU";
    }
}


for (java.util.Iterator it = comp_GRID_tramiteGrilla.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
{
    org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

    String tramite = li.getChildren().get(1).getLabel(); // obtengo el valor del campo de la columna 9 

    if(comp_CMB_tramite.getValue().equals(tramite))
    {
        numeros = li.getChildren().get(0).getLabel().toString();
        if(numeros.equals("1") || numeros.equals("2"))
        {
            auxTramite = true;
        }
    }
}


//VALIDAR TIPO DE TRAMITE


if(((numeros.equals("1") || numeros.equals("2")) && comp_IN_subParcelaCUT.getValue()==0) || numeros.equals("3")|| numeros.equals("4"))
{
    adjuntoPlano= true;
    adjuntoPlancha = true;
}

if(numeros.equals("3") || numeros.equals("4")|| numeros.equals("5"))
{
    adjuntoNotaSolicitud = true;
}

if(numeros.equals("4"))
{
    adjuntoNotaUbicacion = true;
}

if(numeros.equals("5"))
{
    adjuntoPlano= true;
}

if(numeros.equals("11"))
{
    adjuntoNumeroCliente = true;
}

for (java.util.Iterator it = comp_UP_adjuntos.getItems().iterator(); it.hasNext();)//se le cambia el nombre a la grilla que se quiera recorrer
{
    org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

    tipoAdjunto = li.getChildren().get(6).getLabel().trim();

    if(tipoAdjunto.equals("Plano"))
    {
        plano = true;
    }
    
    //Se agrega los demas ajuntos
    if(tipoAdjunto.contains("Nota de Solicitud")){
            notaSolicitud = true;
    }
    
    if(tipoAdjunto.contains("Nota Ubicación Conexión")){
            ubicacionConeccion = true;
     }
    
  	if(tipoAdjunto.contains("N° de Cuenta")){
           nCuenta = true; 
    }
        
    if(tipoAdjunto.contains("Plancha ATM")){
           planchaATM = true; 
            
     }
    
    
}

// Calcular porcentaje total de Adquirentes
double  total = 0; 
total = comp_DOU_personaAdquirente1Porcentaje.getValue() + comp_DOU_personaAdquirente2Porcentaje.getValue() + comp_DOU_personaAdquirente3Porcentaje.getValue() ;

// ----- Validaciones del formulario ----- //

// Datos del Escribano
if(comp_TXT_numeroRegistro.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un numero de registro valido","Advertencia",null,null,null);
}
else if(comp_TXT_emailEscribano.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un correo electrónico","Advertencia",null,null,null);  
}
else if(comp_CMB_zonaEscribano.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese una zona","Advertencia",null,null,null);  

// Datos Cuenta
}
else if(!comp_CHK_tieneCuentaSi.isChecked() && !comp_CHK_tieneCuentaNo.isChecked())
{
    Messagebox.show("Por favor seleccione la casilla correspondiente a si posee una cuenta.","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaSi.isChecked() && comp_TXT_apellidoCuenta.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un numero de cuenta","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_TXT_CUITPersona.getValue().trim().equals("-") && typePers.equals("PJU"))
{
    Messagebox.show("Por favor ingrese un CUIT para su cuenta","Advertencia",null,null,null);

}
//Datos Sin Cuenta

else if(comp_CHK_tieneCuentaNo.isChecked() && comp_CMB_departamentoFisicoSC.getValue().equals("-"))
{
    Messagebox.show("Por favor seleccione un Departamento en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_CMB_distritoFisicoSC.getValue().equals("-"))
{
    Messagebox.show("Por favor seleccione un Distrito en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() &&  comp_BANDBOX_calleFisicoSC.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione una Calle en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() &&  comp_BANDBOX_calleFisicoSC.getValue().equals("-") ||  comp_CHK_tieneCuentaNo.isChecked() &&  comp_TXT_calleFisicoSC.getValue().equals("-"))
{
    Messagebox.show("Por favor seleccione una Calle en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_IN_calleFisicoNumeroSC.getValue().equals(0)){
    
     Messagebox.show("Por favor ingrese un Numero en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}

else if(comp_CHK_tieneCuentaNo.isChecked() && comp_BANDBOX_barrioSC.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione un Barrio en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() &&  comp_BANDBOX_barrioSC.getValue().equals("-") ||  comp_CHK_tieneCuentaNo.isChecked() &&  comp_TXT_barrioFisicoSC.getValue().equals("-"))
{
   Messagebox.show("Por favor seleccione un Barrio en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_TXT_manzanaFisicoSC.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese una Manzana en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_TXT_loteFisicosSC.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un Lote en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() && comp_BANDBOX_cpFisicoSC.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione un Código Postal en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(comp_CHK_tieneCuentaNo.isChecked() &&  comp_BANDBOX_cpFisicoSC.getValue().equals("-") ||  comp_CHK_tieneCuentaNo.isChecked() &&  comp_TXT_cpFisicoSC.getValue().equals("-"))
{
    Messagebox.show("Por favor seleccione un Código Postal en Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}

// Datos Tramite
else if(comp_CMB_tramite.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor seleccione un tramite","Advertencia",null,null,null);
// CUT
}

//Nomenclatura TRADICIONAL
else if(auxTramite &&  !comp_CHK_NCT.isChecked() && !comp_CHK_NCG.isChecked())
{ 
        Messagebox.show("Por favor seleccione una nomenclatura correspondiente ","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_NCT.isChecked() && comp_CMB_departamentoCUT.getValue().trim().equals("-")  )
{ 
        Messagebox.show("Por favor seleccione un departamento en nomenclatura catastral","Advertencia",null,null,null);
    
}
else if(auxTramite && comp_CHK_NCT.isChecked() && comp_CMB_distritoCUT.getValue().trim().equals("-")  )
{ 
        Messagebox.show("Por favor seleccione un distrito en nomenclatura catastral","Advertencia",null,null,null);
    
}
else if(auxTramite && comp_CHK_NCG.isChecked() && comp_CMB_departamentoCUT_GEO.getValue().trim().equals("-")  )
{ 
        Messagebox.show("Por favor seleccione un departamento en nomenclatura catastral Georeferenciada","Advertencia",null,null,null);
}
/*
//INSCRIPCION DE DOMINIO
else if(auxTramite && comp_TXT_AsientoCUT.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un asiento","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_matriculaTomoCut.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un número de Matrícula/Tomo","Advertencia",null,null,null);
}
else if(auxTramite && comp_CMB_departamentoDominioInput.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor seleccione un Departamento","Advertencia",null,null,null);
// CUT - Tramitentes
}
else if(auxTramite && comp_TXT_nombreTramitente1.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del primer Transmitente/Hipotecario","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_dniTramitente1.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del primer Transmitente/Hipotecario","Advertencia",null,null,null);
}
else if(auxTramite && dis_nombreTramitente2.isVisible() && comp_TXT_nombreTramitente2.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del segundo Transmitente/Hipotecario","Advertencia",null,null,null);
}
else if(auxTramite && dis_nombreTramitente2.isVisible() && comp_TXT_dniTramitente2.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del segundo Transmitente/Hipotecario","Advertencia",null,null,null);
}
else if(auxTramite && dis_nombreTramitente3.isVisible() && comp_TXT_nombreTramitente3.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del tercer Transmitente/Hipotecario","Advertencia",null,null,null);
}
else if(auxTramite && dis_nombreTramitente3.isVisible() && comp_TXT_dniTramitente3.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del tercer Transmitente/Hipotecario","Advertencia",null,null,null);

}
else if(auxTramite && comp_TXT_personaAdquirente1Nombre.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del primer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_personaAdquirente1DNI.isVisible() && comp_TXT_personaAdquirente1DNI.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del primer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_CUT_ADQUIERE_CUIT1.isVisible() && comp_TXT_CUT_ADQUIERE_CUIT1.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el CUIT del primer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_DOU_personaAdquirente1Porcentaje.getValue()<=0)
{
    Messagebox.show("Por favor ingrese correctamente el porcentaje del primer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && dis_personaAdquirente2.isVisible() && comp_TXT_personaAdquirente2Nombre.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del segundo Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_personaAdquirente2DNI.isVisible() && dis_personaAdquirente2.isVisible() && comp_TXT_personaAdquirente2DNI.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del segundo Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_CUT_ADQUIERE_CUIT2.isVisible() && dis_personaAdquirente2.isVisible() && comp_TXT_CUT_ADQUIERE_CUIT2.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el CUIT del segundo Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && dis_personaAdquirente2.isVisible() && comp_DOU_personaAdquirente2Porcentaje.getValue()<=0)
{
    Messagebox.show("Por favor ingrse correctamente el porcentaje del segundo Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && dis_personaAdquirente3.isVisible() && comp_TXT_personaAdquirente3Nombre.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el nombre del tercer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_personaAdquirente3DNI.isVisible() && dis_personaAdquirente3.isVisible() && comp_TXT_personaAdquirente3DNI.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el DNI del tercer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && comp_TXT_CUT_ADQUIERE_CUIT3.isVisible() && dis_personaAdquirente3.isVisible() && comp_TXT_CUT_ADQUIERE_CUIT3.getValue().equals("-"))
{
    Messagebox.show("Por favor ingrese el CUIT del tercer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && dis_personaAdquirente3.isVisible() && comp_DOU_personaAdquirente3Porcentaje.getValue()<=0)
{
    Messagebox.show("Por favor ingrese correctamente el porcentaje del tercer Adquiriente/Hipotecante","Advertencia",null,null,null);
}
else if(auxTramite && total!=100)
{
    Messagebox.show("Por favor verifique e ingrese correctamente el porcentaje de los Adquirientes/Hipotecantes","Advertencia",null,null,null);

}
*/

// CUT - Domicilio Postal SI

else if(auxTramite && !comp_CHK_igualUbicacionPostalSi.isChecked() && !comp_CHK_igualUbicacionPostalNO.isChecked())
{
    Messagebox.show("Por favor seleccione la casilla correspondiente igual ubicacion en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_CMB_departamentoFisico.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el departamento del Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_CMB_distritoFisico.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese el distrito del Domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_BANDBOX_calleFisico.getValue().isEmpty()){
    
     Messagebox.show("Por favor seleccione la calle  del domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
    
}else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_IN_calleFisicoNumero.getValue().equals(0)){
    
      Messagebox.show("Por favor ingrese una Calle  del domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
    
    
}
else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_BANDBOX_barrio.getValue().isEmpty()){
    
      Messagebox.show("Por favor ingrese un Barrio  del domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
    
    
}
else if(auxTramite  && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_TXT_manzanaFisico.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese una manzana (Datos Cuenta)","Advertencia",null,null,null);
}
else if(auxTramite  && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_TXT_loteFisicos.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor ingrese un lote (Datos Cuenta)","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_tieneCuentaNo.isChecked() && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_BANDBOX_cpFisico.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione el código postal del domicilio Físico/Ubicación (Datos Cuenta)","Advertencia",null,null,null);
}

// CUT - Domicilio Postal NO

else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_CMB_departamentoPostal.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor seleccione un Departamento en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_CMB_distritoPostals.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor seleccione un Distrito en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_BANDBOX_callePostal.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione una Calle en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_IN_numeroPostal.getValue().equals(0))
{
    Messagebox.show("Por favor seleccione un Numero en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_BANDBOX_barrioPostal.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione un Barrio en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_TXT_manzanaPostal.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor Ingrese una Manzana en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_TXT_LotePostal.getValue().trim().equals("-"))
{
    Messagebox.show("Por favor Ingrese un Lote en el Domicilio Postal.","Advertencia",null,null,null);
}
else if(auxTramite && comp_CHK_igualUbicacionPostalNO.isChecked() && comp_BANDBOX_cpPostal.getValue().isEmpty())
{
    Messagebox.show("Por favor seleccione un Codigo Postal en el Domicilio Postal.","Advertencia",null,null,null);
}
/*else if(auxTramite && comp_CHK_igualUbicacionPostalSi.isChecked() && comp_TXT_numeroPlano.getValue().trim().equals("-") && comp_IN_subParcelaCUT.getValue()==0)
{
    Messagebox.show("Por favor ingrese el número de plano en el Domicilio Físico.","Advertencia",null,null,null);
// CUT - Superficie del Inmueble y Superficie a Transferir
}*/
else if(auxTramite && comp_DOU_segunTituloInmueble.getValue()==0 && comp_IN_subParcelaCUT.getValue()==0)
{                                           
    Messagebox.show("Por favor ingrese el numero Según Titulo en m2 (Superficie del Inmueble)","Advertencia",null,null,null);
}
else if(auxTramite && comp_DOU_segunPlanoInmueble.getValue()==0 && comp_IN_subParcelaCUT.getValue()==0)
{
    Messagebox.show("Por favor ingrese el numero Según Plano en m2 (Superficie del Inmueble)","Advertencia",null,null,null);
}
else if(auxTramite && comp_DOU_supTituloTransferirM2.getValue()==0 && comp_IN_subParcelaCUT.getValue()==0)
{
    Messagebox.show("Por favor ingrese el numero Según Titulo en m2 (Superficie a Transferir)","Advertencia",null,null,null);
}
else if(auxTramite && comp_DOU_supPlanoTrasferir.getValue()==0 && comp_IN_subParcelaCUT.getValue()==0)
{
    Messagebox.show("Por favor ingrese el numero Según Plano en m2 (Superficie a Transferir)","Advertencia",null,null,null);

}
// Datos CUT para PH TRA
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_TXT_Unidad.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese la Unidad para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_TXT_Designacion.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese la Designacion para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_CMB_Destino.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese el Destino para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_DOU_CutPHSupCubPropia.getValue()==0)
{                                           
    Messagebox.show("Por favor ingrese la Superficie Cubierta Propia en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_DOU_CutPHSupCubComun.getValue()==0)
{
    Messagebox.show("Por favor ingrese la Superficie Cubierta Común en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_DOU_CutPHSupCubTotal.getValue()==0)
{
    Messagebox.show("Por favor ingrese la Superficie Cubierta Total en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT.getValue()!=0 && comp_DOU_CutPHPorcentaje.getValue()==0)
{
    Messagebox.show("Por favor ingrese el Porcentaje en Datos del CUT para PH","Advertencia",null,null,null);
    
}
//Datos CUT para PH GEO
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_TXT_Unidad.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese la Unidad para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_TXT_Designacion.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese la Designacion para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_CMB_Destino.getValue().trim().equals("-"))
{                                           
    Messagebox.show("Por favor ingrese el Destino para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_DOU_CutPHSupCubPropia.getValue()==0)
{                                           
    Messagebox.show("Por favor ingrese la Superficie Cubierta Propia en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_DOU_CutPHSupCubComun.getValue()==0)
{
    Messagebox.show("Por favor ingrese la Superficie Cubierta Común en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_DOU_CutPHSupCubTotal.getValue()==0)
{
    Messagebox.show("Por favor ingrese la Superficie Cubierta Total en Datos del CUT para PH","Advertencia",null,null,null);
}
else if(comp_IN_subParcelaCUT_GEO.getValue()!=0 && comp_DOU_CutPHPorcentaje.getValue()==0)
{
    Messagebox.show("Por favor ingrese el Porcentaje en Datos del CUT para PH","Advertencia",null,null,null);
    
// Adjuntos
}
else if(adjuntoPlano && !plano)
{
    Messagebox.show("Por favor ingrese el Plano Digitalizado","Advertencia",null,null,null);        
}
else if(numeros.equals("11") && comp_CHK_tieneCuentaNo.isChecked())
{
    Messagebox.show("Para el tipo de trámite INFORME DE DEUDA - BOLETO debe cargar un número de cuenta");
}
else if(impositiva == true)
{
    Messagebox.show("Debe completar Condición Impositiva");
}
else
{
    org.zkoss.zul.Messagebox.show("¿Si finaliza el tramite pasará a Revisión?", "Atención", org.zkoss.zul.Messagebox.YES | org.zkoss.zul.Messagebox.NO, org.zkoss.zul.Messagebox.QUESTION, new org.zkoss.zk.ui.event.EventListener()
    {
        public void onEvent(org.zkoss.zk.ui.event.Event evt)
        {
            switch (((Integer) evt.getData()).intValue())
            {
                case Messagebox.YES:
                  
               
                    
                    	long milesegundos = 172800000;
                    	comp_LON_timerOculto.setValue(milesegundos);
                        java.util.List parametrosfnGuardar = new java.util.ArrayList();
                       
                        parametrosfnGuardar.add(false); //alIniciador / Boolean ---->
                        parametrosfnGuardar.add(false); //asignacionDirecta / Boolean
                        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnGuardar",parametrosfnGuardar);

            }
        }
    }); 
}














