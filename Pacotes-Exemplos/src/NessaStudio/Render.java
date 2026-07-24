package NessaStudio;

import NessaStudioModel.Planos;

public class Render {
   String planoAtivo = "Tester";

 public void conferirSaldo(Planos planos){
    if(planoAtivo == "Tester"){
      System.out.println("Você tem direito a 3 renderizações de imagem");
    } 
    else if(planoAtivo == "Plus"){
      System.out.println("Você tem direito a 10 renderizações de imagem");
    }
     else if(planoAtivo == "Pro"){
      System.out.println("Você tem direito a 25 renderizações de imagem");
    }
    } 
  public void renderizar(){
      if(planoAtivo == "Tester"){
      System.out.println("Imagem renderizada, restam mais 2 renderizaçoes ");
    } 
    else if(planoAtivo == "Plus"){
      System.out.println("Imagem renderizada, restam mais 9 renderizaçoes ");
    }
     else if(planoAtivo == "Pro"){
      System.out.println("Imagem renderizada, restam mais 24 renderizaçoes ");
    }
     } 
     
  }
