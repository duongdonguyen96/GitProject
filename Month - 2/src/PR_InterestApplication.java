import java.util.Scanner;

public class PR_InterestApplication {
    public static void main(String[] args) {
        double tienChoVay=1.0;
        double tiLeLaiXuat=1.0;
        double tienLai = 0.0;
        double soThangChovay=1.0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số lượng tiền cho vay");
        tienChoVay= scanner.nextDouble();
        System.out.println("Nhập tỉ lệ lãi xuất theo tháng");
         tiLeLaiXuat= scanner.nextDouble();
        System.out.println("Số tháng cho vay");
        soThangChovay = scanner.nextDouble();

        for (int i=0;i<soThangChovay;i++) {
            tienLai+=tienChoVay*(tiLeLaiXuat/100)/12*soThangChovay;

        }


        System.out.println("Tổng số tiền lãi là: "+ tienLai);



    }
}
