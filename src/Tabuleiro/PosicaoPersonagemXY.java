package Tabuleiro;
import java.util.ArrayList;
import java.util.List;

public class PosicaoPersonagemXY<T>{
    public int [][] posicaoXY;
    public int posicao = 0;
    List<T> ListAdicionarPersonagemXY;
    List<T> AdicionarnaposicaoXY;

    public int[][] getPosicaoXY() {
        return posicaoXY;
    }
    public int setPosicao() {
        this.posicaoXY = posicaoXY;
        return setPosicao();
    }

    public PosicaoPersonagemXY() {
        this.ListAdicionarPersonagemXY = new ArrayList<>();
    }
    public PosicaoPersonagemXY(int[][] posicao) {
        this.posicaoXY = posicao;
    }

    public void adicionarPosicao(){
        posicao++;
    }

    public void AdicionarPersonagem(T personagem){
          ListAdicionarPersonagemXY.add(personagem);
      }
public  void mostrarPersonagem(){
        for(T personagem : ListAdicionarPersonagemXY ){
            System.out.println(personagem);
        }
}



    public   void mostrarXY() {
          for (int[] coordenada : posicaoXY){
              for (T posicoesXY : ListAdicionarPersonagemXY){
                  System.out.println(posicoesXY);
              }
          }
      }
}
