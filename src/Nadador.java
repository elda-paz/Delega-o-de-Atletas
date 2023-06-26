
public class Nadador extends Atleta {

    private String estilo;
    private double altura;

    public Nadador(String nome, int numero, int idade, String genero, String estilo, double altura) {
        super(nome, numero, idade, genero);
        this.estilo = estilo;
        this.altura = altura;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String toString() {
        String retorno = super.toString();
        retorno += "Estilo: " + this.estilo + "\n";
        retorno += "Altura: " + this.altura + "cm\n";
        return retorno;
    }

    @Override
    public boolean iniciarAtividade() {
        if (this.getAltura() < 0) {
            return false;
        } else {
            return true;
        }
    }
}