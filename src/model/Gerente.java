package model;

public class Gerente extends Empregado {
    private double gratificacao;

    public Gerente(double quantidade, double gratificacao) {
        super(quantidade);
        this.gratificacao = gratificacao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }
}