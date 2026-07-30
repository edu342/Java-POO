package navegador;

public class NavegadorInternet {
   public void exibirPagina(String url){
    System.out.println("Exibindo a pagina:" + url);
   }
   public void adicionarNovaAba(){
    System.out.println("Nova aba adicionada");
   }
   public void atualizarPagina(){
    System.out.println("Pagina atualizada");
   }

  public static void main(String[] args) {
   NavegadorInternet navegador = new NavegadorInternet();
   navegador.exibirPagina("google.com");
   navegador.adicionarNovaAba();
   navegador.atualizarPagina();
  }
}
