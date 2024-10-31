package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient1=new Covid19Pacient("aitor", 35);
		
		pacient1.addSymptomByName("disnea", 2);
		pacient1.addSymptomByName("cefalea", 1);
		pacient1.addSymptomByName("astenia", 3);
		
		ShowPacientTableGUI gui1=new ShowPacientTableGUI(pacient1);
		gui1.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui1.setVisible(true);
		
		Covid19Pacient pacient2=new Covid19Pacient("leire", 28);
		
		pacient2.addSymptomByName("fiebre", 1);
		pacient2.addSymptomByName("diarrea", 3);
		pacient2.addSymptomByName("mialgia", 2);
		
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
	}

}

