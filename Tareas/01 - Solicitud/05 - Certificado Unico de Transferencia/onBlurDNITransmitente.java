import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();

Textbox comp_TXT_dniTramitente1 = (Textbox) sup.getInstanciaComponente("comp_TXT_dniTramitente1");
Radiogroup comp_RA_personaFisicaJuridicaTr=(Radiogroup) sup.getInstanciaComponente("comp_RA_personaFisicaJuridicaTr");

String value = comp_TXT_dniTramitente1.getValue().trim();

//Verifica que el campo no quede vacio
if (value.equals("") || value.equals(null)) {
    comp_TXT_dniTramitente1.setValue("-");
}

//Valida Tipo de Persona
if (comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==0) { //PERSONA FISICA - VALIDA DNI

    String patronOrden = "[0-9]{7,8}"; // compara numero de 0-9 y tiene una entrada de 1 o tres caracteres
    String orden = comp_TXT_dniTramitente1.getValue(); // obtiene el el valor de la variable. Cambiar comp_TXT_bdOrden por la variable
    Pattern patternOrden = Pattern.compile(patronOrden); //modificar nombre
    Matcher matcherOrden = patternOrden.matcher(orden); //modificar nombre

    //Revisa que se haya ingresado un DNI correcto
    if (!matcherOrden.matches()) {
        Messagebox.show("Por favor, ingrese correctamente el DNI del primer Transmitente/Hipotecario", "Advertencia", null, null, null);
        comp_TXT_dniTramitente1.setValue("-");
    }

} else if(comp_RA_personaFisicaJuridicaTr.getSelectedIndex()==1){ //PERSONA JURIDICA - VALIDA CUIT
    
    String dato = comp_TXT_dniTramitente1.getValue();
    dato = dato.replaceAll("-", "");
    String patroncuil = "[0-9]{11}";
    String cuil = dato;
    Pattern patternCUIL = Pattern.compile(patroncuil);
    Matcher matcherCUIL = patternCUIL.matcher(cuil);
    boolean cuilerror = false;
    String cuit = "";


        if (comp_TXT_dniTramitente1.getValue().trim().equals("-")) {
            //No ha cargado nada
        } else if (!matcherCUIL.matches()) {
            Messagebox.show("Por favor, ingrese los once dígitos del CUIT", "Advertencia", null, null, null);
            comp_TXT_dniTramitente1.setValue("-");
        } else {
            cuit = dato;
            //la secuencia de valores de factor es 5, 4, 3, 2, 7, 6, 5, 4, 3, 2
            int factor;
            factor = 5;
            int[] c = new int[11];
            int resultado = 0;

            int ultimoint = Integer.parseInt(Character.toString(cuit.charAt(cuit.length() - 1)));

            for (int i = 0; i < 10; i++) {

                c[i] = Integer.parseInt(Character.toString(cuit.charAt(i)));
                resultado = resultado + c[i] * factor;
                factor = (factor == 2) ? 7 : factor - 1;
                System.out.println(resultado);
            }

            int control = 0;
            int ver = (resultado % 11);
            if (ver == 0) {
                control = ver;
            } else {
                control = 11 - ver;

            }
            if (control == ultimoint) {
                cuilerror = false;
            } else {
                cuilerror = true;
            }

            if (cuilerror) {
                Messagebox.show("Por favor, ingrese un CUIT valido", "Advertencia", null, null, null);
                comp_TXT_dniTramitente1.setValue("-");
            } else {

            }

        }
    
}