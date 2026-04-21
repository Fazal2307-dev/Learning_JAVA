class salary{
    public void calculateSalary(int base){
        System.out.println("your base salary will be: "+base);
    }
    public void calculateSalary(int base,int bonus){
        int baseBonus = base + bonus;
        System.out.println("your base salary will be: "+baseBonus);
    }
    public void calculateSalary(int base,int bonus,int incentives){
        int baseBonusIncentives = base + base+incentives;
        System.out.println("your base salary will be: "+baseBonusIncentives);
    }
}
public class Employee {
    public static void main(String[] args){
        salary em1 = new salary();
        em1.calculateSalary(12000);
        em1.calculateSalary(12000,2000);
        em1.calculateSalary(12000,2000,1200);
    }
}