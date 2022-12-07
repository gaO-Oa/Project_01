import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	public MyFrame() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton();
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
