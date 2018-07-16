/* Create a for statement using a range of numbers from 1 to 1000 inclusive.

Sum all the numbers that can be divided with both 3 and also with 5.

For those numbers that met the above conditions, print out the number.

break out of the loop once you find 5 numbers that met the above conditions.

After breaking out of the loop print the sum of the numbers that met the above conditions.

Note: Type all code in main method  */


public class Main {


    public static void main(String[] args) {
        // write your code here
        
		//define variables
		int counter = 0;
        int sum = 0;
        
		for(int i = 1; i < 1000; i++){
			//both conditions need too be met to enter if statement
            if(i%3==0 && i%5== 0){
                System.out.println("The value that is divisible by 3 or 5 is: " + i);

                //increase counter by 1
                counter++;

                //increase variable by i
                sum+=i;
                System.out.println("The sum is: " + sum);

                //breaking statement
                if(counter == 5){
                    break;
                }

            }
        }

    }

}