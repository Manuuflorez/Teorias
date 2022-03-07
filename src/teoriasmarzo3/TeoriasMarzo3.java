/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriasmarzo3;

import java.util.Scanner;

public class TeoriasMarzo3 {

    public static void main(String[] args) {
        System.out.println("Ingresa el numero de estudiantes");
        int NumEstudiantes=new Scanner(System.in).nextInt();
        Curso objCurso = new Curso(NumEstudiantes);
        objCurso.PedirDatos();
        objCurso.LeerCurso();
        Educador objEducador=new Educador();
        objEducador.PromedioNotas(objCurso.Notas);
        objEducador.PorcentajePerdidas(objCurso.Notas);
        objEducador.MejorNota(objCurso.Notas, objCurso.Estudiantes);
    }
    
}
