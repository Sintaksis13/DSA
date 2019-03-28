package com.epam.module.one.task1_3;

import java.util.Arrays;

public class GeneralizedDynamicDoubleArray<T> {
    private T[] array;
    private int arraySize = 0;

    public GeneralizedDynamicDoubleArray() {
        this(0);
    }

    public GeneralizedDynamicDoubleArray(int initialSize) {
        this.array = getNewArray(initialSize);
    }

    public void add(T elem) {
        if (arraySize == array.length) {
            increaseArrayLength();
        }

        array[arraySize] = elem;
        arraySize++;
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
        if (index >= arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in array!");
        }
    }

    private void increaseArrayLength() {
        int newArraySize = array.length == 0 ? 1 : array.length;
        T[] newArray = getNewArray(newArraySize * 2);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private void decreaseArrayLength() {
        T[] newArray = getNewArray(arraySize - 1);
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

    public int size() {
        return arraySize;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
