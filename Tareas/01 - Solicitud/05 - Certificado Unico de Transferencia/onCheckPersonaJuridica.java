import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.Notification;
ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_condImposTrans=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposTrans");
Radiogroup comp_RA_personaFisicaJuridicaTr=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridicaTr");
org.zkoss.zul.Radio radioFisica = comp_RA_personaFisicaJuridicaTr.getItemAtIndex(0);
org.zkoss.zul.Radio radioJuridica = comp_RA_personaFisicaJuridicaTr.getItemAtIndex(1);

Textbox comp_TXT_apellidoTransmitente1 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente1");
Textbox comp_TXT_apellidoTransmitente2 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente2");
Textbox comp_TXT_apellidoTransmitente3 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoTransmitente3");
Textbox comp_TXT_dniTramitente1 = (Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");
Textbox comp_TXT_dniTramitente2 = (Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente2");
Textbox comp_TXT_dniTramitente3 = (Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente3");

Textbox comp_TXT_idPersonaFisicaTramitente = (Textbox) sup.getInstanciaComponente("comp_TXT_idPersonaFisicaTramitente");
Textbox comp_TXT_tipoIVAVendedor = (Textbox) sup.getInstanciaComponente("comp_TXT_tipoIVAVendedor");

Label comp_LA_nombreTramitente1=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente1");
Label comp_LA_nombreTramitente2=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente2");
Label comp_LA_nombreTramitente3=(Label) sup.getInstanciaComponente("comp_LA_nombreTramitente3");
Label comp_LA_apellidoTrans1=(Label) sup.getInstanciaComponente("comp_LA_apellidoTrans1");
Label comp_LA_apellidoTransmitente2=(Label) sup.getInstanciaComponente("comp_LA_apellidoTransmitente2");
Label comp_LA_apellidoTransmitente3=(Label) sup.getInstanciaComponente("comp_LA_apellidoTransmitente3");
Label comp_LA_dniTramitente1=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente1");
Label comp_LA_dniTramitente2=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente2");
Label comp_LA_dniTramitente3=(Label) sup.getInstanciaComponente("comp_LA_dniTramitente3");

String itemCombo = comp_CMB_condImposTrans.getValue().toString();

    switch (itemCombo){

        case "Consumidor Final":

        comp_TXT_tipoIVAVendedor.setValue("1");
        
        if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0){ //física
            
            comp_LA_nombreTramitente1.setValue("Nombre:");
            comp_LA_nombreTramitente2.setValue("Nombre:");
            comp_LA_nombreTramitente3.setValue("Nombre:");
            comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTrans1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_dniTramitente1.setValue("DNI:");
            comp_LA_dniTramitente2.setValue("DNI:");
            comp_LA_dniTramitente3.setValue("DNI:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            radioJuridica.setDisabled(true);
            comp_TXT_idPersonaFisicaTramitente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){ //jurídica

                comp_RA_personaFisicaJuridicaTr.setSelectedIndex(0);
                Notification.show("Si es Consumidor Final, no puede ser Persona Jurídica a la vez");
                
                radioJuridica.setDisabled(true);

                comp_LA_nombreTramitente1.setValue("Nombre:");
                comp_LA_nombreTramitente2.setValue("Nombre:");
                comp_LA_nombreTramitente3.setValue("Nombre:");
                comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
                comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
                comp_LA_apellidoTrans1.setStyle("display: inline;");
                comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
                comp_LA_apellidoTransmitente2.setStyle("display: inline;");
                comp_LA_apellidoTransmitente3.setStyle("display: inline;");
                comp_LA_dniTramitente1.setValue("DNI:");
                comp_LA_dniTramitente2.setValue("DNI:");
                comp_LA_dniTramitente3.setValue("DNI:");
                comp_TXT_dniTramitente1.setValue("-");
                comp_TXT_dniTramitente2.setValue("-");
                comp_TXT_dniTramitente3.setValue("-");
                comp_TXT_idPersonaFisicaTramitente.setValue("PFI");

        }
        
        break;

        case "Exento":
        
        comp_TXT_tipoIVAVendedor.setValue("2");
        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0){
            
            comp_LA_nombreTramitente1.setValue("Nombre:");
            comp_LA_nombreTramitente2.setValue("Nombre:");
            comp_LA_nombreTramitente3.setValue("Nombre:");
            comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTrans1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-"); 
            comp_TXT_idPersonaFisicaTramitente.setValue("PFI");           

        }else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){

            comp_LA_nombreTramitente1.setValue("Razón Social:");
            comp_LA_nombreTramitente2.setValue("Razón Social:");
            comp_LA_nombreTramitente3.setValue("Razón Social:");
            comp_LA_apellidoTrans1.setStyle("display: none;");
            comp_TXT_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente3.setStyle("display: none;");
            comp_LA_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_apellidoTransmitente3.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_apellidoTransmitente1.setValue("-");
            comp_TXT_apellidoTransmitente2.setValue("-");
            comp_TXT_apellidoTransmitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PJU");

        }
        
        break;

        case "Responsable Inscripto":

        comp_TXT_tipoIVAVendedor.setValue("4");
        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0){
            
            comp_LA_nombreTramitente1.setValue("Nombre:");
            comp_LA_nombreTramitente2.setValue("Nombre:");
            comp_LA_nombreTramitente3.setValue("Nombre:");
            comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTrans1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){

            comp_LA_nombreTramitente1.setValue("Razón Social:");
            comp_LA_nombreTramitente2.setValue("Razón Social:");
            comp_LA_nombreTramitente3.setValue("Razón Social:");
            comp_LA_apellidoTrans1.setStyle("display: none;");
            comp_TXT_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente3.setStyle("display: none;");
            comp_LA_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_apellidoTransmitente3.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_apellidoTransmitente1.setValue("-");
            comp_TXT_apellidoTransmitente2.setValue("-");
            comp_TXT_apellidoTransmitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PJU");

        }
        
        break;

        case "Monotributo":

        comp_TXT_tipoIVAVendedor.setValue("6");
        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0){
            
            comp_LA_nombreTramitente1.setValue("Nombre:");
            comp_LA_nombreTramitente2.setValue("Nombre:");
            comp_LA_nombreTramitente3.setValue("Nombre:");
            comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTrans1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){

            comp_LA_nombreTramitente1.setValue("Razón Social:");
            comp_LA_nombreTramitente2.setValue("Razón Social:");
            comp_LA_nombreTramitente3.setValue("Razón Social:");
            comp_LA_apellidoTrans1.setStyle("display: none;");
            comp_TXT_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente3.setStyle("display: none;");
            comp_LA_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_apellidoTransmitente3.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_apellidoTransmitente1.setValue("-");
            comp_TXT_apellidoTransmitente2.setValue("-");
            comp_TXT_apellidoTransmitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PJU");

        }
        
        break;

        case "Sujetos No Recategorizados":

        comp_TXT_tipoIVAVendedor.setValue("7");
        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0){
            
            comp_LA_nombreTramitente1.setValue("Nombre:");
            comp_LA_nombreTramitente2.setValue("Nombre:");
            comp_LA_nombreTramitente3.setValue("Nombre:");
            comp_TXT_apellidoTransmitente1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTrans1.setStyle("display: inline;");
            comp_TXT_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_apellidoTransmitente2.setStyle("display: inline;");
            comp_LA_apellidoTransmitente3.setStyle("display: inline;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){

            comp_LA_nombreTramitente1.setValue("Razón Social:");
            comp_LA_nombreTramitente2.setValue("Razón Social:");
            comp_LA_nombreTramitente3.setValue("Razón Social:");
            comp_LA_apellidoTrans1.setStyle("display: none;");
            comp_TXT_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente3.setStyle("display: none;");
            comp_LA_apellidoTransmitente2.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_apellidoTransmitente3.setStyle("display: none;");
            comp_TXT_apellidoTransmitente1.setStyle("display: none;");
            comp_LA_dniTramitente1.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente2.setValue("CUIL/CUIT:");
            comp_LA_dniTramitente3.setValue("CUIL/CUIT:");
            comp_TXT_dniTramitente1.setValue("-");
            comp_TXT_dniTramitente2.setValue("-");
            comp_TXT_dniTramitente3.setValue("-");
            comp_TXT_apellidoTransmitente1.setValue("-");
            comp_TXT_apellidoTransmitente2.setValue("-");
            comp_TXT_apellidoTransmitente3.setValue("-");
            comp_TXT_idPersonaFisicaTramitente.setValue("PJU");

        }
        
        break;

    }