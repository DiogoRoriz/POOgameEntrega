package Personagem.inimigos;

import EnumTipos.TipoDeRaca;
import Personagem.personagem;
import interfaces.*;

public class inimigos extends personagem {

    personagem Inimigo = new personagem("judas", EnumTipos.TipoDeRaca.ONI,5,10,1);

    @Override
    public void Atacar() {

        super.Atacar();
    }
}