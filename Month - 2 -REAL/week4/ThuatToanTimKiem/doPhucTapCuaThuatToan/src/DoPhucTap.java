import java.util.Scanner;

public class DoPhucTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                  //1
        for (int i = 0; i < inputString.length(); i++) {    //2
            int ascii = (int) inputString.charAt(i);        //3
            frequentChar[ascii] += 1;                       //4
            int max = 0;                                    //5
            char character = (char) 255;                    //6
            for (int j = 0; j < 255; j++) {                 //7
                if (frequentChar[j] > max) {                //8
                    max = frequentChar[j];                  //9
                    character = (char) j;                   //10
                }
            }
            System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
        }
    }
}
// Câu lenh 1: 1
// Cau lenh 2: n
// Cau lenh 3: 1
// Cau lenh 4: 1
// Cau lenh 5: 1
// Cau lenh 6: 1
// Cau lenh 7: 255
// Cau lenh 8: 1
// Cau lenh 9: 1
// Cau lenh 10:1


//TH1: n <= 255
//
// Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {7} và bằng O(255) = O(1)
//
//TH2: n> 255
//
// Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {2} và bằng O(n)