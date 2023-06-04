package studentrecord;

import java.awt.PopupMenu;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Color;
import java.awt.Font;

public class FinalsProject extends JFrame implements ActionListener {
  JFrame frame1, frame2;
  JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14, label15;
  JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9, textField10, textField11;
  JButton button1, button2, button3;
  JTextArea textArea;

  public FinalsProject() {

    frame1 = new JFrame("Student Record ");
   
    label1 = new JLabel("FINAL PROJECT");
    label1.setBounds(150, 50, 200, 30);
    label1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24));
    label1.setForeground(Color.YELLOW);
    
    label1.setHorizontalAlignment(SwingConstants.CENTER);

    label2 = new JLabel("(N) New Student Record");
    label2.setBounds(150, 100, 200, 30);
    label2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
    label2.setForeground(Color.YELLOW);
    label2.setHorizontalAlignment(SwingConstants.CENTER);

    
    label3 = new JLabel("(O) Open Student Record");
    label3.setBounds(150, 150, 200, 30);
    label3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
    label3.setForeground(Color.YELLOW);
    label3.setHorizontalAlignment(SwingConstants.CENTER);

    
    label4 = new JLabel("(X) Exit");
    label4.setBounds(150, 200, 200, 30);
    label4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 17));
    label4.setForeground(Color.YELLOW);
    label4.setHorizontalAlignment(SwingConstants.CENTER);
  
    button1 = new JButton("Choose");
    button1.setBounds(211, 250, 80, 30);
    
    button1.addActionListener(this);
    frame1 = new JFrame();
    frame1.add(label1);
    frame1.add(label2);
    frame1.add(label3);
    frame1.add(label4);	
    frame1.add(button1);
    frame1.setSize(500, 400);
    frame1.setLayout(null);
    frame1.setLocationRelativeTo(null); // center the frame
    frame1.setVisible(true);
    
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\Beth\\Downloads\\op1 (1).png");
    JLabel imageLabel = new JLabel(imageIcon);
    frame1.add(imageLabel);
    imageLabel.setBounds(0, 0, frame1.getWidth(), frame1.getHeight());
    


    
    
    frame2 = new JFrame("Enter Student Record");
 
    


    
    label5 = new JLabel("Enter Your Filename:");
    label5.setBounds(50, 50, 200, 30);
    label5.setFont(new Font("Times New Roman", Font.BOLD, 16));

    label6 = new JLabel("Student No:");
    label6.setBounds(50, 100, 200, 30);
    label6.setFont(new Font("Times New Roman", Font.BOLD, 16));

    label7 = new JLabel("Degree:");
    label7.setBounds(50, 150, 200, 30);
    label7.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label8 = new JLabel("Year Level:");
    label8.setBounds(50, 200, 200, 30);
    label8.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label9 = new JLabel("First Name:");
    label9.setBounds(50, 250, 200, 30);
    label9.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label10 = new JLabel("Middle Name:");
    label10.setBounds(50, 300, 200, 30);
    label10.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label11 = new JLabel("Last Name:");
    label11.setBounds(50, 350, 200, 30);
    label11.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label12 = new JLabel("Gender:");
    label12.setBounds(50, 400, 200, 30);
    label12.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label13 = new JLabel("Prelim Grade:");
    label13.setBounds(50, 450, 200, 30);
    label13.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label14 = new JLabel("Midterm Grade:");
    label14.setBounds(50, 500, 200, 30);
    label14.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    label15 = new JLabel("Finals Grade:");
    label15.setBounds(50, 550, 200, 30);
    label15.setFont(new Font("Times New Roman", Font.BOLD, 16));
    
    textField1 = new JTextField();
    textField1.setBounds(200, 50, 150, 30);

    textField2 = new JTextField();
    textField2.setBounds(200, 100, 150, 30);

    textField3 = new JTextField();
    textField3.setBounds(200, 150, 150, 30);

    textField4 = new JTextField();
    textField4.setBounds(200, 200, 150, 30);

    textField5 = new JTextField();
    textField5.setBounds(200, 250, 150, 30);

    textField6 = new JTextField();
    textField6.setBounds(200, 300, 150, 30);

    textField7 = new JTextField();
    textField7.setBounds(200, 350, 150, 30);

    textField8 = new JTextField();
    textField8.setBounds(200, 400, 150, 30);

    textField9 = new JTextField();
    textField9.setBounds(200, 450, 150, 30);

    textField10 = new JTextField();
    textField10.setBounds(200, 500, 150, 30);

    textField11 = new JTextField();
    textField11.setBounds(200, 550, 150, 30);

    button2 = new JButton("Save");
    button2.setBounds(100, 600, 80, 30);
    button2.addActionListener(this);

    button3 = new JButton("Quit");
    button3.setBounds(250, 600, 80, 30);
    button3.addActionListener(this);

    textArea = new JTextArea();
    textArea.setBounds(400, 50, 300, 500);

    frame2.add(label5);
    frame2.add(label6);
    frame2.add(label7);
    frame2.add(label8);
    frame2.add(label9);
    frame2.add(label10);
    frame2.add(label11);
    frame2.add(label12);
    frame2.add(label13);
    frame2.add(label14);
    frame2.add(label15);
    frame2.add(textField1);
    frame2.add(textField2);
    frame2.add(textField3);
    frame2.add(textField4);
    frame2.add(textField5);
    frame2.add(textField6);
    frame2.add(textField7);
    frame2.add(textField8);
    frame2.add(textField9);
    frame2.add(textField10);
    frame2.add(textField11);
    frame2.add(button2);
    frame2.add(button3);
    frame2.add(textArea);
    frame2.setSize(800, 700);
    frame2.setLayout(null);
    frame2.setLocationRelativeTo(null);
    frame2.setVisible(false);
    
    ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\Beth\\Downloads\\bgcolor (1).png");
    JLabel imageLabel1 = new JLabel(imageIcon1);
    frame2.add(imageLabel1);
    imageLabel1.setBounds(0, 0, frame2.getWidth(), frame2.getHeight());
    
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      String choice = JOptionPane.showInputDialog(frame1, "Enter Your Choice:");
      if (choice != null && choice.equalsIgnoreCase("N")) {
        frame2.setVisible(true);
      } else if (choice != null && choice.equalsIgnoreCase("O")) {
        String filename = JOptionPane.showInputDialog(frame1, "Enter Filename:");

        try {
          BufferedReader br = new BufferedReader(new FileReader(filename));
          String line;
          while ((line = br.readLine()) != null) {
            textArea.append(line + "\n");
          }
          br.close();
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(frame1, "File Not Found");
        }
      } else if (choice != null && choice.equalsIgnoreCase("X")) {
        System.exit(0);
      } else {
        JOptionPane.showMessageDialog(frame1, "Invalid Choice");
      }
    }

    if (e.getSource() == button2) {
      String filename = textField1.getText();
      String studentNo = textField2.getText();
      String degree = textField3.getText();
      String yearLevel = textField4.getText();
      String firstName = textField5.getText();
      String middleName = textField6.getText();
      String lastName = textField7.getText();
      String gender = textField8.getText();
      String prelimGrade = textField9.getText();
      String midtermGrade = textField10.getText();
      String finalGrade = textField11.getText();

      try {
       
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true));
        bw.write(filename + "\n" + "Student NO.: " + studentNo + "\n" + "Degree: " + degree + "\n" + "Year Level: " + yearLevel + "\n" + "First Name: " + firstName + "\n" + "Middle Name: " + middleName + "\n" +
          "Last Name: " + lastName + "\n" + "Gender: " + gender + "\n" + "Prelim Grade: " + prelimGrade + "\n" + "Midterm Grade: " + midtermGrade + "\n" + "Final Grade: " + finalGrade + "\n");
        bw.close();
        JOptionPane.showMessageDialog(frame2, "Record Saved Successfully");
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(frame2, "Error Saving Record");
      }

      textField2.setText("");

      textField3.setText("");

      textField4.setText("");

      textField5.setText("");

      textField6.setText("");

      textField7.setText("");

      textField8.setText("");

      textField9.setText("");

      textField10.setText("");

      textField11.setText("");

    }

    if (e.getSource() == button3) {
      int result = JOptionPane.showConfirmDialog(frame2, "Are you sure you want to quit?", "Confirm",
        JOptionPane.YES_NO_OPTION);
      if (result == JOptionPane.YES_OPTION) {
        frame2.dispose();
      }
    }
  }

  public static void main(String[] args) {
    new FinalsProject();
  }
}
 