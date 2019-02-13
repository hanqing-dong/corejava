package object;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class callback {
	public static void main(String[] args) {
		TimePrinter mytp = new TimePrinter();
		Timer t = new Timer(1000,mytp);
		t.start();
		JOptionPane.showMessageDialog(null, "quit");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ʱ�䣺" + new Date());
		Toolkit.getDefaultToolkit().beep();
	}
	
}
