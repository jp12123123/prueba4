import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.Notification;
ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_condImposAdq=(Combobox) sup.getInstanciaComponente("comp_CMB_condImposAdq");
Radiogroup comp_RA_personaFisicaJuridica=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridica");
org.zkoss.zul.Radio radioFisica = comp_RA_personaFisicaJuridica.getItemAtIndex(0);
org.zkoss.zul.Radio radioJuridica = comp_RA_personaFisicaJuridica.getItemAtIndex(1);

Textbox comp_TXT_apellidoTransmitente1 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente1");
Textbox comp_TXT_apellidoTransmitente2 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente2");
Textbox comp_TXT_apellidoTransmitente3 = (Textbox) sup.getInstanciaComponente("comp_TXT_apellidoAdquirente3");
Textbox comp_TXT_dniTramitente1 = (Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente1DNI");
Textbox comp_TXT_dniTramitente2 = (Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente2DNI");
Textbox comp_TXT_dniTramitente3 = (Textbox) sup.getInstanciaComponente("comp_TXT_personaAdquirente3DNI");
Textbox comp_TXT_idPersonaFisicaJuridicaAdquirente=(Textbox) sup.getInstanciaComponente("comp_TXT_condImposComprador");

Label comp_LA_nombreTramitente1=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente1Nombre");
Label comp_LA_nombreTramitente2=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente2");
Label comp_LA_nombreTramitente3=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente3Nombre");
Label comp_LA_apellidoTrans1=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquierente1");
Label comp_LA_apellidoTransmitente2=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquirente2");
Label comp_LA_apellidoTransmitente3=(Label) sup.getInstanciaComponente("comp_LA_apellidoAdquirente3");
Label comp_LA_dniTramitente1=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente1DNI");
Label comp_LA_dniTramitente2=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente2DNI");
Label comp_LA_dniTramitente3=(Label) sup.getInstanciaComponente("comp_LA_personaAdquirente3DNI");

String itemCombo = comp_CMB_condImposAdq.getValue().toString();

    switch (itemCombo){

        case "Consumidor Final":
        
        if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){ //física
            
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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){ //jurídica

                comp_RA_personaFisicaJuridica.setSelectedIndex(0);
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
                comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");

        }
        
        break;

        case "Exento":
        
        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){
            
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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");           

        }else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){

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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PJU");

        }
        
        break;

        case "Responsable Inscripto":

        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){
            
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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){

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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PJU");

        }
        
        break;

        case "Monotributo":

        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){
            
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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){

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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PJU");

        }
        
        break;

        case "Sujetos No Recategorizados":

        radioJuridica.setDisabled(false);

        if(comp_RA_personaFisicaJuridica.getSelectedIndex()==0){
            
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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PFI");

        }else if(comp_RA_personaFisicaJuridica.getSelectedIndex()==1){

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
            comp_TXT_idPersonaFisicaJuridicaAdquirente.setValue("PJU");

        }
        
        break;

    }