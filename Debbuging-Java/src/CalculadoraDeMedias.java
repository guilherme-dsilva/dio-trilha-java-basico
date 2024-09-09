import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaDaTurma(alunos, scanner);

        System.out.println("Média da turma " + media);
    }

    static int calculaMediaDaTurma(String[] alunos, Scanner scanner){

        int soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno " + aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}   
