package factory;

import domain.Covid19Pacient;
import domain.Medicament;
import domain.Symptom;
import domain.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1 = new Covid19Pacient("aitor", 35);
		PacientSymptomGUI psGUI1 = new PacientSymptomGUI(p1);
		
		SymptomFactory fac = SymptomFactory.getInstance();
		Symptom mareos = fac.createSymptom("Mareos", 1);
		
		fac.createSymptom("Mareos", 1);
		
        if (mareos != null) {
            p1.addSymptomByName(mareos.getName(), 1);
            System.out.println("Sintoma ondo inplementatu da");
        } else {
            System.out.println("Sintoma ez da ondo inplementatu");
        }
	}
}
