package Ipod;
public class ReprodrodutorMusical {
     public void tocar(){
        System.out.println("Tocando musica");
    }
     public void pausar(){
        System.out.println("musica pausada");
    }
     public void selecionarMusic(String music){
        System.out.println("Musica escolhida: " + music);
    }
  public static void main(String[] args) {
    ReprodrodutorMusical ipod= new ReprodrodutorMusical();
    ipod.selecionarMusic("the moments");
    ipod.tocar();
    ipod.pausar();

   }
}
