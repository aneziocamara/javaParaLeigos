import static java.lang.System.out;
import java.util.Scanner;

public class Autenticador2 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       out.println("Username: ");
       String username = keyboard.next();

       if (username.equals("Jesus")){
           out.println("Password: ");
           String password = keyboard.next();
           if (password.equals("Cristo")){
               out.println("Você está logado.");
           }else{
               out.println("Usuário ou senha incorretos.");
           }
       }else{
           out.println("Usuário desconhecido.");
       }
    }
}
