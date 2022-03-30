package game.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Progect1  extends JFrame {
    int ranomNum, guess;
    private  JButton jButton;
    private JTextField  jTextField;
    private JLabel promptLabel;
    private JLabel promptResult;
    private JLabel promptRandom;

    public Progect1() {
        setLayout(new FlowLayout());

        promptLabel = new JLabel("Enter a random number 1-20");
        add(promptLabel);

        jTextField = new JTextField(5);
        add(jTextField);

        jButton = new JButton("Guess");
        add(jButton);

        promptResult = new JLabel(" ");
        add(promptResult);

        promptRandom = new JLabel(" ");
        add(promptRandom);

        event e = new event();
        jButton.addActionListener(e);

    }
    public class event implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            ranomNum =(int)(Math.random()*20+1);
            try {
                guess =(int)(Double.parseDouble(jTextField.getText()));
                if(guess ==ranomNum){
                    promptResult.setText("Вы выйгрли!");
                }else if(guess!=ranomNum){
                    promptResult.setText("Вы проиграли!");
                }
                promptRandom.setText("рандомное число было ровно"+ranomNum);
            }catch (Exception exception){
                promptRandom.setText("Пожалуйста введите число");

            }
        }
    }

    public static void main(String[] args) {
        Progect1 progect1 = new Progect1();
        progect1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        progect1.setVisible(true);
        progect1.setSize(300,200);
        progect1.setTitle("Игра на везение");
    }


    }

