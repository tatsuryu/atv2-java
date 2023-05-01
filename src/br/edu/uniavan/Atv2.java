package br.edu.uniavan;

import java.util.HashMap;
import java.util.Set;

import br.edu.uniavan.entities.HighSchoolWorker;
import br.edu.uniavan.entities.Employee;
import br.edu.uniavan.entities.CollegeWorker;
import br.edu.uniavan.entities.MiddleSchoolWorker;

public class Atv2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new MiddleSchoolWorker("João"),
            new MiddleSchoolWorker("Maria"),
            new MiddleSchoolWorker("Gertrudes"),
            new MiddleSchoolWorker("Adamastor"),
            new HighSchoolWorker("Jurema"),
            new HighSchoolWorker("Etevaldo"),
            new HighSchoolWorker("Teobaldo"),
            new HighSchoolWorker("Quitéria"),
            new CollegeWorker("Elão Moska"),
            new CollegeWorker("Estive Jobe")
        };
        HashMap<String,Double> costsBySchoolLevel = new HashMap<String, Double>();
        Double TotalCost = 0.0;

        System.out.printf("%-5s %-17s %10s %16s\n","Id","Nome", "Salario", "Escolaridade");
        for (Employee e : employees){
            costsBySchoolLevel.put(
                e.getSchoolLevel().name(),
                costsBySchoolLevel.getOrDefault(e.getSchoolLevel().name(), 0.0) + e.getIncome()
            );
            System.out.printf(
                "%-5d %-20s %-8.2f %15s\n",
                e.getId(),
                e.name,
                e.getIncome(),
                e.getSchoolLevel()
            );
        }
        
        System.out.printf("\n%-20s %-20s\n", "Escolaridade", "Custo Total");

        Set<String> schoolLevels = costsBySchoolLevel.keySet();
        for(String sl: schoolLevels){
            TotalCost += costsBySchoolLevel.get(sl);
            System.out.printf(
                "%-20s %10.2f\n",
                sl, costsBySchoolLevel.get(sl)
            );
        }

        System.out.printf("Custo total: ");
        System.out.printf("%18.2f\n", TotalCost);
    }
}
