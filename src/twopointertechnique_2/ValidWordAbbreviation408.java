package twopointertechnique_2;

public class ValidWordAbbreviation408 {

	public boolean validWordAbbreviation(String word, String abbr) {
		int i = 0, j = 0;
		while (i < word.length() && j < abbr.length()) {
			char c1 = word.charAt(i), c2 = abbr.charAt(j);
			if (c2 > '0' && c2 <= '9') {
				int cnt = 0;
				while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
					cnt = 10 * cnt + abbr.charAt(j) - '0';
					j++;
				}
				i += cnt;
			} else if (c1 != c2)
				return false;
			else {
				i++;
				j++;
			}
		}

		return i == word.length() && j == abbr.length();
	}

}
