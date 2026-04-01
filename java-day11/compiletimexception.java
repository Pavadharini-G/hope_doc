public class compiletimexception {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            try{
                System.out.println("thread sleep");
                Thread.sleep(2000);
                System.out.println("thread wake");
            }catch(InterruptedException e){
                System.out.println("sleep interrupted");
            }
        });
        t.start();
        t.interrupt();
        try{
            Thread.sleep(4000);
        }catch(Exception e){
            System.out.println("Not t");
        }
        t.interrupt();
    }
}
