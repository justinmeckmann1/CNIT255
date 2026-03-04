
public class Manager extends Employee {

    private double bonus;

//    public Manager() {   }

    public Manager(String aName, double aSalary, int year, int month, int day) {
        super(aName, aSalary, year, month, day);
        /*If not explicit call to superclass constructor,
        * no-arg constructor of superclass is invoked!*/
        bonus = 0;
    }
@Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
