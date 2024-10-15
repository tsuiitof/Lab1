import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание четырех целых чисел x, y, w и z из консоли
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int z = in.nextInt();
        // Задаем диапазон допустимых значений (минимум и максимум)
        int min = -(int)Math.pow(10, 9);
        int max = (int)Math.pow(10, 9);
        // Проверяем, войдет ли число в заданный диапазон
        if (x <= min || x >= max || y<= min || y>=max ||w<= min || w>=max ||z<= min || z>=max) {
            out.println("Среди введённых чисел есть числ(о/а), не входящ(и/е)е в заданный диапазон `-10^9 <= ваше число <= 10^9`. " +
                    "\nВведите четыре числа, каждое из которых будет входить в диапазон допустимых значений.");
            x = in.nextInt();
            y = in.nextInt();
            w = in.nextInt();
            z = in.nextInt();
        }
        // Рассмотрим первый случай, когда x<y
        if (x<y)
            // Далее сравниваем все остальные числа друг с другом
            if (y<w)
                if (w<z)
                    out.print(y);
                else
                if (y<z)
                    out.print(y);
                else
                if (x<z)
                    out.print(z);
                else
                    out.print(x);
            else
            if (x<w)
                if (z<x)
                    out.print(x);
                else
                if (z<w)
                    out.print(z);
                else
                    out.print(w);
            else
            if (z<w)
                out.print(w);
            else
            if (z<x)
                out.print(z);
            else
                out.print(x);
            // Второй случай: x>y
        else
            // Также проверяем остальные условия
            if (w<y)
                if (z<w)
                    out.print(w);
                else
                if (z<y)
                    out.print(z);
                else
                    out.print(y);
            else
            if (w<x)
                if (x<z)
                    out.print(w);
                else
                if (w<z)
                    out.print(w);
                else
                if (z<y)
                    out.print(y);
                else
                    out.print(z);
            else
            if (z<y)
                out.print(y);
            else
            if (z<x)
                out.print(z);
            else
                out.print(x);

    }
}
