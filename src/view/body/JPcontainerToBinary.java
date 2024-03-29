package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolTip;

import com.placeholder.PlaceHolder;

import control.Commands;
import exceptions.OnlyNumbersException;
import view.ConstantsUI;
import views.items.MyComboBox;
import views.items.RoundedJButton;



public class JPcontainerToBinary extends JPanel{
	private static final long serialVersionUID = 1L;
		private MyComboBox mcbReportSelect; 
		private JTextField textField; 
		private JTextArea textFieldTwo; 
		private JTextArea textFieldComplement1; 
		private JTextArea textFieldmagnitudesign; 
		private JTextArea textFieldExces; 

		private RoundedJButton jbutton;
		public JPcontainerToBinary(ActionListener actionListener) {
			setLayout(new GridLayout(7,1));
			setBackground(Color.white);
			initComponents(actionListener);

		}
		
		public void initComponents(ActionListener actionListener) {
				
			mcbReportSelect = new MyComboBox("d",2){
	            private static final long serialVersionUID = 1L;
	            @Override
	            public JToolTip createToolTip() {
	                JToolTip toolTip = super.createToolTip();
	                toolTip.setBackground(ConstantsUI.COLOR_DARCK_BLUE);
	                toolTip.setForeground(Color.WHITE);
	                toolTip.setFont(ConstantsUI.RUBIK_BOLD_16);
	                return toolTip;
	            }
	        };;
	        addItemsToComboBox();
			
			
			textField = new JTextField();
			textField.setSize(100, 20);
			textField.setToolTipText(ConstantsUI.T_TEXT_DATA);
			textField.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_DATA));
			PlaceHolder placeHolder = new PlaceHolder(textField, ConstantsUI.T_TEXT_PLACE_HOLDER);
			placeHolder.setColorHolder(Color.lightGray);
			textField.setBackground(Color.white);
			
			textFieldTwo = new JTextArea();
			textFieldTwo.setSize(100, 20); 
			textFieldTwo.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS);
			textFieldTwo.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS));
			textFieldTwo.setEditable(false);
			
			
			textFieldComplement1 = new JTextArea();
			textFieldComplement1.setSize(100, 20); 
			textFieldComplement1.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_COMPLEMENT_TO_ONE);
			textFieldComplement1.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_COMPLEMENT_TO_ONE));
			textFieldComplement1.setEditable(false);
			
			textFieldmagnitudesign = new JTextArea();
			textFieldmagnitudesign.setSize(100, 20); 
			textFieldmagnitudesign.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_MAGNITUDE_SIGN);
			textFieldmagnitudesign.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_MAGNITUDE_SIGN));
			textFieldmagnitudesign.setEditable(false);
			
			textFieldExces = new JTextArea();
			textFieldExces.setSize(100, 20); 
			textFieldExces.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_EXCESS);
			textFieldExces.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_EXCESS));
			textFieldExces.setEditable(false);
			
			jbutton = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_SEND, ConstantsUI.COLOR_DARCK_BLUE,
				    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_SEND_TO_BINARY.toString(), actionListener ){
			            private static final long serialVersionUID = 1L;
			            @Override
			            public JToolTip createToolTip() {
			                JToolTip toolTip = super.createToolTip();
			                toolTip.setBackground(ConstantsUI.COLOR_DARCK_BLUE);
			                toolTip.setForeground(Color.WHITE);
			                toolTip.setFont(ConstantsUI.RUBIK_BOLD_16);
			                return toolTip;
			            }
			        };
			
			add(textField);
			add(mcbReportSelect);
			add(textFieldComplement1);
			add(textFieldTwo);
			add(textFieldmagnitudesign);
			add(textFieldExces);
			add(jbutton);
		}
		private void addItemsToComboBox() {
			mcbReportSelect.addItem("Byte");
			mcbReportSelect.addItem("Short");
			mcbReportSelect.addItem("Int");
			mcbReportSelect.addItem("Long");
			mcbReportSelect.addItem("Float");
			mcbReportSelect.addItem("Double");

		}
		public String getIndexToComboBox() {
			return mcbReportSelect.getSelectedItem().toString();
		}
		public void setValueText(String text) {
				textFieldTwo.setText("");
				textFieldTwo.setText(text);
		}
		public void setValueTextComplementToOne(String text) {
			textFieldComplement1.setText("");
			textFieldComplement1.setText(text);
		}
		
		public void setValueTextMagnitudeSign(String text) {
			textFieldmagnitudesign.setText("");
			textFieldmagnitudesign.setText(text);
		}
		
		public void setValueTextExccess2n(String text) {
			textFieldExces.setText("");
			textFieldExces.setText(text);
		}
		public String getValueUser() throws OnlyNumbersException {
			try {
				validateNumberCode(textField.getText());
				return textField.getText();
			} catch (OnlyNumbersException e) {
				throw new OnlyNumbersException();
			}
		}
		public String getValueCharUser() {
			return textField.getText();
		}
		
		/**
		 * Valida que el numero que ingreso el usuario sea correcto.
		 * @param code
		 * @return
		 * @throws OnlyNumbersException
		 */
		public static boolean validateNumberCode(String code) throws OnlyNumbersException{
			boolean validate = false;
			Pattern pat = Pattern.compile("^-?[0-9]\\d*(.\\d+)?$");
		    Matcher mat = pat.matcher(code);                                                                           
		     if (mat.matches() == true) {
		         validate = true;
		         return validate;
		     } else {
		        throw new OnlyNumbersException();                                                                             
		     }
		}
}	
