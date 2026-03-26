package pos.File1;

public class Result{
        public void CheckResult(int marks){
            if(marks >= 85){
                System.out.println("First Division plus D :");
            } else if(marks >= 60 && marks<85){
                System.out.println("First Division :");
            } else if(marks >= 45 && marks <60){
                System.out.println("Second Division :");
            } else if (marks >= 30 && marks <45){
                System.out.println("Third Division :");
            } else{
                System.out.println("Failed :");
            }
        }

}