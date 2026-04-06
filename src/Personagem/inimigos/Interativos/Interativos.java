package Personagem.inimigos.Interativos;
import Personagem.Usuarios.personagem;
import interfaces.interativos;
import java.util.Objects;
import EnumTipos.*;

public class Interativos implements interativos {
    String nome;
    tipoDeItemDropado TipoDeDrop;
    tipoDoInterativo tipoDoInterativo;

    private int vida = 1;
    private boolean estarVivo = true;

    personagem personagem = new personagem();


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public tipoDeItemDropado getTipoDeDrop() {
        return TipoDeDrop;
    }
    public Object setTipoDeDrop(tipoDeItemDropado tipoDeDrop) {
        TipoDeDrop = tipoDeDrop;
        return null;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public boolean isEstarVivo() {
        return estarVivo;
    }
    public void setEstarVivo(boolean estavivo) {
        this.estarVivo = estarVivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Interativos that = (Interativos) o;
        return Objects.equals(TipoDeDrop, that.TipoDeDrop);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(TipoDeDrop);
    }

    @Override
    public void drop() {
        getTipoDeDrop();
        if (getTipoDeDrop().equals(setTipoDeDrop(tipoDeItemDropado.VIDA))){
            if(tipoDoInterativo.equals(EnumTipos.tipoDoInterativo.ARMAILHA)){

            }
        } else if (getTipoDeDrop().equals(setTipoDeDrop(tipoDeItemDropado.ESTAMINA))) {

        }
    }


    @Override
    public void Vida() {

        if(estarVivo == false){
            Morte();
        }else{

        }
    }

    @Override
    public void Morte() {
        drop();
    }
    @Override
    public void atividadeDoInterativo() {

    }

}
