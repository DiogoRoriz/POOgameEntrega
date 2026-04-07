import Personagem.Usuarios.Heroi;
import Personagem.inimigos.inimigos;
import Personagem.personagem;
import EnumTipos.TipoDeRaca;
import java.util.Random;

public class Duelo {

    public static void main(String[] args) {
        // Criando os personagens
        Heroi heroi = new Heroi();
        inimigos inimigo = new inimigos();

        // Chamando o duelo
        iniciarDuelo(heroi, inimigo);
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
            personagem personagem = new personagem();
            personagem.Morte();
        } else {
            System.out.println("Vitória de " + p2.getNome() + "!");
        }
    }
}
