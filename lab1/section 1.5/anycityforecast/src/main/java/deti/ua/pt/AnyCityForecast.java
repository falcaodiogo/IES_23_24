package deti.ua.pt;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class AnyCityForecast {
    private static final Map<String, Integer> cityCodes = new HashMap<>();

    public void start() {
        cityCodes.put("Aveiro", 1010500);
        cityCodes.put("Beja", 1020500);
        cityCodes.put("Braga", 1030300);
        cityCodes.put("Guimarães", 1030800);
        cityCodes.put("Bragança", 1040200);
        cityCodes.put("Castelo Branco", 1050200);
        cityCodes.put("Coimbra", 1060300);
        cityCodes.put("Évora", 1070500);
        cityCodes.put("Faro", 1080500);
        cityCodes.put("Sagres", 1081505);
        cityCodes.put("Portimão", 1081100);
        cityCodes.put("Loulé", 1080800);
        cityCodes.put("Guarda", 1090700);
        cityCodes.put("Penhas Douradas", 1090821);
        cityCodes.put("Leiria", 1100900);
        cityCodes.put("Lisboa", 1110600);
        cityCodes.put("Portalegre", 1121400);
        cityCodes.put("Porto", 1131200);
        cityCodes.put("Santarém", 1141600);
        cityCodes.put("Setúbal", 1151200);
        cityCodes.put("Sines", 1151300);
        cityCodes.put("Viana do Castelo", 1160900);
        cityCodes.put("Vila Real", 1171400);
        cityCodes.put("Viseu", 1182300);
        cityCodes.put("Funchal", 2310300);
        cityCodes.put("Porto Santo", 2320100);
        cityCodes.put("Vila do Porto", 3410100);
        cityCodes.put("Ponta Delgada", 3420300);
        cityCodes.put("Angra do Heroísmo", 3430100);
        cityCodes.put("Santa Cruz da Graciosa", 3440100);
        cityCodes.put("Velas", 3450200);
        cityCodes.put("Madalena", 3460200);
        cityCodes.put("Horta", 3470100);
        cityCodes.put("Santa Cruz das Flores", 3480200);
        cityCodes.put("Vila do Corvo", 3490100);

        Random random = new Random();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int randomIndex = random.nextInt(cityCodes.size());
                String[] citiesArray = cityCodes.keySet().toArray(new String[0]);
                String randomCity = citiesArray[randomIndex];
                System.out.println("Cidade Aleatória: " + randomCity);

                int cityCode = cityCodes.get(randomCity);
                System.out.println("Código da Cidade: " + cityCode);

                try {
                    CityForecast forecast = WeatherStarter.getTempo(cityCode);
                    System.out.println(forecast);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 20 * 1000);
    }

    public static void main(String[] args) {
        new AnyCityForecast().start();
    }
}
