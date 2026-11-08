package Builder;

public class ComputadorBuilder {

    private String processador;
    private String memoriaRAM;
    private String armazenamento;
    private String placaVideo;
    private String sistemaOperacional;

    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        return new Computador(processador, memoriaRAM, armazenamento, placaVideo, sistemaOperacional);
    }
}
