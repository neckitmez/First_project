package Test1;

public class Computer {
    private String name;
        
    private int ram;
    
    private  int hdd;
    
    private double weight;
    
     
    public int getHdd(){
        return hdd;
    }
    
    public void setHdd(int newHdd){
       if (newHdd>0){
           hdd = newHdd;
       }else{
          System.out.println("Переданное значение "+ newHdd +" не может быть отрицательныьм!"); 
       }
       
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    
    public int getRam(){
        return ram;
    }
    
    public void setRam(int newRam){
        if (newRam>0){
           ram = newRam; 
        }else {
            System.out.println("Переданное значение "+ newRam +" не может быть отрицательныьм!");
        }
   

        
        
        
    }
    public  void on (){
        System.out.println("Я включаюсь!" );
    }
    
    public  void off (){
        System.out.println("Я выключаюсь!" );
    }
    public  void load (){
        System.out.println("Я загружаюсь!Мой объем диска равен: "+ hdd+" Гб");
    }
}
