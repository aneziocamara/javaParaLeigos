import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class AdivinheNovamente {
    static void main() {
        Scanner keyboard = new Scanner(System.in);
        int numPalpites = 0;
        int numAleatorio = new Random().nextInt() + 1;
        out.println("       ******************");
        out.println("Bem vindo ao jogo de adivinhação!");
        out.println("       ******************");
        out.println("Inisira um número de 1 a 10:");
        int numeroEntrada = keyboard.nextInt();
        numPalpites++;

        while (numeroEntrada != numAleatorio) {
            out.println();
            out.println("Tente novamente...");
            out.println("Insira um número de 1 a 10: ");
            numeroEntrada = keyboard.nextInt();
            numPalpites++;
        }
        out.print("Você ganhou depois de " + numPalpites + "tentativas.");
    }
}
