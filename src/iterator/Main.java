package iterator;

import adapter3.SymptomNameComparator;
import adapter3.SeverityIndexComparator;
import domain.Covid19Pacient;
import domain.Symptom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Covid19Pacient p = new Covid19Pacient("Ane", 29);
        p.addSymptom(new Symptom("s1", 10, 10), 1);
        p.addSymptom(new Symptom("s2", 10, 10), 2);
        p.addSymptom(new Symptom("s3", 10, 10), 3);
        p.addSymptom(new Symptom("s4", 10, 10), 4);
        p.addSymptom(new Symptom("s5", 10, 10), 5);

        List<Symptom> symptomList = new ArrayList<>(p.getSymptoms());

        System.out.println("Izen arabera ordenatu:");
        Collections.sort(symptomList, new SymptomNameComparator());
        for (Symptom symptom : symptomList) {
            System.out.println(symptom);
        }

        System.out.println("Larritasun ideize arabera ordenatu");
        Collections.sort(symptomList, new SeverityIndexComparator());
        for (Symptom symptom : symptomList) {
            System.out.println(symptom);
        }
    }
}
