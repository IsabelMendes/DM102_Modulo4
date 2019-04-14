import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Lote {

    private long lotNumber;
    private Date dataCriacao;

    private List<Robo> robos = new ArrayList<>();

    public Lote() {
        lotNumber = lotNumberGenerator();
        dataCriacao = new Date();
    }

    public long getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(long lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    //metodo
    public void mostraRobosLote (){
        System.out.println("O número do lote é "+lotNumber);
        System.out.println(" E a data de criação é "+dataCriacao);

        for (int i=0; i<robos.size(); i++) {
            System.out.println("Robo "+(i+1));
            robos.get(i).mostraConfigRobo();
        }
    }

    public void addRobo(Robo robo){
        robos.add(robo);
    }

    private long lotNumberGenerator(){
        Random numberGenerator = new Random();
        return Math.abs(numberGenerator.nextLong());
    }
}
