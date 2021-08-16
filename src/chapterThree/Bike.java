package chapterThree;

public class Bike {

     
    private boolean isOn;
    private int gear;
    private int speed;

    public void turnItOn(){
        isOn = true;

    }

	public boolean isOn() {
        speed = 0;
        gear = 0;
        return isOn;
	}

    public void turnItOff() {
        isOn = false;
       
    }

    public void increaseSpeed() {
        if(speed > -1 && speed < 21){
            speed += 1;
            gear = 1;
        }
        if(speed >20 && speed < 31
        ){
            speed += 2;
            gear = 2;
        }
        if(speed > 30 && speed < 43){
            speed += 3;
            gear = 3;
        }
        if(speed >= 41){
            speed += 4;
            gear = 4; 
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear(){
        return gear;
    }
   


}
