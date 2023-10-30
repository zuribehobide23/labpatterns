package adapter2;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;
import javax.swing.table.TableModel;

import domain.Covid19Pacient;


public class ShowPacientTableGUI extends JFrame{
	
	
  public static void main(String[] args) {
    
    Covid19Pacient pacientAitor=new Covid19Pacient("aitor", 35);
    pacientAitor.addSymptomByName("disnea", 2);
    pacientAitor.addSymptomByName("cefalea", 1);

    
	JFrame frame=new ShowPacientTableGUI(pacientAitor);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.pack();
    frame.setVisible(true);
  }
  
  public ShowPacientTableGUI(Covid19Pacient pacient ) {
	  	this.setTitle("Covid Symptoms "+pacient.getName());
	  	setFonts();
	    
		TableModel tm=new PacientTableModel(pacient);
	    JTable table = new JTable(tm);
	    table.setRowHeight(36);
	    JScrollPane pane = new JScrollPane(table);
	    pane.setPreferredSize(
	      new java.awt.Dimension(300, 100));
	    this.getContentPane().add(pane);
	    
	  
  }


  private static void setFonts() {
    Font font = new Font("Dialog", Font.PLAIN, 18);
    UIManager.put("Table.font", font);
    UIManager.put("TableHeader.font", font);
  }
}
