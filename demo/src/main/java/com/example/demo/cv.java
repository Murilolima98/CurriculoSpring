package com.example.demo;

public class cv {

    private String nome;
    private String data;
    private String email;

    private String Linkdin;
    private String github;

    public String getLinkdin() {
        return Linkdin;
    }

    public void setLinkdin(String linkdin) {
        Linkdin = linkdin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
