package Tabuleiro;

public class Tabuleiro {
// criando um tabuleiro que consiga ir para todas as direções norte nordeste leste sudeste sul suldoeste oeste noroeste
     final int linha = 3;
     final int coluna= 3;
     PosicaoPersonagemXY<Object> posicaoPersonagemXY = new PosicaoPersonagemXY<>();

     int[][] redorpersonagem = new int[linha][coluna];


     void map(){

    for(int l = 0 ; l<linha; l++){
        for (int c = 0 ; c<coluna; c++){
            redorpersonagem[l][c] = posicaoPersonagemXY.setPosicao();
            posicaoPersonagemXY.adicionarPosicao();
        }
    }
         for(int l = 0 ; l<linha; l++){
             for (int c = 0 ; c<coluna; c++){
                 redorpersonagem[l][c] = posicaoPersonagemXY.setPosicao();
                 posicaoPersonagemXY.adicionarPosicao();
             }
         }

    }
    void batalha(){

    }

}
