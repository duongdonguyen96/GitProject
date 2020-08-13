public class ATM {
    private String name = "Nguyen Van A";
    private int money = 1200000;
    public String[] history = new String[3];
    public int i = 0;

    public ATM() {
    }
    public ATM(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void checkMoney() {
        System.out.println("So du tai khoan cua ban la:" + this.money + " VND");
        System.out.println("Bam theo menu de tiep tuc giao dich");
    }

    public void increaseMoney(int increaseMoney) {
        this.setMoney(this.getMoney() + increaseMoney);
        history[i] = i + 1 + "." + " Ban  nap " + increaseMoney;
        i++;
        System.out.println("Giao dich thanh cong. Ban vua nap " + increaseMoney);
        System.out.println("So du tai khoan la:" + this.money);
        System.out.println("Bam nut tiep theo de giao dich");
        System.out.println("_____________________________");
        System.out.println("Bam nut tiep theo de thuc hien giao dich");
    }

    public void decreaseMoney(int decreaseMoney) {
        this.setMoney(this.getMoney() - decreaseMoney);
        history[i] = i + " Ban rut " + decreaseMoney;
        i++;
        System.out.println("Giao dich thanh cong. Ban vua rut  so tien " + decreaseMoney + " thanh cong");
        System.out.println("So du tai khoan la: " + this.money);
        System.out.println("_____________________________");
        System.out.println("Bam nut tiep theo de thuc hien giao dich");
    }

    public void historyExchange() {
//        if (i > 3) {
//            for (int m = 0; m < 3; m++) {
//                for (int n = m + 1; n < 3; n++) {
//                    String temp = history[1];
//                    history[0]=temp;
//                    history[1]=history[2];
//                }
//            }
//        }
        for (String his : history) {
            if (his != null) {
                System.out.println(his);
            }
        }
    }

    public void exit() {
        System.out.println("Cam on ban da su dich dich vu ATM");
        System.exit(0);
    }


}
