package javatest;

import Test1.Computer;

public class JavaTest {
 
    public static void main(String[] args) {
                      
      Computer comp= new Computer();
      comp.name="IBM";
      comp.hdd=123;
 
      
      
        comp.on();
        comp.load();
        comp.off();
    }
    
}