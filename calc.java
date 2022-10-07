import java.util.Scanner;


class Calculator{
    public static void main(String[] args) {
        int a = 0;
        while(a == 0){
            System.out.println("Intial Input: ");
            Scanner ascan =  new Scanner(System.in);
            a = ascan.nextInt();
        }
        int b = 0;
        while(b ==0){
            System.out.println("Second Input: ");
            Scanner bscan = new Scanner(System.in);
            b = bscan.nextInt();
        }

        calc(a,b);
    }
    public static void calc(int a, int b) {
        String math = "";
        while(math  == ""){
            System.out.println("Enter Math Type: ex: +-*/");
            Scanner mathinp = new Scanner(System.in);
            math = mathinp.nextLine();
        }
        //System.out.println(math);
        int ans = 0;
        if(math.equalsIgnoreCase("+")){
            ans = a + b;
            String answer = String.valueOf(ans);
            System.out.println("Your answer is: " + answer);

        }else if(math.contains("-")){
            ans = a-b;
            String answer = Integer.toString(ans);
            System.out.println("Your answer is: " + answer);
        }  else if(math.contains("*")){
            ans = a*b;
            String answer = Integer.toString(ans);
            System.out.println("Your answer is: " + answer); 
        }  else if(math.contains("/")){
            ans = a/b;
            String answer = Integer.toString(ans);
            System.out.println("Your answer is: " + answer);            
        }else{
            System.out.println("Invalid Input");
        }
    } 
}