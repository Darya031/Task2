//package user;
import org.junit.Assert;
import org.junit.Test;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Tests {
    //берем обычный массив и сравниваем
    //тесты  Base_tests_1 и Base_tests_2 созданы для проверки корректности функций поиска минимума, максимума, сложения и умножения
    @Test
    public void Base_tests_1(){
        int[] array = {1, 2, 3, 4, 5, 56};
        int current_min = Second_task._min(array);
        Assert.assertEquals(current_min, 1);
        Assert.assertEquals(Second_task._max(array), 56);
        Assert.assertEquals(Second_task._mult(array), 6720);
        Assert.assertEquals(Second_task._sum(array), 71);
    }
    @Test
    public void Base_tests_2(){
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int current_min = Second_task._min(array);
        Assert.assertEquals(current_min, 1);
        Assert.assertEquals(Second_task._max(array), 15);
        Assert.assertEquals(Second_task._mult(array), 2027025);
        Assert.assertEquals(Second_task._sum(array), 64);
    }
    @Test
    //теперь делаем тесты на скорость Time_test_1 и Time_test_2 для 100000 и 1000000 чисел соответственно
    public void Time_test_1(){
        //создадим массив, в котором будет 100 000 чисел
        int[] array = new int[100000];
        Random random_generator = new Random();
        int current_el = 1;
        for (int i = 0; i < array.length; i++){
            //генерим числа от 0 до 100 000
            array[i] = random_generator.nextInt(100001);
        }
        //фиксирую время старта
        long startTime = System.currentTimeMillis();
        //запускаю функции
        int current_min = Second_task._min(array);
        int current_max = Second_task._max(array);
        int current_mult = Second_task._mult(array);
        int current_sum = Second_task._sum(array);
        //запоминаю время окончания
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        String finish_phrase = new String();
        finish_phrase = "Программа работает слишком медленно";
        //если время меньше 100 милисекунд, то все ок
        if (elapsedTime < 100) {
            finish_phrase = "Все круто!";
        }
        Assert.assertEquals(finish_phrase, "Все круто!");
        //System.out.println(elapsedTime); + работает за 30 милисекунд
    }
    @Test
    public void Time_test_2(){
        //создадим массив, в котором будет 1 000 000 чисел
        int[] array = new int[1000000];
        Random random_generator = new Random();
        int current_el = 1;
        for (int i = 0; i < array.length; i++){
            //генерим числа от 0 до 100 000
            array[i] = random_generator.nextInt(100001);
        }
        //фиксирую время старта
        long startTime = System.currentTimeMillis();
        //запускаю функции
        int current_min = Second_task._min(array);
        int current_max = Second_task._max(array);
        int current_mult = Second_task._mult(array);
        int current_sum = Second_task._sum(array);
        //запоминаю время окончания
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        String finish_phrase = new String();
        finish_phrase = "Программа работает слишком медленно";
        //если время меньше 100 милисекунд, то все ок
        if (elapsedTime < 100) {
            finish_phrase = "Все круто!";
        }
        Assert.assertEquals(finish_phrase, "Все круто!");
        //System.out.println(elapsedTime); + работает за 30 милисекунд
    }
    //сделала дополнительный тест, который проверяет ограничения по памяти
    @Test
    public void Memory_test(){
        //создадим массив, в котором будет 100 000 чисел
        int[] array = new int[100000];
        Random random_generator = new Random();
        int current_el = 1;
        for (int i = 0; i < array.length; i++){
            //генерим числа от 0 до 100 000
            array[i] = random_generator.nextInt(100001);
        }
        //фиксирую время старта
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        //запускаю функции
        int current_min = Second_task._min(array);
        int current_max = Second_task._max(array);
        int current_mult = Second_task._mult(array);
        int current_sum = Second_task._sum(array);
        // Запоминаю использованную память
        long memory = runtime.totalMemory() - runtime.freeMemory();
        String finish_phrase = new String();
        finish_phrase = "Программа работает слишком медленно";
        //если использует меньше, чем 5000 Мб памяти (5 120 000 байтов), то все круто
        if (memory < 5120000) {
            finish_phrase = "Все круто!";
        }
        Assert.assertEquals(finish_phrase, "Все круто!");
        //запоминаю затраченную память
        //System.out.println(memory);
    }
}