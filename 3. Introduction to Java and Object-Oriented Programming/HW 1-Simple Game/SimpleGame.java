import java.util.Scanner;

public class SimpleGame {

	public String convertTime(int seconds){
        int sec, temp,min, hours;
        String s1="-1:-1:-1";
        String s2="0:0:0";
        if(seconds<0){
            System.out.println(s1);
            return s1;
        }
        else if (seconds == 0){
            System.out.println(s2);
            return s2;
        }
        else{
            sec= seconds%60;
            temp = seconds/60;
            min= temp%60;
            hours = temp/60;
        
            String hhmmss = hours+":"+min+":"+sec ;
            System.out.println(hhmmss);
		    return hhmmss;
        }
        
    }

	public int digitsSum(int input){
        int sum=0,rem;
        while(input>0)
        {
            rem=input%10;
            sum=sum+rem;
            input=input/10;
        }
        System.out.println("Sum of the digits: "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		SimpleGame SG = new SimpleGame();
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1/2");
        System.out.println("1: Convert second into hours, minutes, and seconds");
        System.out.println("2: calculate the sum of all digits in an integer");
        int choice = sc.nextInt();
        
        if (choice ==1){
            System.out.println("Enter seconds: ");
            int second=sc.nextInt();
            SG.convertTime(second);
        }
        else if(choice==2){
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            SG.digitsSum(num);
        }
        else{
            System.out.println("Wrong Choice :-(");
        }
		sc.close();
	}
}