import java.util.Scanner;
public class Average {
  int marks;
    public void main(String[]args){
      Scanner x =  new Scanner(System.in);
      System.out.println("Enter the average");
      int n = x.nextInt();
      
      if (marks<0||marks<100) {
        System.out.println("You have entered the wrong marks");
      }
      else if (0<=marks && marks<40) {
        System.out.println("C");
      }
      else if (40<=marks && marks<70) {
        System.out.println("B");
      }
    }
}
