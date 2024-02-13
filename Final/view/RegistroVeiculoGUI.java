package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroVeiculoGUI extends JFrame {
    private JTextField txtPlaca;
    private JTextField txtModelo;
    private JTextField txtMarca;
    private JTextField txtTipoVeiculo;
    private JTextField txtAno;
    private JTextField txtQuilometragem;
    private JButton btnRegistrar;
    private FrotaController frotaController;

    public RegistroVeiculoGUI(FrotaController frotaController) {
        this.frotaController = frotaController;

        setTitle("Registro de Veículo");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        txtPlaca = new JTextField(20);
        txtModelo = new JTextField(20);
        txtMarca = new JTextField(20);
        txtTipoVeiculo = new JTextField(20);
        txtAno = new JTextField(20);
        txtQuilometragem = new JTextField(20);

        panel.add(new JLabel("Placa:"));
        panel.add(txtPlaca);
        panel.add(new JLabel("Modelo:"));
        panel.add(txtModelo);
        panel.add(new JLabel("Marca:"));
        panel.add(txtMarca);
        panel.add(new JLabel("Tipo de Veículo:"));
        panel.add(txtTipoVeiculo);
        panel.add(new JLabel("Ano:"));
        panel.add(txtAno);
        panel.add(new JLabel("Quilometragem:"));
        panel.add(txtQuilometragem);

        btnRegistrar = new JButton("Registrar");
        panel.add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarVeiculo();
            }
        });
    }

    private void registrarVeiculo() {
        try {
            String placa = txtPlaca.getText();
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String tipoVeiculo = txtTipoVeiculo.getText();
            int ano = Integer.parseInt(txtAno.getText());
            double quilometragem = Double.parseDouble(txtQuilometragem.getText());

            Veiculo veiculo = new Veiculo(placa, modelo, marca, tipoVeiculo, ano, quilometragem, null); // Defina como null por enquanto
            frotaController.adicionarVeiculo(veiculo);

            JOptionPane.showMessageDialog(this, "Veículo registrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar veículo: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
