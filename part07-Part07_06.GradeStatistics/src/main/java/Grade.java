import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> points;
    private int allPoints;
    private int passingPoints;
    private int passCount;

    public Grade() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int points) {
        if (points >= 0 && points < 100) {
            this.points.add(points);
            this.allPoints += points;
        }

        if (points >= 50 && points < 100) {
            this.passingPoints += points;
            this.passCount++;
        }
    }

    public double pointAverage() {
        if (this.points.isEmpty())
            return 0.0;
        return (double) this.allPoints / this.points.size();
    }

    public String passingAverage() {
        if (this.passingPoints == 0) {
            return "-";
        }

        return String.format("%.1f", (double) this.passingPoints / this.passCount);
    }

    public double passingPercentage() {
        if (this.points.isEmpty())
            return 0.0;
        return ((double) this.passCount / this.points.size()) * 100;
    }

    public void distribution() {
        int[] gradeDistribution = new int[6];

        for (int point : points) {
            if (point < 50) {
                gradeDistribution[0]++;
            } else if (point < 60) {
                gradeDistribution[1]++;
            } else if (point < 70) {
                gradeDistribution[2]++;
            } else if (point < 80) {
                gradeDistribution[3]++;
            } else if (point < 90) {
                gradeDistribution[4]++;
            } else {
                gradeDistribution[5]++;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
