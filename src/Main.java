public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        System.out.println(list.getLength());
        System.out.println("Primeiro: " + list.getFirst().getValue());
        System.out.println("Ultimo: " + list.getLast().getValue());
        System.out.println(list.get(1).getValue());

    }
}
