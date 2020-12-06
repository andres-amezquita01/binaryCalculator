package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

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
	public  String getValueUser() {
		return jPcontainerHeader.getValueUser();
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
