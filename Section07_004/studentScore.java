package Section07_004;

import java.util.Scanner;

class studentScore{
    private String name;
    private int age;
    private String glass;
    private double avgScore;

    public studentScore(String name, int age, String glass, double avgScore) {
        this.name = name;
        this.age = age;
        this.glass = glass;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

}
