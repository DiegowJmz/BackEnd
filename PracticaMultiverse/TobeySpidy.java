public class TobeySpidy extends Spiderman{

    @Override
    public void mostrarPoderes() {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Soy el spiderman de Tobey Maguire");
        screen.setVisible(true);
        screen.showImage("tobey.jpg");

    }

}