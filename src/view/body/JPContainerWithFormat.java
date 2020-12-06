package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolTip;

import com.placeholder.PlaceHolder;

import control.Commands;
import view.ConstantsUI;
import views.items.MyComboBox;
import views.items.RoundedJButton;

public class JPContainerWithFormat extends JPanel{
	private static final long serialVersionUID = 1L;

	private MyComboBox mcbSelectFormat;
	private JTextField textField; 
	private JTextField textFieldTwo; 
	private RoundedJButton jbutton;
	
	public JPContainerWithFormat(ActionListener actionListener) {
		initComponents( actionListener);
	}
	
	public void initComponents(ActionListener actionListener) {
		setBackground(Color.white);
		setLayout(new GridLayout(4,1));
		mcbSelectFormat = new MyComboBox("d",2){
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
        
        
        textField = new JTextField();
		textField.setSize(100, 20);
		textField.setToolTipText(ConstantsUI.T_TEXT_DATA);
		textField.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_DATA));
		PlaceHolder placeHolder = new PlaceHolder(textField, ConstantsUI.T_TEXT_PLACE_HOLDER);
		placeHolder.setColorHolder(Color.lightGray);
		textField.setBackground(Color.white);
		
		textFieldTwo = new JTextField();
		textFieldTwo.setSize(100, 20); 
		textFieldTwo.setToolTipText(ConstantsUI.T_TEXT_CONFIGURATION_BITS_WHIT_FORMAT);
		textFieldTwo.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CONFIGURATION_BITS_WHIT_FORMAT));
		textFieldTwo.setEditable(false);
		
		jbutton = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_SEND, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_SEND_TO_BINARY_WHIT_FORMAT.toString(), actionListener ){
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
        
        addItemsToComboBox();
        add(mcbSelectFormat);
        add(textField);
        add(textFieldTwo);
        add(jbutton);
	}
	
	private void addItemsToComboBox() {
		mcbSelectFormat.addItem("Float");
		mcbSelectFormat.addItem("Double");
	}
	
	public String getIndexToComboBox() {
		return mcbSelectFormat.getSelectedItem().toString();
	}
	public void setValueText(String text) {
		textFieldTwo.setText("");
		textFieldTwo.setText(text);
	}

	public String getValueUser() {
		return textField.getText();
	}
}
