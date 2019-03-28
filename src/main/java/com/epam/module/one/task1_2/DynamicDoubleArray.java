package com.epam.module.one.task1_2;

import java.util.Arrays;

public class DynamicDoubleArray {
    private double[] array;
    private int arraySize = 0;

    public DynamicDoubleArray() {
        this(0);
    }

    public DynamicDoubleArray(int initialSize) {
        this.array = new double[initialSize];
    }

    public void add(double elem) {
        if (arraySize == array.length) {
            increaseArrayLength();
        }

        array[arraySize] = elem;
        arraySize++;
    }

    public double get(int index) {
        checkIndexError(index);

        return array[index];
    }

    public void remove(int index) {
        checkIndexError(index);

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        if (array.length > 2 * (arraySize - 1)) {
            decreaseArrayLength();
        }

        arraySize--;
    }

    protected void checkIndexError(int index) {
        if (index >= arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in array!");
        }
    }

    private void increaseArrayLength() {
        int newArraySize = array.length == 0 ? 1 : array.length;

        double[] newArray = new double[newArraySize * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    private void decreaseArrayLength() {
        double[] newArray = new double[arraySize - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
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
