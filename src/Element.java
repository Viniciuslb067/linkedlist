public class Element<T> {

    private T value;
    private Element<T> next;

    public Element (T newElement) {
        this.value = newElement;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }
}
