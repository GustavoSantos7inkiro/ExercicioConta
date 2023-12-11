package entities;

public class Conta {

    public int nconta;
    public String nome;
    public double saldo;

    public Conta ( int nconta, String nome, double valor) {
        this.nconta = nconta;
        this.nome = nome;
        deposito(valor);
    }
    public Conta (int nconta, String nome){
        this.nconta = nconta;
        this.nome = nome;
    }

    public void deposito (double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: $" + saldo);

    }

    public void retirar(double valor) {
        if (saldo >= valor + 5) {
            saldo -= (valor + 5);
            System.out.println("Saldo insuficiente para saque. ");
        }
    }
    public void dados() {
        System.out.println("Numero da conta: " + nconta + ",Titular da conta: " + nome + ",Saldo: $" + saldo);
    }

}
