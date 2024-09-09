import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        int nota = scanner.nextInt();

        //Estrutura Condicional Ternária aplicada a uma estrtutura condicional encadeada
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        /* 
        //Estrutura Composta:

        if(nota >= 7){                                      //true
            System.out.println("Aprovado");
        }else
            System.out.println("Reprovado");

        // Estrtutura Encadeada:

        if(nota >= 7){                                      //true
            System.out.println("Aprovado");
        
        }else if (nota >=5 && nota < 7){                    //true or false
            System.out.println("Prova de Recuperação");
        }else
            System.out.println("Reprovado");
        
        //Estrutura Condicional Ternária aplicada a uma estrtutura condicional composta:

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        */

    }
}
