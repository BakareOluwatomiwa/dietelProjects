package chapterThree;

public class AirConditioner {
        private int temperature;
        private boolean isOn;

	public void increaseTemperature() {
        if(temperature < 31)
        temperature+=1;
	}

    public int getTemperature() {
        return temperature;
    }

    public void turnItOn(){
        temperature = 16;
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnItOff() {
        isOn = false;
    }


    public void temperature(int defaultTemperature) {
        temperature = defaultTemperature;
    }

    public void decreaseTemperature() {
        if(temperature<15)
        temperature-=1;
    }

   
}
