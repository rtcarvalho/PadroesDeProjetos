public class Computador {

    private String processador;
    private String placaMae;
    private String memoriaRam;
    private String fonte;
    private String hd;
    private String ssd;
    private String placaVideo;

    public Computador() {
        this.processador = "";
        this.placaMae = "";
        this.memoriaRam = "";
        this.fonte = "";
        this.hd = "";
        this.ssd = "";
        this.placaVideo = "";
    }

    public String getProcessador() {return processador;}

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getFonte() { return fonte;}

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getSsd() {return ssd;}

    public void setSsd(String ssd) { this.ssd = ssd; }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }
}
