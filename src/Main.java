public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Tamanho da lista: " + list.getLength());
        System.out.println("Primeiro: " + list.getFirst().getValue());
        System.out.println("Ultimo: " + list.getLast().getValue());

        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.getById(i).getValue());
        }

        list.remove("A");
        System.out.println("Removeu o A");

        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.getById(i).getValue());
        }

    }
}
