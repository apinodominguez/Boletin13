package boletin13;

public class Adestrador extends Seleccion {
    
    private String idFederacion;

    public Adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxa o entrenador: ");   
    }
    
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }
    
    
}
