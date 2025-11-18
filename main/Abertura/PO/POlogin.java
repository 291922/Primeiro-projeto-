package main.Abertura.PO;

public class POlogin {
    String nome,email,senha;


    public POlogin(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public String getnome() {
        return this.nome;
    }
    public String getemail() {
        return this.email;
    }
    public String senha() {
        return this.senha;
    }
}
