import org.junit.Assert;
import org.junit.Test;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Main {
    public static int _min(int[] list) {
        int min_el = list[0];
        for (Integer i: list) {
            if(i < min_el) {
                min_el = i;
            }
        }
        return min_el;
    }

    //функция, которая ищет максимум
    public static int _max(int[] list) {
        int max_el = list[0];
        for (Integer i: list) {
            if(i > max_el) {
                max_el = i;
            }
        }
        return max_el;
    }
    //функция, которая ищет сумму чисел
    public static int _sum(int[] list) {
        int summa = 0;
        for (Integer i: list) {
            summa += i;
        }
        return summa;
    }
    //функция, которая ищет произведение чисел
    public static int _mult(int[] list) {
        int multip = 1;
        for (Integer i: list) {
            multip *= i;
        }
        return multip;
    }
    public static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введите путь до файла и нажмите Enter");
        Scanner scan = new Scanner(System.in);
        //в line_path лежит итоговая строка
        String line_path = scan.nextLine();
        //"C:/Users/DELL/Desktop/java_functions.txt"
        try {
            FileReader current_file = new FileReader(line_path);
            BufferedReader buffered_file = new BufferedReader(current_file);
            String line_str = buffered_file.readLine();
            String[] string_array = line_str.split(" ");
            int string_array_len = string_array.length;
            int[] final_array = new int[string_array_len];
            for (int i = 0; i < string_array_len; i++) {
                try {
                    final_array[i] = Integer.parseInt(string_array[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Big number error " + e.getMessage());
                    System.exit(0);
                }
            }
            buffered_file.close();
            current_file.close();
            System.out.println(_min(final_array));
            System.out.println(_max(final_array));
            System.out.println(_sum(final_array));
            System.out.println(_mult(final_array));
        }
    catch (IOException e) {
        System.out.println("Такого файла не существует, введите правильный путь еще раз");
        System.out.println("Error " + e.getMessage());
        System.exit(0);
    }
}

}