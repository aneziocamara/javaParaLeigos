import java.util.Scanner;

import static java.lang.System.out;

public class UsandoSwitch {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        out.println("Qual é a música?");
        int verso = keyboard.nextInt();

        switch (verso){
            case 1:
                out.println("Eis o lema do bom servidor,");
                break;
            case 2:
                out.println("T rabalhar, trabalhar, trabalhar");
                break;
            case 3:
                out.println("Se houver empecilho ou barreira,");
                break;
            default:
                out.println("Não há esta música, tente novamente!");
                break;
        }
        out.println("Ohhhhhhhhh...");
    }
}
