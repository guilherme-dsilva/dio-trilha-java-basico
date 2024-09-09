import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ControleCandidatos{
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCELO", "MARIA", "DOUGLAS", "JOÃO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas);
        }
        else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
        }
    }
    // metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCELO", "MARIA", "DOUGLAS", "JOÃO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemnto");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }

        //forma abreviada For each (sem o indice)

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecionarCandidatos(){
        String [] candidatos = {"FELIPE", "MARCELO", "MARIA", "DOUGLAS", "JOÃO", "GEOVANA", "LUCIENE", "GUILHERME", "YASMIM"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Este candidato " + candidato + " solicitou esse salário: " + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionado++;
             }else{
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
             }
             candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(Double salarioPretendido){

        double baseSalarial = 2000.0;
        
        if(baseSalarial > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(baseSalarial==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM A CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RETORNO DE OUTROS CANDIDATOS");
        }
            
        
            
        
    }
}
    

