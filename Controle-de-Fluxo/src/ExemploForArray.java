public class ExemploForArray {
    
    public static void main(String[] args) {

        String alunos[] = {"Guilherme", "Yasmim", "Marlei", "Valdemir"};

        // Utilizando For Each (sintaxe "excluvisa" para trabalhar com for em arrays)
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        /* 
        // Forma padrão de utilizar for com Arrays
        for(int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
        */
    }
}
