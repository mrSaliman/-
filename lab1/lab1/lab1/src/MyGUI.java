import javax.swing.*;

public class MyGUI {
    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое графическое приложение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);

        // Создаем панель содержимого
        JPanel panel = new JPanel();

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
        String outString = "Информация по красивоцветущим растениям:\n" + HousePlant.printAllFloweringPlants(repository.getPlants());
        
        // Print information about all short-lived plants in the repository
        outString += "\nРастения с продолжительностью жизни менее 5 лет:\n" + HousePlant.printShortLivedPlants(repository.getPlants());
        
        // Print information about all tall ferns in the repository
        outString += "\nПапоротники выше 0.6 м:\n" + HousePlant.printTallFerns(0.6, repository.getPlants());

        // Создаем компоненты
        JLabel label = new JLabel();
        label.setText("<html>" + outString.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
        
        // Добавляем компоненты на панель содержимого
        panel.add(label);

        // Добавляем панель содержимого в главное окно
        frame.getContentPane().add(panel);

        // Показываем главное окно
        frame.setVisible(true);
    }
}
