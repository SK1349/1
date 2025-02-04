package org.example;

/**
 * Класс, реализующий узлы
 * @param <A> произвольный тип
 */
public class Node<A> {
    /**
     * Объект произвольного типа
     */
    public A data;

    /**
     * Ссылка на следующий объект
     */
    public Node<A> next;

    /**
     * Конструктор с параметрами
     * @param data значение данных
     * @param next ссылка на следующий объект
     */
    public Node(A data, Node<A> next) {
        this.data = data;
        this.next = next;
    }
}
