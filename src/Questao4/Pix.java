package Questao4;

public class Pix extends Pagamento {
   private static final double valor_desconto = 0.05;

     @Override
     public  double processar(double valor){
          double valorFinal = valor-(valor*valor_desconto);
          return valorFinal;

     }


    }
