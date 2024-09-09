import java.util.Scanner;

public class SistemaMedida {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma sigla: ");
        String sigla = scanner.next();
        
        //SWITCH CASE
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
        /*
        // Estrtutura Condicional Encadeada
        if(sigla == "P"){
            System.out.println("PEQUENO");
        }else if(sigla == "M"){
            System.out.println("MÉDIO");
        }else if(sigla == "G"){
            System.out.println("GRANDE");
        }else
            System.out.println("INDEFINIDO");
        */
    }
}
