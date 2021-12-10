package in.edu.scse.xim.numpy;

import java.util.Scanner;

public class CodeRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of your first Array");
        int dim = scan.nextInt();
        NDArray arr = new NDArray(dim);
    }
}
