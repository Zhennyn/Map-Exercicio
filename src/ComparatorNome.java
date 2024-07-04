import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNome implements Comparator<Map.Entry<String, Siglas>> {

    @Override
    public int compare(Entry<String, Siglas> o1, Entry<String, Siglas> o2) {
        return o1.getValue().getSiglasEstado().compareToIgnoreCase(o1.getValue().getSiglasEstado());
    }

}
