public class main {
    public static void main(String[] args) throws InterruptedException {
        FibonacciThread Thread1 = new FibonacciThread();
        CalcThread Thread2 = new CalcThread();
        NumberThread Thread3 = new NumberThread();
        Thread1.start();
        Thread1.join();
        Thread2.start();
        Thread2.join();
        Thread3.start();
        Thread3.join();
        System.out.println("Всі операції успішно завершено.");
    }
}
