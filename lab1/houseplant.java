import java.util.ArrayList;
import java.util.List;

public abstract class HousePlant {
    private String name;
    private double height;
    private int lifespan;

    public HousePlant(String name, double height, int lifespan) {
        this.name = name;
        this.height = height;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getLifespan() {
        return lifespan;
    }
    
    public static void printShortLivedPlants(List<HousePlant> plants) {
        for (HousePlant plant : plants) {
            if (plant.getLifespan() < 5) {
                System.out.printf("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                        plant.getName(), plant.getHeight(), plant.getLifespan());
            }
        }
    }

    public static void printAllFloweringPlants(List<HousePlant> plants) {
        for (HousePlant plant : plants) {
            if (plant instanceof FloweringPlant) {
                FloweringPlant floweringPlant = (FloweringPlant) plant;
                System.out.printf("Название: %s, высота: %.2f м, продолжительность жизни: %d лет, продолжительность цветения: %d мес.%n",
                        floweringPlant.getName(), floweringPlant.getHeight(), floweringPlant.getLifespan(), floweringPlant.getFloweringDuration());
            }
        }
    }   
    
    public static void printTallFerns(double minHeight, List<HousePlant> plants) {
        for (HousePlant plant : plants) {
            if (plant instanceof FernPlant && plant.getHeight() > minHeight) {
                FernPlant fern = (FernPlant) plant;
                System.out.printf("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                        fern.getName(), fern.getHeight(), fern.getLifespan());
            }
        }
    }

}