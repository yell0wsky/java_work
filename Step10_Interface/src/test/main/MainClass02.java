package test.main;

import test.mypac.Remocon;

public class MainClass02 {
   // Remocon 인터페이스를 구현한 inner class
   static class YourRemocon implements Remocon{
      @Override
      public void up() {
         System.out.println("볼륨을 올려요");
      }
      @Override
      public void down() {
         System.out.println("볼륨을 내려요");
      }
   }
   
   public static void main(String[] args) {
      Remocon r1=new YourRemocon();
      useRemocon(r1);
   }
   
   
   //Remocon 인터페이스 type 을 인자로 전달받는 static 메소드
   public static void useRemocon(Remocon r) {
      r.up();
      r.down();
   }
}