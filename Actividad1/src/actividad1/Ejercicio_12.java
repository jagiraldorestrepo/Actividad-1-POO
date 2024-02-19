
package actividad1;

public class Ejercicio_12 {
    
    
    public static void main (String[] args) {
        double h_trabajadas, valor_h, retencion, salario_bruto, salario_neto;
                
        
        valor_h = 5000;
        h_trabajadas = 48;
        salario_bruto = valor_h * h_trabajadas;
        retencion = salario_bruto * (12.5/100);
        salario_neto = salario_bruto - retencion;
        System.out.println("Horas trabajadas: " + h_trabajadas);
        System.out.println("Valor hora: " + valor_h);
        System.out.println("Salario bruto es: " + salario_bruto);
        System.out.println("La retencion es: " + retencion);
        System.out.println("Salario neto es: " + salario_neto);

    }  
}
