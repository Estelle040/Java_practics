package Task2;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public int getEmployeeWorkExp() {
        return model.getWorkExp();
    }

    public void setEmployeeWorkExp(int workExp) {
        model.setWorkExp(workExp);
    }

    public boolean getEmployeeSpecEd() {
        return model.isHasSpecEd();
    }

    public void setEmployeeSpecEd(boolean SpecEd) {
        model.setHasSpecEd(SpecEd);
    }

    public void updateView() {
        view.showSalary(model.calculateSalary());
    }
}
