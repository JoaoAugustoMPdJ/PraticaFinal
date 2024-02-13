package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarCombustivelGUI extends JFrame {
    private JTextField txtLitros;
    private JTextField txtPreco;
    private JButton btnRegistrar;

    public RegistrarCombustivelGUI() {
        setTitle("Registrar Uso de Combustível");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel lblLitros = new JLabel("Litros:");
        txtLitros = new JTextField(10);
        panel.add(lblLitros);
        panel.add(txtLitros);

        JLabel lblPreco = new JLabel("Preço por litro:");
        txtPreco = new JTextField(10);
        panel.add(lblPreco);
        panel.add(txtPreco);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementar ação de registrar uso de combustível
            }
        });
        panel.add(btnRegistrar);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrarCombustivelGUI::new);
    }
}
