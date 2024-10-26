package zadan2;

import java.util.Comparator;
/**
 * Sortowanie przez telefon
 */
public class KontaktComparator implements Comparator<Kontakt>{

	@Override
	public int compare(Kontakt o1, Kontakt o2) {
		
		return o1.getTelefon().compareTo(o2.getTelefon());
		
		//dodac inne sortowania(funkcje)
	}
}