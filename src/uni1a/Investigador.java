package uni1a;

public class Investigador extends Documental {
    private String areaInvestigacion;

    public Investigador(String titulo, int duracionEnMinutos, String genero, String tema, String areaInvestigacion) {
        super(titulo, duracionEnMinutos, genero, tema);
        this.areaInvestigacion = areaInvestigacion;
    }

    public String getAreaInvestigacion() {
        return areaInvestigacion;
    }

    public void setAreaInvestigacion(String areaInvestigacion) {
        this.areaInvestigacion = areaInvestigacion;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Área de Investigación: " + areaInvestigacion);
        System.out.println();
    }

}
