package Builder;

public class Application {
    static void main() {
        Computador computador1 = new ComputadorBuilder()
                .processador("Intel Core i5-13420H")
                .memoriaRAM("16GB RAM")
                .armazenamento("932 GB SSD")
                .placaVideo("NVIDIA GeForce RTX 3050 6GB")
                .sistemaOperacional("Windows")
                .build();
        Computador computador2 = new ComputadorBuilder()
                .processador("Intel Core i7-14700K")
                .memoriaRAM("32GB RAM")
                .armazenamento("1TB SSD")
                .placaVideo("NVIDIA GeForce RTX 4070 8GB")
                .sistemaOperacional("Linux")
                .build();
        System.out.println("=== Computador Gamer ===");
        System.out.println(computador1.toString());
        System.out.println("=== Computador de Desenvolvedor ===");
        System.out.println(computador2.toString());
    }
}
