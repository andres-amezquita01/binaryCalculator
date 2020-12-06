package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

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
import view.ConstantsUI;
import views.items.MyComboBox;
import views.items.RoundedJButton;



public class JPcontainerHeader extends JPanel{
	private static final long serialVersionUID = 1L;
		private MyComboBox mcbReportSelect;
		private JTextField textField; 
		private JTextField textFieldTwo; 
		private JTextField textFieldComplement1; 
		private JTextField textFieldmagnitudesign; 
		private JTextField textFieldExces; 

		private RoundedJButton jbutton;
		public JPcontainerHeader(ActionListener actionListener) {
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
			
			textFieldTwo = new JTextField();
			textFieldTwo.setSize(100, 20); 
			textFieldTwo.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS);
			textFieldTwo.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS));
			textFieldTwo.setEditable(false);
			
			
			textFieldComplement1 = new JTextField();
			textFieldComplement1.setSize(100, 20); 
			textFieldComplement1.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_COMPLEMENT_TO_ONE);
			textFieldComplement1.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_COMPLEMENT_TO_ONE));
			textFieldComplement1.setEditable(false);
			
			textFieldmagnitudesign = new JTextField();
			textFieldmagnitudesign.setSize(100, 20); 
			textFieldmagnitudesign.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_MAGNITUDE_SIGN);
			textFieldmagnitudesign.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_MAGNITUDE_SIGN));
			textFieldmagnitudesign.setEditable(false);
			
			textFieldExces = new JTextField();
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
			mcbReportSelect.addItem("Char");
			mcbReportSelect.addItem("Byte");
			mcbReportSelect.addItem("Short");
			mcbReportSelect.addItem("Int");
			mcbReportSelect.addItem("Long");
			mcbReportSelect.addItem("Float");
			mcbReportSelect.addItem("Double");
			mcbReportSelect.addItem("String");

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
		public String getValueUser() {
			return textField.getText();
		}
}	
