import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Div dis_nombreTramitente2=(Div) sup.getInstanciaComponente("dis_nombreTramitente2");
Div dis_nombreTramitente3=(Div) sup.getInstanciaComponente("dis_nombreTramitente3");

if(!dis_nombreTramitente2.isVisible()){
    dis_nombreTramitente2.setVisible(true);
}
else{
    dis_nombreTramitente3.setVisible(true);
}