public class Main {

    public static void main(String[] args) {
        byte idade; // -128 - 127 | 8-bit
        short anoNascimento; // -32,768 - 32,767 | 16-bit
        int idInteiro; // -2ˆ31 - (2ˆ31)-1 | 32-bit
        long idLong; // -2ˆ63 - (2ˆ63)-1 | 64-bit
        float salario; // 754 floating point | 32-bit
        double indiceDeAtualizacao; // 754 floating point | 64-bit
        boolean ativo; // true and false | 1-bit
        char genero; // Unicode's character | 16-bit

        idade = 35;
        anoNascimento = 1988;
        idInteiro = -1001;
        idLong = 1001L;
        salario = 15000F;
        indiceDeAtualizacao = 8.1234567890D;
        ativo = true;
        genero = 'M';

        System.out.println("Byte " + idade);
        System.out.println("Short " + anoNascimento);
        System.out.println("Integer " + idInteiro);
        System.out.println("Long " + idLong);
        System.out.println("Float " + salario);
        System.out.println("Double " + indiceDeAtualizacao);
        System.out.println("Boolean " + ativo);
        System.out.println("Character " + genero);
    }
}
