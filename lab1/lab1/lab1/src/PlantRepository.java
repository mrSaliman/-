import java.util.ArrayList;
import java.util.List;

public class PlantRepository {
    private List<HousePlant> housePlants; // Объявление приватного поля класса

    public PlantRepository() { // Конструктор класса
        this.housePlants = new ArrayList<>(); // Инициализация пустой коллекции экземпляров класса HousePlant
    }

    // Методы для добавления, удаления и изменения элементов коллекции
    public void addPlant(HousePlant plant) { // Метод для добавления элемента в коллекцию
        housePlants.add(plant);
    }

    public void removePlant(HousePlant plant) { // Метод для удаления элемента из коллекции
        housePlants.remove(plant);
    }

    public void updatePlant(int index, HousePlant plant) { // Метод для обновления элемента в коллекции по индексу
        housePlants.set(index, plant);
    }

    // Геттер для коллекции экземпляров иерархии
    public List<HousePlant> getPlants() { // Метод для получения коллекции экземпляров класса HousePlant
        return housePlants;
    }
}
