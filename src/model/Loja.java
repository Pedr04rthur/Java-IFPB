package model;

import java.util.ArrayList;

public class Loja {
    private String cnpj;
    private String nome;
    private ArrayList<Empregado> empregados;

    public Loja(String cnpj, String nome, Gerente gerente) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.empregados = new ArrayList<>();
        this.adicionar(gerente);
    }

    public double getSalarioTotal() {
        double total = 0;
        for (Empregado empregado : empregados) {
            total += empregado.getSalario();
        }
        return total;
    }

    public double getDescontoTotal() {
        double total = 0;
        for (Empregado empregado : empregados) {
            total += 0.10 * Empregado.getSalarioMinimo();
        }
        return total;
    }

    public Empregado getMaraja() {
        Empregado maraja = null;
        double maiorSalario = 0;
        for (Empregado empregado : empregados) {
            if (empregado.getSalario() > maiorSalario) {
                maiorSalario = empregado.getSalario();
                maraja = empregado;
            }
        }
        return maraja;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public Gerente getGerente() {
        for (Empregado empregado : empregados) {
            if (empregado instanceof Gerente) {
                return (Gerente) empregado;
            }
        }
        return null;
    }

    public void adicionar(Empregado empregado) {
        empregados.add(empregado);
        empregado.setLoja(this);
    }

    public void remover(Empregado empregado) {
        empregados.remove(empregado);
        empregado.setLoja(null);
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }
}