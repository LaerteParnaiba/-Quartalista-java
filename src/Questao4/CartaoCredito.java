package Questao4;

public class CartaoCredito extends Pagamento{
    private static final double taxa_cartao = 0.03;

    @Override
    public double processar(double valor){
        double valorFinal = valor + (valor*taxa_cartao);
        return valorFinal;

    }

}
