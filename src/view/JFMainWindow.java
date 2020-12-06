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

/**
 * Ventana principal
 * @author Andres Felipe Amezquita Gordillo
 *
 */
public class JFMainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPMainPanel pMainPanel;
	
	public JFMainWindow(ActionListener controllerApp) {
		initComponents(controllerApp);
	}
	
	/**
	 * Inicializa los componentes, cargando el panel principal.
	 * @param controllerApp
	 */
	public void initComponents(ActionListener controllerApp) {
		pMainPanel = new JPMainPanel(controllerApp);
		this.setTitle(ConstantsUI.T_MAIN_WINDOW);
		this.setDefaultCloseOperation( EXIT_ON_CLOSE );
		this.setLayout( new BorderLayout() );
		this.setBackground(Color.white);
		this.setIconImage(new ImageIcon(getClass().getResource(ConstantsUI.PATH_ICON_APP)).getImage());
		getRootPane().setBorder(BorderFactory.createMatteBorder(20, 30, 4, 30, Color.white));
		this.setSize(1000,500);
		this.setPreferredSize(new Dimension(1000,500));
		add(pMainPanel);
	}
	
	public String getIndexToComboBox() {
		return pMainPanel.getIndexToComboBox();
	}
	public void setValueText(String text) {
		pMainPanel.setValueText(text);
	}
	public void setValueTextComplementToOne(String text) {
		pMainPanel.setValueTextComplementToOne(text);
	}
	public void setValueTextMagnitudeSign(String text) {
		pMainPanel.setValueTextMagnitudeSign(text);
	}
	public String getValueUser() {
		return pMainPanel.getValueUser();
	}
	public String getIndexToComboBoxFormat() {
		return pMainPanel.getIndexToComboBoxFormat();
	}
	public void setValueTextFormat(String text) {
		pMainPanel.setValueTextFormat(text);
	}
	public String getValueUserFormat() {
		return pMainPanel.getValueUserFormat();
	}

	public void showPanelToBinary() {
		pMainPanel.showPanelToBinary();
	}
	public void showPanelToNumber() {
		pMainPanel.showPanelToNumber();
	}

	public void showPanelToBinaryWithFormat() {
		pMainPanel.showPanelToBinaryWithFormat();		
	}

}
