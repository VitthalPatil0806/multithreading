public class Join extends Thread{
    private String url;

    public Join(){
        url = null;
    }

    public Join(String url){
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
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello from join"+url);
    }
}
