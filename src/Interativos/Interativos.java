/*
package Interativos;
import Personagem.personagem;
import interfaces.interativos;
import EnumTipos.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Interativos implements interativos {
    String nome;
    tipoDoEfeitoItem EfeitoInterativo;
    tipoDoInterativo tipoDoInterativo;
    int alimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public tipoDoEfeitoItem getEfeitoInterativo() {
        return EfeitoInterativo;
    }
    public void setEfeitoInterativo(tipoDoEfeitoItem efeitoInterativo) {
        EfeitoInterativo = efeitoInterativo;
    }
    public tipoDoInterativo getTipoDoInterativo() {
        return tipoDoInterativo;
    }
    public void setTipoDoInterativo(tipoDoInterativo tipoDoInterativo) {
        this.tipoDoInterativo = tipoDoInterativo;
    }
    public int getAlimento() {
        return alimento;
    }
    public void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public Interativos() {
        System.out.println("...");
    }

    List<Interativos> interativosList = new ArrayList<>();

    @Override
    public void AtivarInterativo(personagem personagem) {
       // fazer com que o metodo criado pela filha seja ativado e enviado para o personagem
    }

    @Override
    public void Drop() {
        //classe filha vai definir
    }

    @Override
    public void AtividadeDoInterativo() {
        personagem.setVidaAtual(personagem.getVidaAtual()+ alimento);
        personagem.setEstaminaAtual(personagem.getEstaminaAtual() + alimento);
    }

    public Interativos(String nome, tipoDoEfeitoItem efeitoInterativo, tipoDoInterativo tipoDoInterativo) {
        this.nome = nome;
        EfeitoInterativo = efeitoInterativo;
        this.tipoDoInterativo = tipoDoInterativo;
    }

}

 */
