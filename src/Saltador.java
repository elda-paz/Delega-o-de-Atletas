public class Saltador extends Atleta {

    private String modalidade;
    private double altura;

    public Saltador(String nome, int numero, int idade, String genero, String modalidade, double altura) {
        super(nome, numero, idade, genero);
        this.modalidade = modalidade;
        this.altura = altura;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        String retorno = super.toString();
        retorno += "Modalidade: " + this.modalidade + "\n";
        retorno += "Altura: " + this.altura + "m\n";
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