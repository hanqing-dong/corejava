package object;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class lambdatest {
	public static void main(String[] args) {
		String[] str = {"Mercury", "Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		Arrays.sort(str, (str1,str2)->str1.length()-str2.length());
		System.out.println(Arrays.toString(str));
		
		Timer t = new Timer(1000, System.out::println);
		t.start();
		JOptionPane.showMessageDialog(null, "quit program?");
		System.exit(0);
	}
}
