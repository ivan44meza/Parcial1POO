import java.util.Scanner;

public class Empleado {
    public String nombre;
    public int cedula;

    public Empleado(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // creo getters

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    // crep setters

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void nuevoPlato (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese carne");
        String carne = sc.nextLine();

        System.out.println("Ingrese guarnicion 1");
        String guarnicion1 = sc.nextLine();

        System.out.println("Ingrese guarnicion 2");
        String guarnicion2 = sc.nextLine();

        System.out.println("Ingrese jugo natural");
        String jugo = sc.nextLine();

        Menu nuevo = new Menu(carne, guarnicion1, guarnicion2, jugo);
    }

}
