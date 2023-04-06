import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI {

    private static PlantRepository repository = new PlantRepository();
    private static JTextField textField1;
    private static JTextField textField2;
    private static JTextField textField3;
    private static JLabel mainLabel;


    public static void main(String[] args) {
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

        StartProgram(repository);
    }

    public static void StartProgram(PlantRepository repository) {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое графическое приложение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);

        // Создаем компоненты
        JPanel panel = new JPanel();
        JButton addPlant = new JButton("addPlant");
        JButton removePlant = new JButton("removePlant");
        JButton updatePlant = new JButton("updatePlant");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        mainLabel = new JLabel();
        JLabel label1 = new JLabel("Назови цветок.");
        JLabel label2 = new JLabel("Скажи тип этого цветка.");
        JLabel label3 = new JLabel("Напиши его высоту.");

        updatePlant.addActionListener(new updatePlantListener());
        addPlant.addActionListener(new addPlantListener());
        removePlant.addActionListener(new removePlantListener());

        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);

        ShowText(repository.toString(), mainLabel);

        // Добавляем компоненты на панель содержимого
        panel.add(mainLabel);
        panel.add(addPlant);
        panel.add(removePlant);
        panel.add(updatePlant);
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);

        // Добавляем панель содержимого в главное окно
        frame.getContentPane().add(panel);

        // Показываем главное окно
        frame.setVisible(true);
    }

    public static void ShowText(String text, JLabel label) {
        label.setText("<html>" + text.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
    }

    static class addPlantListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String plantType = textField2.getText();
            double height = Double.parseDouble(textField3.getText());
            if (plantType.equals("FloweringPlant")) {
                int numPetals = Integer.parseInt(JOptionPane.showInputDialog("Enter flowering duration:"));
                repository.addPlant(new FloweringPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:")), numPetals));
            } else if (plantType.equals("SucculentPlant")) {
                repository.addPlant(new SucculentPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:"))));
            } else if (plantType.equals("FernPlant")) {
                repository.addPlant(new FernPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:"))));
            }
            ShowText(repository.toString(), mainLabel);
        }
    }

    static class removePlantListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            repository.removePlant(Integer.parseInt(JOptionPane.showInputDialog("Enter index:")) - 1);
            ShowText(repository.toString(), mainLabel);
        }
    }

    static class updatePlantListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String plantType = textField2.getText();
            double height = Double.parseDouble(textField3.getText());
            int index = Integer.parseInt(JOptionPane.showInputDialog("Enter index:"));
            if (plantType.equals("FloweringPlant")) {
                int numPetals = Integer.parseInt(JOptionPane.showInputDialog("Enter flowering duration:"));
                repository.updatePlant(index, new FloweringPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:")), numPetals));
            } else if (plantType.equals("SucculentPlant")) {
                repository.updatePlant(index, new SucculentPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:"))));
            } else if (plantType.equals("FernPlant")) {
                repository.updatePlant(index, new FernPlant(textField1.getText(), height, Integer.parseInt(JOptionPane.showInputDialog("Enter lifespan:"))));
            }
            ShowText(repository.toString(), mainLabel);
        }
    }
}
