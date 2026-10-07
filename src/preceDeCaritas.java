import java.util.Scanner;

import static java.lang.System.out;

public class preceDeCaritas {
    static void main() {
        Scanner keyboard = new Scanner(System.in);
        out.println("qual é a prece?");
        int verso = keyboard.nextInt();
        switch (verso){
            case 1:
                out.println("Deus, nosso Pai, que tendes poder e bondade,");
                out.println("Dai força para aquele que passa pela provação,");
            case 2:
                out.println("Dai a Luz àquele que procura a verdade,");
                out.println("Ponde no coração do homem,1 a compaixão e a caridade,");
            case 3:
                out.println("Deus, dai ao viajor, a estrela guia,");
                out.println("Ao aflito, a consolação, ao doente, o repouso,");
        }
        out.println("Pai, dai ao culpado, o arrependimento,");
        out.println("Ao espírito, a Verdade,");
        out.println("À criança, o guia, ao órfão, o pai.");
        out.println("Que a Vossa bondade se estenda sobre tudo que criastes.");
    }
}
