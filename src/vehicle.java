public class vehicle
{
   private String name;
    private int currentSpeed;
   private int currentDirection;

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    public vehicle(String name)
    {
        this.name=name;
        this.currentSpeed=0;
        this.currentDirection=0;
    }

    public void move(int speed, int direction)
    {
       this.currentSpeed=speed;
       this.currentDirection=direction;
        System.out.println("move method called- the speed is changed to:"+ currentSpeed+" and the direction is changed to: "+currentDirection);

    }
    public void steer(int addDirection)
    {
        this.currentDirection+=addDirection;
        System.out.println("steer method is called-the direction is changed to: "+currentDirection+"degrees");
    }
    public void stop()
    {
        this.currentSpeed=0;
        System.out.println(" Stopped method called Your vehicle stopped now");
    }


}