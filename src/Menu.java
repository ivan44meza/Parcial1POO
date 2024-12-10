public class Menu {

    public String carne;
    public String guarnicion1;
    public String guarnicion2;
    public String jugo;
    
    public Menu (String carne, String guarnicion1, String guarnicion2, String jugo){
        this.carne = carne;
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.jugo = jugo;
    }

    public String getCarne() {
        return carne;
    }

    public String getGuarnicion1() {
        return guarnicion1;
    }

    public String getGuarnicion2() {
        return guarnicion2;
    }

    public String getJugo() {
        return jugo;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setGuarnicion1(String guarnicion1) {
        this.guarnicion1 = guarnicion1;
    }

    public void setGuarnicion2(String guarnicion2) {
        this.guarnicion2 = guarnicion2;
    }

    public void setJugo(String jugo) {
        this.jugo = jugo;
    }

    public void imprimeMenu (){
        System.out.println("El menu contiene:");
        System.out.println(getCarne());
        System.out.println(getGuarnicion1());
        System.out.println(getGuarnicion2());
        System.out.println(getJugo());
    }
}
