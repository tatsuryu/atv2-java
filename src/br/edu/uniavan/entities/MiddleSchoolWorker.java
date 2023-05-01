package br.edu.uniavan.entities;

public class MiddleSchoolWorker extends Employee {
    private final EducationLevel schoolLevel = EducationLevel.ESCOLA;
    private static final double BONUS_PERCENTAGE = 0.1;

    public MiddleSchoolWorker() {}

    public MiddleSchoolWorker(String name){
        super(name);
    }

    @Override
    public double getIncome(){
        double income = super.getIncome();
        return income + income * BONUS_PERCENTAGE;
    }
    
    @Override
    public EducationLevel getSchoolLevel() {
        return schoolLevel;
    }
}
