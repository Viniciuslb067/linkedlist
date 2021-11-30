import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do scanner para receber os
        // dados do usuário
        Scanner input = new Scanner(System.in);
        // Criação da lista
        LinkedList list = new LinkedList();

        // Variáveis que irão receber os dados
        int car;
        double time;

        System.out.println();
        System.out.println("PRIMEIRA RODADA! \n");

        // Um laço de repetição que irá adicionar os 24 carros
        // na lista
        for (int i = 0; i < 24; i++) {
            System.out.println("Número do carro ");
            car = input.nextInt();
            System.out.println("Marca ");
            time = input.nextDouble();

            // Adicionando na lista
            list.add(car, time);
        }

        // Ordenando a lista
        list.sortList();

        // Mostrando o resultado da primeira rodada
        System.out.println();
        System.out.println("RESULTADO PRIMEIRA RODADA: ");
        list.display();

        System.out.println("SEGUNDA RODADA! \n");

        // Um laço de repetição que irá iniciar a segunda rodada
        for (int i = 0; i < 17; i++) {
            // Recebendo novas marcas para os carros
            System.out.println("Nova marca para o carro " + list.getById(i).car);
            time = input.nextDouble();

            // Verificando se o tempo foi igual ao da rodada anterior
            if ((time == list.getById(i).time)) {
                System.err.println("TEMPO FOI IGUAL AO ANTERIOR, PORTANTO NÃO SERÁ MODIFICADO!");
                // Verificando se o tempo foi menor que o da rodada anterior
            } else if ((time < list.getById(i).time)) {
                list.getById(i).time = time;
            }

        }

        // Ordenando a lista
        list.sortList();

        // Mostrando o resultado da segunda rodada
        System.out.println();
        System.out.println("RESULTADO SEGUNDA RODADA: ");
        list.display();

        System.out.println("TERCEIRA RODADA! \n");

        // Um laço de repetição que irá iniciar a terceira rodada
        for (int i = 0; i < 10; i++) {
            // Recebendo novas marcas para os carros
            System.out.println("Nova marca para o carro " + list.getById(i).car);
            time = input.nextDouble();

            // Verificando se o tempo foi igual ao da rodada anterior
            if ((time == list.getById(i).time)) {
                System.err.println("TEMPO FOI IGUAL AO ANTERIOR, PORTANTO NÃO SERÁ MODIFICADO!");
                // Verificando se o tempo foi menor que o da rodada anterior
            } else if ((time < list.getById(i).time)) {
                list.getById(i).time = time;
            }

        }

        // Ordenando a lista
        list.sortList();

        // Mostrando o resultado da terceira rodada
        System.out.println();
        System.out.println("RESULTADO TERCEIRA RODADA: ");
        list.display();

    }
}