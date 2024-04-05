package develhope.esercizio72ControllerconGETcompleta;

import java.time.OffsetDateTime;

public class User {

    public User(String nome, String provincia, String saluto, OffsetDateTime dataDiNascita) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
        this.dataDiNascita = dataDiNascita;
    }

    public User() {

    }

    public String nome;
    public String provincia;
    public String saluto;
    public OffsetDateTime dataDiNascita;


    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", provincia='" + provincia + '\'' +
                ", saluto='" + saluto + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
