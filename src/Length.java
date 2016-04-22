/**
 * Enum Length that implements Unit interface
 * @author Chayanin Punjakunaporn
 *
 */
public enum Length implements Unit {
	
	/** Constant */
	METER("Meter", 1.0),
	CENTIMETER("Centimeter", 0.01),
	KILOMETER("Kilometer", 1000),
	MILE("Mile", 1609.344),
	INCH("Inch", 0.0254),
	FOOT("Foot", 0.3048),
	YARD("Yard", 0.9144),
	MICRON("Micron", 1.0e-6),
	WA("Wa", 2.0);

	public final String name;
	public final double value;
	
	/** Constructor */
	Length(String name, double value){
		this.name = name;
		this.value = value;
	}
	/**
	 * @return value of length
	 */
	public double getValue(){
		return value;
	}
	/**
	 * @return name of length
	 */
	public String toString(){
		return String.format("%s", name);
	}
}