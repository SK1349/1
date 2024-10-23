package org.example;

/**
 * Класс, реализующий связанный спиок
 * @param <A> произвольный тип
 */
public class Gallery<A> {
    /**
     * Количество элементов в списке
     */
    private int count;
    /**
     * Ссылка на первый элемент
     */
    private Node<A> first;

    /**
     * Конструктор без входых данных
     */
    public Gallery() {
        count = 0;
        first = null;
    }

    /**
     * Проверка на пустоту
     * @return true - количество элементов равно нулю, false - список не пуст
     */
    public  boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Добавление элемента на требуемое место
     * @param element передаваемый объект
     * @param n номер позиции, где должен оказаться объект
     */
    public void add(A element, int n) {

        Node<A> temp = new Node<A>(element, null);
        Node<A> now = first;

        for (int i = 0; i < n-1; i++){
            now = now.next;
        }

        if (isEmpty()){
            first = new Node<A>(element, null);
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

    /**
     * Выводит пронумерованный список
     */
    public void view () {
        Node<A> element = first;
        for( int i = 0; i < count; i++){
            System.out.print(i + "." +element.data + " ");
            element = element.next;
        }
        System.out.println();
    }

    /**
     * Проверяет входит ли число в размер списка
     * @param n число
     * @return true - число не больше размера, false - число не удовлетворяет размеру списка
     */
    public boolean checkSize(int n) {
        return (n <= count);
    }

    /**
     * Удаляет элемент на заданной позиции
     * @param n позиция
     */
    public void clear (int n) {
        Node<A> now = first;

        if (n == 0) {
            first = first.next;
        }else {
            for (int i = 0; i < n-1; i++){
                now = now.next;
            }
            now.next = now.next.next;
        }
        count--;
    }

    /**
     * Извлечение объекта по заданной позиции
     * @param n позиция
     * @return объект на заданной позиции
     */
    public A getData (int n) {
        Node<A> now = first;
        for (int i = 0; i < n; i++) {
            now = now.next;
        }
        return now.data;
    }

    /**
     * Сравнение элемента на позиции с заданным значением
     * @param element заданное значение
     * @param n позиция
     * @return true - элемент на позиции и значение совпали, false - на позиции не заданное значение
     */
    public boolean checkData(A element, int n){
        Node<A> now = first;
        for (int i = 0; i < n; i++){
            now = now.next;
        }
        if (now.data.equals(element)){
            return true;
        }
        return false;
    }

}
