public class List<T> {

    private Element<T> first;
    private Element<T> last;
    private int length;

    public List() {
        this.length = 0;
    }

    public Element<T> getFirst() {
        return first;
    }

    public void setFirst(Element<T> first) {
        this.first = first;
    }

    public Element<T> getLast() {
        return last;
    }

    public void setLast(Element<T> last) {
        this.last = last;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void add(T value) {
        Element<T> newElement = new Element<>(value);
        if (this.first == null && this.last == null) {
            this.first = newElement;
        } else {
            this.last.setNext(newElement);
        }
        this.last = newElement;
        this.length++;
    }

    public void remove(T value) {
        Element<T> previous = null;
        Element<T> current = this.first;
        for (int i = 0; i < this.getLength(); i++) {
            if (current.getValue().equals(value)) {
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

    public void printList(Element node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getValue() + " ");
        printList(node.getNext());
    }

    public Element getNewNode(int key) {
        Element a = new Element();
        a.setNext(null);
        a.setValue(key);
        return a;
    }

    public Element insert(int value, int id ,Element<T> node) {

        if (node == null)
            return getNewNode(value);
        else
            node.setNext(insert(value, id ,node.getNext()));

        return node;
    }

    public Element<T> mergeSort(Element<T> element) {
        if(element == null || element.getNext() == null) {
            return element;
        }

        Element<T> middle = middleNode(element);
        Element<T> secondHalf = middle.getNext();
        middle.setNext(null);

        return merge(mergeSort(element), mergeSort(secondHalf));
    }

    public Element<T> middleNode(Element <T> element) {
        if(element == null) {
            return null;
        }

        Element<T> a = element;
        Element<T> b = element.getNext();

        while(b != null && b.getNext() != null) {
            a = a.getNext();
            b = b.getNext().getNext();
        }

        return a;
    }

    public Element<T> merge(Element<T> a, Element<T> b) {
        Element<T> temp = new Element(a);
        Element<T> finalList = temp;

        while(a != null && b != null) {
            if((Integer) a.getValue() < (Integer) b.getValue()) {
                temp.setNext(a);
                a = a.getNext();
            } else {
                temp.setNext(b);
                b = b.getNext();
            }
            temp = temp.getNext();
        }
        temp.setNext((a == null) ? b : a);
        return finalList.getNext();
    }

}