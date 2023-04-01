import org.zkoss.zul.*;
import modelos.builder.componentes.*;

ModeloComponente sup = new ModeloComponente();


Combobox comp_CMB_zonaEscribano=(Combobox) sup.getInstanciaComponente("comp_CMB_zonaEscribano");
Listbox comp_GRID_grillaZonaEscribano=(Listbox) sup.getInstanciaComponente("comp_GRID_grillaZonaEscribano");
Textbox comp_TXT_IdZona=(Textbox) sup.getInstanciaComponente("comp_TXT_IdZona");
controladores.builder.componentes.Ubicacion comp_UBI_prueba=(controladores.builder.componentes.Ubicacion) new modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_UBI_prueba");

String compZona1 =comp_CMB_zonaEscribano.getValue();
String compZona ="";
String valorZona ="";



for (java.util.Iterator it = comp_GRID_grillaZonaEscribano.getItems().iterator(); it.hasNext();){//se le cambia el nombre a la grilla que se quiera recorrer
            org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();
            compZona = li.getChildren().get(1).getLabel().trim(); // obtengo el valor del campo de la columna 2 

            if(compZona1.equals(compZona)){
               valorZona = li.getChildren().get(0).getLabel().trim();
            }
    }



comp_TXT_IdZona.setValue(valorZona);

String valorZonaComnbo = comp_TXT_IdZona.getValue();

if (valorZonaComnbo.equals("3")) {							//GRAN MENDOZA
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(2);
}else if (valorZonaComnbo.equals("345")) {					//UGARTECHE
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(13);
}else if (valorZonaComnbo.equals("17")) {						//GRAL ALVEAR
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(1);
}else if (valorZonaComnbo.equals("10")) {						//LA PAZ
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(3);
}else if (valorZonaComnbo.equals("5")) {						//LAS HERAS
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(4);
}else if (valorZonaComnbo.equals("11")) {						//LAVALLE
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(5);
}else if (valorZonaComnbo.equals("13")) {						//TUNUYAN
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(12);
}else if (valorZonaComnbo.equals("16")) {						//MALARGUE
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(6);
}else if (valorZonaComnbo.equals("9")) {						//RIVADAVIA
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(7);
}else if (valorZonaComnbo.equals("14")) {						//SAN CARLOS
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(8);
}else if (valorZonaComnbo.equals("8")) {						//SAN MARTIN
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(9);
}else if (valorZonaComnbo.equals("15")) {						//SAN RAFAEL
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(10);
}else if (valorZonaComnbo.equals("12")) {						//SANTA ROSA
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(11);
}else if (valorZonaComnbo.equals("6")) {						//USPALLATA
comp_UBI_prueba.cmbUbicacion.setSelectedIndex(14);
}else {
	comp_UBI_prueba.cmbUbicacion.setSelectedIndex(15);  //Por defecto está seteado a todas
}

