package carro;

/**
 * Esta é a classe Carro que representa um veículo automotor com marca, modelo, ano e velocidade.
 */
public class Carro {
    
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade; // em km/h
    
    /**
     * Construtor da classe Carro.
     * @param marca A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano de fabricação do carro.
     */
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; // velocidade inicial é zero
    }
    
    /**
     * Método para obter a marca do carro.
     * @return A marca do carro.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Método para definir a marca do carro.
     * @param marca A marca do carro.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Método para obter o modelo do carro.
     * @return O modelo do carro.
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * Método para definir o modelo do carro.
     * @param modelo O modelo do carro.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Método para obter o ano de fabricação do carro.
     * @return O ano de fabricação do carro.
     */
    public int getAno() {
        return ano;
    }
    
    /**
     * Método para definir o ano de fabricação do carro.
     * @param ano O ano de fabricação do carro.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    /**
     * Método para obter a velocidade atual do carro.
     * @return A velocidade atual do carro em km/h.
     */
    public double getVelocidade() {
        return velocidade;
    }
    
    /**
     * Método para acelerar o carro.
     * @param aceleracao A quantidade de aceleração em km/h.
     */
    public void acelerar(double aceleracao) {
        velocidade += aceleracao;
    }
    
    /**
     * Método para frear o carro.
     * @param desaceleracao A quantidade de desaceleração em km/h.
     */
    public void frear(double desaceleracao) {
        velocidade -= desaceleracao;
        // Velocidade mínima é zero
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    
    /**
     * Método para exibir informações sobre o carro.
     */
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
