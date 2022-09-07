package exercises.technology.main;

public class Laptop extends Computer{
    private boolean touchscreenIsActivated;

    public Laptop (String brand, int year, double storage, boolean touchscreenIsActivated){
        super(brand, year, storage);
        this.touchscreenIsActivated = touchscreenIsActivated;
    }

    public void activateTouchscreen(){
        this.touchscreenIsActivated = true;
    }

    public void deactivateTouchscreen(){
        this.touchscreenIsActivated = false;
    }
}
