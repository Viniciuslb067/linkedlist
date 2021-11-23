import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        Element root = null;

        int car;
        int time;

        System.out.printf("PRIMEIRA RODADA! \n\n");

        for (int i = 0; i < 2; i++) {
            System.out.println("Número do carro ");
            car = input.nextInt();
            System.out.println("Marca ");
            time = input.nextInt();

            root = list.insert(car,time);

        }

        for (int i = 0; i < list.getLength(); i++) {
            System.out.println("Carro: " + list.getById(i).getCar() + " Tempo: " + list.getById(i).getTime());
        }

        Element sorted = list.mergeSort(root);
        list.printList(sorted);
        System.out.println();

        System.out.printf("SEGUNDA RODADA! \n");

    }
}