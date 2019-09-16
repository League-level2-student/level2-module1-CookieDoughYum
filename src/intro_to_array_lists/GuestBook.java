package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton("Add Name");
	JButton button1=new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook gb=new GuestBook();
		gb.GUI();
	}
	void GUI(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doner
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
		String name=JOptionPane.showInputDialog("Please enter a name");
		names.add(name);
		}
		else if(e.getSource()==button1) {
			String list="";
			for(int i=0; i<names.size(); i++) {
				list+=(" Guest # " + i + ": " + names.get(i));
				list+=("\n");
				
			}
			JOptionPane.showMessageDialog(null, list);
		}
		
	}
}
