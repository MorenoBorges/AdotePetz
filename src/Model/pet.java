
package Model;

public class pet {
    private String animal;
    private String vacinado;
    private String porte;
    private String casa;

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


    public pet(String animal, String vacinado, String porte, String casa) {
        this.animal = animal;
        this.vacinado = vacinado;
        this.porte = porte;
        this.casa = casa;
    }
    
    public pet(){
        this("","","","");
    }
    
}
