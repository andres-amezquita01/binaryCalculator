package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import exceptions.OnlyNumbersException;
import view.body.JPContainerToNumber;
import view.body.JPContainerWithFormat;
import view.body.JPcontainerHeader;
import view.body.JPContainerMenu;

public class JPMainPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPcontainerHeader jPcontainerHeader;
	private JPContainerToNumber jPContainerToNumber;
	private JPContainerWithFormat jpContainerWithFormat;
	private JPanel jpContainerBody;
	private JPContainerMenu jpContainerMenu;
	private final static String TO_BINARY = "Binario";
	private final static String TO_NUMBER = "Numero";
	private final static String TO_BINARY_WITH_FORMAT_IEE754 = "Binario con formato";

	public JPMainPanel(ActionListener actionListener) {
		initComponents(actionListener);
	}
	
	public void initComponents(ActionListener actionListener) {
		setBorder(BorderFactory.createTitledBorder(ConstantsUI.AUTOR_NAME));

		jPcontainerHeader = new JPcontainerHeader(actionListener);
		jPContainerToNumber = new JPContainerToNumber(actionListener);
		jpContainerWithFormat =  new JPContainerWithFormat(actionListener);
		
		jpContainerBody = new JPanel();
		jpContainerBody.setBackground(Color.WHITE);
		jpContainerBody.setLayout(new CardLayout(0, 0));
		
		jpContainerBody.add(jPcontainerHeader, TO_BINARY);
		jpContainerBody.add(jPContainerToNumber, TO_NUMBER);
		jpContainerBody.add(jpContainerWithFormat, TO_BINARY_WITH_FORMAT_IEE754);
		jpContainerMenu = new JPContainerMenu(actionListener);
		
		setBackground(Color.white);
		setLayout(new GridLayout(1,2));
		add(jpContainerMenu);
		add(jpContainerBody);
		showPanelToBinary();
	}
	public String getIndexToComboBox() {
		return jPcontainerHeader.getIndexToComboBox();
	}
	
	public String getIndexToComboBoxToNumber() {
		return jPContainerToNumber.getIndexToComboBoxToNumber();
	}
	
	public  String getValueUserToNumber() throws OnlyNumbersException {
		return jPContainerToNumber.getValueUserToNumber();
	}
	
	public void setValueTextToNumber(String text) {
		jPContainerToNumber.setValueTextToNumber(text);
	}

	public String getIndexToComboBoxFormat() {
		return jpContainerWithFormat.getIndexToComboBox();
	}
	
	public void setValueTextFormat(String text) {
		jpContainerWithFormat.setValueText(text);
	}

	public  String getValueUserFormat() {
		return jpContainerWithFormat.getValueUser();
	}
	
	
	public void setValueText(String text) {
		jPcontainerHeader.setValueText(text);
	}
	public void setValueTextComplementToOne(String text) {
		jPcontainerHeader.setValueTextComplementToOne(text);
	}
	public void setValueTextMagnitudeSign(String text) {
		jPcontainerHeader.setValueTextMagnitudeSign(text);
	}
	public void setValueTextExccess2n(String text) {
		jPcontainerHeader.setValueTextExccess2n(text);
	}
	
	
	public  String getValueUser() throws OnlyNumbersException {
		return jPcontainerHeader.getValueUser();
	}
	public String getValueCharUser() {
		return jPcontainerHeader.getValueCharUser();
	}
	
	
	public void showPanelToBinary() {
		CardLayout cl = (CardLayout)(jpContainerBody.getLayout());
	    cl.show(jpContainerBody, TO_BINARY);
	}
	
	public void showPanelToNumber() {
		CardLayout cl = (CardLayout)(jpContainerBody.getLayout());
	    cl.show(jpContainerBody, TO_NUMBER);
	}

	public void showPanelToBinaryWithFormat() {
		CardLayout cl = (CardLayout)(jpContainerBody.getLayout());
	    cl.show(jpContainerBody, TO_BINARY_WITH_FORMAT_IEE754);
	}
}
