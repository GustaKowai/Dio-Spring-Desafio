package dio.gof;

import dio.gof.singleton.EagerSingleton;
import dio.gof.singleton.LazyHolderSingleton;
import dio.gof.singleton.LazySingleton;
import dio.gof.strategy.*;

public class teste {
    public static void main(String[] args) {

        /*
                                            Testes de Singleton.
                    Impressões de mesmo singleton devem exibir o mesmo endereço de memória
        */

        LazySingleton lazy = LazySingleton.getInstancia();
        System.out.println(lazy);
        lazy = LazySingleton.getInstancia();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstancia();
        System.out.println(eager);
        eager = EagerSingleton.getInstancia();
        System.out.println(eager);

        LazyHolderSingleton holder = LazyHolderSingleton.getInstancia();
        System.out.println(holder);
        holder = LazyHolderSingleton.getInstancia();
        System.out.println(holder);


        /*
                                        Strategy
         */

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

    }
}


