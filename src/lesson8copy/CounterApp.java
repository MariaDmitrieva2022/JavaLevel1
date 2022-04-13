package lesson8copy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue) {
        setBounds(1000, 300, 400, 250);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        // Дополнительный слой
        JPanel additionalLayer = new JPanel();
        additionalLayer.setLayout(new BorderLayout());

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);

        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));


        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);

        JButton cleenButton = new JButton("сбросить счетчик");
        cleenButton.setFont(font);

        JButton plusTenButton = new JButton("+10");
        plusTenButton.setFont(font);

        JButton minusTenButton = new JButton("-10");
        minusTenButton.setFont(font);

        add(cleenButton, BorderLayout.NORTH);

        // Добавить элементы на дополнительный слой
        additionalLayer.add(decrementButton, BorderLayout.WEST);
        additionalLayer.add(incrementButton, BorderLayout.EAST);
        additionalLayer.add(counterValueView, BorderLayout.CENTER);

        add(minusTenButton, BorderLayout.WEST);
        add(plusTenButton, BorderLayout.EAST);

        // Сам новый слой добавить на основной слой
        add(additionalLayer, BorderLayout.CENTER);

        plusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        minusTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        cleenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new CounterApp(0);
    }
}