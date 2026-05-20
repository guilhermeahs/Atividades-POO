import java.util.HashSet;

public class POOR3 {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet();
        nomes.add ("Mario");
        nomes.add ("Mario");
        nomes.add ("João");
        nomes.add ("Pedro");
        nomes.add ("Pedro");

        for (String string : nomes) {
            System.out.println(string);
        }
        System.out.println("Tem: " + nomes.size() + " alunos presentes");
    }
}
