package com.epam.task1_3;

import java.util.Arrays;

public class GeneralizedDynamicDoubleArray<T> {
    private T[] array;
    private int arraySize = -1;

    public GeneralizedDynamicDoubleArray() {
        this(0);
    }

    public GeneralizedDynamicDoubleArray(int initialSize) {
        this.array = getNewArray(initialSize);
    }

    public void add(T elem) {
        arraySize++;
        if (arraySize == array.length) {
            increaseArrayLength();
        }

        array[arraySize] = elem;
    }

    public T get(int index) {
        checkIndexError(index);

        return array[index];
    }

    public void remove(int index) {
        checkIndexError(index);

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        if (array.length - arraySize <= 1) {
            decreaseArrayLength();
        }

        arraySize--;
    }

    private void checkIndexError(int index) {
        if (index > arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in array or value has not set yet!");
        }
    }

    private void increaseArrayLength() {
        T[] newArray = getNewArray(array.length + 1);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private void decreaseArrayLength() {
        T[] newArray = getNewArray(array.length - 1);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private T[] getNewArray(int size) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[size];
        return newArray;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
