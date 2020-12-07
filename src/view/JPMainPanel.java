package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import exceptions.OnlyNumbersException;
import view.body.JPContainerToNumber;
import view.body.JPContainerToBinaryWithFormat;
import view.body.JPcontainerToBinary;
import view.body.JPContainerCharacterToBinary;
import view.body.JPContainerMenu;

public class JPMainPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JPcontainerToBinary jPcontainerContainerToBinary;
	private JPContainerToNumber jPContainerToNumber;
	private JPContainerToBinaryWithFormat jpContainerWithFormat;
	private JPContainerCharacterToBinary jpContainerCharacterToBinary;
	private JPanel jpContainerBody;
	private JPContainerMenu jpContainerMenu;
	private final static String TO_BINARY = "Binario";
	private final static String TO_NUMBER = "Numero";
	private final static String TO_BINARY_WITH_FORMAT_IEE754 = "Binario con formato";
	private final static String FROM_CHARACTER_TO_BINARY = "De caracter a binario";

	public JPMainPanel(ActionListener actionListener) {
		initComponents(actionListener);
	}
	
	public void initComponents(ActionListener actionListener) {
		setBorder(BorderFactory.createTitledBorder(ConstantsUI.AUTOR_NAME));

		jPcontainerContainerToBinary = new JPcontainerToBinary(actionListener);
		jPContainerToNumber = new JPContainerToNumber(actionListener);
		jpContainerWithFormat =  new JPContainerToBinaryWithFormat(actionListener);
		jpContainerCharacterToBinary =  new JPContainerCharacterToBinary(actionListener);
		
		jpContainerBody = new JPanel();
		jpContainerBody.setBackground(Color.WHITE);
		jpContainerBody.setLayout(new CardLayout(0, 0));
		
		jpContainerBody.add(jPcontainerContainerToBinary, TO_BINARY);
		jpContainerBody.add(jPContainerToNumber, TO_NUMBER);
		jpContainerBody.add(jpContainerWithFormat, TO_BINARY_WITH_FORMAT_IEE754);
		jpContainerBody.add(jpContainerCharacterToBinary,FROM_CHARACTER_TO_BINARY);
		
		jpContainerMenu = new JPContainerMenu(actionListener);
		
		setBackground(Color.white);
		setLayout(new GridLayout(1,2));
		add(jpContainerMenu);
		add(jpContainerBody);
		showPanelToBinary();
	}
	public String getIndexToComboBox() {
		return jPcontainerContainerToBinary.getIndexToComboBox();
	}
	
	public String getIndexToComboBoxToNumber() {
		return jPContainerToNumber.getIndexToComboBoxToNumber();
	}
	
	public  String getValueUserToNumber() throws OnlyNumbersException {
		return jPContainerToNumber.getValueUserToNumber();
	}
	public  String getValueUserFormat() throws OnlyNumbersException {
		return jpContainerWithFormat.getValueUser();
	}
	public String getValueUserFromCharacterToBits() {
		return jpContainerCharacterToBinary.getValueUserFromCharacterToBits();
	}
	public  String getValueUser() throws OnlyNumbersException {
		return jPcontainerContainerToBinary.getValueUser();
	}
	public String getValueCharUser() {
		return jPcontainerContainerToBinary.getValueCharUser();
	}
	
	

	public String getIndexToComboBoxFormat() {
		return jpContainerWithFormat.getIndexToComboBox();
	}
	public String getIndexToComboBoxFromCharacterToBits() {
		return jpContainerCharacterToBinary.getIndexToComboBoxFromCharacterToBits();
	}
	
	
	
	public void setValueTextFormat(String text) {
		jpContainerWithFormat.setValueText(text);
	}
	public void setValueText(String text) {
		jPcontainerContainerToBinary.setValueText(text);
	}
	public void setValueTextComplementToOne(String text) {
		jPcontainerContainerToBinary.setValueTextComplementToOne(text);
	}
	public void setValueTextMagnitudeSign(String text) {
		jPcontainerContainerToBinary.setValueTextMagnitudeSign(text);
	}
	public void setValueTextExccess2n(String text) {
		jPcontainerContainerToBinary.setValueTextExccess2n(text);
	}
	public void setValueTextFromCharacterToBits(String text) {
		 jpContainerCharacterToBinary.setValueTextFromCharacterToBits(text);
	}
	public void setValueTextToNumber(String text) {
		jPContainerToNumber.setValueTextToNumber(text);
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
	
	public void showPanelFromCharacterToNumber() {
		CardLayout cl = (CardLayout)(jpContainerBody.getLayout());
	    cl.show(jpContainerBody, FROM_CHARACTER_TO_BINARY);
	}
}







