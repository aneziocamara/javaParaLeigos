import java.util.Scanner;

import static java.lang.System.out;

public class SwitchNo7 {
    static void main() {
        Scanner keyboard = new Scanner(System.in);
        out.println("Qual o verso (1, 2 ou 3)?");
        String verso = keyboard.next();

        switch(verso){
            case "um":
                out.println("Jesus é o vencedor do mundo,");
                break;
            case "dois":
                out.println("Sejamos os vencedores da impiedade.");
                break;
            case "três":
                out.println("Jesus é o Caminho, a Verdade e a Vida");
                break;
            default:
                out.println("Jesus é o Rei de Nébadon.");
                break;
        }
        out.println("Viva Jesus!");
    }
}
