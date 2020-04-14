package com.example.user.javacoretraining.training;

import java.util.ArrayList;

/**
 * Набор тренингов по работе со строками в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see StringsTrainingTest.
 */
public class StringsTraining {

    /**
     * Метод по созданию строки,
     * состоящей из нечетных символов
     * входной строки в том же порядке
     *
     * @param text строка для выборки
     * @return новая строка из нечетных
     * элементов строки text
     */
    public String getOddCharacterString(String text) {
        StringBuilder res = new StringBuilder();
        for(int i=1; i < text.length(); i+=2) {
            res.append(text.charAt(i));
        }
        return res.toString();
    }

    /**
     * Метод для определения количества
     * символов, идентичных последнему
     * в данной строке
     *
     * @param text строка для выборки
     * @return массив с номерами символов,
     * идентичных последнему. Если таких нет,
     * вернуть пустой массив
     */
    public int[] getArrayLastSymbol(String text) {
        int j = 0;
        for(int i=0; i < text.length()-1; i++) {
            if(text.charAt(i) == text.charAt(text.length() - 1)) {
                j++;
            }
        }

        int[] res = new int[j];
        j = 0;
        for(int i=0; i < text.length()-1; i++) {
            if(text.charAt(i) == text.charAt(text.length() - 1)) {
                res[j] = i;
                j++;
            }
        }

        return res;
    }

    /**
     * Метод по получению количества
     * цифр в строке
     *
     * @param text строка для выборки
     * @return количество цифр в строке
     */
    public int getNumbersCount(String text) {
        int count = 0;
        for(int i=0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    /**
     * Дан текст. Заменить все цифры
     * соответствующими словами.
     *
     * @param text текст для поиска и замены
     * @return текст, где цыфры заменены словами
     */
    public String replaceAllNumbers(String text) {
        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";

        StringBuilder res = new StringBuilder();
        for(int i=0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))) {
                switch (text.charAt(i)){
                    case '0':
                        res.append(zero);
                        break;
                    case '1':
                        res.append(one);
                        break;
                    case '2':
                        res.append(two);
                        break;
                    case '3':
                        res.append(three);
                        break;
                    case '4':
                        res.append(four);
                        break;
                    case '5':
                        res.append(five);
                        break;
                    case '6':
                        res.append(six);
                        break;
                    case '7':
                        res.append(seven);
                        break;
                    case '8':
                        res.append(eight);
                        break;
                    case '9':
                        res.append(nine);
                        break;
                }
            }
            else {
                res.append(text.charAt(i));
            }
        }

        return res.toString();
    }

    /**
     * Метод должен заменить заглавные буквы
     * на прописные, а прописные на заглавные
     *
     * @param text строка для изменения
     * @return измененная строка
     */
    public String capitalReverse(String text) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i < text.length(); i++) {
            if(Character.isLowerCase(text.charAt(i))) {
                res.append(Character.toUpperCase(text.charAt(i)));
            }
            else {
                res.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        return res.toString();
    }

}
