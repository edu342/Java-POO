//  ABSTRAÇÃO: Classe abstrata que serve de modelo genérico
public abstract class Veiculo {
    
    //  ENCAPSULAMENTO: Atributos privados para proteger os dados
    private String marca;
    private double velocidade;

    // Construtor
    public Veiculo(String marca) {
        this.marca = marca;
        this.velocidade = 0.0;
    }

    //  POLIMORFISMO: Método abstrato que cada veículo implementará do seu jeito
    public abstract void acelerar();

    //  ENCAPSULAMENTO: Getters e Setters para acesso controlado
    public String getMarca() {
        return marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}