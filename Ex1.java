package ex1;

public class Ex1 {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("Edésio", 40000.0);
        ContaPoupanca cp = new ContaPoupanca("Gabriel", 200.0);
        
        
        cc.depositar(200.0);
        cp.sacar(100.0);
        cc.status();
        cp.status();
    }
}
