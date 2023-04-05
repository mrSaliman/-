import java.util.List;

public abstract class HousePlant {
    private String name;
    private double height;
    private int lifespan;

    // Constructor for initializing the instance variables of the class
    public HousePlant(String name, double height, int lifespan) {
        this.name = name;
        this.height = height;
        this.lifespan = lifespan;
    }

    // Getter method for retrieving the name of the plant
    public String getName() {
        return name;
    }

    // Getter method for retrieving the height of the plant
    public double getHeight() {
        return height;
    }

    // Getter method for retrieving the lifespan of the plant
    public int getLifespan() {
        return lifespan;
    }
    
// Method for printing the details of short-lived plants in the list
public static String printShortLivedPlants(List<HousePlant> plants) {
    String outString = "";
    for (HousePlant plant : plants) {
        if (plant.getLifespan() < 5) {
            outString += String.format("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                    plant.getName(), plant.getHeight(), plant.getLifespan());
        }
    }
    return outString;
}

// Method for printing the details of all flowering plants in the list
public static String printAllFloweringPlants(List<HousePlant> plants) {
    String outString = "";
    for (HousePlant plant : plants) {
        if (plant instanceof FloweringPlant) {
            FloweringPlant floweringPlant = (FloweringPlant) plant;
            outString += String.format("Название: %s, высота: %.2f м, продолжительность жизни: %d лет, продолжительность цветения: %d мес.%n",
                    floweringPlant.getName(), floweringPlant.getHeight(), floweringPlant.getLifespan(), floweringPlant.getFloweringDuration());
        }
    }
    return outString;
}

    
    // Method for printing the details of tall ferns in the list
    public static String printTallFerns(double minHeight, List<HousePlant> plants) {
        String outString = "";
        for (HousePlant plant : plants) {
            if (plant instanceof FernPlant && plant.getHeight() > minHeight) {
                FernPlant fern = (FernPlant) plant;
                outString += String.format("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                        fern.getName(), fern.getHeight(), fern.getLifespan());
            }
        }
        return outString;
    }

}
