import java.io.*;
import java.util.ArrayList;

public class NumberThread extends Thread{
    @Override
    public void run(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true));
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            ArrayList<String> phoneNumbers = new ArrayList<>();
            String number;
            while ((number = reader.readLine()) != null){
                phoneNumbers.add(number);
                writer.write(number);
                writer.newLine();
            }
            System.out.println("Номера телефонів: " + phoneNumbers);
            writer.close();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
