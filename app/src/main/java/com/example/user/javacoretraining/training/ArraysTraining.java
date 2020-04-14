package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        if(valuesArray.length == 0) {
            return valuesArray;
        }
        int buf;
        for(int i = 0; i < valuesArray.length; i++) {
            for (int j = 0; j < valuesArray.length - 1 - i; j++) {
                if (valuesArray[j] > valuesArray[j + 1]) {
                    buf = valuesArray[j];
                    valuesArray[j] = valuesArray[j + 1];
                    valuesArray[j + 1] = buf;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        if(values.length == 0) {
            return 0;
        }
        int max;
        max = values[0];
        for (int value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        int[] reversion = new int[array.length];
        for(int i = 0; i < array.length; i++ ){
            reversion[array.length - i - 1] = array[i];
        }
        return reversion;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */
    public int[] fibonacciNumbers(int numbersCount) {
        if(numbersCount < 1) {
            return new int[]{};
        }
        int[] res = new int[numbersCount];
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < res.length; i++) {
            res[i] += res[i-1] + res[i-2];
        }
        return res;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        int count;
        int maxCount = 1;
        for(int i = 0; i < array.length; i++) {
            count = 0;
            for(int j = i; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
