package control;

import java.util.List;

import model.Motorista;
import model.Veiculo;

public class FrotaController {
    private List<Veiculo> veiculos;
    private List<Motorista> motoristas;

    public FrotaController(List<Veiculo> veiculos, List<Motorista> motoristas) {
        this.veiculos = veiculos;
        this.motoristas = motoristas;
    }


    public void adicionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }
    
    
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }   
    
    
    public void atribuirMotorista(Veiculo veiculo, Motorista motorista) {
        veiculo.setIdMotorista(motorista.getId());
    }

    public void marcarEmManutencao(Veiculo veiculo) {
        veiculo.setEmManutencao(true);
    }

    public void desmarcarEmManutencao(Veiculo veiculo) {
        veiculo.setEmManutencao(false);
    }

    public void registrarUsoCombustivel(Veiculo veiculo, double litros, double precoLitro) {
        double custoTotal = litros * precoLitro;
        veiculo.setQuilometragem(veiculo.getQuilometragem() + litros);
        
        System.out.println("Uso de combustível registrado para o veículo " + veiculo.getPlaca() + ": " + litros + " litros a R$" + precoLitro + " totalizando R$" + custoTotal);
    }

    public void registrarIncidente(Veiculo veiculo, String descricao) {
        
        System.out.println("Incidente registrado para o veículo " + veiculo.getPlaca() + ": " + descricao);
    }
}
