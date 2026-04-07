package Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class PosicaoPersonagemXY<T>{
    public int [][] posicaoXY;
    public int posicao = 0;
    List<T> AdicionarPosicaoXY;

    public int[][] getPosicaoXY() {
        return posicaoXY;
    }
    public int setPosicao() {
        this.posicaoXY = posicaoXY;
        return setPosicao();
    }

    public PosicaoPersonagemXY() {
        this.AdicionarPosicaoXY  = new ArrayList<>();
    }
    public PosicaoPersonagemXY(int[][] posicao) {
        this.posicaoXY = posicao;
    }

    public void adicionarPosicao(){
        posicao++;
    }

    public void adicionarXY(T posicaoXY){
          AdicionarPosicaoXY.add(posicaoXY);
      }
    private  void mostrarXY() {
          for (int[] coordenada : posicaoXY){
              for (T posicoesXY : AdicionarPosicaoXY){
                  System.out.println(posicoesXY);
              }
          }
      }

}
