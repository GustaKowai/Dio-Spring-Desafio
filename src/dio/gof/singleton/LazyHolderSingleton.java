package dio.gof.singleton;

public class LazyHolderSingleton {

    private static class Holder{
        public static LazyHolderSingleton instancia = new LazyHolderSingleton();
    }
    private LazyHolderSingleton(){
        super();
    }
    public static LazyHolderSingleton getInstancia(){
        return Holder.instancia;
    }
}
