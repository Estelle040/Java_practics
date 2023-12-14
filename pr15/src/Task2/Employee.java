package Task2;

public class Employee {
    private int workExp;
    private boolean hasSpecEd;

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public boolean isHasSpecEd() {
        return hasSpecEd;
    }

    public void setHasSpecEd(boolean hasSpecEd) {
        this.hasSpecEd = hasSpecEd;
    }

    public double calculateSalary() {
        if (hasSpecEd) {
            return 1.5 * (5332 * workExp + 10000);
        }
        else {
            return 5332 * workExp + 10000;
        }
    }
}
