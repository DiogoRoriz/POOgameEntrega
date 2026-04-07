package Tabuleiro;

import Personagem.*;
import Personagem.Usuarios.Heroi;
import Personagem.inimigos.inimigos;

public class Tabuleiro {
// criando um tabuleiro que consiga ir para todas as direções norte nordeste leste sudeste sul suldoeste oeste noroeste
     final int linha = 3;
     final int coluna= 3;
     PosicaoPersonagemXY<Object> personagemXY = new PosicaoPersonagemXY<>();


    int[][] redorpersonagem = new int[linha][coluna];

   public void teste(){
       personagemXY.AdicionarPersonagem(new inimigos("judas", EnumTipos.TipoDeRaca.ONI,5,10,1));
       personagemXY.AdicionarPersonagem(new Heroi("jonas", EnumTipos.TipoDeRaca.HUMANO,10,10,10));

       personagemXY.mostrarPersonagem();
   }
     void map(){

    for(int l = 0 ; l<linha; l++){
        for (int c = 0 ; c<coluna; c++){
            redorpersonagem[l][c] = personagemXY.setPosicao();
            personagemXY.adicionarPosicao();
        }
    }
         for(int l = 0 ; l<linha; l++){
             for (int c = 0 ; c<coluna; c++){
                 redorpersonagem[l][c] = personagemXY.setPosicao();
                 personagemXY.adicionarPosicao();
             }
         }

    }
    void batalha(){

    }

}
