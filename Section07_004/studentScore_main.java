package Section07_004;


import java.util.Scanner;

public class studentScore_main {
    public static void main(String[] args) {
        studentScore[] studenArray = new studentScore[5];

        //danh sach sinh vien
        studenArray[0] = new studentScore("Nguyen Van A",20,"A1",9);
        studenArray[1] = new studentScore("Nguyen Van B",21,"A5",3);
        studenArray[2] = new studentScore("Nguyen Van C",22,"A4",8);
        studenArray[3] = new studentScore("Nguyen Van D",18,"A7",5);
        studenArray[4] = new studentScore("Nguyen Van E",19,"A1",6);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem min : ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem max : ");
        double max = Double.parseDouble(sc.nextLine());

        //hien thi danh sach sinh vien trong khoang diem
        System.out.println("Sinh vien co danh sach trung binh tu "+min+ " den "+max);
        for (int i = 0; i < studenArray.length; i++) {
            if (studenArray[i].getAvgScore() >=min && studenArray[i].getAvgScore() <= max) {
                System.out.println(studenArray[i].getName());
            }
        }

    }
}
