package bibliografiaDisciplinas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

public class telaCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public telaCadastro() {

		setBounds(100, 100, 640, 480);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new MigLayout("", "[grow][][grow]", "[grow][][grow]"));

		JPanel panel = new JPanel();
		add(panel, "cell 1 1,grow");
		panel.setLayout(new MigLayout("", "[grow][][][grow]", "[][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Cadastrar disciplina");
		panel.add(lblNewLabel, "cell 1 1 2 1");

		JLabel lblNewLabel_1 = new JLabel("Preencha as informações abaixo:");
		panel.add(lblNewLabel_1, "cell 1 3 2 1");
		
		JLabel lblNewLabel_3 = new JLabel("Componente curricular:");
		panel.add(lblNewLabel_3, "cell 1 4,alignx left");
		
		textField = new JTextField();
		panel.add(textField, "cell 2 4,growx");
		textField.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("Carga horária:");
				panel.add(lblNewLabel_4, "flowx,cell 1 5");
				
				JLabel lblNewLabel_5 = new JLabel("Semestre:");
				panel.add(lblNewLabel_5, "flowx,cell 2 5");
		
				JButton btnNewButton_1 = new JButton("Confirmar");
				panel.add(btnNewButton_1, "cell 2 7,alignx right");
				
				textField_1 = new JTextField();
				panel.add(textField_1, "cell 1 5");
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				panel.add(textField_2, "cell 2 5");
				textField_2.setColumns(10);

	}

}
