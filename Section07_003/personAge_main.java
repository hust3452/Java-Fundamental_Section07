package Section07_003;

import java.util.Scanner;

public class personAge_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tao doi tuong 1
        personAge person1 = new personAge();
        System.out.print("Nhap vao ten nguoi dung 1 : ");
        person1.setName(sc.nextLine());
        System.out.print("Nhap vao tuoi nguoi dung 1 : ");
        person1.setAge(sc.nextInt());
        sc.nextLine();

        //tao doi tuong 2
        personAge person2 = new personAge();
        System.out.print("Nhap vao tuoi nguoi dung 2 : ");
        person2.setName(sc.nextLine());
        System.out.println("Nhap vao tuoi nguoi dung 2 : ");
        person2.setAge(sc.nextInt());

        //so sanh tuoi
        if(person1.getAge() > person2.getAge()){
            System.out.println(" Nguoi dung " + person1.getName() + " co tuoi la "+ person1.getAge() +" lon hon"+" Nguoi dung"+ person2.getName() +" co tuoi la " + person2.getAge());
        }else if (person2.getAge() > person1.getAge()){
            System.out.println(" Nguoi dung " + person2.getName() + " co tuoi la "+ person2.getAge() +" lon hon"+" Nguoi dung"+ person1.getName() +" co tuoi la " + person1.getAge());
        }else if (person2.getAge() == person1.getAge()){
            System.out.println("Hai nguoi co so tuoi bang nhau");
        }
    }
}
