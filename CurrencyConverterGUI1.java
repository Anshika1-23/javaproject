import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.*;

public class CurrencyConverterGUI1 implements ActionListener {

    private HashMap<String, Double> currencies;
    private JFrame frame;
    private JLabel fromLabel, toLabel, amountLabel, resultLabel;
    private JTextField amountField;
    private JComboBox<String> fromBox, toBox;
    private JButton convertButton;

    public CurrencyConverterGUI1() {
        currencies = new HashMap<String, Double>();
        currencies.put("USD", 1.0);
        currencies.put("EUR", 0.83);
        currencies.put("GBP", 0.71);
        currencies.put("JPY", 109.29);
        currencies.put("CAD", 1.26);
        currencies.put("AUD", 1.30);
        currencies.put("CHF", 0.91);
        currencies.put("INR", 74.22);

        frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        fromLabel = new JLabel("From currency:");
        fromLabel.setBounds(300, 10, 100, 30);
        frame.add(fromLabel);

        fromBox = new JComboBox<String>(currencies.keySet().toArray(new String[currencies.size()]));
        fromBox.setBounds(400, 10, 100, 30);
        frame.add(fromBox);

        toLabel = new JLabel("To currency:");
        toLabel.setBounds(300, 50, 100, 30);
        frame.add(toLabel);

        toBox = new JComboBox<String>(currencies.keySet().toArray(new String[currencies.size()]));
        toBox.setBounds(400, 50, 100, 30);
        frame.add(toBox);

        amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(300, 90, 100, 30);
        frame.add(amountLabel);

        amountField = new JTextField();
        amountField.setBounds(400, 90, 100, 30);
        frame.add(amountField);

        convertButton = new JButton("Convert");
        convertButton.setBounds(350, 130, 100, 30);
        convertButton.addActionListener(this);
        frame.add(convertButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(350, 160, 200, 30);
        frame.add(resultLabel);

        toLabel = new JLabel("Currency name");
        toLabel.setBounds(350, 190, 100, 30);
        frame.add(toLabel);

        toLabel = new JLabel("USD - United States Dollar");
        toLabel.setBounds(250, 220, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("EUR - Euro");
        toLabel.setBounds(250, 250, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("GBP - Pound sterling");
        toLabel.setBounds(250, 280, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("JPY - Japanese Yen");
        toLabel.setBounds(250, 310, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("CAD - Canadian Dollar");
        toLabel.setBounds(250, 340, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("AUD - Australian Dollar");
        toLabel.setBounds(250, 370, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("CHF - Swiss Franc");
        toLabel.setBounds(250, 400, 200, 30);
        frame.add(toLabel);

        toLabel = new JLabel("INR - Indian Rupee");
        toLabel.setBounds(250, 430, 200, 30);
        frame.add(toLabel); 
        
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String from = fromBox.getSelectedItem().toString();
        String to = toBox.getSelectedItem().toString();
        double amount = Double.parseDouble(amountField.getText());
        double result = convert(from, to, amount);
        DecimalFormat df = new DecimalFormat("#.##");
        resultLabel.setText(df.format(amount) + " " + from + " = " + df.format(result) + " " + to);
    }

    private double convert(String from, String to, double amount) {
        double rateFrom = currencies.get(from);
        double rateTo = currencies.get(to);
        return (amount / rateFrom) * rateTo;
    }

    public static void main(String[] args) {
        new CurrencyConverterGUI1();
    }

}