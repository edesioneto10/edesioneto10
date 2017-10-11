package ex4;
//teste
public class Aluno {
    private String nome;
    private float n1;
    private float n2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public void media(){
        System.out.println((n1 + n2) / 2);
        
    }

    public Aluno(String nome, float n1, float n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }

}
