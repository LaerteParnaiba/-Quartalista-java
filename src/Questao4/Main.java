package Questao4;

public class Main {
    public static void main(String[] args){

         Pagamento[] vet = new Pagamento[3];
         vet[0] = new Pix();
         vet[1] = new Boleto();
         vet[2] = new CartaoCredito();

         for(Pagamento p : vet){
             System.out.println(p.processar(100));
         }












    }

}
