public class EnumPractice {
    //reference: https://www.youtube.com/watch?v=hrEF3M2LCrc
    enum Transport{
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        Transport(int s){
            speed = s;
        }
    }

    public static void main(String[] args) {

        Transport tp = Transport.PLANE;
        Transport tp2 = Transport.TRAIN;

        if(tp == Transport.PLANE){
            System.out.println("something");
        }

        Transport[] allTransports = Transport.values();

        for(Transport t: allTransports){
            System.out.println(t);
        }

        System.out.println(Transport.AUTOMOBILE.speed);

        System.out.println(tp.ordinal()); //ordinal is the order in which it is in the enum in reference to the speed

        if(tp2.ordinal()<2){
            System.out.println("Not an automobile");
        }
    }
}
