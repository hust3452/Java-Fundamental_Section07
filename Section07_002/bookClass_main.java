package Section07_002;

public class bookClass_main {
    public static void main(String[] args) {
        bookClass myBook = new bookClass();

        myBook.setAuthor("Java Programming");
        myBook.setTitle("John Doe");
        myBook.setPrice(50000);
        //hien thi thong tin sach
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Price: " + myBook.getPrice());

        //set lai gia tri price
        myBook.setPrice(20000);
        System.out.println("New price: " + myBook.getPrice());
        //gia tri price am
        myBook.setPrice(-20000);

    }
}
