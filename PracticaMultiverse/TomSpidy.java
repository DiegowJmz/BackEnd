public class TomSpidy extends Spiderman{

    @Override
    public void mostrarPoderes() {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Soy el spiderman de Tom Holland");
        screen.setVisible(true);
        screen.showImage("TomH.jpg");
    }

}
