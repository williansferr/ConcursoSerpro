package SistemaDeEnsino;

/**
 *
 * @author willians
 */
public class Aluno {

    int matricula;
    String nome;
    String disciplina;
    double nota1;
    double nota2;
    double nota3;
    
    public Aluno(){
        
    }

    public Aluno(String nome, String disciplina, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "nome= " + nome + ", disciplina= " + disciplina + ", nota1= " + nota1 + ", nota2= " + nota2 + ", nota3= " + nota3 + '}';
    }
    

}
