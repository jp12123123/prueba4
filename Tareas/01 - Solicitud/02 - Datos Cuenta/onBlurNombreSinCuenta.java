import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zk.ui.util.Clients;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_nombrePersonaNO=(Textbox) sup.getInstanciaComponente("comp_TXT_nombrePersonaNO");

String nombre = comp_TXT_nombrePersonaNO.getValue().trim();
nombre = nombre.toUpperCase();
comp_TXT_nombrePersonaNO.setValue(nombre);