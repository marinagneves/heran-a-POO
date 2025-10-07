public class Carro extends Veiculo { 
    private String tipoDeCombustivel;

    public Carro(String cor, String modelo, String marca, int anoDeLancamento, int preco, String tipoDeCombustivel){
        super(cor, modelo, marca, anoDeLancamento, preco);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public void fazerBarulho(){
        //System.out.println("Bi! Bi!");
        super.fazerBarulho();
    }
}