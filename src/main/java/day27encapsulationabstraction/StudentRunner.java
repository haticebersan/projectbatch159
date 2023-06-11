package day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.getStdId());//TH2023FL

        std1.setStdId("AB2023V");
        System.out.println(std1.getStdId());//AB2023V

        Student std2 = new Student();
        System.out.println(std2.getStdId());//TH2023FL


    }

}


