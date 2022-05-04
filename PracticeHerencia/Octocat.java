
public  class Octocat {
    String tonoP;
    String tematica;
    String actividad;
    String traje;
    String herramienta;
    String oracion;
    String nombre;

    public Octocat(String tonoP, String tematica, String actividad, String traje, String herramienta, String nombre) {
        this.tonoP = tonoP;
        this.tematica = tematica;
        this.actividad = actividad;
        this.traje = traje;
        this.herramienta = herramienta;
        this.nombre = nombre;
    }


    public void mostrarDatos(){
        oracion = "\nSu tono de piel es " + tonoP +
                "\nLa tematica en la que esta es de: " + tematica +
                "\nLa actividad que esta haciendo es: " + actividad +
                "\nEl traje que tiene es de: " + traje +
                "\nLa herrameinta que esta usando es: " + herramienta +
                "\nSu nombre es: " + nombre;

    System.out.print(oracion);
    }

}
