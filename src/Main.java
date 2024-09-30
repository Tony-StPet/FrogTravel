import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("INPUT.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("OUTPUT.TXT"));

            // Считываем первую строку
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            double bx = Double.parseDouble(tokenizer.nextToken());
            double by = Double.parseDouble(tokenizer.nextToken());
            double l = Double.parseDouble(tokenizer.nextToken());

            // Создаем объект лягушки
            Frog frog = new Frog(bx, by, l);

            // Создаем объект кузнечика
            Grasshopper grasshopper = new Grasshopper();

            // Считываем координаты точек A1, A2, ..., An
            for (int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                double x = Double.parseDouble(tokenizer.nextToken());
                double y = Double.parseDouble(tokenizer.nextToken());
                grasshopper.addPoint(x, y);
            }

            // Проверяем, будет ли Тёма съеден лягушкой
            int eatenAt = grasshopper.checkJump(frog);
            if (eatenAt == -1) {
                writer.println("Yes");
            } else {
                writer.println(eatenAt + 1);
            }

            writer.close();
            reader.close();
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Ошибка при преобразовании числа: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла неизвестная ошибка: " + e.getMessage());
        }
    }

}