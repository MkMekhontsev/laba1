package org.example;

import java.time.LocalDate;

public class Treatment {
    public Doctor doctor;
    public Patient patient;
    public String disease, pills;
    public LocalDate startDate, endDate;
    public boolean isActive;

    public Treatment(Doctor doctor, Patient patient, String pills) {
        this.doctor = doctor;
        this.patient = patient;
        this.disease = patient.disease;
        this.pills = pills;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusDays(10);
        this.isActive = true;
    }

    public void showTreatment() {
        System.out.println("Пациент: " + patient.name + " " + patient.surname);
        System.out.println("Болезнь: " + disease);
        System.out.println("Врач: " + doctor.name);
        System.out.println("Лекарства: " + pills);
        System.out.println("Срок: " + startDate + " — " + endDate);
        System.out.println("Статус: " + (isActive ? "Активно" : "Завершено"));
    }

    public boolean isFinished() {
        return LocalDate.now().isAfter(endDate);
    }

    public void finishTreatment() {
        this.endDate = LocalDate.now();
        this.isActive = false;
        patient.recovered();
    }

    public void changePills(String newPills) {
        this.pills = newPills;
    }

    @Override
    public String toString() {
        return "Лечение: " + disease + ", пациент: " + patient.name +
                ", врач: " + doctor.name + ", лекарства: " + pills;
    }
}
