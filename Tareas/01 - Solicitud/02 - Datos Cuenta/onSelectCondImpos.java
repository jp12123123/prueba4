import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.Notification;
ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_condicionImpositivaVendedor=(Combobox) sup.getInstanciaComponente("comp_CMB_condicionImpositivaVendedor");
Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_TipoIVAVendedor1=(Textbox) sup.getInstanciaComponente("comp_TXT_TipoIVAVendedor1");
Textbox comp_TXT_tipoPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_tipoPersona");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Div dis_razonSocialPersonaNO=(Div) sup.getInstanciaComponente("dis_razonSocialPersonaNO");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
String valorCondicion = comp_CMB_condicionImpositivaVendedor.getValue().toString();
String valorPersona = comp_CMB_persona.getValue().toString();

    switch (valorCondicion){

        case "Consumidor Final":

        comp_TXT_TipoIVAVendedor1.setValue("1");
        
        if(valorPersona.equals("Física")){ //física
            
            dis_dniPersona.setVisible(true);
            dis_cuitPersona.setVisible(false);
            dis_nombrePersonaNO.setVisible(true);
            dis_razonSocialPersonaNO.setVisible(false);
            dis_apellidoPersonaNO.setVisible(true);
            comp_TXT_tipoPersona.setValue("PFI");

        }else if(valorPersona.equals("Jurídica")){ //jurídica
                comp_CMB_persona.setSelectedIndex(0);
                Notification.show("Si es Consumidor Final, no puede ser Persona Jurídica a la vez");
                dis_dniPersona.setVisible(true);
                dis_cuitPersona.setVisible(false);
                dis_nombrePersonaNO.setVisible(true);
                dis_razonSocialPersonaNO.setVisible(false);
                dis_apellidoPersonaNO.setVisible(true);
                comp_TXT_tipoPersona.setValue("PFI");
        }
        
        break;

        case "Exento":
        
        comp_TXT_TipoIVAVendedor1.setValue("2");
                
        if(valorPersona.equals("Física")){ //física
            comp_CMB_persona.setSelectedIndex(1);
            Notification.show("Si es Excento, no puede ser Persona Física a la vez");
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            dis_nombrePersonaNO.setVisible(false);
            dis_razonSocialPersonaNO.setVisible(true);
            dis_apellidoPersonaNO.setVisible(false);
            comp_TXT_tipoPersona.setValue("PJU");

        }else if(valorPersona.equals("Jurídica")){ //jurídica
                
                dis_dniPersona.setVisible(false);
                dis_cuitPersona.setVisible(true);
                dis_nombrePersonaNO.setVisible(false);
                dis_razonSocialPersonaNO.setVisible(true);
                dis_apellidoPersonaNO.setVisible(false);
                comp_TXT_tipoPersona.setValue("PJU");
        }
        
        break;

        case "Responsable Inscripto":

        comp_TXT_TipoIVAVendedor1.setValue("4");

        if(valorPersona.equals("Física")){ //física
            
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            dis_nombrePersonaNO.setVisible(true);
            dis_razonSocialPersonaNO.setVisible(false);
            dis_apellidoPersonaNO.setVisible(true);
            comp_TXT_tipoPersona.setValue("PFI");

        }else if(valorPersona.equals("Jurídica")){ //jurídica
                
                dis_dniPersona.setVisible(false);
                dis_cuitPersona.setVisible(true);
                dis_nombrePersonaNO.setVisible(false);
                dis_razonSocialPersonaNO.setVisible(true);
                dis_apellidoPersonaNO.setVisible(false);
                comp_TXT_tipoPersona.setValue("PJU");
        }
        
        break;

        case "Monotributo":

        comp_TXT_TipoIVAVendedor1.setValue("6");

        if(valorPersona.equals("Física")){ //física
            
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            dis_nombrePersonaNO.setVisible(true);
            dis_razonSocialPersonaNO.setVisible(false);
            dis_apellidoPersonaNO.setVisible(true);
            comp_TXT_tipoPersona.setValue("PFI");

        }else if(valorPersona.equals("Jurídica")){ //jurídica
                
                dis_dniPersona.setVisible(false);
                dis_cuitPersona.setVisible(true);
                dis_nombrePersonaNO.setVisible(false);
                dis_razonSocialPersonaNO.setVisible(true);
                dis_apellidoPersonaNO.setVisible(false);
                comp_TXT_tipoPersona.setValue("PJU");
        }
        
        break;

        case "Sujetos No Recategorizados":

        comp_TXT_TipoIVAVendedor1.setValue("7");
        if(valorPersona.equals("Física")){ //física
            
            dis_dniPersona.setVisible(false);
            dis_cuitPersona.setVisible(true);
            dis_nombrePersonaNO.setVisible(true);
            dis_razonSocialPersonaNO.setVisible(false);
            dis_apellidoPersonaNO.setVisible(true);
            comp_TXT_tipoPersona.setValue("PFI");

        }else if(valorPersona.equals("Jurídica")){ //jurídica
                
                dis_dniPersona.setVisible(false);
                dis_cuitPersona.setVisible(true);
                dis_nombrePersonaNO.setVisible(false);
                dis_razonSocialPersonaNO.setVisible(true);
                dis_apellidoPersonaNO.setVisible(false);
                comp_TXT_tipoPersona.setValue("PJU");
        }
        
        break;

    }