package model;

public class Conteudo {
    private String nome;
    private String email;
    private String areaConteudo;

    public Conteudo(){}
    
    public Conteudo(String nome, String email, String areaConteudo) {
        this.nome = nome;
        this.email = email;
        this.areaConteudo = areaConteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaConteudo() {
        return areaConteudo;
    }

    public void setAreaConteudo(String areaConteudo) {
        this.areaConteudo = areaConteudo;
    }
    
}
