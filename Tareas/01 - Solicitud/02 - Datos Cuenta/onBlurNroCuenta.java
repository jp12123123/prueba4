import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_direccion=(Textbox) sup.getInstanciaComponente("comp_TXT_direccion");

Textbox comp_TXT_cuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_cuenta");
Textbox comp_TXT_nombreCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_nombreCuenta");
Textbox comp_TXT_apellidoCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_apellidoCuenta");
Textbox comp_TXT_domicilioCuenta=(Textbox) sup.getInstanciaComponente("comp_TXT_domicilioCuenta");


String numeroCliente = "[0-9]{14}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
String cliente = comp_TXT_cuenta.getValue(); // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
Pattern patternCliente = Pattern.compile(numeroCliente);//modificar nombre
Matcher matcherCliente = patternCliente.matcher(cliente);//modificar nombre

if(!matcherCliente.matches())
{
    Messagebox.show("Por favor, ingrese los 14 digitos del numero de cuenta","Advertencia",null,org.zkoss.zul.Messagebox.EXCLAMATION,null);
    comp_TXT_cuenta.setValue("-");
    comp_TXT_apellidoCuenta.setValue("-");
    comp_TXT_nombreCuenta.setValue("-");
    comp_TXT_domicilioCuenta.setValue("-");
}
else
{
   try{
        java.util.List parametrosdatosUsuarios = new java.util.ArrayList();
        parametrosdatosUsuarios.add(comp_TXT_cuenta.getValue()); //usuario / String
        new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("datosUsuarios",parametrosdatosUsuarios);
        Map return14mapa=(Map) ((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return14mapa");

        if(return14mapa.get("items").size()==0)
        {
            Messagebox.show("La cuenta ingresada, es incorrecta o no corresponde a un cliente activo","Advertencia",null,org.zkoss.zul.Messagebox.EXCLAMATION,null);
            comp_TXT_cuenta.setValue("-");
            comp_TXT_apellidoCuenta.setValue("-");
            comp_TXT_nombreCuenta.setValue("-");
            comp_TXT_domicilioCuenta.setValue("-");
        }
        else
        {
            String nombre = return14mapa.get("items").get(0).get("titular");
        	String[] parts = nombre.split(";");
            comp_TXT_apellidoCuenta.setValue(parts[0]);
            comp_TXT_nombreCuenta.setValue(parts[1]);
            comp_TXT_domicilioCuenta.setValue(return14mapa.get("items").get(0).get("domicilio"));
        }
      }
    catch (Exception e) 
    {
    	Messagebox.show("El Servicio de cuenta no disponible en este momento. Por favor intente mas tarde.","Advertencia",null,org.zkoss.zul.Messagebox.EXCLAMATION,null);
        comp_TXT_cuenta.setValue("-");
        comp_TXT_apellidoCuenta.setValue("-");
        comp_TXT_nombreCuenta.setValue("-");
        comp_TXT_domicilioCuenta.setValue("-");
    }  
}

