
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPopulacao implements Comparator<Map.Entry<String, Siglas>> {

    @Override
    public int compare(Entry<String, Siglas> o1, Entry<String, Siglas> o2) {
        Siglas populacao1 = o1.getValue();
        Siglas populacao2 = o2.getValue();
        return Integer.compare(populacao1.getPopulacao(), populacao2.getPopulacao());

    }

}
