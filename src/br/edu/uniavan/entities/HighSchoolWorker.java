package br.edu.uniavan.entities;

public class HighSchoolWorker extends MiddleSchoolWorker{
    private final EducationLevel schoolLevel = EducationLevel.MEDIO;
    private static final double BONUS_PERCENTAGE = 0.5;

    public HighSchoolWorker() {}

    public HighSchoolWorker(String name){
        super(name);
    }

    @Override
    public double getIncome() {
        double income = super.getIncome();
        return income + income * BONUS_PERCENTAGE;
    }

    @Override
    public EducationLevel getSchoolLevel() {
        return schoolLevel;
    }
}
