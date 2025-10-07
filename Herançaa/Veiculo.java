public abstract class Veiculo {
    protected String cor;
    protected String modelo;
    protected String marca;
    protected int anoDeLancamento;
    protected int preco;
    
    public Veiculo (String cor, String modelo, String marca, int anoDeLancamento, int preco){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeLancamento = anoDeLancamento;
        this.preco = 0;
    }
    
    public void fazerBarulho(){
        System.out.println("O veículo está fazendo barulho");
    }

    public void setPreco (int preco){
        this.preco = 0;
    }

    public int getPreco(){
        return preco;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setanoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getanoDeLancamento(){
        return anoDeLancamento;
    }


}
