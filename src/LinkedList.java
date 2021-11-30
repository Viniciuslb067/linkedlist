public class LinkedList {

    public Element head = null;
    public Element tail = null;
    private int length;
    private Element first;
    private Element last;

    public LinkedList() {
        this.length = 0;
    }

    // Métodos getter e setter
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

    //Função para remover um carro pelo seu número
    public void remove(int value) {
        Element current = head, previous = tail;
        for (int i = 0; i < this.getLength(); i++) {
            if (current.car == value) {
                if (this.length == 1) {
                    this.first = null;
                    this.last = null;
                } else if (current == first) {
                    head = current.next;
                    current.next = null;
                } else if (current == previous) {
                    tail = previous;
                    previous.next = null;
                } else {
                    previous.next = current.next;
                }
                this.length--;
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    //Função para buscar um carro pela sua posição na lista
    public Element getById(int id) {
        Element current = this.first;
        for (int i = 0; i < id; i++) {
            if (current == null) {
                System.err.println("ERRO!");
                System.exit(0);
            }
            if (current.next != null) {
                current = current.next;
            }
        }
        return current;
    }

    //Função para adicionar novos elementos na lista
    public void add(int car, double time) {
        // Cria um novo elemento
        Element newNode = new Element(car, time);

        // Verifica se a lista está vazia
        if (head == null) {

            // Se a lista estiver vazia, tanto o inicio quanto o fim
            // irão receber um novo elemento
            head = newNode;
            tail = newNode;
            this.first = newNode;
        } else {

            // será adicionado após o fim de modo
            // que o próximo ultimo elemento aponte para newNode
            tail.next = newNode;

            // newNode se tornará o novo final da lista
            this.last = newNode;
            tail = newNode;
        }
        this.length++;
    }

    //Função para ordenar a lista do menor para o maior
    public void sortList() {
        Element current = head, index;
        double temp;
        int car;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.time > index.time) {
                        temp = current.time;
                        car = current.car;
                        current.time = index.time;
                        current.car = index.car;
                        index.car = car;
                        index.time = temp;
                    }

                    index = index.next;

                }
                current = current.next;
            }
        }
    }

    //Função para exibir a lista
    public void display() {
        int count = 1;
        Element current = head;

        if (head == null) {
            System.out.println("A lista está vazia");
            return;
        }
        while (current != null) {
            System.out.print(count + "° Posição " + "= Carro: " + current.car + " Tempo: " + current.time + "\n");
            current = current.next;
            count++;
        }
        System.out.println();
    }

}