
import java.util.Scanner;

class BigElement{ 
    void Element(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Elment :");
        int x= sc.nextInt();
          int count=0;
        int [] num ={2,5,4,3,5,6,7,4,2,9};
        for(int i=0;i<num.length;i++){
            if(x>num[i]){
                count++;
                // System.out.println("Array me big number is :"+ count);

            }
        }
        System.out.println("Array me big number is :"+ count);
    }
}
public class ArrayBigElement{
 public static void main(String[] args) {
    BigElement obj = new BigElement();
    obj.Element();
     
 }
}