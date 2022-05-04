public class HarryPotter {
    String casa,genero,nombre,boggart,patronus;

    public HarryPotter(String casa, String genero, String nombre, String boggart, String patronus) {
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    @Override
    public String toString() {
        return "El hechicero " + genero + ", de nombre " + nombre + " pertenece a la casa " + casa +
                ", su boggart es " + boggart + " y su patronus es " + patronus;
    }


}
