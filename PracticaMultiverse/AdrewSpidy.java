public class AdrewSpidy extends Spiderman{

    @Override
    public void mostrarPoderes() {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Soy el spiderman de Andrew Garfield");
        screen.setVisible(true);
        screen.showImage("TomH.jpg");
    }
}
