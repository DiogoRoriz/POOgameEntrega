package Personagem.Usuarios;
import interfaces.serVivo;
import EnumTipos.TipoDeRaca;

public class personagem implements serVivo {
    String Nome;
    TipoDeRaca TipoDeRaca;
    int vida;
    int estamina;
    double forca;
    double velocide;
    int vidaAtual;
    int estaminaAtual;
    double forcaAtual;
    double velocidadeAtual;


    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getEstamina() {
        return estamina;
    }
    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }
    public double getForca() {
        return forca;
    }
    public void setForca(double forca) {
        this.forca = forca;
    }
    public double getVelocide() {
        return velocide;
    }
    public void setVelocide(double velocide) {
        this.velocide = velocide;
    }

    @Override
    public void Atacar() {

    }

    @Override
    public void Descancar() {

    }

    @Override
    public void Comer(){

    }

    void estadoVida(){

    }

    void estadoEstamina(){

    }

}
