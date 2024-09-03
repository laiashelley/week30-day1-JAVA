// TRENES: Preguntas al usuario:

// Cuantos Km recorridos?
// Cuantas horas necesarias?
// Cuantos minutos necesarios? 

// Y a partir d'aquí indicar la velocidad del tren en Km/H


import java.util.Scanner;

public class EjercicioRepasoJava1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los km recorridos:");
        double kilometros = sc.nextDouble();
        System.out.println("Introduce las horas necesarias:");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos necesarios:");
        int minutos = sc.nextInt();

        sc.close();
        
        double minutosAHoras = minutos / 60;
        double velocidadTren = kilometros / (minutosAHoras + horas);

        System.out.println("Has introducido " + kilometros + " km, " + horas + " horas y " + minutos + " minutos. La velocidad del tren en Km/H es de: " + velocidadTren);
    }
}

// formulas:

// velocidad = distancia / tiempo
// horas = minutos / 60