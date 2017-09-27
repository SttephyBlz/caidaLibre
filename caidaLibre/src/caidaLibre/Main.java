package caidaLibre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//h = (vo*t) + ((g*(t*t))/2)
		//vf = vo + (g*t)
		
		//h = altura (m)
		//t = tiempo (s)
		// vo = velocidad inicial (m/s)
		// vf = velocidad final (m/s)
		// g = gravedad (9.8 m/s2)
		
		//double  vo = 0;
		//double t = 3;
		//double g = 9.8;
		//double h = 2;
		//double h = (vo*t) + ((g*(t*t))/2);
		//double vf = vo + (g*t);
		
		//System.out.println(h + "m");
		//System.out.println(vf + "m/s");
		
		
		/*----------------------------*/
		// a = -g = -9.8 m/s2
		// d = h
		// vf = vo + a*t
		// (vf*vf) = (vo*vo) + (2*a*d)
		// d = (vo*t) + ((a*(t*t)/2)
		
		// https://www.youtube.com/watch?v=z6fIEAqPF5g
		double  vo = 0;
		double g = 9.8;
		double t = 0;
		double h = -(g*(t*t)/2);
		double vf = -(g*t);
		//double vf2 = 2 * g * h;
		double vf2 = Math.sqrt(2*g*h);
		
	}
	
	
	public void algo(){
		Scanner l = new Scanner(System.in);
		//Condiciones iniciales y parametros del ejercicio.		
				System.out.println("x(t) = 0.5at2 + vit + xi; donde: ");
				System.out.println(" a= Si la caida libre se realiza en la tierra la aceleracion sera la gravedad terrestre cuyo valor es 9,81 m/s^2.");
				System.out.println("La aceleracion de la gravedad es un vector que apunta siempre verticalmente hacia abajo, es decir es negativa.");
				System.out.println(" t= Tiempo, dado en segundos.");
				System.out.println(" vi= Velocidad Inicial.Recuerde que cuando Un objeto se deja caer la velocidad inicial sera siempre igual a cero.");
				System.out.println(" xi= Posicion Inicial.");
				
			//Se asigna a la variable t como Real; analiza la cadena ti y nos devuelve un valor real.
				System.out.println("Ingrese el tiempo, para calcular la distancia del objeto, trancurrido durante la caida libre del mismo:");
				String ti= l.next();
				double t= Double.parseDouble(ti);
				
			//Se asigna a la variable vel_ini como Real; analiza la cadena vo y nos devuelve un valor real.
				System.out.println("Ingrese la velocidad inicial, para calcular la distancia del objeto, trancurrido durante la caida libre del mismo:");
				String vo= l.next();
				double vel_ini= Double.parseDouble(vo);
			
			//Se asigna a la variable pos_ini como Real; analiza la cadena so y nos devuelve un valor real.	
				System.out.println("Ingrese el la posicion inicial, para calcular la distancia del objeto, trancurrido durante la caida libre del mismo:");
				String so= l.next();
				double pos_ini= Double.parseDouble(so);
				

			//Se aplica la formula de la caida libre, para obtener la posicion del objeto.
				double co=0.5;
				double ace=-9.81;
				double dis_rec=(co*(ace*(t*t)))+(vel_ini*t)+pos_ini;
				System.out.println("La Distancia recorrida por el objetos en caida libre es: "+dis_rec+" m");
	}
}
