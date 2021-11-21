import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Element root = null;

        LinkedList<Integer> car = new LinkedList<>();
        LinkedList<Integer> time = new LinkedList<>();

        System.out.printf("PRIMEIRA RODADA! \n\n");

        for (int i = 0; i < 2; i++) {
            System.out.println("Número do carro ");
            time.add(input.nextInt());
            System.out.println("Marca ");
            root = time.insert(input.nextInt(), root);

        }

        Element sorted = time.mergeSort(root);
        time.printList(sorted);

        System.out.printf("SEGUNDA RODADA! \n\n");

        for (int i = 0; i < 2; i++) {
            System.out.println("Número do carro ");
            time.add(input.nextInt());
            System.out.println("Marca ");
            root = time.insert(input.nextInt(), root);
        }

        Element second = time.mergeSort(root);
        time.printList(second);





    }
}
