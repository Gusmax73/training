package com.example.user.javacoretraining.training;

/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

        /**
         * Метод должен возвращать среднее значение
         * для введенных параметров
         *
         * @param firstValue  первый элемент
         * @param secondValue второй элемент
         * @return среднее значение для введенных чисел
         */
        public double averageValue(int firstValue, int secondValue) {
            return (firstValue + secondValue)/2.0;
        }

        /**
         * Пользователь вводит три числа.
         * Произвести манипуляции и вернуть сумму новых чисел
         *
         * @param firstValue  увеличить в два раза
         * @param secondValue уменьшить на три
         * @param thirdValue  возвести в квадрат
         * @return сумма новых трех чисел
         */
        public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
            double firstValueBuf = firstValue*2;
            int secondValueBuf = secondValue - 3;
            int thirdValueBuf = thirdValue * thirdValue;
            return firstValueBuf + secondValueBuf + thirdValueBuf;
        }

        /**
         * Метод должен поменять значение в соответствии с условием.
         * Если значение больше 3, то увеличить
         * на 10, иначе уменьшить на 10.
         *
         * @param value число для изменения
         * @return новое значение
         */
        public int changeValue(int value) {
            if(value > 3) {
                value += 10;
            }
            else {
                value -= 10;
            }
            return value;
        }

        /**
         * Метод должен менять местами первую
         * и последнюю цифру числа.
         * Обрабатывать максимум пятизначное число.
         * Если число < 10, вернуть
         * то же число
         *
         * @param value число для перестановки
         * @return новое число
         */
        public int swapNumbers(int value) {
            if(String.valueOf(value).length() > 5 ) {
                return value;
            }

            if(value < 10){
                return value;
            }

            int res = value % 10;
            value /= 10;

            int inversion = 10;
            while(value > 9) {
                inversion = (inversion * 10) + value % 10;
                value /= 10;
            }

            while(inversion > 10){
                res = (res * 10) + inversion % 10;
                inversion /= 10;
            }

            res = (res * 10) + value;

            return res;
        }

        /**
         * Изменить значение четных цифр числа на ноль.
         * Счет начинать с единицы.
         * Обрабатывать максимум пятизначное число.
         * Если число < 10 вернуть
         * то же число.
         *
         * @param value число для изменения
         * @return новое число
         */
        public int zeroEvenNumber(int value) {
            if(value < -99999 || value > 99999) {
                return value;
            }

            if(value < 10) {
                return value;
            }

            int buffer = 0;
            while(value > 0) {
                if( (value%10) % 2 == 0 ) {
                    buffer = (buffer * 10);
                }
                else {
                    buffer = (buffer * 10) + value % 10;
                }
                value /= 10;
            }
            int res = 0;
            while(buffer > 0) {
                res = (res * 10) + buffer % 10;
                buffer /= 10;
            }

            return res;
        }
}
