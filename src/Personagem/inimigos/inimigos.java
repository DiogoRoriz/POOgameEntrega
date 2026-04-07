package Personagem.inimigos;

import EnumTipos.TipoDeRaca;
import Personagem.personagem;

public class inimigos extends personagem {

    personagem Inimigo;


    public inimigos(String nome, TipoDeRaca tipoDeRaca, int vida, int estamina, int forca, personagem inimigo) {
        super("judas", EnumTipos.TipoDeRaca.ONI,5,10,1);
        Inimigo = inimigo;
    }

    public inimigos() {
        Inimigo = inimigo;
    }
}