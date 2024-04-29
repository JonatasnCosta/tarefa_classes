import carro.Carro;

public class App {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        Carro carro = new Carro("Fiat", "Uno", 2010);

        carro.acelerar(10);
        carro.frear(5);
        System.out.println(carro.getAno());
    }
}
