import org.zkoss.zul.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelos.builder.componentes.*;


ModeloComponente sup = new ModeloComponente();



Combobox comp_CMB_persona=(Combobox) sup.getInstanciaComponente("comp_CMB_persona");
Textbox comp_TXT_CUITPersona=(Textbox) sup.getInstanciaComponente("comp_TXT_CUITPersona");

String dato = comp_TXT_CUITPersona.getValue();

dato = dato.replaceAll("-", "");

String patroncuil = "[0-9]{11}";
String cuil = dato;
Pattern patternCUIL = Pattern.compile(patroncuil);
Matcher matcherCUIL = patternCUIL.matcher(cuil);

boolean cuilerror = false;
String cuit ="";



if(comp_CMB_persona.getValue().trim().equals("Jurídica")){
    if(comp_TXT_CUITPersona.getValue().trim().equals("-")){
        
    }else if(!matcherCUIL.matches()){
        Messagebox.show("Por favor, ingrese los once dígitos del CUIT","Advertencia",null,null,null);
    }else{
        
        
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

                int control =0;
                int ver = (resultado % 11);
                if(ver==0){
                    control = ver;
                }else{
                    control = 11 - ver;

                }
                if (control == ultimoint) {
                    cuilerror = false;
                } else {
                    cuilerror = true;
                }

        if(cuilerror){
            Messagebox.show("Por favor, ingrese un CUIT valido","Advertencia",null,null,null);
        }else{

        }
        
	}
}
