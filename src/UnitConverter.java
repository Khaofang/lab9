/**
 * Convert the first unit to the second by the converter.
 * Use unit from Unit interface.
 * @author Chayanin Punjakunaporn
 *
 */
public class UnitConverter {
	
	/**
	 * Convert this amount to new amount with new unit.
	 * @param amount amount of formal unit
	 * @param fromUnit formal unit
	 * @param toUnit new unit for converter
	 * @return new amount in new unit
	 */
	public double convert(double amount, Unit fromUnit, Unit toUnit){
		return amount*(fromUnit.getValue()/toUnit.getValue());
	}
	/**
	 * Get all of unit.
	 * @return all of unit in arrays
	 */
	public Unit[] getUnits(){
		return Length.values();
	}
}
