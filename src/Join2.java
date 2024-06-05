public class Join2 extends Thread{
    private String url;

    public Join2(){
        url = null;
    }

    public Join2(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        Join j1 = new Join(url);
        j1.start();

        try{
            j1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
         for(int i=0;i<=10;i++){
             System.out.println("downloading url is:"+i+"%");
         }
    }
}
