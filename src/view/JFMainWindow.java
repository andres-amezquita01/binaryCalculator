package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import exceptions.OnlyNumbersException;

/**
 * Ventana principal
 * @author Andres Felipe Amezquita Gordillo
 *
 */
public class JFMainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPMainPanel jpMainPanel;
	
	/**
	 * Constructor que inicializa cada uno de los paneles que componen el JFMainWindow.
	 * @param controllerApp
	 */
	public JFMainWindow(ActionListener controllerApp) {
		initComponents(controllerApp);
	}
	
	/**
	 * Inicializa los componentes, cargando el panel principal.
	 * @param controllerApp
	 */
	public void initComponents(ActionListener controllerApp) {
		jpMainPanel = new JPMainPanel(controllerApp);
		this.setTitle(ConstantsUI.T_MAIN_WINDOW);
		this.setDefaultCloseOperation( EXIT_ON_CLOSE );
		this.setLayout( new BorderLayout() );
		this.setBackground(Color.white);
//		this.setIconImage(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ICON_APP)).getImage());
//		this.setIconImage(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ICON_APP).getPath()));
		getRootPane().setBorder(BorderFactory.createMatteBorder(20, 30, 4, 30, Color.white));
		this.setSize(1000,500);
		this.setExtendedState( MAXIMIZED_BOTH );
		add(jpMainPanel);
	}
	
	public String getIndexToComboBox() {
		return jpMainPanel.getIndexToComboBox();
	}
	
	
	public void setValueText(String text) {
		jpMainPanel.setValueText(text);
	}
	public void setValueTextComplementToOne(String text) {
		jpMainPanel.setValueTextComplementToOne(text);
	}
	public void setValueTextMagnitudeSign(String text) {
		jpMainPanel.setValueTextMagnitudeSign(text);
	}
	public void setValueTextExccess2n(String text) {
		jpMainPanel.setValueTextExccess2n(text);
	}
	public void setValueTextFromCharacterToBits(String text) {
		jpMainPanel.setValueTextFromCharacterToBits(text);
	}
	
	
	public String getValueUser() throws OnlyNumbersException {
		return jpMainPanel.getValueUser();
	}
	public String getValueCharUser() {
		return jpMainPanel.getValueCharUser();
	}
	public String getValueUserFromCharacterToBits() {
		return jpMainPanel.getValueUserFromCharacterToBits();
	}
	
	
	
	public String getIndexToComboBoxFormat() {
		return jpMainPanel.getIndexToComboBoxFormat();
	}
	public String getIndexToComboBoxFromCharacterToBits() {
		return jpMainPanel.getIndexToComboBoxFromCharacterToBits();
	}
	
	
	
	public void setValueTextFormat(String text) {
		jpMainPanel.setValueTextFormat(text);
	}
	public String getValueUserFormat() throws OnlyNumbersException {
		return jpMainPanel.getValueUserFormat();
	}

	
	public String getIndexToComboBoxToNumber() {
		return jpMainPanel.getIndexToComboBoxToNumber();
	}
	
	public  String getValueUserToNumber() throws OnlyNumbersException {
		return jpMainPanel.getValueUserToNumber();
	}
	
	public void setValueTextToNumber(String text) {
		jpMainPanel.setValueTextToNumber(text);
	}
	
	
	
	public void showPanelToBinary() {
		jpMainPanel.showPanelToBinary();
	}
	public void showPanelToNumber() {
		jpMainPanel.showPanelToNumber();
	}
	public void showPanelToBinaryWithFormat() {
		jpMainPanel.showPanelToBinaryWithFormat();		
	}
	public void showPanelFromCharacterToNumber() {
		jpMainPanel.showPanelFromCharacterToNumber();
	}


}
