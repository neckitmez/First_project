package Test1;

public class Computer {
    public String name;
    public int ram;
    public  int hdd;
    public double weight;
    
    public  void on (){
        System.out.println("Я включаюсь!Моя модель: " + name+" ");
    }
    public  void off (){
        System.out.println("Я выключаюсь!" );
    }
    public  void load (){
        System.out.println("Я загружаюсь!Мой объем диска равен: "+ hdd+" Гб");
    }
}
