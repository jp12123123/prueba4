import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_apellidoPersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoPersonaNO");

String apellido = comp_TXT_apellidoPersonaNO.getValue().trim();
apellido = apellido.toUpperCase();
comp_TXT_apellidoPersonaNO.setValue(apellido);