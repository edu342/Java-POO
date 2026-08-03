import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {
   public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente();
    cc.depositar(1000);
    cc.sacar(200);
    ContaPoupanca poupanca = new ContaPoupanca();
    poupanca.depositar(500);
   
   cc.transferir(500, poupanca);

   cc.imprimirExtrato();
   poupanca.imprimirExtrato();
   }
}
