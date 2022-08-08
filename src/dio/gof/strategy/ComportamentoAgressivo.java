package dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robo está se movendo de forma agressiva!");
    }
}
