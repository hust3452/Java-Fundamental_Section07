package Section07_001;

public class Section07_001 {
    // thuộc tính
    int length;
    int width;

    //Contruction
    public Section07_001(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //phuong thuc

    public int getArea(){
        int area = length * width;
        return area;
    }
    public int getPerimeter(){
        int perimeter = (length + width)*2;
        return perimeter;
    }
    public void display(){
        System.out.println("Chieu dai :" + length );
        System.out.println("Chieu rong :" +width);
        System.out.println("Dien tich HCN la: "+ getArea());
        System.out.println("Chu vi HCN la : "+ getPerimeter());
    }
}
