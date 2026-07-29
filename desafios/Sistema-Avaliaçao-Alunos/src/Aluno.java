  public class Aluno{

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

   
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public void setNota1(double nota1) {
        if(nota1 > 0 && nota1 < 10){
            this.nota1 = nota1;
        } else{
            System.out.println("numero precisa ser entre 0 e 10");
        }
    }

    public void setNota2(double nota2) {
         if(nota2 > 0 && nota2 < 10){
            this.nota2 = nota2;
        } else{
            System.out.println("numero precisa ser entre 0 e 10");
        }
    }

    public double calcularMedia() {
        return  (nota1*nota2) /2.0;
    }


    public boolean isAprovado() {
     return calcularMedia() >= 7.0;
    }


    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public static void main(String[] args) {
        System.out.println("=== Teste do Desafio 3: Aluno ===");

        Aluno aluno1 = new Aluno("Maria Silva", "2024001");

        aluno1.setNota1(8.5);
        aluno1.setNota2(6.5);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Aprovado: " + aluno1.isAprovado());
    }
}
