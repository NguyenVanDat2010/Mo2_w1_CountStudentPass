import java.util.Arrays;
import java.util.Scanner;
public class CountStudentPass {
//    public static void showScore(int [] arr){
//        for (int k=0;k<arr.length;k++){
//            System.out.print(arr[k]+"\t");
//        }
//    }

    public int CountStudent(int[]arr){
        int count=0;
        for (int i =0; i<arr.length;i++){
            if (arr[i]>=5&&count<=10){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số lượng sinh viên: ");
            size=scanner.nextInt();
            if (size<0||size>30){
                System.out.println("Tối thiểu 1 sv và tối đa cho phép 30 sv.");
            }
        }while (size>30);
        int[] arrA=new int[size];
        for (int i=0;i<arrA.length;i++){
            System.out.println("Nhập điểm của sv "+(i+1));
            arrA[i]=scanner.nextInt();
        }
        CountStudentPass a=new CountStudentPass();
        System.out.println("Điểm của sv: ");
//        showScore(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println("SỐ lượng sinh viên pass module là: "+a.CountStudent(arrA));
    }
}
