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
          System.out.println("���������� �������� "+ newHdd +" �� ����� ���� ��������������!"); 
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
            System.out.println("���������� �������� "+ newRam +" �� ����� ���� ��������������!");
        }
   

        
        
        
    }
    public  void on (){
        System.out.println("� ���������!" );
    }
    
    public  void off (){
        System.out.println("� ����������!" );
    }
    public  void load (){
        System.out.println("� ����������!��� ����� ����� �����: "+ hdd+" ��");
    }
}
