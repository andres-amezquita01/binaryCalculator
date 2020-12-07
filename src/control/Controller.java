package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import exceptions.OnlyNumbersException;
import model.ManagerConfiguration;
import view.ConstantsUI;
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
	/**
	 * Gestiona los eventos que realiza el usuario.
	 */
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
		case C_SEND_TO_NUMBER:
			this.chooseTypeDataToNumber();
			break;
		default:
			break;
		}
	}
	/**
	 * Escoge el tipo de dato del cual el usuario quiere saber su representacion con formatio IEEE754.
	 */
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
	/**
	 * Escoge el tipo de dato del cual el usuario quiere saber su representacion en binario.
	 */
	private void chooseTypeData() {
		String typeData = null;
		 typeData = getCBValue();
		switch (typeData) {
		case "Char":
			if (window.getValueCharUser().length() > 1 || window.getValueCharUser().length() == 0) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_CHAR);
			}else {
				window.setValueText(ConstantsUI.VALUE_BITS + managerConfiguration.fromStringToBinary(Character.toString(window.getValueCharUser().charAt(0))) +
						ConstantsUI.ASCII+ managerConfiguration.fromChar( (window.getValueCharUser()).charAt(0)) +
						ConstantsUI.UNICODE + Integer.toHexString(window.getValueCharUser().charAt(0)));
				window.setValueTextComplementToOne(ConstantsUI.MESSAGE_UNAVAILABLE);
				window.setValueTextMagnitudeSign(ConstantsUI.MESSAGE_UNAVAILABLE);
				window.setValueTextExccess2n(ConstantsUI.MESSAGE_UNAVAILABLE);
			}
			break;
		case "Byte":
			try {
				window.setValueText(managerConfiguration.fromByte(Byte.parseByte(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromByteComplementOne(Byte.parseByte(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromByteMagnitudeSign(Byte.parseByte(window.getValueUser()) ));
				window.setValueTextExccess2n(managerConfiguration.fromByteToExccess2n(Byte.parseByte(window.getValueUser()) ));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		case "Short":
			try {
				window.setValueText(managerConfiguration.fromShort(Short.parseShort(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromShortComplementOne(Short.parseShort(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromShortMagnitudeSign(Short.parseShort(window.getValueUser()) ));
				window.setValueTextExccess2n(managerConfiguration.fromShortToExcces2n(Short.parseShort(window.getValueUser())));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			
			break;
		case "Int":
			try {
				window.setValueText(managerConfiguration.fromInt(Integer.parseInt(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromIntComplementOne(Integer.parseInt(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromIntMagnitudeSign(Integer.parseInt(window.getValueUser()) ));
				window.setValueTextExccess2n(managerConfiguration.fromIntToExccess2n(Integer.parseInt(window.getValueUser()) ));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		case "Long":
			
			try {
				window.setValueText(managerConfiguration.fromLong(Long.parseLong(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromLongComplementOne(Long.parseLong(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromLongMagnitudeSign(Long.parseLong(window.getValueUser()) ));
				window.setValueTextExccess2n(managerConfiguration.fromLongToExccess2n(Long.parseLong(window.getValueUser()) ));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		case "Float":
			
			try {
				window.setValueText(managerConfiguration.fromFloat(Float.parseFloat(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromFloatComplementOne(Float.parseFloat(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromFloatMagnitudeSign(Float.parseFloat(window.getValueUser()) ));
				window.setValueTextExccess2n(ConstantsUI.MESSAGE_UNAVAILABLE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		case "Double":
			
			try {
				window.setValueText(managerConfiguration.fromDouble(Double.parseDouble(window.getValueUser())));
				window.setValueTextComplementToOne(managerConfiguration.fromDoubleComplementOne(Double.parseDouble(window.getValueUser()) ));
				window.setValueTextMagnitudeSign(managerConfiguration.fromDoubleMagnitudeSign(Double.parseDouble(window.getValueUser()) ));
				window.setValueTextExccess2n(ConstantsUI.MESSAGE_UNAVAILABLE);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		case "String":
			
			try {
				window.setValueText(""+managerConfiguration.fromStringToBinary(window.getValueUser()));

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
			} catch (OnlyNumbersException e) {
				JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
			}
			break;
		default:
			break;
		}
	}
	
	/**
	 * Escoge el tipo de dato del cual viene la cadena de bits para convertirla a numero.
	 */
	private void chooseTypeDataToNumber() {
		String typeData = null;
		 typeData = getCBValueToNumber();
		switch (typeData) {
			case "Integer":
				try {
					window.setValueTextToNumber(managerConfiguration.fromBinaryToNumberInt(window.getValueUserToNumber()));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
				} catch (OnlyNumbersException e) {
					JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
				}
				break;
			case "Double":
				try {
					window.setValueTextToNumber(managerConfiguration.fromBinaryToNumberDouble((window.getValueUserToNumber())));
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_NUMBER);
				} catch (OnlyNumbersException e) {
					JOptionPane.showMessageDialog(null, ConstantsUI.MESSAGE_ERROR_FORMAT_NUMBER);
				}
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
	 * Obtiene el valor seleccionado en el JcomboBox del panel ToNumber
	 * @return Valor seleccionado en el jComboBox.
	 */
	public String getCBValueToNumber() {
		return window.getIndexToComboBoxToNumber();
	}
	
	/**
	 * Obtiene el valor seleccionado del JcomboBox para elegir el formato.
	 * @return
	 */
	private String getCBValueWhitFormat() {
		return window.getIndexToComboBoxFormat();
	}
}
