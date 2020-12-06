package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ManagerConfiguration;
import view.JFMainWindow;
/**
 * Controlador que administra la interaccion con el usuario y envia datos al modelo.
 * @author Andres Felipe Amezquita Gordillo
 *
 */
public class Controller implements ActionListener{
	private JFMainWindow window;
	private ManagerConfiguration managerConfiguration;
	
	public Controller() {
		managerConfiguration = new ManagerConfiguration();
		window = new JFMainWindow(this);
		window.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		switch (Commands.valueOf(event.getActionCommand())) {
		
		case C_SEND_TO_BINARY:
			this.chooseTypeData();
			break;
		case C_SEND_TO_BINARY_WHIT_FORMAT:
			this.chooseTypeDataWithFormat();
			break;
		case C_PANEL_TO_BINARY:
			window.showPanelToBinary();
			break;
		case C_PANEL_TO_NUMBER:
			window.showPanelToNumber();
			break;
		case C_PANEL_TO_BINARY_WHIT_FORMAT:
			window.showPanelToBinaryWithFormat();
			break;
		default:
			break;
		}
	}
	private void chooseTypeDataWithFormat() {
		String typeData = null;
		 typeData = getCBValueWhitFormat();
		switch (typeData) {
		
		case "Float":
			window.setValueTextFormat(  managerConfiguration.fromFloatWithFormat(Float.parseFloat(window.getValueUserFormat()))  );
			break;
		case "Double":
			window.setValueTextFormat(managerConfiguration.fromDoubleWithFormat(Double.parseDouble(window.getValueUserFormat())));
			break;
		default:
			break;
		}
	}
	private void chooseTypeData() {
		String typeData = null;
		 typeData = getCBValue();
		switch (typeData) {
		case "Char":
			window.setValueText(managerConfiguration.fromChar((window.getValueUser()).charAt(0)));
			break;
		case "Byte":
			window.setValueText(""+managerConfiguration.fromByte(Byte.parseByte(window.getValueUser())));
			break;
		case "Short":
			window.setValueText(managerConfiguration.fromShort(Short.parseShort(window.getValueUser())));
			break;
		case "Int":
			window.setValueText(""+managerConfiguration.fromInt(Integer.parseInt(window.getValueUser())));
			break;
		case "Long":
			window.setValueText(managerConfiguration.fromLong(Long.parseLong(window.getValueUser())));
			break;
		case "Float":
			window.setValueText(managerConfiguration.fromFloat(Float.parseFloat(window.getValueUser())));
			break;
		case "Double":
			window.setValueText(managerConfiguration.fromDouble(Double.parseDouble(window.getValueUser())));
			break;
		case "String":
			window.setValueText(""+managerConfiguration.fromStringToBinary(window.getValueUser()));
			break;
		default:
			break;
		}
	}
	/**
	 * Obtiene el valor seleccionado en el JcomboBox
	 * @return Valor seleccionado en el jComboBox.
	 */
	public String getCBValue() {
		return window.getIndexToComboBox();
	}
	
	/**
	 * Obtiene el valor seleccionado del JcomboBox para elegir el formato.
	 * @return
	 */
	private String getCBValueWhitFormat() {
		return window.getIndexToComboBoxFormat();
	}
}
