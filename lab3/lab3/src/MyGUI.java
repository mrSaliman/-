import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI {
    private static JTextField textField1;
    private static JLabel mainLabel;


    public static void main(String[] args) {

        StartProgram();
    }

    public static void StartProgram() {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое графическое приложение");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);

        // Создаем компоненты
        JPanel panel = new JPanel();
        JButton addPlant = new JButton("sort");
        textField1 = new JTextField(20);
        mainLabel = new JLabel();

        addPlant.addActionListener(new sortListener());

        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);


        // Добавляем компоненты на панель содержимого
        panel.add(mainLabel);
        panel.add(addPlant);
        panel.add(textField1);

        // Добавляем панель содержимого в главное окно
        frame.getContentPane().add(panel);

        // Показываем главное окно
        frame.setVisible(true);
    }

    private static int[] convertStringToArray(){
        String[] strings = textField1.getText().split(",");
        int[] arr = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }


    static class sortListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainLabel.setText(convertIntArrToString(CountingSort.sort(convertStringToArray())));
        }
    }

    private static String convertIntArrToString(int[] arr){
        String outString = "";
        for (int i = 0; i < arr.length; i++) {
            outString += Integer.toString(arr[i]) + " ";
        }
        return outString;
    }
}
