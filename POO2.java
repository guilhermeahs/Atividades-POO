import java.util.ArrayList;
import java.util.Scanner;

public class POO2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        for (int i = 0; i < 4; i++ ) {
            System.out.println("Forneça alguns numero");
            notas.add(sc.nextDouble());
            soma += notas.get(i);
        }

        media = soma / notas.size();
        if (media < 7) {
            System.out.println("Aprovado com a media de " + media + " pontos");
        } else {
            System.out.println("Reprovado com a media de " + media + " pontos");
        }
    }
}
