package bibliografiaDisciplinas;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;

	public Menu() {
		setBounds(100, 100, 640, 480);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new MigLayout("", "[grow][][grow]", "[grow][][grow]"));

		JPanel panel = new JPanel();
		add(panel, "cell 1 1,grow");
		panel.setLayout(new MigLayout("", "[grow][grow][grow]", "[][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Bem-Vindo!");
		panel.add(lblNewLabel, "cell 1 1");

		JLabel lblNewLabel_1 = new JLabel("Selecione uma disciplina para ver mais informações:");
		panel.add(lblNewLabel_1, "cell 1 3");

		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "cell 1 4,growx");

		JButton btnNewButton_1 = new JButton("Confirmar");
		panel.add(btnNewButton_1, "cell 1 5,alignx right");

		JLabel lblNewLabel_2 = new JLabel("Não encontrou uma disciplina?");
		panel.add(lblNewLabel_2, "cell 1 6");

		JButton btnNewButton = new JButton("Cadastrar");
		panel.add(btnNewButton, "cell 1 7,alignx left");

	}

}
