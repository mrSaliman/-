import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HousePlant> plants = new ArrayList<>();
        plants.add(new FloweringPlant("Роза", 0.6, 3, 2));
        plants.add(new FloweringPlant("Орхидея", 0.4, 4, 1));
        plants.add(new SucculentPlant("Алоэ", 0.2, 5));
        plants.add(new SucculentPlant("Кактус", 0.3, 10));
        plants.add(new SucculentPlant("Агава", 0.8, 15));
        plants.add(new FernPlant("Асплениум", 0.5, 6));
        plants.add(new FernPlant("Циртомиум", 0.7, 7));
        plants.add(new FernPlant("Птерис", 0.3, 5));
        plants.add(new FernPlant("Нефролепис", 0.6, 8));
        plants.add(new FernPlant("Селагинелла", 0.2, 3));
        
        System.out.println("Информация по красивоцветущим растениям:");
        HousePlant.printAllFloweringPlants(plants);
        
        System.out.println("\nРастения с продолжительностью жизни менее 5 лет:");
        HousePlant.printShortLivedPlants(plants);
        
        System.out.println("\nПапоротники выше 0.6 м:");
        HousePlant.printTallFerns(0.6, plants);
    }
}

