public class Numberprinter implements Runnable{
private  int number;

public  Numberprinter(int number){
    this.number=number;
}
    @Override
    public void run() {
        System.out.println("Thread:" + Thread.currentThread().getName()+ " Number:" + number);
    }
}
