import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterUI extends JFrame {
	private JButton convertButton,clearButton;
	private JComboBox<Unit> unit1ComboBox,unit2ComboBox;
	private JLabel equalLabel;
	private JPanel contents,changeModeContents;
	private JTextField inputField1,inputField2;
	private UnitConverter unitconverter;
	//
	
	public ConverterUI(UnitConverter uc){
		this.unitconverter = uc;
		this.setTitle("Length Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	private void initComponents(){
		//this.setLayout(new BoxLayout(null, BoxLayout.Y_AXIS));
		this.setLayout(new BorderLayout());
		contents = new JPanel(new FlowLayout());
		changeModeContents = new JPanel(new FlowLayout());
		this.add(contents);
		convertButton = new JButton("Convert!");
		clearButton = new JButton("Clear");
		unit1ComboBox = new JComboBox<Unit>(unitconverter.getUnits());
		unit2ComboBox = new JComboBox<Unit>(unitconverter.getUnits());
		equalLabel = new JLabel("=");
		inputField1 = new JTextField("",10);
		inputField2 = new JTextField("",10);
		//
		//
		contents.add(inputField1);
		contents.add(unit1ComboBox);
		contents.add(equalLabel);
		contents.add(inputField2);
		contents.add(unit2ComboBox);
		contents.add(convertButton);
		contents.add(clearButton);
		ActionListener listener = new ConvertButtonListener();
		convertButton.addActionListener(listener);
		this.pack();
	}
	public void run(){
		this.setVisible(true);
	}
	
	class ConvertButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			String s = inputField1.getText().trim();
			System.out.println("actionPerformed: input="+s);
			if(s.length()>0){
				try{
					double value = Double.valueOf(s);
					double result = unitconverter.convert(value,(Unit)unit1ComboBox.getSelectedItem(),(Unit)unit2ComboBox.getSelectedItem());
					inputField2.setText(String.format("%.2f", result));
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,"Eggs are not supposed to be green.","A plain message",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
	}

}
