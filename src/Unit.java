/**
 * Collect data about unit.
 * Class that use this interface can call these method for get data.
 * @author Chayanin Punjakunaporn
 *
 */
public interface Unit {
	/**
	 * Get value of unit.
	 * @return value
	 */
	double getValue();
	/**
	 * Get name of unit.
	 * @return unit string
	 */
	String toString();
}
