package Personagem.Usuarios;

import EnumTipos.TipoDeRaca;
import Personagem.personagem;

import java.util.Objects;

public class Heroi extends personagem {
    personagem heroi;
    personagem Heroi = new personagem("jonas", EnumTipos.TipoDeRaca.HUMANO,10,10,10);

    public Heroi(String nome, TipoDeRaca tipoDeRaca, int vida, int estamina, int forca) {
        super(nome, tipoDeRaca, vida, estamina, forca);
        Heroi = heroi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Heroi heroi1 = (Heroi) o;
        return Objects.equals(heroi, heroi1.heroi) && Objects.equals(Heroi, heroi1.Heroi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroi, Heroi);
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "heroi=" + heroi +
                ", Heroi=" + Heroi +
                '}';
    }
}
