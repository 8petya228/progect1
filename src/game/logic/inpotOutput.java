package game.logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class inpotOutput extends JFrame {

    JLabel jLabel;
    JTextField textF;
    JButton button;

    public inpotOutput() {
        setLayout(new FlowLayout());
        jLabel = new JLabel("Enter text");
        add(jLabel);

        textF = new JTextField(10);
        add(textF);

        button = new JButton("Write to file");
        add(button);

        event e = new event();
        button.addActionListener(e);
    }
    public class  event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String word = textF.getText();
                FileWriter fileWriter = new FileWriter("C:\\Users\\kiril\\OneDrive\\Рабочий стол\\textSave\\file.txt");
                BufferedWriter out = new BufferedWriter(fileWriter);
                out.write(word);
                out.close();
            } catch (Exception ex) {
            }
        }
    }
        public static void main(String[] args) {
            inpotOutput GUI =new inpotOutput();
            GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GUI.setSize(400,200);
            GUI.setTitle("Progect 1");
            GUI.setVisible(true);

        }
    }




