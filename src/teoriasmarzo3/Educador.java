/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriasmarzo3;

public class Educador extends Curso {
    
    public Educador(){}
        
    public void PromedioNotas(double Notas[]){
        double contador = 0;
        for(int i=0; i<Notas.length; i++)
        {
        contador = contador + Notas[i];
        }
        double promedio = contador/Notas.length;
        System.out.println("El promedio de notas es: "+ promedio);
    }
    
    public void PorcentajePerdidas(double Notas[]){
        double contador = 0;
        for(int i=0; i<Notas.length; i++){
        if (Notas[i]<3)
        {
        contador = +1;
        }
        }
        double porcentaje = (contador * 100)/Notas.length;
        System.out.println("El porcentaje de estudiantes que perdieron la materia es: "+ porcentaje);
    }
    
    public void MejorNota(double Notas[], String Estudiantes[]){
        double mayorNota = 0;
        String nombreEstudiante="";
        for(int i=0; i<Notas.length; i++){
        if (Notas[i]>mayorNota)
        {
        mayorNota= Notas[i];
        nombreEstudiante=Estudiantes[i];
        }
        }
        System.out.print("La nota maxima es de "+ nombreEstudiante + ", con la nota de: " + mayorNota);
    }
}
