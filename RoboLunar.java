public class RoboLunar {
    private int bateria;
    
    public RoboLunar(){}
    public RoboLunar(int bateria){
        this.bateria = bateria;
    }

    public void setBateria(int bateria){
        this.bateria = bateria;
    }

    public void andarFrente(int mov) throws InterruptedException{
        if (bateria > 10){
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("Andando para Frente...");
            }
            Thread.sleep(1000);
            System.out.println("Andei "+mov+" metros");
            this.bateria -= 15;
        }else{
            Thread.sleep(1000);
            System.out.println("Bateria muito Baixa!");
        }
    }
    public void andarATras(int mov) throws InterruptedException{
        if (bateria > 10){
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("Andando para Tras...");
            }
            Thread.sleep(1000);
            System.out.println("Andei "+mov+" metros");
            this.bateria -= 15;
        }else{
            Thread.sleep(1000);
            System.out.println("Bateria muito Baixa!");
        }
    }

    public void virarEsquerda(int grau) throws InterruptedException{
        if (bateria > 10){
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("<<< Virando a Esquerda");
            }
            Thread.sleep(1000);
            System.out.println("Virei "+grau+"° Graus a Esquerda");
            if (grau > 180){
                this.bateria -= 10;
            }else{
                this.bateria -= 5;
            }
        }else{
            Thread.sleep(1000);
            System.out.println("Bateria muito Baixa!");
        }
    }
    public void virarDireita(int grau) throws InterruptedException{
        if (bateria > 10){
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Virando a Direita >>>");
            }
            Thread.sleep(1000);
            System.out.println("Virei "+grau+"° Graus a Direita");
            if (grau > 180){
                this.bateria -= 10;
            }else{
                this.bateria -= 5;
            }
        }else{
            Thread.sleep(1000);
            System.out.println("Bateria muito Baixa!");
        }
    }

    public void tirarFoto() throws InterruptedException{
        if (bateria > 10){
            Thread.sleep(1000);
            System.out.println("Foto Tirada:");
            System.out.println("\n        _____");
            System.out.println("    ,-:` \\;',`'-, ");
            System.out.println("  .'-;_,;  ':-;_,'.");
            System.out.println(" /;   '/    ,  _`.-\\");
            System.out.println("| '`. (`     /` ` \\`|");
            System.out.println("|:.  `\\`-.   \\_   / |");
            System.out.println("|     (   `,  .`\\ ;'|");
            System.out.println(" \\     | .'     `-'/");
            System.out.println("  `.   ;/        .'");
            System.out.println("    `'-._____.\n");

            this.bateria -= 15;
        }else{
            System.out.println("Bateria muito Baixa!");
        }
    }

    public void getStatus() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Estou com "+this.bateria+"% De Bateria!");
    }
}
