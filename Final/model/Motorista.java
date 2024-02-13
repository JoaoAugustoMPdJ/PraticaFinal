package model;

import java.time.LocalDate;

public class Motorista {
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private int idade;

    public Motorista(String nome, LocalDate dataNascimento, String telefone, String email, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        calcularIdade();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    private void calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        idade = dataAtual.getYear() - dataNascimento.getYear();
    }

    public void validarIdade() throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("O motorista deve ter pelo menos 18 anos.");
        }
    }
}

