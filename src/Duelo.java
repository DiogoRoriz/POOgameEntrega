import Personagem.personagem;
import EnumTipos.TipoDeRaca;
import java.util.Random;

public class Duelo {

    public static void main(String[] args) {
        // Criando os personagens
        personagem jogador = new personagem("Arthur", TipoDeRaca.HUMANO, 20, 10, 5);
        personagem inimigo = new personagem("Judas", TipoDeRaca.ONI, 15, 10, 3);

        // Chamando o duelo
        iniciarDuelo(jogador, inimigo);
    }

    public static void iniciarDuelo(personagem p1, personagem p2) {
        Random rand = new Random();
        int turno = 0;

        System.out.println("Duelo iniciado entre " + p1.getNome() + " e " + p2.getNome());

        while (p1.getVida() > 0 && p2.getVida() > 0) {
            personagem atacante = (turno % 2 == 0) ? p1 : p2;
            personagem alvo = (turno % 2 == 0) ? p2 : p1;

            // Dano aleatório entre 1 e força do atacante
            int dano = rand.nextInt(atacante.getForca()) + 1;
            alvo.setVida(alvo.getVida() - dano);

            System.out.println(atacante.getNome() + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");
            System.out.println("Status: " + p1.getNome() + " (" + p1.getVida() + " HP) | "
                    + p2.getNome() + " (" + p2.getVida() + " HP)\n");

            turno++;
        }

        if (p1.getVida() > 0) {
            System.out.println("Vitória de " + p1.getNome() + "!");
        } else {
            System.out.println("Vitória de " + p2.getNome() + "!");
        }
    }
}
