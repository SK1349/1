package org.example;

public class Gallery<A> {
    /* добавление, извлечение, удаление */
    private int count;
    private Node<A> first;
    private Node<A> last;

    public Gallery() {
        count = 0;
        first = null;
        last = null;
    }

    public  boolean isEmpty() {
        return (count == 0);
    }

    public void add(A element, int n) {

        Node<A> temp = new Node<A>(element, null);
        Node<A> now = first;

        for (int i = 0; i < n-1; i++){
            now = now.next;
        }

        if (isEmpty()){
            first = new Node<A>(element, null);
            last = first;
            count = 1;
        } else if (n != 0) {
            temp.next = now.next;
            now.next = temp;
            count++;
        }else {
            first = new Node<A>(element, null);
            first.next = now;
            count++;
        }
    }

    public void view () {
        Node<A> element = first;
        for( int i = 0; i < count; i++){
            System.out.print(i + "." +element.data + " ");
            element = element.next;
        }
        System.out.println();
    }

    public boolean check (int n) {
        return (n < count);
    }

    public void clear (int n) {
        Node<A> before = null;
        Node<A> now = first;

        for (int i = 0; i < n; i++){
            before = now;
            now = before.next;
        }

        if (now == first) {
            first = first.next;
        } else if (now == last) {
            last = before;
            last.next = null;
        } else if (first == last) {
            first = null;
        } else {
            before.next = now.next;
        }
        count--;
    }

    public A getData (int n) {
        Node<A> now = first;
        for (int i = 0; i < n; i++) {
            now = now.next;
        }
        return now.data;
    }

}
