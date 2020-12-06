package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolTip;

import com.placeholder.PlaceHolder;

import control.Commands;
import exceptions.OnlyNumbersException;
import view.ConstantsUI;
import views.items.MyComboBox;
import views.items.RoundedJButton;

public class JPContainerToNumber extends JPanel {
	private static final long serialVersionUID = 1L;
	private MyComboBox mcbReportSelect;
	private JTextField textField; 
	private JTextField textFieldTwo; 
	private RoundedJButton jbutton;
	public JPContainerToNumber(ActionListener actionListener) {
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
		textField.setToolTipText(ConstantsUI.T_TEXT_BITS_CONFIGURATION);
		textField.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_BITS_CONFIGURATION));
		PlaceHolder placeHolder = new PlaceHolder(textField, ConstantsUI.T_TEXT_PLACE_HOLDER);
		placeHolder.setColorHolder(Color.lightGray);	
		textField.setBackground(Color.white);
		
		textFieldTwo = new JTextField();
		textFieldTwo.setSize(100, 20); 
		textFieldTwo.setToolTipText(ConstantsUI.T_TEXT_NUMBER_REPRESENTING_THE_CONFIGURATION);
		textFieldTwo.setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_TEXT_NUMBER_REPRESENTING_THE_CONFIGURATION));
		textFieldTwo.setEditable(false);
		
		jbutton = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_SEND, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_SEND_TO_NUMBER.toString(), actionListener ){
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
    	add(textField);
		add(textFieldTwo);
		add(jbutton);
	}
	private void addItemsToComboBox() {
		mcbReportSelect.addItem("Integer");
		mcbReportSelect.addItem("Double");
	}
	public String getIndexToComboBoxToNumber() {
		return mcbReportSelect.getSelectedItem().toString();
	}
	public void setValueTextToNumber(String text) {
		textFieldTwo.setText("");
		textFieldTwo.setText(text);
	}

	public String getValueUserToNumber() throws OnlyNumbersException {
		try {
			validateNumberCode(textField.getText());
			return textField.getText();
		} catch (OnlyNumbersException e) {
			throw new OnlyNumbersException();
		}
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
