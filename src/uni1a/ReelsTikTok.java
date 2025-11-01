package uni1a;

public class ReelsTikTok extends ContenidoAudiovisual {
    private String creador;
    private int seguidores;


    public ReelsTikTok(String titulo, int duracionEnMinutos, String genero, String creador, int seguidores) {
        super(titulo, duracionEnMinutos, genero);
        this.creador = creador;
        this.seguidores = seguidores;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getInfoReels() {
        return "Creador: " + creador + ", Seguidores: " + seguidores;
    }

    public String subStringSeguidores () {
        if(seguidores > 1000){
            var seguidoresK = seguidores / 1000;
            return seguidoresK + "K";
        }else {
            return String.valueOf(seguidores);
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=============Detalles del Reels de TikTok: =============");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Seguidores: " + subStringSeguidores());
        System.out.println();
    }

}
