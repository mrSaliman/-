import java.util.List;

// This is the main class of the program
public class Main {
    public static void main(String[] args) {
        // Create a new instance of PlantRepository
        PlantRepository repository = new PlantRepository();
        
        // Add different types of plants to the repository
        repository.addPlant(new FloweringPlant("Роза", 0.6, 3, 2));
        repository.addPlant(new FloweringPlant("Орхидея", 0.4, 4, 1));
        repository.addPlant(new SucculentPlant("Алоэ", 0.2, 5));
        repository.addPlant(new SucculentPlant("Кактус", 0.3, 10));
        repository.addPlant(new SucculentPlant("Агава", 0.8, 15));
        repository.addPlant(new FernPlant("Асплениум", 0.5, 6));
        repository.addPlant(new FernPlant("Циртомиум", 0.7, 7));
        repository.addPlant(new FernPlant("Птерис", 0.3, 5));
        repository.addPlant(new FernPlant("Нефролепис", 0.6, 8));
        repository.addPlant(new FernPlant("Селагинелла", 0.2, 3));
        
        // Print information about all flowering plants in the repository
        System.out.println("Информация по красивоцветущим растениям:");
        System.out.println(plantListToString(repository.getAllFloweringPlants()));
        
        // Print information about all short-lived plants in the repository
        System.out.println("\nРастения с продолжительностью жизни менее 5 лет:");
        System.out.println(plantListToString(repository.getShortLivedPlants()));
        
        // Print information about all tall ferns in the repository
        System.out.println("\nПапоротники выше 0.6 м:");
        System.out.println(plantListToString(repository.getTallFerns(0.6)));
    }

    public static String plantListToString(List<HousePlant> plants) {
        String outString = "";
        for (HousePlant plant : plants) {
            outString += String.format("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                    plant.getName(), plant.getHeight(), plant.getLifespan());
        }
        return outString;
    }
}
