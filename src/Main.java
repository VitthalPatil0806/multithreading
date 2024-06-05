//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

//        Car c1 = new Car(2,"lamborgini",800);
//        c1.moves();
//        c1.run();
//
//        Car c2 = new Car(3,"ferrari",1000);
//        c2.moves();
//        c2.run();
//
//        Car c3 = new Car(4,"bentley",230);
//        c3.moves();
//        c3.run();
//
//        c1.start();
//        c2.start();
//        c3.start();
//
//        System.out.println(c1.isAlive());
//        System.out.println(c2.isAlive());
//        System.out.println(c3.isAlive());

//        Hii h1 = new Hii();
//        Hello h2 = new Hello();
//
//        h1.start();
//        try{Thread.sleep(10);}catch (Exception e){}
//        h2.start();

//        Car2 c2 = new Car2(45,"buggati",400);
//        Car2 c21 = new Car2(23,"mercedez",300);
//
//
//        Thread t1 = new Thread(c2);
//        t1.start();
//        try{Thread.sleep(10);}catch (Exception e){}
//        Thread t2 = new Thread(c21);
//        t2.start();

        Syncronisation s1 = new Syncronisation();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    s1.increament();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    s1.increament();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t1.join();
        System.out.println(s1.count);

//        Join2 j2 = new Join2("hello.pdf");
//        Join2 j3 = new Join2("hello2.pdf");
//        j2.start();
//        j3.start();
//
//        try{
//            j2.join();
//            j3.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("now here me!!!");


    }
}