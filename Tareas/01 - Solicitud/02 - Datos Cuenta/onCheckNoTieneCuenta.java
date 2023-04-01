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
Div dis_nombrePersonaNO=(Div) sup.getInstanciaComponente("dis_nombrePersonaNO");
Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");
Div dis_domicilioPersona=(Div) sup.getInstanciaComponente("dis_domicilioPersona");
Div dis_condicionImpositiva=(Div) sup.getInstanciaComponente("dis_condicionImpositiva");
Div dis_apellidoPersonaNO=(Div) sup.getInstanciaComponente("dis_apellidoPersonaNO");
Textbox comp_TXT_domicilioPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioPersona");
Div dis_dniPersona=(Div) sup.getInstanciaComponente("dis_dniPersona");
Div dis_cuitPersona=(Div) sup.getInstanciaComponente("dis_cuitPersona");

if(comp_CHK_tieneCuentaNo.isChecked()){
    comp_CHK_tieneCuentaSi.setChecked(false);
    dis_cuenta.setVisible(false);
    dis_nombreCuenta.setVisible(false);
    dis_apellidoCuenta.setVisible(false);
    dis_domicilio.setVisible(false);
    dis_persona.setVisible(true);
    dis_nombrePersonaNO.setVisible(true);
    dis_domicilioPersona.setVisible(true);
    dis_condicionImpositiva.setVisible(true);
    dis_apellidoPersonaNO.setVisible(true);
    dis_dniPersona.setVisible(true);
	dis_cuitPersona.setVisible(true);
    comp_TXT_cuenta.setValue("-");
    comp_TXT_nombreCuenta.setValue("-");
    comp_TXT_apellidoCuenta.setValue("-");
    comp_TXT_domicilioCuenta.setValue("-");    
}