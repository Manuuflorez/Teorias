
package teoriasmarzo3;

import java.util.Scanner;

public class Curso {
    
    public String[] Estudiantes;
    public double[] Notas;
    
    public Curso(int NumEstudiantes){
    Estudiantes=new String [NumEstudiantes];
    Notas=new double[NumEstudiantes];    
    }
    
    public Curso(){}
    
    public void PedirDatos(){
        for(int i=0; i < Estudiantes.length; i++)
        {
        System.out.println("Ingresa el nombre del estudiante " + (i+1));
        String Nombre = new Scanner(System.in).nextLine();
        Estudiantes[i]=Nombre;
        System.out.println("Ingresa la nota del estudiante " + (i+1));
        double Nota = Double.parseDouble(new Scanner(System.in).nextLine());
        Notas[i]=Nota;
        }
    }
    
    
    public void LeerCurso(){    
        for(int i=0; i < Estudiantes.length; i++)
      {
        System.out.println(Estudiantes[i]+": " + Notas[i]);          
      }
    }   
    
    
}
