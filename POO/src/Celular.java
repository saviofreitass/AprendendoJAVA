public class Celular {
    private String marca;
    private String modelo;
    private int bateria;
    private boolean ligado = false;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligaDesliga() {
        if (!ligado) {
            System.out.println("Ligando celular...");
            this.ligado = true;
        } else {
            System.out.println("Desligando celular...");
            this.ligado = false;
        }
    }

    void usar(int consumo){
        if(bateria - consumo >= 0){
            bateria -= consumo;
            System.out.println("Bateria em: " + bateria + "%");
        }else{
            System.out.println("Sem bateria suficiente!");
        }
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Bateria: " + bateria);
    }
}
