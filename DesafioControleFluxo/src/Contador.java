import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            int parametroUm = scanner.nextInt();
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            throw new ParametrosInvalidosException();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        int contagem = parametroDois - parametroUm;
        
        if(contagem > 0 ){
            for (int contador = 0; contador <= contagem; contador++){
                System.out.println("imprimindo o número " + contador);
            }
        }
        else{
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            throw new ParametrosInvalidosException();
        }
    }
}
