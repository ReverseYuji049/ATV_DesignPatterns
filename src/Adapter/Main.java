package Adapter;

public class Main {
    static void main() {
        // Instância do legado
        LegacyLogger legacy = new LegacyLogger();
        // Adapter
        Logger logger = new LegacyLoggerAdapter(legacy);
        // Injeção no cliente
        Application app = new Application(logger);
        app.run();
    }
}
