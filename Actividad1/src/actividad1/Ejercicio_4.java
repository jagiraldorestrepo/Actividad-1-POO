
package actividad1;


public class Ejercicio_4 {
    
    
    public static void main(String[] args) {
      int edjuan = 9;
      int edana, edalber, edmama;
      
      edalber = (int) (edjuan*(2.0/3));
      edana = (int) (edjuan*(4.0/3));
      edmama = (int) (edjuan + edalber + edana);
      
      System.out.println("Las edades son:");
      System.out.println("Juan :" + edjuan);
      System.out.println("Alberto:" + edalber);
      System.out.println("Ana :" + edana);
      System.out.println("Mama :" + edmama);
      
    }
    
}