import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceGrafica extends JFrame {
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public InterfaceGrafica() {
		setBounds(100, 100, 522, 510);
		
		JPanel pnlBotoes = new JPanel();
		pnlBotoes.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox = Box.createHorizontalBox();
		pnlBotoes.add(horizontalBox, BorderLayout.WEST);
		
		JButton btnAdicionar = new JButton("Adicionar");
		horizontalBox.add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		horizontalBox.add(btnRemover);
		
		JButton btnAtualizar = new JButton("Atualizar");
		horizontalBox.add(btnAtualizar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pnlBotoes.add(btnFechar, BorderLayout.EAST);
		
		JPanel pnlListar = new JPanel();
		
		JPanel panelVisualizar = new JPanel();
		
		JPanel panelBotaoBustar = new JPanel();
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlBotoes, GroupLayout.PREFERRED_SIZE, 510, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panelBotaoBustar, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panelVisualizar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlListar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(pnlBotoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(pnlListar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelVisualizar, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelBotaoBustar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
		);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		GroupLayout gl_panelBotaoBustar = new GroupLayout(panelBotaoBustar);
		gl_panelBotaoBustar.setHorizontalGroup(
			gl_panelBotaoBustar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotaoBustar.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnBuscar)
					.addGap(117))
		);
		gl_panelBotaoBustar.setVerticalGroup(
			gl_panelBotaoBustar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotaoBustar.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelBotaoBustar.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar))
					.addGap(13))
		);
		panelBotaoBustar.setLayout(gl_panelBotaoBustar);
		pnlListar.setLayout(new BorderLayout(0, 0));
		
		JButton btnVisualizar = new JButton("Visualizar");
		pnlListar.add(btnVisualizar, BorderLayout.WEST);
		getContentPane().setLayout(groupLayout);
		
		
		
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
