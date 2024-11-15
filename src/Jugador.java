public class Jugador {
    protected String equipo; //protected lo que hace es proteger los atributos de la clase padre (Jugador)
    protected int edad;
    protected String nombre;

    //CONSTRUCTOR PADRE
    public Jugador(String equipo, String nombre, int edad) {
        this.equipo = equipo;
        this.edad = edad;
        this.nombre = nombre;
    }

    // METODO PADRE
    public void biografia() {
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Edad del jugador: " + edad);
    }

    static class Portero extends Jugador {
        private int atajadas;
        private int golesRecibidos;

        public Portero(String equipo, String nombrePortero, int edadPortero, int atajadas, int golesRecibidos) {
            super(equipo, nombrePortero, edadPortero);
            this.atajadas = atajadas;
            this.golesRecibidos = golesRecibidos;
        }

        public int Atajadas(int atajadas) {
            return atajadas;
        }

        public int GolesRecibidos(int golesRecibidos) {
            return golesRecibidos;
        }

        @Override //Sobreescribir
        public void biografia() {
            super.biografia();
            System.out.println("Atajadas: " + Atajadas(atajadas));
            System.out.println("Goles recibidos: " + GolesRecibidos(golesRecibidos) + "\n");
        }
    }



    static class Defensa extends Jugador {
        private int bloqueos;

        //Aqui tambien le cambie los nombres para diferenciar
        public Defensa(String equipo, String nombreDefensa, int edadDefensa, int bloqueos) {
            super(equipo, nombreDefensa, edadDefensa);
            this.bloqueos = bloqueos;
        }

        public int Bloqueos(int bloqueos) {
            return bloqueos;
        }

        @Override // sobreescribimos
        public void biografia() {
            super.biografia();
            System.out.println("Bloqueos: " + Bloqueos(bloqueos) + "\n");
        }
    }



    static class Delantero extends Jugador {
        public Delantero(String equipo, String nombreDelantero, int edadDelantero){
            super(equipo, nombreDelantero, edadDelantero);
        }
    }



    public static void main(String[] args) {
        Portero portero = new Portero("Liga","Richard",20,15,20);
        portero.biografia();

        Defensa defensa = new Defensa("Liga","Patricio",22,50);
        defensa.biografia();

        Delantero delantero = new Delantero("Liga","Ariel",25);
        delantero.biografia();
    }
}

