import org.zkoss.zul.*;
import modelos.builder.componentes.*;
import java.io.*;

ModeloComponente sup = new ModeloComponente();

Combobox comp_CMB_distritoFisico = (Combobox) sup.getInstanciaComponente("comp_CMB_distritoFisico");
Combobox comp_CMB_departamentoFisico = (Combobox) sup.getInstanciaComponente("comp_CMB_departamentoFisico");
Listbox comp_GRID_GrillasAuxDepartamentoDomicilio = (Listbox) sup.getInstanciaComponente("comp_GRID_GrillasAuxDepartamentoDomicilio");

Combobox comp_CMB_calleFisico = (Combobox) sup.getInstanciaComponente("comp_CMB_calleFisico");

Button comp_SAVE_accion = (Button) sup.getInstanciaComponente("comp_SAVE_accion");
Listbox comp_GRID_CalleUbicacion = (Listbox) sup.getInstanciaComponente("comp_GRID_CalleUbicacion");
Listbox comp_GRID_grillDistritoUbicacion = (Listbox) sup.getInstanciaComponente("comp_GRID_grillDistritoUbicacion");

Textbox comp_TXT_idComboFisicoDepartamento = (Textbox) sup.getInstanciaComponente("comp_TXT_idComboFisicoDepartamento");
Combobox comp_CMB_CutPHCalle = (Combobox) sup.getInstanciaComponente("comp_CMB_CutPHCalle");

//Bandbox instanciacion
org.zkoss.zul.Bandbox comp_BANDBOX_calleFisico = (org.zkoss.zul.Bandbox) new modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_calleFisico");

org.zkoss.zul.Listbox listboxBusqueda = (org.zkoss.zul.Listbox) comp_BANDBOX_calleFisico.getAttribute("listbox");
listboxBusqueda.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
  public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
    org.zkoss.zul.Listitem item = listboxBusqueda.getSelectedItem();
    String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
    comp_BANDBOX_calleFisico.setValue(valor);
    comp_BANDBOX_calleFisico.close();
  }

});
org.zkoss.zul.Textbox textBusqueda = (org.zkoss.zul.Textbox) comp_BANDBOX_calleFisico.getAttribute("textbox");
// org.zkoss.zul.Button buttonBusqueda = (org.zkoss.zul.Button) comp_BANDBOX_calleFisico.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_calleFisico.getAttribute("button");

buttonBusqueda.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
  public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
    listboxBusqueda.getItems().clear();

    int x = comp_CMB_calleFisico.getItemCount();

    for (int i = 0; i < x; i++) {
      String test = comp_CMB_calleFisico.getItemAtIndex(i).getValue();

      if (test.matches("(?i).*" + textBusqueda.getValue() + "(.*)")) {

        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);

        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda);

      }
    }

  }
});

//Bandbox calle de CUTPH
org.zkoss.zul.Bandbox comp_BANDBOX_CutPHCalle = (org.zkoss.zul.Bandbox) new modelos.builder.componentes.ModeloComponente().getInstanciaComponente("comp_BANDBOX_CutPHCalle");

org.zkoss.zul.Listbox listboxBusqueda2 = (org.zkoss.zul.Listbox) comp_BANDBOX_CutPHCalle.getAttribute("listbox");
listboxBusqueda2.addEventListener("onSelect", new org.zkoss.zk.ui.event.EventListener() {
  public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
    org.zkoss.zul.Listitem item = listboxBusqueda2.getSelectedItem();
    String valor = ((org.zkoss.zul.Listcell) item.getChildren().get(0)).getLabel();
    comp_BANDBOX_CutPHCalle.setValue(valor);
    comp_BANDBOX_CutPHCalle.close();
  }
});
org.zkoss.zul.Textbox textBusqueda2 = (org.zkoss.zul.Textbox) comp_BANDBOX_CutPHCalle.getAttribute("textbox");
//org.zkoss.zul.Button buttonBusqueda2=(org.zkoss.zul.Button) comp_BANDBOX_CutPHCalle.getAttribute("button");
modelos.builder.componentes.Toolbarbutton buttonBusqueda2=(modelos.builder.componentes.Toolbarbutton) comp_BANDBOX_CutPHCalle.getAttribute("button");

buttonBusqueda2.addEventListener("onClick", new org.zkoss.zk.ui.event.EventListener() {
  public void onEvent(org.zkoss.zk.ui.event.Event event) throws Exception {
    listboxBusqueda2.getItems().clear();

    int x = comp_CMB_CutPHCalle.getItemCount();
    for (int i = 0; i < x; i++) {
      String test = comp_CMB_CutPHCalle.getItemAtIndex(i).getValue();

      if (test.matches("(?i).*" + textBusqueda2.getValue() + "(.*)")) {

        Listitem itemBandbox = new Listitem();
        org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(test);

        itemBandbox.appendChild(cell1);
        itemBandbox.setParent(listboxBusqueda2);

      }
    }

  }
});

String compara = comp_CMB_departamentoFisico.getValue().trim();
String idCompara = "";
String idWS = "";
String compare = "";

