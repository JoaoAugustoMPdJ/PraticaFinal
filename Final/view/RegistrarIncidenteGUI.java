package view;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarIncidenteGUI extends JFrame {
    private JTextField txtDescricao;
    private JButton btnRegistrar;

    public RegistrarIncidenteGUI() {
        setTitle("Registrar Incidente ou Avaria");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblDescricao = new JLabel("Descrição:");
        txtDescricao = new JTextField(20);
        panel.add(lblDescricao);
        panel.add(txtDescricao);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar ação de registrar incidente ou avaria
            }
        });
        panel.add(btnRegistrar);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrarIncidenteGUI::new);
    }
}
