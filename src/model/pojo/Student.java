package model.pojo;

public class Student {
    private int registro;
    private String dni;
    private String name;
    private String surname1;
    private String surname2;

    public Student() {
        
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    @Override
    public String toString() {
        return registro + "#" + dni + "#" + name + "#" + surname1 + "#" + surname2;
    }
}
