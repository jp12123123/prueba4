import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Div dis_nombreTramitente2=(Div) sup.getInstanciaComponente("dis_nombreTramitente2");
Div dis_nombreTramitente3=(Div) sup.getInstanciaComponente("dis_nombreTramitente3");

Textbox comp_TXT_nombreTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente2");
Textbox comp_TXT_dniTramitente2=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente2");
Textbox comp_TXT_nombreTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreTramitente3");
Textbox comp_TXT_dniTramitente3=(Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente3");

// Ocultar tramitentes
if(dis_nombreTramitente3.isVisible()){
    dis_nombreTramitente3.setVisible(false);
    
    comp_TXT_nombreTramitente3.setValue("-");
    comp_TXT_dniTramitente3.setValue("-");
}
else{
    dis_nombreTramitente2.setVisible(false);
    
    comp_TXT_nombreTramitente2.setValue("-");
    comp_TXT_dniTramitente2.setValue("-");
}