public class Main {

    public static void main(String[] args) {
        byte diaFabricacao, mesFabricacao; // -128 - 127 | 8-bit
        short anoFabricacao; // -32,768 - 32,767 | 16-bit
        int pesoEmGramas; // -2ˆ31 - (2ˆ31)-1 | 32-bit
        long codigoDoProduto; // -2ˆ63 - (2ˆ63)-1 | 64-bit
        float valorUnitario; // 754 floating point | 32-bit
        double margemDeLucro; // 754 floating point | 64-bit
        boolean ativo; // true and false | 1-bit
        char categoria; // Unicode's character | 16-bit

        diaFabricacao = 14;
        mesFabricacao = 7;
        anoFabricacao = 2023;
        pesoEmGramas = 32150;
        codigoDoProduto = 1001100110011001100L;
        valorUnitario = 1500.50F;
        margemDeLucro = 20.1234567890D;
        ativo = true;
        categoria = 'A';

        System.out.println("Data de fabricação: " + diaFabricacao + "/" + mesFabricacao + "/" + anoFabricacao);
        System.out.println("Peso: " + pesoEmGramas + "g");
        System.out.println("Código do produto: " + codigoDoProduto);
        System.out.println("Valor unitário: " + valorUnitario);
        System.out.println("Margem de lucro: " + margemDeLucro);
        System.out.println("Lucro: " + valorUnitario * margemDeLucro / 100);
        System.out.println("Valor total: " + (valorUnitario + valorUnitario * margemDeLucro / 100));
        System.out.println("Ativo? " + ativo);
        System.out.println("Categoria: " + categoria);
    }
}
