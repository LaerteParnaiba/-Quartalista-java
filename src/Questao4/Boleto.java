package Questao4;

public class Boleto extends Pagamento {
    private static final double taxa_boleto = 3.50;

    @Override
    public double processar(double valor){
        return valor+taxa_boleto;

    }
}
