public class Main {
    public static void main(String[] args) throws InterruptedException {
        RoboLunar robo = new RoboLunar(50);
        robo.setBateria(10);
        robo.virarDireita(20);
        robo.virarEsquerda(50);
        robo.andarFrente(100);
        robo.andarATras(110);
        robo.tirarFoto();
        robo.getStatus();
    }

}
