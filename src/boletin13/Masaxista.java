package boletin13;
 
public class Masaxista extends Seleccion {

private String titulacion;
private int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

    @Override
    public void viaxar(){
        System.out.println("viaxa o masaxista: ");   
    }
    
public void darMasaxes(){
    
}

}
