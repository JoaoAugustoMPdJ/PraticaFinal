package app.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class FrotaManager {
    public static void main(String[] args) {
        FrotaController frotaController = new FrotaController();
        RegistroVeiculoGUI registroVeiculoGUI = new RegistroVeiculoGUI(frotaController);
        RegistroMotoristaGUI registroMotoristaGUI = new RegistroMotoristaGUI(frotaController);
        AgendarManutencaoGUI agendarManutencaoGUI = new AgendarManutencaoGUI(frotaController);
        RegistrarCombustivelGUI registrarCombustivelGUI = new RegistrarCombustivelGUI(frotaController);
        RegistrarIncidenteGUI registrarIncidenteGUI = new RegistrarIncidenteGUI(frotaController);

        registroVeiculoGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registroMotoristaGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agendarManutencaoGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrarCombustivelGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrarIncidenteGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registroVeiculoGUI.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                registroMotoristaGUI.dispose();
                agendarManutencaoGUI.dispose();
                registrarCombustivelGUI.dispose();
                registrarIncidenteGUI.dispose();
            }
        });

        registroVeiculoGUI.setVisible(true);
        registroMotoristaGUI.setVisible(true);
        agendarManutencaoGUI.setVisible(true);
        registrarCombustivelGUI.setVisible(true);
        registrarIncidenteGUI.setVisible(true);
    }
}
