package telefone;
public class AparelhoTelefônico{
  public void ligar(String numero){
    System.out.println("lIGANDO PARA: " + numero);
  }
  public void atender(){
    System.out.println("ATENDENDO CHAMADA");
  }
  public void iniciarCorreioVoz(){
    System.out.println("CORREIO DE VOZ INICIADO");
  }



  public static void main(String[] args) {
    AparelhoTelefônico aparelhoTelefônico = new AparelhoTelefônico();
   aparelhoTelefônico.ligar("41-99736-7810");
  aparelhoTelefônico.atender();
  aparelhoTelefônico.iniciarCorreioVoz();
  
  }
}