public class LinkedList {

    private Element first;
    private Element last;
    private int length;

    public LinkedList() {
        this.length = 0;
    }

    public Element getFirst() {
        return first;
    }

    public void setFirst(Element first) {
        this.first = first;
    }

    public Element getLast() {
        return last;
    }

    public void setLast(Element last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void add(String value) {
        Element newElement = new Element(value);
        if (this.first == null && this.last == null) {
            this.first = newElement;
        } else {
            this.last.setNext(newElement);
        }
        this.last = newElement;
        this.length++;
    }

    public void remove(String value) {
        Element previous = null;
        Element current = this.first;
        for (int i = 0; i < this.getLength(); i++) {

            if (current.getValue().equalsIgnoreCase(value)) {
                if (this.length == 1) {
                    this.first = null;
                    this.last = null;
                } else if (current == first) {
                    this.first = current.getNext();
                    current.setNext(null);
                } else if (current == previous) {
                    this.last = previous;
                    previous.setNext(null);
                } else {
                    previous.setNext(current.getNext());
                }
                this.length--;
                break;
            }
            previous = current;
            current = current.getNext();
        }
    }

    public Element getById(int id) {
        Element current = this.first;
        for (int i = 0; i < id; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            }
        }
        return current;
    }

}
