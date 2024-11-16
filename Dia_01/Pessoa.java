package entities;

public class Pessoa {

    private String nome;
    private String idade;

    public static class Builder {
        private final String nome;
        private final String idade;

        public Builder(String nome, String idade){
            this.nome = nome;
            this.idade = idade;
        }

        public Pessoa build(){
            return new Pessoa(this);
        }

    }

    private Pessoa(Builder builder) {
        nome = builder.nome;
        idade = builder.idade;
    }


    public void andar(){
        System.out.println(this.nome + " esta andando");
    }

    public void correr(){
        System.out.println(this.nome + " esta correndo");
    }

    public void parar() {
        System.out.println(this.nome + " esta parando de andar/correr");
    }

    public void falar() {
        System.out.println("Ola, eu sou o" + this.nome + " prazer em conhecer!");
    }



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

    @Override
    public String toString() {
        return "Pessoa {" + "\n" +
                "   Nome: " + nome + "\n" +
                "   Idade: " + idade + "\n" +
                "}";
    }




}
