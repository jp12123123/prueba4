import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Checkbox comp_CHK_tieneCuentaSi=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaSi");
Checkbox comp_CHK_tieneCuentaNo=(Checkbox) sup.getInstanciaComponente("comp_CHK_tieneCuentaNo");
Div dis_cuenta=(Div) sup.getInstanciaComponente("dis_cuenta");
Div dis_nombreCuenta=(Div) sup.getInstanciaComponente("dis_nombreCuenta");
Div dis_apellidoCuenta=(Div) sup.getInstanciaComponente("dis_apellidoCuenta");
Div dis_domicilio=(Div) sup.getInstanciaComponente("dis_domicilio");
Div dis_persona=(Div) sup.getInstanciaComponente("dis_persona");
Div dis_nombrePersona=(Div) sup.getInstanciaComponente("dis_nombrePersona");
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");
Textbox comp_TXT_DNIPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_DNIPersona");
Textbox comp_TXT_domicilioPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioPersona");
Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");
Div dis_condicionImpositiva=(Div) sup.getInstanciaComponente("dis_condicionImpositiva");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Div dis_razonSocialPersonaNO=(Div) sup.getInstanciaComponente("dis_razonSocialPersonaNO");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");

if(comp_CHK_tieneCuentaSi.isChecked()){
    dis_nombrePersonaNO.setVisible(false);
    dis_apellidoPersonaNO.setVisible(false);
    
    dis_dniPersona.setVisible(false);
	dis_cuitPersona.setVisible(false);
    dis_domicilioPersona.setVisible(false);
    dis_condicionImpositiva.setVisible(false);
    comp_CHK_tieneCuentaNo.setChecked(false);
    dis_cuenta.setVisible(true);
    dis_nombreCuenta.setVisible(true);
    dis_apellidoCuenta.setVisible(true);
    dis_domicilio.setVisible(true);
    dis_persona.setVisible(false);
    //dis_nombrePersona.setVisible(false);
    dis_razonSocialPersonaNO.setVisible(false);
    comp_TXT_nombrePersonaNO.setValue("-");
    comp_TXT_apellidoPersonaNO.setValue("-");
    comp_TXT_DNIPersona.setValue("-");
    comp_TXT_domicilioPersona.setValue("-");
}