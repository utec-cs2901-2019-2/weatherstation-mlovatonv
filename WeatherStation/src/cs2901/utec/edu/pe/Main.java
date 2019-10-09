package cs2901.utec.edu.pe;

public class Main {

    public static void main(String[] args) {
      WeatherData weatherData = new WeatherData();
      
      CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
      StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
      //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
      ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

      weatherData.changeMeasurements(50.0f, 20.1f, 34.3f);
    }
}
