import java.util.Scanner;

public class parcialMenu {
    public static void main(String[] args) throws Exception {
        // creamos escaner para leer entradas
        Scanner sc = new Scanner(System.in); 

        // Creo una variable para mantener el ciclo funcionando
        boolean abierto = true;

        Menu menu1 = new Menu("Cerdo", "Arroz", "Papas", "Mora");
        Menu menu2 = new Menu("Pollo", "Arroz", "Huevo", "Mango");
        Menu menu3 = new Menu("Carne", "Arroz", "Papas", "Guanabana");

        while (abierto) {

            // Variable para la seleccion de la opcion en la consola
            int opcion;

            System.out.println("Para ingresar como empleado usuario = Empleado; codigo = 1");
            System.out.println("Para ingresar como cliente usuario = Cliente; codigo = 2");

            System.out.println("Debemos verificar tu identidad");
            System.out.println("Ingrese su usuario");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su codigo");
            String codigo = sc.nextLine();

            if (usuario == "Empleado " && codigo == "1") {
                Empleado persona = new Empleado(usuario, Integer.parseInt(codigo));

                System.out.println("Pagina de entrada del Restaurante \n Bienvenido");
    
                System.out.println("Seleccione una opcion para continuar");
                System.out.println("1. Menu Disponible");
                System.out.println("2. Nuevo Menu");
                System.out.println("3. Salir");
        
                opcion = Integer.parseInt(sc.nextLine());
        
                switch (opcion) {
                    case 1:
                        menu1.imprimeMenu();
                        menu2.imprimeMenu();
                        menu3.imprimeMenu();
                        break;
        
                    case 2:
                        persona.nuevoPlato();
                        break;

                    case 3:
                        abierto = false;
                        break;
                
                    default:
                        System.out.println("Debe poner un numero en la opcion (1 o 2)");
                        break;
                }
            } else if (usuario == "Cliente" && codigo == "2"){
                Cliente persona = new Cliente(usuario);

                System.out.println("Pagina de entrada del Restaurante \n Bienvenido");
    
                System.out.println("Seleccione una opcion para continuar");
                System.out.println("1. Menu Disponible");
                System.out.println("2. Realizar Pedido");
                System.out.println("3. Salir");
        
                opcion = Integer.parseInt(sc.nextLine());
        
                switch (opcion) {
                    case 1:
                        menu1.imprimeMenu();
                        menu2.imprimeMenu();
                        menu3.imprimeMenu();
                        break;
        
                    case 2:
                        
                        break;

                    case 3:
                        abierto = false;
                        break;
                
                    default:
                        System.out.println("Debe poner un numero en la opcion (1 o 2)");
                        break;
                }
            } else {
                System.out.println("Por favor ingrese un usuario o codigo correcto");
            }
            
            
        }

        
    }
}
