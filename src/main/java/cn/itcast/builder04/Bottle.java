package cn.itcast.builder04;

public class Bottle implements Packing {
 
   @Override
   public String pack() {
      return "Bottle";
   }
}