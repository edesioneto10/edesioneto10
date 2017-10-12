package ex1;

import java.util.Scanner;

public class Conta {

    Scanner scan = new Scanner(System.in);

//Atributos
    private String nome;
    protected double saldo;
    private boolean tipo;
//Metódos

    public void depositar(double s) {
        setSaldo(getSaldo() + s);
    }

    public void sacar(double s) {
        setSaldo(getSaldo() - s);
    }

    public void atualizar(double s) {

        double taxa = scan.nextDouble();
        if (tipo == true) {
            setSaldo(((getSaldo() * taxa) / 100) * 2);
        } else {
            setSaldo(((getSaldo() * taxa) / 100) * 3);
        }

    }

    public void status() {
        System.out.println("Nome: " + getNome());
        if (tipo == true) {
            System.out.println("Tipo: Conta Corrente");
        } else {
            System.out.println("Tipo: Conta Poupança");
        }
        ;
        System.out.println("Saldo: " + getSaldo());
        System.out.println("===========================");
    }

//Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}
