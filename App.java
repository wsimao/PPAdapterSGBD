import Users.UsersBasicos;
import Users.UsersGratuito;
import Users.UsersUltimate;

public class App {
    public static void main(String[] args) {

        UsersGratuito UserGratuito = new UsersGratuito("Admin", "admin123");
        UsersBasicos UserBasico = new UsersBasicos("Admin2", "admin123");
        UsersUltimate UserUltimate = new UsersUltimate("Admin3", "admin123");
        

        System.out.println("=================================================================================================");
        UserGratuito.getSGBD().typeAndDescription();
        System.out.println("Usuário: "+UserGratuito.getName());
        System.out.println("");
        UserBasico.getSGBD().typeAndDescription();
        System.out.println("Usuário: "+UserBasico.getName());
        System.out.println("");
        UserUltimate.getSGBD().typeAndDescription();
        System.out.println("Usuário: "+UserUltimate.getName());
        System.out.println("=================================================================================================");

    }
}
