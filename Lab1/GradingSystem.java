public class GradingSystem {

    // 1. Nicht ausreichende Noten (weniger als 40)
    public int[] getFailingGrades(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }

        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;
    }

    // 2. Durchschnittswert berechnen
    public double getAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // 3. Noten nach den Rundungsregeln
    public int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = roundGrade(grades[i]);
        }
        return roundedGrades;
    }

    // Hilfsmethode zum Runden
    private int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }
        int nextMultipleOfFive = (grade + 4) / 5 * 5;
        if (nextMultipleOfFive - grade < 3) {
            return nextMultipleOfFive;
        } else {
            return grade;
        }
    }

    // 4. Höchste abgerundete Note
    public int getMaxRoundedGrade(int[] grades) {
        int max = 0;
        int[] roundedGrades = getRoundedGrades(grades);
        for (int grade : roundedGrades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
