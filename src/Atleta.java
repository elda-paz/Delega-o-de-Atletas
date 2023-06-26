import java.io.Serializable;

public abstract class Atleta implements Serializable{

    private String nome;
    private int numero;
    private int idade;
    private String genero;

    public Atleta(String nome, int numero, int idade, String genero ) {
        this.nome = nome;
        this.numero = numero;
        this.idade = idade;
        this.genero = genero;
    }
    public String toString() {
        String retorno = "";
        retorno += "Nome: "    + this.nome   + "\n";
        retorno += "Número: "  + this.numero + "\n";
        retorno += "Idade: "   + this.idade  + "\n";
        retorno += "Gênero: "  + this.genero + "\n";
        return retorno;
    }

    public abstract boolean iniciarAtividade();

    public String getNome() { return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() { return genero; }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}