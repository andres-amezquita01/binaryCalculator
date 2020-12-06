package view.body;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolTip;

import control.Commands;
import view.ConstantsUI;
import views.items.RoundedJButton;

public class JPContainerMenu extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton buttonBinary, buttonNumber, buttonBinaryWithFormat;
	
	public  JPContainerMenu(ActionListener actionListener) {
		initComponents(actionListener);
	}
	
	public void initComponents(ActionListener actionListener) {
		setLayout(new GridLayout(3,1,10,40));
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createMatteBorder(20, 30, 4, 30, Color.white));

		buttonBinary = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_TO_BINARY, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_PANEL_TO_BINARY.toString(), actionListener ){
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
		        
        buttonNumber = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_TO_NUMBER, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_PANEL_TO_NUMBER.toString(), actionListener ){
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
		
      buttonBinaryWithFormat = new RoundedJButton(15, 15, ConstantsUI.T_BUTTON_TO_BINARY_WITH_FORMAT, ConstantsUI.COLOR_DARCK_BLUE,
			    Color.WHITE,ConstantsUI.FONT_MAIN_WINDOW_LABELS, Commands.C_PANEL_TO_BINARY_WHIT_FORMAT.toString(), actionListener ){
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
	
		add(buttonBinary);
		add(buttonNumber);
		add(buttonBinaryWithFormat);

	}
	
}
