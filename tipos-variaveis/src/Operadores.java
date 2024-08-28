public class Operadores {
    public static void main(String[] args){
        //Operadores Matematicos

        int soma = 6 + 7;
        System.out.println(soma);

        int subtracao = 6 - 7;
        System.out.println(subtracao);

        int divisao = 12 / 6;
        System.out.println(divisao);

        double multiplicao = 12.9 * 12.9;
        System.out.println(multiplicao);

        double modulo = 18 % 3;
        System.out.println(modulo);

        int operacao = (12 * 4) + (18 / 3);
        System.out.println(operacao);
        
        //Operadores Unitarios

        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero *-1;
        System.out.println(numero);

        //fluxo de repeticao (operadores unarios)

        int numeroDois = 5;
        numeroDois = numeroDois + 1;

        System.out.println(numeroDois);

        int numeroTres = 6;
        numeroTres ++;

        System.out.println(numeroTres);

        numeroTres = 7;

        System.out.println(++ numeroTres);

        int numeroQuatro = 7;
        numeroQuatro --;

        System.out.println(numeroQuatro);

        numeroQuatro = 7;

        System.out.println(-- numeroQuatro);

        //Valores Booleanos

        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        // Operadores Terciarios

        int a, b;

        a = 6;
        b = 6;

        /* Exemplo de Condicional Utilizando uma Estrutura IF/ELSE */

        /* if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
            System.out.println(resultado); --- o resultado vai ser falso */
        
        /*Utilizando uma estrutura com o operador terciario na resolucao */

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        // Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é maior que numero 2?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que número 2?" + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero 1 é menor que número 2?" + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero 1 é maior ou igual ao número 2?" + simNao);

        simNao = numero1 <= numero2;

        System.out.println("Numero 1 é menor ou igual ao número 2" + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do número 2?" + simNao);

        String nomeUm = "Guilherme";
        String nomeDois = "Guilherme";

        System.out.println(nomeUm == nomeDois);

        // operadores logicos (E/OU)

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("Fim");

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
     }
}
