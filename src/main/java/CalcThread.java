import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
public class CalcThread extends Thread {
    public void run() {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true));
        Random random = new Random();
        int n = 20;
        int randomNumber;
        int[] randomArray = new int[10];
        for(int i = 0; i<randomArray.length; i++){
            randomNumber = random.nextInt(n);
            randomArray[i] = Integer.parseInt(Files.readAllLines(Paths.get("numbers.txt")).get(randomNumber));
        }
        int sum = IntStream.of(randomArray).sum();
        System.out.println("Сума: " + sum);
        System.out.println("Вибрані числа: " + Arrays.toString(randomArray));
        writer.write(String.valueOf(sum));
        writer.newLine();
        writer.close();
    } catch(
    IOException e) {throw new RuntimeException(e);}
    }
}
