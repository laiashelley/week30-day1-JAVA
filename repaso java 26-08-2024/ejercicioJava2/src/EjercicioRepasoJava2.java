// 2- LISTA CURSOS JAVA

// Vamos a crear un listado de escuelas que ofrecen cursos de programación en java.

// Cada curso contiene estos datos:

//     nombre de la escuela

//     localidad de la escuela

//     precio del curso

//     si hacen cursos nocturnos o no

// A partir de ahí. Crear todos los métodos habituales en la POO.

// Y en el programa principal instanciar 3 escuelas (incrustarlas, no por usuario) y guardarlas en un arraylist de objetos, e imprimirlos todos.

import java.util.ArrayList;

public class EjercicioRepasoJava2 {
    public static void main(String[] args) {

        // crear ArrayList:

        ArrayList<Escuelas> escuelasLista = new ArrayList<>();
        
        // instanciar 3 escuelas:

        Escuelas escuela1 = new Escuelas("Ironhack", "Barcelona", 5000, true);
        Escuelas escuela2 = new Escuelas("Nuclio", "Barcelona", 7000, false);
        Escuelas escuela3 = new Escuelas("codeAcademy", "Online", 600, true);

        // añadir escuelas a la ArrayList:

        escuelasLista.add(escuela1);
        escuelasLista.add(escuela2);
        escuelasLista.add(escuela3);

        // imprimir escuelas:

        for (Escuelas escuelaL : escuelasLista) {
            System.out.println(escuelaL);
        }

    }
}

