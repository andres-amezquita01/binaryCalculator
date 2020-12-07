package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolTip;

import com.placeholder.PlaceHolder;

import control.Commands;
import view.ConstantsUI;
import views.items.MyComboBox;
import views.items.RoundedJButton;

public class JPContainerCharacterToBinary  extends JPanel {
	private static final long serialVersionUID = 1L;
	private MyComboBox mcbReportSelect;
	private JTextField textFieldUserData; 
	private JTextArea textAreaBitsOfString; 
	private RoundedJButton jbutton;

	public JPContainerCharacterToBinary(ActionListener actionListener) {
		initComponents(actionListener);
	}
	
	public void initComponents(ActionListener actionListener) {
		setLayout(new GridLayout(4,1));
		setBackground(Color.white);
		
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
        
        textFieldUserData = new JTextField();
		textFieldUserData.setSize(100, 20);
		textFieldUserData.setToolTipText(ConstantsUI.T_TEXT_CHARACTER_OR_STRING_BORDER);
		textFieldUserData.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_CHARACTER_OR_STRING_BORDER));
		PlaceHolder placeHolder = new PlaceHolder(textFieldUserData, ConstantsUI.T_TEXT_CHARACTER_OR_STRING_BORDER);
		placeHolder.setColorHolder(Color.lightGray);	
		textFieldUserData.setBackground(Color.white);
		
		textAreaBitsOfString = new JTextArea();
		textAreaBitsOfString.setToolTipText(ConstantsUI.T_TEXT_AREA_REPRESENTING_THE_TEXT_OR_CHARACTER);
		textAreaBitsOfString.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_AREA_REPRESENTING_THE_TEXT_OR_CHARACTER));
		PlaceHolder placeHolder2 = new PlaceHolder(textFieldUserData, ConstantsUI.T_TEXT_AREA_REPRESENTING_THE_TEXT_OR_CHARACTER);
		placeHolder.setColorHolder(Color.lightGray);
		textAreaBitsOfString.setEditable(false);
		textAreaBitsOfString.setBackground(Color.white);
		
		jbutton = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_SEND, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_SEND_TO_CHARACTER.toString(), actionListener ){
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
		        
		 add(mcbReportSelect);
		 add(textFieldUserData);
		 add(textAreaBitsOfString);
		 add(jbutton);
	}
	
	public void addItemsToComboBox() {
		mcbReportSelect.addItem("Char");
		mcbReportSelect.addItem("String");
	}
	
	public String getIndexToComboBoxFromCharacterToBits() {
		return mcbReportSelect.getSelectedItem().toString();
	}
	
	public void setValueTextFromCharacterToBits(String text) {
		textAreaBitsOfString.setText("");
		textAreaBitsOfString.setText(text);
	}
	
	public String getValueUserFromCharacterToBits() {
		return textFieldUserData.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
