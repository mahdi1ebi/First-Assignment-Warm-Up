public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        // TODO   
        int num = 1;
        for (int i = 2 ; i <= n ; i++){
            num = num * i;
        }
        return num;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        // TODO
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        char[][] arr = new char[rows][rows];
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j <= i ; j++){
                arr[i][j]='*';
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}
