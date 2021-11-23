public class Element<T> {

    private T time;
    private T car;
    private Element next;

    public Element(T car, T time) {
        this.car = car;
        this.time = time;
    }

    public <T> Element(Element<T> a) {
    }

    public T getTime() {
        return time;
    }


    public void setTime(T time) {
        this.time = time;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
