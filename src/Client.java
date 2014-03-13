// Anton Stoytchev
// 05/10/2013

import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class Client {
	public static void main(String [] args) throws IOException {
		JFrame frame = new JFrame("Large Prime Generator");
		frame.getContentPane().add(new ClientGUI());
		frame.setPreferredSize(new Dimension(500, 600));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
