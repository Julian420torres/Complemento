public class Main {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Jumbo", "Bélgica");
        Velocista velocista1 = new Velocista(1234, "Peter Sagan", 50, 70);
        Escalador escalador = new Escalador(5678, "Nairo Quintana", 20, 15);
        Contrarelojista contrarelojista1 = new Contrarelojista(1357, "Esteban Chavez", 120);
        //Imprimir listar equipo
        

        // Agregar los ciclistas al equipo usando el método añadirCiclista
        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador);
        equipo1.añadirCiclista(contrarelojista1);

        // Listar el equipo y sus ciclistas usando el método listarEquipo
        equipo1.listarEquipo();
    }

    
    }


