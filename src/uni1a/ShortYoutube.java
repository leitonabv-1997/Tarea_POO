//clase de shortyoutube que hereda de ContenidoAudiovisual
package uni1a;

public class ShortYoutube extends ContenidoAudiovisual{
    private String creador;
    private int likes;

    public ShortYoutube(String titulo, int duracionEnMinutos, String genero, String creador, int likes) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.likes = likes;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=============Detalles del Short de YouTube: =============");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Likes: " + likes);
        System.out.println();
    }

}
