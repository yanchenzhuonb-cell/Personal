import java.util.NoSuchElementException;

class DoublyLinkedList<T> {
    private Element<T> head;
    private int size = 0;
    void push(T value) {
        Element<T> newNode = new Element<>(value,null,null);

        Element<T> current = head;

        if(size == 0){
            head = newNode;
            size = 1;
            return;
        }
        while(current.hasNext()){
            current = current.getNext();
        }
        newNode.setPrev(current);
        current.setNext(newNode);
        size+=1;

    }

    T pop() {
        T value;
        Element<T> pre = head;

        if(size == 0){
            return null;
        }
        if (size == 1){
            value = head.getValue();
            head = null;
            size--;
            return value;
        }

        Element<T> current = pre.getNext();
        while(current.hasNext()){
            pre = current;
            current = current.getNext();
        }
        value = current.getValue();
        pre.setNext(null);
        size-=1;
        return value;

    }

    void unshift(T value) {
         Element<T> newNode = new Element<>(value,null,head);
         head = newNode;
         size++;
    }

    T shift() {
        T v;

        if(size == 0){
            return null;
        }
        if(size == 1){
            T va;
            va = head.getValue();
            head = null;
            size = 0;
            return va;
        }
        Element<T> next  = head.getNext();
        v = head.getValue();
        next.setPrev(null);
        head =next;
        size--;
        return v;
    }

    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;

        Element(T value, Element<T> prev, Element<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
        public boolean hasNext(){
            if(next == null){
                return false;
            }
            return true;
        }
        public Element<T> getNext(){
            return next;
        }
        public T getValue(){
            return this.value;
        }

        public void setNext(Element<T> e){
            next=e;
        }
        public Element<T> getPrev(){
            return prev;
        }
        public void setPrev(Element<T>e){
            prev =e;
        }
    }


}
