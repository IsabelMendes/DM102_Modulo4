public class Modelo4Exercicio {

    public static void main(String[] args){
        //Lote
        Lote lote1 = new Lote();

        //Corpo
        Corpo corpo1 = new Corpo();
        corpo1.setCor("azul");
        corpo1.setTipo("Rodas");

        //Processador
        Processador processador1 = new Processador();
        processador1.setFrequenciaProcessamento(750);
        processador1.setMarca("AMD");

        //Robo
        Robo robo1 = new Robo(true);


        //Adicionar corpo no robo
        robo1.setCorpo(corpo1);

        //Adicionar processador no robo
        robo1.setProcessador(processador1);

        //Adicionar Robo no Lote
        lote1.addRobo(robo1);


        Corpo corpo2 = new Corpo();
        corpo2.setCor("vermelho");
        corpo2.setTipo("esferico");
        Robo robo2 = new Robo(false);
        robo2.setCorpo(corpo2);
        lote1.addRobo(robo2);



        //Mostra informações do lote
        lote1.mostraRobosLote();





    }

}
