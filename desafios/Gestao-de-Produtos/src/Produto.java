
public class Produto {


    private String nome;
    private double preco;
    private int quantidadeStock;

    public Produto(String nome, double preco, int quantidadeStock) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeStock = quantidadeStock;
    } 
    //criação metodos getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidadeStock(){
        return quantidadeStock;
    }
    //criacao de validação
    public void setPreco(double preco) {
        if(preco >0){
        this.preco = preco;
        }
    }

    public void adicionarStock(int quantidade) {
       if(quantidade > 0){
        this.quantidadeStock += quantidade;
       }
    }

    public static void main(String[] args) {
        System.out.println("=== Teste do Desafio 2: Produto ===");

        Produto p1 = new Produto("Teclado Mecânico", 250.0, 10);
     
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco() + " €");
         System.out.println("Stock inicial: " + p1.getQuantidadeStock());
    // Teste de alteração com preço inválido
        p1.setPreco(-50.0);
    // Teste de adição de stock
         p1.adicionarStock(5);
         System.out.println("Novo stock: " + p1.getQuantidadeStock());
    }
}