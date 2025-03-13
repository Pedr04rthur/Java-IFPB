package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empregado {
    private int matricula;
    private String dataAdmissao;
    private double quantidade;
    private static double salarioMinimo;
    private Loja loja;
    private static int contador = 0;

    public Empregado(double quantidade) {
        this.matricula = ++contador;
        this.dataAdmissao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.quantidade = quantidade;
    }

    public double getSalario() {
        return quantidade * salarioMinimo - (0.10 * salarioMinimo);
    }

    public static void setSalarioMinimo(double salarioMinimo) {
        Empregado.salarioMinimo = salarioMinimo;
    }

    public static double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public Loja getLoja() {
        return loja;
    }
}