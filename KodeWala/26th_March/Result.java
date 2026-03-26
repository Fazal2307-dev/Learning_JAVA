class Result{
    public static void main(String[] args){
        Result result = new Result();
        String userInputStr = args[0];
        int userInputInt = Integer.parseInt(userInputStr);
        result.passOrFail(userInputInt);
    }
    public void passOrFail(int marks){
        if(marks >85){
            System.out.println("First Division with D :");
        }else if(marks >= 60 && marks <85){
            System.out.println("First Division :");
        } else if(marks >= 45 && marks <60){
            System.out.println("Second Division :");
        } else if(marks >= 30  && marks<45){
            System.out.println("Third Division :");
        } else{
            System.out.println("Faild :");
        }
    }
}