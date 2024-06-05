public class Car2 implements Runnable{
    private int id;
    private String name;
    private int speed;

    public Car2(){
        id=1;
        name="bmw";
        speed=100;
    }

    public Car2(int id, String name, int speed){
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(id+name+(speed+i));
        }
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}
