package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pairs<K, V> implements Iterable<Pair<K, V>> {

    private final Pair<K, V>[] pairs;
    public static final int CAPACITY = 10;
    private int idx;

    @SuppressWarnings("unchecked")
    public Pairs() {
        pairs = new Pair[CAPACITY];
        idx = 0;
    }

    public boolean addPair(K first, V second) {

        if(idx < CAPACITY)
        {
            pairs[idx] = new Pair<>(first,second);
            idx++;
            return true;
        }
        return false;
    }


    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }

    /*
     * TODO: Реализуйте итератор здесь на основе документации API по адресу
     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
     * specified
     */
    private class PairIterator implements Iterator<Pair<K, V>> {
        private int i;
        private boolean calledNext;
        /**
         * TODO: Проверить наличие следующего элемента в итераторе
         */
        @Override
        public boolean hasNext() {
            return i<idx;
        }

        /**
         * TODO: Вернуть следующую пару в итератор.
         * @throws //NoSuchElementException - если больше нет элементов для итерации
         */
        @Override
        public Pair<K, V> next() {
            calledNext = true;
            if(i>=idx)
            {
                throw new NoSuchElementException();
            }
            return pairs[i++];
        }

        /**
         * TODO: Удалите предыдущую пару, возвращенную функцией next()
         */
        @Override
        public void remove() {
            if (!calledNext)
            {
                throw new IllegalStateException();
            }
           for(int j = i; j<idx;j++)
           {
               pairs[j-1] = pairs[j];

           }
            idx--;
           calledNext = false;
        }
    }
}
