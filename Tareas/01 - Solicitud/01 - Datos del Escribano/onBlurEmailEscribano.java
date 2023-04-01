import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zul.Messagebox;
import modelos.builder.componentes.*;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Checkbox;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_emailEscribano=(Textbox) sup.getInstanciaComponente("comp_TXT_emailEscribano");

// Chequeo de correcto ingreso de mail
Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

String mail = comp_TXT_emailEscribano.getValue().toString();

Matcher mather = pattern.matcher(mail);

if (!mather.find() == true) 
{
    Messagebox.show("Correo electronico incorrecto, por favor re-ingrese el email del Escribano");
    comp_TXT_emailEscribano.setValue("-");
}