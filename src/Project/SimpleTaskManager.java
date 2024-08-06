package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//настолно приложение на Java, което позволява на потребителите да добавят, премахват и маркират задачи като изпълнени.
public class SimpleTaskManager extends JFrame {
    // Деклариране на компонентите
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInputField;
    private JButton addButton;
    private JButton removeButton;
    private JButton markAsDoneButton;

    public SimpleTaskManager() {
        // Настройки на главния прозорец
        setTitle("Simple Task Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Инициализиране на компонентите
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        taskInputField = new JTextField(20);
        addButton = new JButton("Добави");
        removeButton = new JButton("Премахни");
        markAsDoneButton = new JButton("Маркирай като завършена");

        // Панел за въвеждане на задачи
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskInputField);
        inputPanel.add(addButton);

        // Панел за управление на задачи
        JPanel managePanel = new JPanel();
        managePanel.add(markAsDoneButton);
        managePanel.add(removeButton);

        // Добавяне на панели към главния прозорец
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(managePanel, BorderLayout.SOUTH);

        // Добавяне на слушатели за бутоните
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInputField.getText();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskInputField.setText("");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskListModel.remove(selectedIndex);
                }
            }
        });

        markAsDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    String task = taskListModel.getElementAt(selectedIndex);
                    taskListModel.set(selectedIndex, task + " (завършена)");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleTaskManager().setVisible(true);
            }
        });
    }
}