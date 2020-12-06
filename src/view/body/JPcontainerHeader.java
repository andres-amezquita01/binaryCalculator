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
		private RoundedJButton jbutton;
		public JPcontainerHeader(ActionListener actionListener) {
			setLayout(new GridLayout(4,1));
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
			add(textFieldTwo);
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

		public String getValueUser() {
			return textField.getText();
		}
}	
