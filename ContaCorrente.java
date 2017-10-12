package ex1;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, Double saldo) {
        
        setNome(nome);
        setSaldo(saldo);
        setTipo(true);
        
    }
//Métodos
    
    public void depositar(double s) {
        setSaldo((getSaldo() + s) - 0.10);
        
    }


}
