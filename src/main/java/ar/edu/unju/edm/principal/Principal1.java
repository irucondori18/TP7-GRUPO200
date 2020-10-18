package ar.edu.unju.edm.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.edm.model.Alumno;

public class Principal1 {

	public static void main(String[] args) {

		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
			System.out.println("---------------------------MENU----------------------------");
			System.out.println("1. Dar de alta un alumno.");
			System.out.println("2. Realizar la b�squeda de un alumno para asignarle sus notas.");
			System.out.println("3. Buscar un alumno ingresando su dni y mostrar el promedio de notas y la nota m�s alta (valor m�ximo) por cada Materia.");
			System.out.println("4. Mostrar la lista de alumnos con sus respectivas notas.");
			System.out.println("5. Mostrar la lista de materias ingresando el curso.");
			System.out.println("6. Salir");
			System.out.println("Ingrese opci�n: ");
			op=sc.nextInt();
			switch(op) {
			case 1:
				Alumno alumno = new Alumno(); 
				System.out.println("Ingrese dni: ");
				long dniIngresado = sc.nextLong();
				System.out.println("prueba");
////				se controla si existe el alumno
//				boolean bander=false;
//				for(Alumno alum: alumnos) {
//					if(alum.getDni()==dniIngresado) {
//						bander=true;
//					}
//				}
//				if(bander==true) {
//					System.out.println("\nEl alumno ya existe!");
//				}
//				else {
					System.out.println("Ingrese nombre: ");
					alumno.setNombre(sc.next());
					System.out.println("Ingrese apellido: ");
					alumno.setApellido(sc.next());
					System.out.println("Ingrese d�a de fecha de nacimiento: ");
					int dia = sc.nextInt();
					System.out.println("Ingrese d�a de fecha de nacimiento: ");
					int mes = sc.nextInt();
					System.out.println("Ingrese d�a de fecha de nacimiento: ");
					int anio = sc.nextInt();
					LocalDate fecha = LocalDate.of(anio, mes, dia);
					alumno.setFechaNac(fecha);
					System.out.println("Ingrese curso: ");
					alumno.setCurso(sc.next());
					alumnos.add(alumno);
					System.out.println("Alumno agregado con �xito!");
//				}

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: 
				break;
			case 6: System.out.println("Saliendo...");
				break;
			default: System.out.println("No es una opci�n!");
				break;
			}
			
			
			
			
			
		}while(op!=6);
		
		
		
	}

}
