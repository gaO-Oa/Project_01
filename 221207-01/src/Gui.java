import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(20,20,20));
		JButton btn = new JButton("첫번째버튼");
		
		add(pnl);
		pnl.add(btn);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Gui {
	public static void main(String[] args) {
		new MyFrame();
	}
}
