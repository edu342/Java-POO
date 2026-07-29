// HERANÇA: Carro herda todos os atributos e métodos de Veiculo
public class Carro extends Veiculo {
    
    private int quantidadePortas;

    public Carro(String marca, int quantidadePortas) {
        super(marca); // Chama o construtor da classe pai
        this.quantidadePortas = quantidadePortas;
    }

    //  POLIMORFISMO: Sobrescreve (@Override) o método acelerar específico para Carro
    @Override
    public void acelerar() {
        double novaVelocidade = getVelocidade() + 15.0;
        setVelocidade(novaVelocidade);
        System.out.println("O carro " + getMarca() + " acelerou para " + getVelocidade() + " km/h.");
    }
}