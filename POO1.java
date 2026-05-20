import java.util.ArrayList;

public class POO1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        lista.add("Manteiga");
        lista.add("Feijão");
        lista.add("Arroz");
        lista.add("Leite");
        lista.add("Carne");

        for (String i : lista) {
            System.out.println(i);
        }
        System.out.println("A lista tem: " + lista.size() + " itens");
    }
}