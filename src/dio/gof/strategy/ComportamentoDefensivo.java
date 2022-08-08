package dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("O robo está se movendo de forma defensiva");
    }
}
