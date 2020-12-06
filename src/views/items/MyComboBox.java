package views.items;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.basic.BasicComboBoxUI;

import view.ConstantsUI;

public class MyComboBox extends JComboBox<String>{
	private int arcW;
	private int arcH;
	public MyComboBox() {
		super();
		setBackground(Color.WHITE);
		//setFont(ConstantsUI.RUBIK_PLAIN_16);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(Color.BLACK);
		
	}

	public MyComboBox(String test,int n) {
		super();
		this.arcW = arcW;
		this.arcH = arcH;
		setBackground(Color.WHITE);
		setFont(ConstantsUI.RUBIK_BOLD_16);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(ConstantsUI.COLOR_DARCK_BLUE);
		setActionCommand( actionCommand );
		//addActionListener( actionListener );
		setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_BOX_TYPE_DATA));
		
		
		setUI(new BasicComboBoxUI() {
			      
			      @Override
			      public void paintCurrentValueBackground(Graphics g,
			                                 Rectangle bounds,
			                                 boolean hasFocus)
			      {
			          g.setColor(Color.WHITE);            
			          g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
			      }
			        
			      //Pinta los items
			      @Override
			      protected ListCellRenderer createRenderer()
			      {
			          return new DefaultListCellRenderer() {      
			              
			          @Override
			          public Component getListCellRendererComponent(JList list,Object value,int index,
			            boolean isSelected,boolean cellHasFocus) {
			        
			          super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
			          list.setSelectionBackground(ConstantsUI.COLOR_LIGTH_BLUE);
			          if (isSelected)
			          {
			              setBackground(ConstantsUI.COLOR_LIGTH_BLUE);
			              setForeground(Color.WHITE);
			          }
			          else
			          {
			              setBackground( Color.WHITE );            
			              setForeground( new Color(70,70,70));
			          }
			          return this;
			        }
			      };
			      }
		});
		
	}
	
	public MyComboBox(String n) {
		super();
		this.arcW = arcW;
		this.arcH = arcH;
		setBackground(Color.WHITE);
		setFont(ConstantsUI.RUBIK_BOLD_16);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setForeground(ConstantsUI.COLOR_DARCK_BLUE);
		setActionCommand( actionCommand );
		setBorder(BorderFactory.createTitledBorder(ConstantsUI.T_BOX_TYPE_DATA));
		
		
		setUI(new BasicComboBoxUI() {
			      
			      @Override
			      public void paintCurrentValueBackground(Graphics g,
			                                 Rectangle bounds,
			                                 boolean hasFocus)
			      {
			          g.setColor(Color.WHITE);            
			          g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
			      }
			        
			      //Pinta los items
			      @Override
			      protected ListCellRenderer createRenderer()
			      {
			          return new DefaultListCellRenderer() {      
			              
			          @Override
			          public Component getListCellRendererComponent(JList list,Object value,int index,
			            boolean isSelected,boolean cellHasFocus) {
			        
			          super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
			          list.setSelectionBackground(ConstantsUI.COLOR_LIGTH_BLUE);
			          if (isSelected)
			          {
			              setBackground(ConstantsUI.COLOR_LIGTH_BLUE);
			              setForeground(Color.WHITE);
			          }
			          else
			          {
			              setBackground( Color.WHITE );            
			              setForeground( new Color(70,70,70));
			          }
			          return this;
			        }
			      };
			      }
		});
		
	}
	
}
