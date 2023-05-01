package br.edu.uniavan.entities;

public class Employee extends Worker{
    private static Integer count = 0;
    protected Integer id;
    private final EducationLevel schoolLevel = EducationLevel.FUNCIONAL;

    public EducationLevel getSchoolLevel() {
        return schoolLevel;
    }

    public Employee() {
        super();
        this.id = this.newId();
    }
    
    public Employee(String name){
        super(name);
        this.id = newId();
    }

    private Integer newId(){
        count++;
        return count;
    }

    public Integer getId() {
        return this.id;
    }
}
