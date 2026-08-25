public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter hwp=new HelloWorldPrinter();
//        Thread thread=new Thread(hwp);
//        thread.start();
        for(int i=1;i<=100;i++){
            Numberprinter np=new Numberprinter(i);
            Thread thread=new Thread(np);
            thread.start();
        }
    }
}
