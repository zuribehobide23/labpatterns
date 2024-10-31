package factory;

import domain.Covid19Pacient;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1 = new Covid19Pacient("aitor", 35);
		PacientSymptomGUI psGUI1 = new PacientSymptomGUI(p1);
		Medicament m = new Medicament("Ibuprofeno");
		MedicalGUI mgui = new MedicalGUI(m);
	}
}
