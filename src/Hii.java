public class Hii extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hii");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }
}
