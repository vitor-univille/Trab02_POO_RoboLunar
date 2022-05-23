public class Main {
    public static void main(String[] args) throws InterruptedException {

        new MyFrame();

        RoboLunar robo = new RoboLunar(100);
        robo.setBateria(200);
        robo.virarDireita(20);
        robo.virarEsquerda(50);
        robo.andarFrente(100);
        robo.andarATras(110);
        robo.tirarFoto();
        robo.getStatus();
    }

}
