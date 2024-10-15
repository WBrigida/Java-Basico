
public class SmartTv {
    Boolean ligada = false;
    int canal = 5;
    int volume = 35;

    public void mudarCanal(int novoCnal) {
        canal = novoCnal;
        System.out.println("Mudando para o canal " + canal);
    }

    public void aumentarCanal() {
        // canal = canal + 1;
        canal++;
        System.out.println("Mudando para o canal " + canal);
    }

    public void diminuirCanal() {
        // canal = canal - 1;
        canal--;
        System.out.println("Mudando para o canal " + canal);
    }

    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume() {
        // volume = volume -1;
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
