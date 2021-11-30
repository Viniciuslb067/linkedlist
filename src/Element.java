public class Element<T> {

    double time;
    int car;
    Element next;

    //Construtor para o elemento
    public Element(int car, double time) {
        this.car = car;
        this.time = time;
        this.next = null;
    }
}
