package Questao5;

public class Main {
    public static void main(String[] args) {

        Personagem[] grupo = {
                new Guerreiro("Brutus"),
                new Mago("Elara"),
                new Arqueiro("Finn")
        };

        int vidaDragao = 100;

        System.out.println("=== Turno de combate: o grupo ataca o dragão (vida: " + vidaDragao + ") ===");

        for (Personagem p : grupo) {
            int dano = p.atacar();
            vidaDragao -= dano;
            System.out.println("   -> dano causado: " + dano + " | vida do dragão: " + Math.max(vidaDragao, 0));
        }

        if (vidaDragao <= 0) {
            System.out.println("O dragão foi derrotado!");
        } else {
            System.out.println("O dragão sobreviveu com " + vidaDragao + " de vida.");
        }
    }

}
