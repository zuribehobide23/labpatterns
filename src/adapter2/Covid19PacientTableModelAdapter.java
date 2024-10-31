package adapter2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
	}

	public int getColumnCount() {
		// Challenge!
		return columnNames.length;
	}

	public String getColumnName(int i) {
		// Challenge!
		return columnNames[i];
	}

	public int getRowCount() {
		// Challenge!
		return this.pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		// Challenge!
		List<Symptom> symptomsList = new ArrayList<>(this.pacient.getSymptoms());
		Symptom symptom = symptomsList.get(row);
        if (col == 0) {
            return symptom.getName();  
        } else if (col == 1) {
            return this.pacient.getWeight(symptom); 
        } else {
            return null;
        }
	}
}
