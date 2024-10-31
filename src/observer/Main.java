package observer;

import java.util.Observable;
import domain.Covid19Pacient;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient1 = new Covid19Pacient("Aitor", 35);
		Observable pacient2 = new Covid19Pacient("Leire", 28);
		Observable pacient3 = new Covid19Pacient("Unai", 42);

		new PacientSymptomGUI((Covid19Pacient) pacient1);
        new PacientObserverGUI(pacient1);
        new PacientThermometerGUI(pacient1);
        new SemaphorGUI(pacient1);
        
        new PacientSymptomGUI((Covid19Pacient) pacient2);
        new PacientObserverGUI(pacient2);
        new PacientThermometerGUI(pacient2);
        new SemaphorGUI(pacient2);
        
        new PacientSymptomGUI((Covid19Pacient) pacient3);
        new PacientObserverGUI(pacient3);
        new PacientThermometerGUI(pacient3);
        new SemaphorGUI(pacient3);
	}
}

