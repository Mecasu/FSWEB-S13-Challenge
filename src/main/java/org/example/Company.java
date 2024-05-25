package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames ;



    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Index dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: ArrayIndexOutOfBoundsException");
        }}


   public Company(int id, String name, double giro, String[] developerNames) {
            this.id = id;
            this.name = name;
            setGiro(giro);
            this.developerNames = developerNames;
        }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }

    }
}
