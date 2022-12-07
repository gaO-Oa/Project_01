import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame  {
	public MyFrame() {
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(20,150,20));
		JButton btn = new JButton("첫번째버튼");
		JButton btn2 = new JButton("두번째버튼");
		
		
		add(pnl);
		pnl.add(btn);
		pnl.add(btn2);
		
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Random rd = new Random();
				int r = rd.nextInt(100);
				int g = rd.nextInt(100);
				int b = rd.nextInt(100);
				pnl.setBackground(new Color(30, 20, 60));
			}
		
			
		});
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
