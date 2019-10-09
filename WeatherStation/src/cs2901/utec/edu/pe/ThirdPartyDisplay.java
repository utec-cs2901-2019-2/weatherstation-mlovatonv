package cs2901.utec.edu.pe;

public class ThirdPartyDisplay implements Observer, DisplayElement {
    private int isHot;

    private Subject weatherData;
    
    public ThirdPartyDisplay(Subject weatherData) {
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
      if (temperature > 50) {
        this.isHot = 1;
      } else {
        this.isHot = 0;
      }
    }

    public void display() {
      System.out.println("Is hot? " + this.isHot);
    }
}
