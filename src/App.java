/**
 * Running GUI by application.
 * Use ConverterUI for running.
 * @author Chayanin Punjakunaporn
 *
 */
public class App {
	public static UnitConverter unitconverter = new UnitConverter();
	
	public static void main(String[] args){
		ConverterUI converter = new ConverterUI(unitconverter);
		converter.run();
	}
}
