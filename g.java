import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class g extends JFrame implements ActionListener {
    Label l1 = new Label("CURRENCY CONVERTER");
    Label l2 = new Label("BY:");
    Label l3 = new Label("12107976-Bathini Sai Pranith");
    Label l4 = new Label("12105080-Anshika");
    Label l5 = new Label("12105290- Vasamsetti Vamsi Pradeep");
    Label l6 = new Label("TO:");
    Label l7 = new Label("Dr.Bhimsen Mohanrana");
    JButton b = new JButton("Go to Currency Converter");

    g() {
        setVisible(true);
        setSize(2000, 1500);
        setTitle("Currency Converter");
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(0, 255, 51));
        l1.setBounds(540, 75, 500, 300);
        add(l1);
        l2.setBounds(220, 500, 120, 30);
        add(l2);
        l3.setBounds(240, 530, 500, 30);
        add(l3);
        l4.setBounds(240, 570, 240, 30);
        add(l4);
        l5.setBounds(240, 610, 500, 30);
        add(l5);
        l6.setBounds(1050, 500, 120, 30);
        add(l6);
        l7.setBounds(1080, 530, 200, 30);
        add(l7);
        l1.setFont(new Font("Calbri", Font.BOLD, 32));
        l2.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        l3.setFont(new Font("calbri", Font.BOLD, 20));
        l4.setFont(new Font("calbri", Font.BOLD, 20));
        l5.setFont(new Font("calbri", Font.BOLD, 20));
        l6.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        l7.setFont(new Font("calbri", Font.BOLD, 20));
        b.setBounds(550, 450, 200, 30);
        b.addActionListener(this);
        add(b);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            new CurrencyConverterGUI1();
            dispose();
        }
    }

    public static void main(String arg[]) {
        new g();
    }
}