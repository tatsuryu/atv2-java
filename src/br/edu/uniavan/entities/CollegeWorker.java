package br.edu.uniavan.entities;

public class CollegeWorker extends HighSchoolWorker{
    private final EducationLevel schoolLevel = EducationLevel.UNIVERSIDADE;
    private static final double BONUS_PERCENTAGE = 1.0;

    public CollegeWorker() {}

    public CollegeWorker(String name){
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