if (compara.equals("-") || compara.equals(null)) {

} else {

  comp_GRID_grillDistritoUbicacion.getItems().clear();
  comp_GRID_CalleUbicacion.getItems().clear();
  comp_CMB_distritoFisico.getItems().clear();
  comp_CMB_calleFisico.getItems().clear();
  comp_CMB_CutPHCalle.getItems().clear();

  Comboitem item9 = new Comboitem();
  item9.setLabel("-");
  item9.setValue("-");
  item9.setParent(comp_CMB_distritoFisico);
  comp_CMB_distritoFisico.setValue("-");

  comp_CMB_calleFisico.getItems().clear();

  listboxBusqueda.getItems().clear();
  listboxBusqueda2.getItems().clear();

  Comboitem item10 = new Comboitem();
  item10.setLabel("-");
  item10.setValue("-");
  item10.setParent(comp_CMB_calleFisico);
  comp_CMB_calleFisico.setValue("-");

  Comboitem item60 = new Comboitem();
  item60.setLabel("-");
  item60.setValue("-");
  item60.setParent(comp_CMB_CutPHCalle);
  comp_CMB_CutPHCalle.setValue("-");

  for (java.util.Iterator it = comp_GRID_GrillasAuxDepartamentoDomicilio.getItems().iterator(); it.hasNext();) //se le cambia el nombre a la grilla que se quiera recorrer
  {

    org.zkoss.zul.Listitem li = (org.zkoss.zul.Listitem) it.next();

    idCompara = li.getChildren().get(1).getLabel().trim(); // obtengo el valor del campo de la columna 9 

    if (compara.equals(idCompara)) {
      idWS = li.getChildren().get(0).getLabel().trim();
    }

  }

  comp_TXT_idComboFisicoDepartamento.setValue(idWS);

  try {

    java.util.List parametrosfnLocalidadesDomicilio = new java.util.ArrayList();
    parametrosfnLocalidadesDomicilio.add(idWS); //codigo / String
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnLocalidadesDomicilio", parametrosfnLocalidadesDomicilio);
    Map return22map = (Map)((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return22map");

    for (int i = 0; i < return22map.get("items").size(); i++) {
      String identificador = return22map.get("items").get(i).get("loc_codigo").toString();
      String ver = return22map.get("items").get(i).get("loc_descripcion");

      Comboitem item = new Comboitem();
      item.setLabel(ver);
      item.setValue(ver);
      item.setParent(comp_CMB_distritoFisico);

      Listitem item31 = new Listitem();

      org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificador);
      cell1.setParent(item31);

      org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
      cell2.setParent(item31);
      org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
      cell3.setParent(item31);

      comp_GRID_grillDistritoUbicacion.appendChild(item31);

    }

  } catch (Exception e) {
    Messagebox.show("El servicio de localidades domicilio no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.", "Advertencia", null, null, null);
    comp_SAVE_accion.setDisabled(true);
  }

  try {

    java.util.List parametrosfnCalleDomicilio = new java.util.ArrayList();
    parametrosfnCalleDomicilio.add(idWS); //codigo / String
    new modelos.builder.eventos.ModeloEventos().ejecutarFuncion("fnCalleDomicilio", parametrosfnCalleDomicilio);
    Map return25map = (Map)((org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winBuilder")).getAttribute("return25map");

    for (int i = 0; i < return25map.get("items").size(); i++) {
      String ver = return25map.get("items").get(i).get("cal_descripcion");
      String identificadore = return25map.get("items").get(i).get("cal_codigo").toString();
      Comboitem item = new Comboitem();
      item.setLabel(ver);
      item.setValue(ver);
      item.setParent(comp_CMB_calleFisico);

      Comboitem item99 = new Comboitem();
      item99.setLabel(ver);
      item99.setValue(ver);
      item99.setParent(comp_CMB_CutPHCalle);

      Listitem itemBandbox = new Listitem();
      org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(ver);

      itemBandbox.appendChild(cell1);
      itemBandbox.setParent(listboxBusqueda);

      Listitem itemBandbox2 = new Listitem();
      org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(ver);

      itemBandbox2.appendChild(cell1);
      itemBandbox2.setParent(listboxBusqueda2);

      Listitem item34 = new Listitem();

      org.zkoss.zul.Listcell cell1 = new org.zkoss.zul.Listcell(identificadore);
      cell1.setParent(item34);

      org.zkoss.zul.Listcell cell2 = new org.zkoss.zul.Listcell(ver);
      cell2.setParent(item34);

      org.zkoss.zul.Listcell cell3 = new org.zkoss.zul.Listcell("-");
      cell3.setParent(item34);

      comp_GRID_CalleUbicacion.appendChild(item34);

    }

  } catch (Exception e) {

    Messagebox.show("El servicio de Calles domicilio no está disponible en este momento. Por favor intente más tarde o comuníquese con el área técnica.", "Advertencia", null, null, null);
    comp_SAVE_accion.setDisabled(true);
  }

}