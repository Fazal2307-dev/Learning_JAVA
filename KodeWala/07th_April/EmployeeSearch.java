import java.util.*;
public class EmployeeSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] employee = new String[4];
        employee[0]="mohit";
        employee[1]="Fazal";
        employee[2]="Afzal";
        employee[3]="Rohit";
        System.out.println("Enter employee name to search :");
        String searchName = sc.nextLine();
        boolean  found = false;
        for(int i =0;i<employee.length;i++){
            if(employee[i].equalsIgnoreCase(searchName)){
                System.out.println("Employee found at [" + i + "] :"+employee[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Employee with name "+searchName+"not found.");
        }
        sc.close();
    }
}