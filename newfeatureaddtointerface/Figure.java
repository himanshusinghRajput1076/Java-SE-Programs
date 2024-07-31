package newfeatureaddtointerface;

public interface Figure {
     void area();
     default void volume() {
         System.out.println(" can not cal volume ");
     }
         static void welcomeMessage(){
             System.out.println("Welcome to mensuration Topic");

     }

}
