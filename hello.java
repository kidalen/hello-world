import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class hello {
	
	
	private static void createWindow() {
		
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String strDate = sdFormat.format(date) ;
		
		
		JFrame frame = new JFrame("HelloWorldTEST");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel(strDate,SwingConstants.CENTER); textLabel.setPreferredSize(new Dimension(300, 100));
		
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	
	public static void main(String args[]){
		//System.out.print("Hello World");
		createWindow();
	}
}


