public class TomSpidy extends Spiderman{
    String poder;

    public TomSpidy(String nombre, String poder) {
        super(nombre);
        this.poder = poder;
    }
    @Override
    public void mostrarPoderes() {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Soy el Spiderman de " + nombre);
        screen.setVisible(true);
        screen.showImage(poder);
    }

}
