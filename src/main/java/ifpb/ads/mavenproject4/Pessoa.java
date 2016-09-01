package ifpb.ads.mavenproject4;

import java.io.Serializable;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 31/08/2016, 08:41:24
 */
public class Pessoa implements Serializable{

    private String nome;
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

}
