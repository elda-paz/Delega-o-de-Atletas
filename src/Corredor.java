
public class Corredor extends Atleta {
    private double velocidade;
    private double peso;

    public Corredor(String nome, int numero, int idade, String genero, double velocidade, double peso) {
        super(nome, numero, idade, genero);
        this.velocidade = velocidade;
        this.peso = peso;
    }

    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        String retorno = super.toString();
        retorno += "Velocidade: "      + this.velocidade    + "km/h\n";
        retorno += "Peso: "            + this.peso          + "kg\n";
        return retorno;
    }

    @Override
    public boolean iniciarAtividade() {
        if(this.getVelocidade() < 0) {
            return false;
        }
        else {
            return true;
        }
    }

}