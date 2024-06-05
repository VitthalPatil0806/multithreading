public class Car extends Thread{
    private int id;
    private String name;
    private int speed;

    public Car(){
        id = 1;
        name = "Porche";
        speed = 200;
    }

    public Car(int id, String name, int speed){
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public int getId1() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void display(){
        System.out.println(id+name+speed);
    }

    public void moves(){
        for(int i=0;i<=10;i++){
            System.out.println(id+name+"running at"+(speed+i));
        }
    }

    public void run(){
        Thread carThread = new Thread();
        System.out.println(carThread.getId());
        System.out.println(carThread.getName());

        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
}
