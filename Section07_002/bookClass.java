package Section07_002;

public class bookClass {
    private String title;
    private String author;
    private int price;

    // getter(lay du lieu)
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }

    //setter(gan gia tri cho bien)
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        if (price < 0){
            System.out.println("Gia khong duoc la so am");

        }else{
        this.price = price;
        }
    }
}

