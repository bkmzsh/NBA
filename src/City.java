/**
 * Created by ldiliyas on 16.07.14.
 */
public class City {
    public String cityName; //Название
    public int population; // Количество населения
    public int market; // Качество рынка (от 1 до 5)

    public City(String cityName, int population, int market){
        this.cityName = cityName;
        this.population = population;
        this.market = market;
    }

    public static City createCity(String cityName, int population, int market){
        City city = new City(cityName, population, market);
        return city;
    }

    public String showCityName(City city){
        return cityName;
    }

}
