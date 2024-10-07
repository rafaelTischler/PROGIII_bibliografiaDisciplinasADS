package bibliografiaDisciplinas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	static Janela frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
					frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		initComponentes();
		this.setContentPane(new Menu());
	}

	private void initComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Disciplinas - Análise e Desenvolvimento de Sistemas");
		setBounds(100, 100, 800, 600);

	}

}
