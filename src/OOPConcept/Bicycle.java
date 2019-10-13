package OOPConcept;

public class Bicycle implements Machine{
    //fields(state)
    public int speed = 10;
    float round = 90.28f;
    int gear = 5;

    //methods(behaviour)
    void changeGears(int gears){
        this.gear = gears;
    }

    int brake(){
        this.speed = 0;
        return this.speed;
    }

    @Override
    public void run() {
        System.out.println("Bike is running");
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public int start() {
        return 0;
    }
}
