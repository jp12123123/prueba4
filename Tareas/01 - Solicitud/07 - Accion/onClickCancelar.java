import org.zkoss.zul.*;
import modelos.builder.componentes.*;
ModeloComponente sup = new ModeloComponente();

org.zkoss.zul.Window w = (org.zkoss.zul.Window) org.zkoss.zk.ui.Executions.getCurrent().getDesktop().getAttribute("winProceso");
org.zkoss.zk.ui.event.Event closeEvent = new org.zkoss.zk.ui.event.Event("onClose", w, null);
org.zkoss.zk.ui.event.Events.postEvent(closeEvent);