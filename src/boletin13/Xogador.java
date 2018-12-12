package boletin13;

public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade){
        super(id, nome, apelido, edade);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    @Override
    public void viaxar(){
        System.out.println("Viaxa o xogador: "); 
    }
    
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }
    
}
