import java.util.ArrayList;
import java.util.List;

public class PlantRepository {
    private List<HousePlant> housePlants; // Объявление приватного поля класса

    public PlantRepository() { // Конструктор класса
        this.housePlants = new ArrayList<>(); // Инициализация пустой коллекции экземпляров класса HousePlant
    }

    public PlantRepository(List<HousePlant> plants) { // Конструктор класса
    }

    // Методы для добавления, удаления и изменения элементов коллекции
    public void addPlant(HousePlant plant) { // Метод для добавления элемента в коллекцию
        housePlants.add(plant);
    }

    public void removePlant(int index) { // Метод для удаления элемента из коллекции
        housePlants.remove(index);
    }

    public void updatePlant(int index, HousePlant plant) { // Метод для обновления элемента в коллекции по индексу
        housePlants.set(index, plant);
    }

    // Геттер для коллекции экземпляров иерархии
    public List<HousePlant> getPlants() { // Метод для получения коллекции экземпляров класса HousePlant
        return housePlants;
    }

    @Override
    public String toString() {
        String outString = "";
        for (HousePlant plant : this.housePlants) {
            outString += String.format("Название: %s, высота: %.2f м, продолжительность жизни: %d лет.%n",
                    plant.getName(), plant.getHeight(), plant.getLifespan());
        }
        return outString;
    }

    // Method for printing the details of short-lived plants in the list
    public List<HousePlant> getShortLivedPlants() {
        List<HousePlant> out = new ArrayList<>();
        for (HousePlant plant : this.housePlants) {
            if (plant.getLifespan() < 5) {
                out.add(plant);
            }
        }
        return out;
    }

    // Method for printing the details of all flowering plants in the list
    public List<HousePlant> getAllFloweringPlants() {
        List<HousePlant> out = new ArrayList<>();
        for (HousePlant plant : this.housePlants) {
            if (plant instanceof FloweringPlant) {
                out.add(plant);
            }
        }
        return out;
    }

    // Method for printing the details of tall ferns in the list
    public List<HousePlant> getTallFerns(double minHeight) {
        List<HousePlant> out = new ArrayList<>();
        for (HousePlant plant : this.housePlants) {
            if (plant instanceof FernPlant && plant.getHeight() > minHeight) {
                out.add(plant);
            }
        }
        return out;
    }
}
