import java.util.Random;

public class Robo {

    private long serialNumber;
    private Processador processador;
    private Corpo corpo;
    private boolean temProcessador;


    public Robo(boolean temProcessador) {
        this.temProcessador = temProcessador;
        serialNumber = serialNumberGenerator();
    }


    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void mostraConfigRobo(){
        System.out.println("O serial number do robo é: "+serialNumber);
        System.out.println("O corpo do robo é: "+corpo.getTipo()+"-"+corpo.getCor());
        if (temProcessador) {
            System.out.println("O processador é: " + processador.getMarca() + "-" + processador.getFrequenciaProcessamento());
        } else {
            System.out.println("O robo não tem processador. Logo, é mais barato.");
        }
    }

    private long serialNumberGenerator(){
        Random numberGenerator = new Random();
        return Math.abs(numberGenerator.nextLong());
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }
}
