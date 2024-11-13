package barracksWars;

public class Main {
    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        Runnable engine = new Engine(new CommandInterpreterImpl(repository,unitFactory));
        engine.run();
    }
    }
}
