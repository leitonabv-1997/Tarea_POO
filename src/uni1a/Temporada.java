package uni1a;

public class Temporada extends SerieDeTV {
    private int numeroTemporada;

    public Temporada(String titulo, int duracionEnMinutos, String genero, int numeroTemporada) {
        super(titulo, duracionEnMinutos, genero, numeroTemporada);
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=============Detalles de la temporada: =============");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporada: " + numeroTemporada);
        System.out.println();
    }

}
