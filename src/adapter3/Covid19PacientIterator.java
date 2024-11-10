package adapter3;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import domain.Symptom;

public class Covid19PacientIterator implements Iterator<Symptom> {
    List<Symptom> symptoms = new Vector<>();
    int position = 0;

    public Covid19PacientIterator(Set<Symptom> s) {
        Iterator<Symptom> i = s.iterator();
        while (i.hasNext())
            symptoms.add(i.next());
    }

    @Override
    public boolean hasNext() {
        return position < symptoms.size();
    }

    @Override
    public Symptom next() {
        Symptom symptom = symptoms.get(position);
        position++;
        return symptom;
    }
}