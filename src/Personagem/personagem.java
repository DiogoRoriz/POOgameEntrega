package Personagem;
import EnumTipos.TipoDeRaca;
//import Interativos.Interativos;
import interfaces.serVivo;
import static EnumTipos.TipoDeRaca.*;

public class personagem implements serVivo {
    String Nome;
    TipoDeRaca TipoDeRaca;
    int vida;
    int estamina;
    int forca;
    double velocide;
    int vidaAtual;
    int estaminaAtual;
    double forcaAtual;
    double velocidadeAtual;
    private int pontuacao = vida + estamina + forca;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public TipoDeRaca getTipoDeRaca() {
        return TipoDeRaca;
    }
    public void setTipoDeRaca(TipoDeRaca tipoDeRaca) {
        TipoDeRaca = tipoDeRaca;
    }
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
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public double getVelocide() {
        return velocide;
    }
    public void setVelocide(double velocide) {
        this.velocide = velocide;
    }
    public int getVidaAtual() {
        return vidaAtual;
    }
    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }
    public int getEstaminaAtual() {
        return estaminaAtual;
    }
    public void setEstaminaAtual(int estaminaAtual) {
        this.estaminaAtual = estaminaAtual;
    }
    public double getForcaAtual() {
        return forcaAtual;
    }
    public void setForcaAtual(double forcaAtual) {
        this.forcaAtual = forcaAtual;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public void Vida() {
        System.out.println("...");
    }

    @Override
    public void Morte() {
        if(getTipoDeRaca() == HUMANO) {
            System.out.println("Seu Personagem Morreu! a Humanidade foi dizimada");
        } else if (getTipoDeRaca() == SLIME ) {
            System.out.println(" blouf Blofu! Blofu...");
        } else if (getTipoDeRaca() == ONI) {
            System.out.println("Seu Personagem Morreu! retornaremos em breve ");
        }
    }

    @Override
    public void Atacar() {

    }

    @Override
    public void Descancar() {
    vidaAtual ++;
    estaminaAtual ++;
    }

    @Override
    public void Comer(){
        System.out.println("esta comendo");
    }

    public personagem() {
    }

    public personagem(String nome, TipoDeRaca tipoDeRaca, int vida, int estamina, int forca) {
        Nome = nome;
        TipoDeRaca = tipoDeRaca;
        this.vida = vida;
        this.estamina = estamina;
        this.forca = forca;
    }
}
