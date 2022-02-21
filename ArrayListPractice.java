import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();
    System.out.println("Enter 5 numbers and press enter in between each entry: ");
    for(int i = 0; i < 5; i++)
      list.add(sc.nextDouble());
    
    System.out.println("The sum of the numbers is : " + sum(list));
  
  }
  
  public static double sum(ArrayList<Double> list) {
    double sum = 0.0;
    for(int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
  

}
