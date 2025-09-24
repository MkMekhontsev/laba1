package org.example;

import java.util.Vector;

public class Ward {
    private Vector<Patient> patients;
    private Vector<Treatment> treatments;

    public Ward() {
        patients = new Vector<>();
        treatments = new Vector<>();
    }

    public void addPatient(Patient patient) {//добавление больного
        this.patients.add(patient);
    }

    public void printSickPatients() {//вывод всех больных в палате
        System.out.println("Список больных пациентов:");
        for (Patient p : patients) {
            if (p.disease != null) { // если есть болезнь — значит болен
                System.out.println(p.name + " " + p.surname + " — " + p.disease);
            }
        }
    }

    public Vector<Patient> getPatients() {
        return patients;
    }

    public Vector<Treatment> getTreatments() {
        return treatments;
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }
}
