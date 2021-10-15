package sky.pro_lesson_4;
/*
Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
– Каждое следующее число равняется сумме двух предыдущих.
Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
Должно получиться следующее:
0 1 1 2 3 5 8 13 21 34
- Справка
Числа Фибоначчи – элементы числовой последовательности
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
 в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
 Названы в честь средневекового математика Леонардо Пизанского.
 */

public class Task5_4 {
    private int numberN;
    private int numberSecond;

    public Task5_4(int numberN, int numberSecond) {
        this.numberN = numberN;
        this.numberSecond = numberSecond;
    }

    public void start() {
        fibonacciNumbers(numberN, numberSecond);
    }

    private void fibonacciNumbers(int n, int a) {
        if (a > 35) {
            return;
        }
        System.out.print(a + " ");
        fibonacciNumbers(a, n + a);
    }
}