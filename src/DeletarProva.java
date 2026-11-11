import java.io.File;
import java.util.Scanner;

public class DeletarProva {
    static void main() {
        File prova = new File("LivrosAdulterados.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;
        do{
            System.out.println("Deletar prova? (S/N)");
            reply = keyboard.findWithinHorizon(".",0).charAt(0);
        } while (reply != 's' && reply != 'S' && reply != 'n' && reply != 'N');

        if (reply == 's' || reply == 'S'){
            System.out.println("Ok, lá vai...");
            prova.delete();
            System.out.println("O arquivo prova foi deletado.");
        }else {
            System.out.println("Desculpe, só estava perguntando.");
        }
    }
}
