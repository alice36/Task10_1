import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Ile liczb chcesz wprowadzic?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double[] tab = new double[number];

        FileWriter fileWriter = new FileWriter("plik.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbę nr " + i + 1);
            tab[i] = input.nextDouble();
            bfw.write(String.valueOf(tab[i]));
            bfw.newLine();
        }
        bfw.close();
    }
}

