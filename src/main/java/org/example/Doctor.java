package org.example;

public class Doctor {
    public String name, surname, post;
    public int age;
    public Doctor(String name, String surname, String post, int age){//конструктор
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.age = age;
    }

    public void showName(){//показ имени
        System.out.println(name);
        System.out.println(surname);
    }

    public void showPost(){//показ должности
        System.out.println(post);
    }

    public void changePost(String newPost){//смена должности
        this.post = newPost;
    }

    public void getOld(){//старение доктора
        this.age++;
    }
    public void dismiss(){//увольнение
        if(this.post != null){
            this.post = null;
        }
    }
}
