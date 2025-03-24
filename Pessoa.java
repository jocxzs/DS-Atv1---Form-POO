
public class Pessoa{
    private  String nome;
    private int idade;
    private String email;

    public Pessoa(String nome,int idade,String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public Pessoa(){}

//nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
//idade
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
//email
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void exibirInformações(){
        System.out.println("SOBRE A PESSOA");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
    }
}