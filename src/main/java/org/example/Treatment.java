package org.example;

public class Treatment {
    public Doctor doctor;
    public Patient patient;
    public String disease, pills;
    public Treatment(Doctor doctor, Patient patient, String pills){
        this.doctor = doctor;
        this.patient = patient;
        this.disease = patient.disease;
        this.pills = pills;
    }

    public void showTreatment(){
        System.out.println(pills);
    }
}
