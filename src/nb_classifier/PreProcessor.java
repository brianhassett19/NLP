package nb_classifier;

/*
 * Contains an overloaded method 'clean' for cleaning a String or StringBuilder.
 */
public class PreProcessor {

	public StringBuilder clean(StringBuilder sb) {
		sb = convertToLowerCase(sb);
		sb = removeFullStops(sb);
		sb = removeCommas(sb);
		sb = removeColons(sb);
		sb = removeSemiColons(sb);

		return sb;
	}
	
	public String clean(String s) {
		StringBuilder sb = new StringBuilder(s);
	
		sb = clean(sb);
		s = sb.toString();
		
		return s;
	}
	
	public StringBuilder convertToLowerCase(StringBuilder sb) {
		String s = sb.toString();
		sb = new StringBuilder(s.toLowerCase());
		return sb;
	}

	public StringBuilder removeFullStops(StringBuilder sb) {
		String s = sb.toString();
		sb = new StringBuilder(s.replace(".", ""));
		return sb;
	}

	public StringBuilder removeCommas(StringBuilder sb) {
		String s = sb.toString();
		sb = new StringBuilder(s.replace(",", ""));
		return sb;
	}

	public StringBuilder removeColons(StringBuilder sb) {
		String s = sb.toString();
		sb = new StringBuilder(s.replace(":", ""));
		return sb;
	}

	public StringBuilder removeSemiColons(StringBuilder sb) {
		String s = sb.toString();
		sb = new StringBuilder(s.replace(";", ""));
		return sb;
	}
}
