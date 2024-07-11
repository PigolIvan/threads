import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciThread extends Thread{
    @Override
    public void run(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true));
        int a = 0;
        int b = 1;
        for (int i = 2; i <= 15; ++i) {
            int nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
        System.out.println("Фібоначі: " + b);
        writer.write(String.valueOf(b));
        writer.newLine();
        writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
