package develhope.esercizio72ControllerconGETcompleta;

public class User {

    public User(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    public String nome;
    public String provincia;
    public String saluto;


    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saluto='" + saluto + '\'' +
                '}';
    }
}
