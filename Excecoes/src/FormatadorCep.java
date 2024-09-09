public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } 
        catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP informado não corresponde com as regras de negócios");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

            //Simulando um cep formatado
            return "23.765-064";
        
    
    }
}
