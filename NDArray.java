package in.edu.scse.xim.numpy;

import java.util.Scanner;
import java.util.*;

class NDArray {
    Scanner scan = new Scanner(System.in);

    public NDArray(int dim) {
        if (dim == 1) {
            Array1D();
        } else if (dim == 2) {
            Array2D();
        } else if (dim == 3) {
            Array3D();
        } else if (dim == 4) {
            Array5D();
        } else if (dim > 5) {
            System.out.println("Your Dimension exceeds the maximum possible dimension supported by this program.");
            System.out.println("The maximum dimension supported by this program is 5D");
        } else {
            System.out.println("Invalid Input !!!");
        }

    }

    private int[] Array1D() {
        System.out.println("Enter the shape of array");
        int l1 = scan.nextInt();
        int array1[] = new int[l1];
        int totalsize = l1;
        List<Integer> arrli1 = new ArrayList<Integer>(totalsize);
        System.out.println();
        int i = 0;
        for (int loop1 = 0; loop1 < l1; loop1++) {

            System.out.println("Enter element no." + (loop1 + 1));
            array1[loop1] = scan.nextInt();
            arrli1.add(i);
            i++;
        }
        System.out.println();
        System.out.println("Your 1D-array is :");
        for (int loop1 = 0; loop1 < l1; loop1++) {
            System.out.println(array1[loop1]);
        }
        return array1;
    }

    private int[][] Array2D() {
        System.out.println("Enter the shape of array");
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();

        int array2[][] = new int[l1][l2];
        int totalsize = l1 * l2;
        List<Integer> arrli2 = new ArrayList<Integer>(totalsize);
        System.out.println();
        int i = 0;
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {

                System.out.println("Enter element no." + (loop1 + 1) + "," + (loop2 + 1));
                array2[loop1][loop2] = scan.nextInt();
                arrli2.add(i);
                i++;
            }
        }
        System.out.println();
        System.out.println("Your 2D-array is :");
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                System.out.print(array2[loop1][loop2] + " ");
            }
            System.out.println();
        }
        return array2;
    }

    private int[][][] Array3D() {
        System.out.println("Enter the shape of array");
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();

        int array3[][][] = new int[l1][l2][l3];
        int totalsize = l1 * l2 * l3;
        List<Integer> arrli3 = new ArrayList<Integer>(totalsize);
        System.out.println();
        int i = 0;
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {

                    System.out.println("Enter element no." + (loop1 + 1) + "," + (loop2 + 1) + "," + (loop3 + 1));
                    array3[loop1][loop2][loop3] = scan.nextInt();
                    arrli3.add(i);
                    i++;
                }
            }
        }
        System.out.println();
        System.out.println("Your 3D-array is :");
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {
                    System.out.print(array3[loop1][loop2][loop3] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        return array3;
    }

    private int[][][][] Array4D() {
        System.out.println("Enter the shape of array");
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();
        int l4 = scan.nextInt();

        int array4[][][][] = new int[l1][l2][l3][l4];
        int totalsize = l1 * l2 * l3 * l4;
        List<Integer> arrli4 = new ArrayList<Integer>(totalsize);
        System.out.println();
        int i = 0;
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {
                    for (int loop4 = 0; loop4 < l4; loop4++) {

                        System.out.println("Enter element no." + (loop1 + 1) + "," + (loop2 + 1) + "," + (loop3 + 1)
                                + "," + (loop4 + 1));
                        array4[loop1][loop2][loop3][loop4] = scan.nextInt();
                        arrli4.add(i);
                        i++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Your 4D-array is :");
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {
                    for (int loop4 = 0; loop4 < l4; loop4++) {
                        System.out.print(array4[loop1][loop2][loop3][loop4] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();

        }
        return array4;
    }

    private int[][][][][] Array5D() {
        System.out.println("Enter the shape of array");
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();
        int l4 = scan.nextInt();
        int l5 = scan.nextInt();

        int array5[][][][][] = new int[l1][l2][l3][l4][l5];
        int totalsize = l1 * l2 * l3 * l4 * l5;
        List<Integer> arrli5 = new ArrayList<Integer>(totalsize);
        System.out.println();
        int i = 0;
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {
                    for (int loop4 = 0; loop4 < l4; loop4++) {
                        for (int loop5 = 0; loop5 < l5; loop5++) {

                            System.out.println("Enter element no." + (loop1 + 1) + "," + (loop2 + 1) + "," + (loop3 + 1)
                                    + "," + (loop4 + 1) + "," + (loop5 + 1));
                            array5[loop1][loop2][loop3][loop4][loop5] = scan.nextInt();
                            arrli5.add(i);
                            i++;
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Your 5D-array is :");
        for (int loop1 = 0; loop1 < l1; loop1++) {
            for (int loop2 = 0; loop2 < l2; loop2++) {
                for (int loop3 = 0; loop3 < l3; loop3++) {
                    for (int loop4 = 0; loop4 < l4; loop4++) {
                        for (int loop5 = 0; loop5 < l5; loop5++) {
                            System.out.print(array5[loop1][loop2][loop3][loop4][loop5] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();

        }
        return array5;
    }

    public int getElement(int[][][][][] arr, int i, int j, int k, int l, int m) {
        return arr[i][j][k][l][m];
    }

    public int getElement(int[][][][] arr, int i, int j, int k, int l) {
        return arr[i][j][k][l];
    }

    public int getElement(int[][][] arr, int i, int j, int k) {
        return arr[i][j][k];
    }

    public int getElement(int[][] arr, int i, int j) {
        return arr[i][j];
    }

    public int getElement(int[] arr, int i) {
        return arr[i];
    }

    public void setElement(int[][][][][] arr, int i, int j, int k, int l, int m, int eng) {
        arr[i][j][k][l][m] = eng;
    }

    public void setElement(int[][][][] arr, int i, int j, int k, int l, int eng) {
        arr[i][j][k][l] = eng;
    }

    public void setElement(int[][][] arr, int i, int j, int k, int eng) {
        arr[i][j][k] = eng;
    }

    public void setElement(int[][] arr, int i, int j, int eng) {
        arr[i][j] = eng;
    }

    public void setElement(int[] arr, int i, int eng) {
        arr[i] = eng;
    }

    public int sum(ArrayList<Integer> arrlist) {
        int sum = 0;
        for (int i : arrlist) {
            sum += i;
        }
        return sum;
    }

    public int[] add(ArrayList<Integer> arrl1, ArrayList<Integer> arrl2) {
        int[] ressumarr = new int[arrl1.size()];
        try {
            for (int i = 0; i < arrl1.size(); i++) {
                ressumarr[i] = arrl1.get(i) + arrl2.get(i);
            }
        } catch (Exception e) {
            System.out.println("Size of two arrays do not match");
        }
        return ressumarr;
    }

    public int[] sub(ArrayList<Integer> arrl1, ArrayList<Integer> arrl2) {
        int[] ressubarr = new int[arrl1.size()];
        try {
            for (int i = 0; i < arrl1.size(); i++) {
                ressubarr[i] = arrl1.get(i) - arrl2.get(i);
            }
        } catch (Exception e) {
            System.out.println("Size of two arrays do not match");
        }
        return ressubarr;
    }

}
