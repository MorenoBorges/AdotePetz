
package Model;

public class pet {
    private String animal;
    private String nome_doador;
    private String vacinado;
    private String porte;
    private String casa;
    private String cor;
    private String idade;
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

    public String getNome_doador() {
        return nome_doador;
    }

    public void setNome_doador(String nome_doador) {
        this.nome_doador = nome_doador;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    
    

    public String getVacinado() {
        return vacinado;
    }

    public void setVacinado(String vacinado) {
        this.vacinado = vacinado;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }


    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public pet(String animal, String nome_doador, String vacinado, String porte, String casa, String cor, String idade, String endereco) {
        this.animal = animal;
        this.nome_doador = nome_doador;
        this.vacinado = vacinado;
        this.porte = porte;
        this.casa = casa;
        this.cor = cor;
        this.idade = idade;
        this.endereco = endereco;
    }

    


    
    
    public pet(){
        this("","","","","","","","");
    }
    
}
