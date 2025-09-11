package org.example;

public class Patient {
    public String name, surname, disease;
    public int age;
    public Doctor doctor;
    public Patient(String name, String surname, String disease, int age, Doctor doctor){
        this.name = name;
        this.surname = surname;
        this.disease = disease;
        this.age = age;
        this.doctor = doctor;
    }

    public void changeDoctor(Doctor doctor){//смена доктора
        this.doctor = doctor;
    }

    public void getOld(){//старение пациента
        this.age++;
    }

    public void recovered(){//выписка(выздоровление)
        this.doctor = null;
        this.disease = null;
    }
}
