package br.edu.uniavan.entities;

public class Employee extends Worker {
    public String name;
    protected Double basicIncome = 1000.0;
    private static Integer count = 0;
    protected Integer id;
    private final EducationLevel schoolLevel = EducationLevel.FUNCIONAL;
    

    public EducationLevel getSchoolLevel() {
        return schoolLevel;
    }

    public Employee() {
        this.id = this.newId();
    }
    
    public Employee(String name){
        this.id = newId();
        this.name = name;
    }

    private Integer newId(){
        count++;
        return count;
    }

    public Integer getId() {
        return this.id;
    }

    public double getIncome() {
        return this.basicIncome;
    }
}
