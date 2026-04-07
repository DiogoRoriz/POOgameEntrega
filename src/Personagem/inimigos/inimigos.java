package Personagem.inimigos;

import EnumTipos.TipoDeRaca;
import Personagem.personagem;

public class inimigos extends personagem {

    personagem Inimigo;

    String nome = "judas";
    TipoDeRaca raca = EnumTipos.TipoDeRaca.ONI;
    int vida = 5;
    int estamina = 10;
    int forca = 1;


    public inimigos(String nome, TipoDeRaca tipoDeRaca, int vida, int estamina, int forca) {
        super(nome, EnumTipos.TipoDeRaca.ONI, vida, estamina, forca);
    }

    public inimigos() {
        personagem inimigo = null;
        Inimigo = inimigo;
    }

    @Override
    public String toString() {
        return "inimigos{" +
                ", nome='" + nome + '\'' +
                ", raca=" + raca +
                ", vida=" + vida +
                ", estamina=" + estamina +
                ", forca=" + forca +
                '}';
    }
}