package funciones;

public abstract class Funciones {
    public static void main(String[] args) {


        // opcion 1: funciones sin parametros y sin tipo de retorno por que no devuelbe nada solo muestra (void)
        //invocar a una funcion cada vez que pongo showMenu() me pondra todas las linias de abajo
        //showMenu();
        //showMenu();

        //opcion 2: funcion sin parametro y con tipo de parametro
        String menu = getMenu();
        System.out.println(menu);

        System.out.println(getMenu());


    }

    //void palabra reservada que idica que no debuelva nada solo muestra/identificador(showMenu)
    static void showMenu() {
        System.out.println("Bienvenidos");
        System.out.println("1 - Ver");
        System.out.println("2 - Comprar");
        System.out.println("3 - Salir");


    }

    //opcion2:
    //Tipos de datos : int, long, boolean, String.

    static String getMenu() {
        return "Bienvenidos";
        //se pone tipo de dato String por que bienvenidos es String


    //opcion 3: funcion con parametros y sin tippo  de retorno

    //imprimirSaludo("OpenBootcamp");


}

//static void imprimirSaludo(String nombre) {
    //system.out.println("buenas tardes " + nombre);

    //opcion 4 funcion con parametros y con tipi de retorno
    String nombre = "Alan";
    String Apellido = "Sastre";
    String saludo = "Buenas tardes " + nombre + " " + Apellido;

}

//}


