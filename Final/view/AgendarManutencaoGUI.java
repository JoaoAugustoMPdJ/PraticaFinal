package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendarManutencaoGUI extends JFrame {
    private JTextField txtDescricao;
    private JTextField txtData;
    private JButton btnAgendar;

    public AgendarManutencaoGUI() {
        setTitle("Agendar Manutenção");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblDescricao = new JLabel("Descrição:");
        txtDescricao = new JTextField(20);
        panel.add(lblDescricao);
        panel.add(txtDescricao);

        JLabel lblData = new JLabel("Data (dd/mm/aaaa):");
        txtData = new JTextField(10);
        panel.add(lblData);
        panel.add(txtData);

        btnAgendar = new JButton("Agendar");
        btnAgendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar ação de agendar manutenção
            }
        });
        panel.add(btnAgendar);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AgendarManutencaoGUI::new);
    }
}
