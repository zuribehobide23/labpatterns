package domain;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class SymptomFactory {
	    private static SymptomFactory instance;
	    private Map<String, Symptom> symptoms = new HashMap<>();

	    public SymptomFactory() {}

	    public static SymptomFactory getInstance() {
	        if (instance == null) {
	            instance = new SymptomFactory();
	        }
	        return instance;
	    }

	    public Symptom createSymptom(String symptomName, int weight) {
	        if (symptoms.containsKey(symptomName)) {
	            return symptoms.get(symptomName);
	        }

	        java.util.List<String> impact5 = Arrays.asList("fiebre", "tos seca", "astenia", "expectoracion");
	        java.util.List<Double> index5 = Arrays.asList(87.9, 67.7, 38.1, 33.4);
	        java.util.List<String> impact3 = Arrays.asList("disnea", "dolor de garganta", "cefalea", "mialgia", "escalofrios");
	        java.util.List<Double> index3 = Arrays.asList(18.6, 13.9, 13.6, 14.8, 11.4);
	        java.util.List<String> impact1 = Arrays.asList("nauseas", "v�mitos", "congesti�n nasal", "diarrea", "hemoptisis", "congestion conjuntival");
	        java.util.List<Double> index1 = Arrays.asList(5.0, 4.8, 3.7, 0.9, 0.8);

	        java.util.List<String> digestiveSymptom = Arrays.asList("nauseas", "v�mitos", "diarrea");
	        java.util.List<String> neuroMuscularSymptom = Arrays.asList("fiebre", "astenia", "cefalea", "mialgia", "escalofrios");
	        java.util.List<String> respiratorySymptom = Arrays.asList("tos seca", "expectoracion", "disnea", "dolor de garganta", "congesti�n nasal", "hemoptisis", "congestion conjuntival");

	        int impact = 0;
	        double index = 0;

	        if (impact5.contains(symptomName)) {
	            impact = 5;
	            index = index5.get(impact5.indexOf(symptomName));
	        } else if (impact3.contains(symptomName)) {
	            impact = 3;
	            index = index3.get(impact3.indexOf(symptomName));
	        } else if (impact1.contains(symptomName)) {
	            impact = 1;
	            index = index1.get(impact1.indexOf(symptomName));
	        }

	        Symptom newSymptom = null;

	        if (impact != 0) {
	            if (digestiveSymptom.contains(symptomName)) {
	                newSymptom = new DigestiveSymptom(symptomName, (int) index, impact);
	            } else if (neuroMuscularSymptom.contains(symptomName)) {
	                newSymptom = new NeuroMuscularSymptom(symptomName, (int) index, impact);
	            } else if (respiratorySymptom.contains(symptomName)) {
	                newSymptom = new RespiratorySymptom(symptomName, (int) index, impact);
	            }
	        }

	        if (newSymptom != null) {
	            symptoms.put(symptomName, newSymptom);
	        }

	        return newSymptom;
	    }
}
