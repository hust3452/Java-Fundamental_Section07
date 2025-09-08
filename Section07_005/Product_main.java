package Section07_005;

import java.util.Scanner;

public class Product_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[1000];
        //khoi tao mang quan li san pham

        int choice;
        boolean check = true;
        int currentIndex = 0;

        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong san pham can quan li");
                    int n = sc.nextInt();
                    int sum = currentIndex + n;
                    for (int i = currentIndex; i < sum; i++) {
                        System.out.printf("Nhap thong tin san pham thu %d : ", i + 1);
                        products[i] = new Product();
                        products[i].inputData(sc);
                    }
                    currentIndex = currentIndex + n;
                    break;
                case 2:
                    for (int i = 0; i < currentIndex; i++) {
                        products[i].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ID san pham ban can sua");
                    int fixID = sc.nextInt();
                    boolean fixID_check = false;
                    for (int i = 0; i < currentIndex; i++) {
                        if (fixID == products[i].getId()) {
                            fixID_check = true;
                            System.out.println("Ten san pham moi la : ");
                            String newName = sc.next();
                            products[i].setName(newName);
                            System.out.println("Gia san pham moi la : ");
                            products[i].setPrice(sc.nextInt());
                        }
                    }

                    if (fixID_check == false) {
                        System.err.println("Khong co ID nao thoa man");
                    }

                    break;
                case 4:
                    break;
                case 5:
                    check = false;
                    break;
            }
        } while (check == true);
    }

    public static void showMenu() {
        System.out.print("Menu \n" +
                "1. Them moi san pham \n" +
                "2. Hien thi danh sach san pham \n" +
                "3. Cap nhat san pham \n" +
                "4. Xoa san pham \n" +
                "5. Thoat \n"
        );
    }

}