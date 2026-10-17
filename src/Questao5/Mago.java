package Questao5;

public class Mago extends Personagem{

    private static final int DANO_BOLA_DE_FOGO = 40;
    private static final int DANO_CAJADO = 5;
    private static final int CUSTO_MAGIA = 20;

    private int mana = 30;

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public int atacar() {
        if (mana >= CUSTO_MAGIA) {
            mana -= CUSTO_MAGIA;
            System.out.println(getNome() + " (Mago) lança uma bola de fogo! Mana restante: " + mana);
            return DANO_BOLA_DE_FOGO;
        }
        System.out.println(getNome() + " (Mago) está sem mana e golpeia com o cajado.");
        return DANO_CAJADO;
    }

}
