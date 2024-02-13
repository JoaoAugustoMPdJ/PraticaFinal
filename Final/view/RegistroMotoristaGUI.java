package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class RegistroMotoristaGUI extends JFrame {
    private JTextField txtNome;
    private JTextField txtDataNascimento;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JTextField txtEndereco;
    private JButton btnRegistrar;
    private FrotaController frotaController;

    public RegistroMotoristaGUI(FrotaController frotaController) {
        this.frotaController = frotaController;

        setTitle("Registro de Motorista");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        txtNome = new JTextField(20);
        txtDataNascimento = new JTextField(20);
        txtTelefone = new JTextField(20);
        txtEmail = new JTextField(20);
        txtEndereco = new JTextField(20);

        panel.add(new JLabel("Nome:"));
        panel.add(txtNome);
        panel.add(new JLabel("Data de Nascimento (yyyy-mm-dd):"));
        panel.add(txtDataNascimento);
        panel.add(new JLabel("Telefone:"));
        panel.add(txtTelefone);
        panel.add(new JLabel("Email:"));
        panel.add(txtEmail);
        panel.add(new JLabel("Endereço:"));
        panel.add(txtEndereco);

        btnRegistrar = new JButton("Registrar");
        panel.add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarMotorista();
            }
        });
    }

    private void registrarMotorista() {
        try {
            String nome = txtNome.getText();
            LocalDate dataNascimento = LocalDate.parse(txtDataNascimento.getText());
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
            String endereco = txtEndereco.getText();

            Motorista motorista = new Motorista(nome, dataNascimento, telefone, email, endereco);
            frotaController.adicionarMotorista(motorista);

            JOptionPane.showMessageDialog(this, "Motorista registrado com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao registrar motorista: " + ex.getMessage(), "Erro", JOptionPane
