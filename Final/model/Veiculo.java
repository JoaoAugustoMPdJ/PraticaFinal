package model;

import java.util.List;
import model.*;
public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String tipoVeiculo;
    private int ano;
    private double quilometragem;
    private String idMotorista;
    private boolean emManutencao;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(String idMotorista) {
        this.idMotorista = idMotorista;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public Veiculo(String placa, String modelo, String marca, String tipoVeiculo, int ano, double quilometragem, String idMotorista) throws Exception {
        validarPlaca(placa);
        validarAno(ano);
        validarQuilometragem(quilometragem);

        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoVeiculo = tipoVeiculo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.idMotorista = idMotorista;
        this.emManutencao = false;
    }

    private void validarPlaca(String placa) throws Exception {
        // Exemplo de validação simples para placa: apenas verificando se não está vazia
        if (placa == null || placa.isEmpty()) {
            throw new Exception("Placa inválida.");
        }
    }

    private void validarAno(int ano) throws Exception {
        // Verificar se o ano está dentro de um intervalo razoável (exemplo: de 1900 a 2100)
        if (ano < 1900 || ano > 2100) {
            throw new Exception("Ano inválido.");
        }
    }

    private void validarQuilometragem(double quilometragem) throws Exception {
        // Verificar se a quilometragem é não negativa
        if (quilometragem < 0) {
            throw new Exception("Quilometragem inválida.");
        }
    }

    public void validarMotoristaExistente(List<Motorista> motoristas) throws Exception {
        // Verificar se o ID do motorista corresponde a um motorista existente na lista de motoristas
        boolean motoristaExistente = false;
        for (Motorista motorista : motoristas) {
            if (motorista.getId().equals(this.idMotorista)) {
                motoristaExistente = true;
                break;
            }
        }
        if (!motoristaExistente) {
            throw new Exception("Motorista não encontrado.");
        }
    }
}
