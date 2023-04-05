import java.util.ArrayList;
import java.util.List;

public class PlantRepository {
    private List<HousePlant> housePlants;

    public PlantRepository() {
        this.housePlants = new ArrayList<>();
    }

    // Методы для добавления, удаления и изменения элементов коллекции
    public void addPlant(HousePlant plant) {
        housePlants.add(plant);
    }

    public void removePlant(HousePlant plant) {
        housePlants.remove(plant);
    }

    public void updatePlant(int index, HousePlant plant) {
        housePlants.set(index, plant);
    }

    // Геттер для коллекции экземпляров иерархии
    public List<HousePlant> getPlants() {
        return housePlants;
    }
}
