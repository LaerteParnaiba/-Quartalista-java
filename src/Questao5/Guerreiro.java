package Questao5;

public class Guerreiro extends Personagem {

    private static final int DANO_ESPADA = 25;

    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public int atacar() {
        System.out.println(getNome() + " (Guerreiro) golpeia com a espada!");
        return DANO_ESPADA;
    }


 }
