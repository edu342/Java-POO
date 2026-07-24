public class ContaBancaria {
    // 1. Atributos privados com nomes padronizados (letra inicial minúscula)
    private String numeroConta;
    private String titular;
    private double saldo;

    // 2. Construtor com o MESMO nome da classe
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta; 
        this.titular = titular;
        this.saldo = 0.0; 
    }
      public static void main(String[] args) {
     ContaBancaria minhaconta = new ContaBancaria("106993", "Eduardo Gomes Cardoso");
    
     System.out.println("Titular da conta: "+ minhaconta.getTitular());
    System.out.println("Numero da conta: "+ minhaconta.getNumeroConta());

    minhaconta.depositar(2000.0);
    System.out.println("Voce fez um deposito de : "+ minhaconta.getSaldo());

    minhaconta.sacar(500.0);
    System.out.println("seu saldo atual e de : "+ minhaconta.getSaldo());

    minhaconta.sacar(3000.0);
    }

    public String getNumeroConta() {
      return numeroConta;
    }
    public String getTitular() {
      return titular;
    }
    public double getSaldo() {
      return saldo;
    }
    public void setTitular(String titular){
      this.titular = titular;
    }

  public void depositar(double valor){
    if(valor > 0){
        this.saldo = valor + saldo;
    }
    } 

  public void sacar(double valor){
    if(valor > 0 && this.saldo >= valor){
        this.saldo = saldo - valor;
    } else {
        System.out.println("Erro o valor solicitado para saque e maior que o saldo");
    }
  }  
}
