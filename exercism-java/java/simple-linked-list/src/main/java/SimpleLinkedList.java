import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    private Node<T> head;
    private int size;
    SimpleLinkedList() {
      head = null;
      size = 0;
    }
    SimpleLinkedList(T[] values) {
        head  = null;
        size = 0;
      for(T t: values){
          push(t);

      }
    }
    void push(T value) {

        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
        size++;

    }
    T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        T value = head.getValue();
        head = head.getNext();
        size--;

        return value;
    }



    T peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return head.getValue();
    }
    void reverse() {
        Node<T> previous = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> next = current.getNext(); // 修改前先保存
            current.setNext(previous);

            previous = current;
            current = next;
        }

        head = previous;
    }
    List<T> toList() {
        List<T> list = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }
        return list;
    }
    int size() {
        return size;
    }
}

//throw new UnsupportedOperationException("Please implement the SimpleLinkedList() constructor.");
//  throw new UnsupportedOperationException("Please implement the SimpleLinkedList(T[]) constructor.");
//throw new UnsupportedOperationException("Please implement the SimpleLinkedList.pop() method.");
//   throw new UnsupportedOperationException("Please implement the SimpleLinkedList.peek() method.");
//throw new UnsupportedOperationException("Please implement the SimpleLinkedList.reverse() method.");
//throw new UnsupportedOperationException("Please implement the SimpleLinkedList.toList() method.");