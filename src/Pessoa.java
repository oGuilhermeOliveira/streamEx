import java.util.List;

/**
 * @author guiol
 */
public class Pessoa {

    private String id;

    private String nome;

    private String sexo;

    private int idade;


    public Pessoa(String id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public Pessoa(Pessoa pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Masculino", 38);
        Pessoa pessoa2 = new Pessoa("p2", "Hernandez Roja", "Masculino", 21);
        Pessoa pessoa3 = new Pessoa("p3", "Sofia", "Feminino", 22);
        Pessoa pessoa4 = new Pessoa("p4", "Neymar Junior", "Masculino", 22);
        Pessoa pessoa5 = new Pessoa("p5", "Marta Santos", "Feminino", 22);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}