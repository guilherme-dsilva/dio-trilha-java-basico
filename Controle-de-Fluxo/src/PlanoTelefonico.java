import java.util.Scanner;

public class PlanoTelefonico {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre os planos telefonicos BASIC, MIDIA e TURBO, qual deles você gostaria de saber mais sobre, apenas informe a sigla: ");
        String plano = scanner.next();

        switch (plano){
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
            
        }
        /* 
        // Estrutura Condicional Encadeada
        if(plano == "B"){
            System.out.println("100 minutos de ligação!");
        }else if(plano == "M"){
            System.out.println("100 minutos de ligação + Whats e Instagram grátis!");
        }else if(plano == "T"){
            System.out.println("100 minutos de ligação + Whats e Instagram grátis + 5Gb Youtube!");
        }else
            System.out.println("Você não informou o plano correto!");
        */
    }
}
