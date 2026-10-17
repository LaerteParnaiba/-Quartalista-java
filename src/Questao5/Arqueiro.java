package Questao5;

public class Arqueiro extends Personagem{

    private static final int DANO_FLECHA = 12;
    private static final int FLECHAS_POR_ATAQUE = 2;
    private static final int DANO_ADAGA = 4;

    private int flechas = 3;

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public int atacar() {
        if (flechas >= FLECHAS_POR_ATAQUE) {
            flechas -= FLECHAS_POR_ATAQUE;
            System.out.println(getNome() + " (Arqueiro) dispara " + FLECHAS_POR_ATAQUE
                    + " flechas! Flechas restantes: " + flechas);
            return DANO_FLECHA * FLECHAS_POR_ATAQUE;
        }
        System.out.println(getNome() + " (Arqueiro) está sem flechas e ataca com a adaga.");
        return DANO_ADAGA;
    }
}
