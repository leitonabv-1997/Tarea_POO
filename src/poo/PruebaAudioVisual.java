package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");

        Actor actor = new Actor("Titanic", 420, "Romantico", "Warner Bros.", "Leonardo DiCaprio");
        Investigador investigador = new Investigador("The Last Dance", 50, "Deportes", "Basketball", "Historia del Deporte");
        Temporada temporada = new Temporada("Stranger Things", 55, "Ciencia Ficción", 3);
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }

        //Mostrar detalles del actor
        actor.mostrarDetalles();

        //Mostrar detalles del investigador
        investigador.mostrarDetalles();

        //Mostrar detalles de la temporada
        temporada.mostrarDetalles();

         // Mostrar Reels
        ReelsTikTok reelsTikTok = new ReelsTikTok("Cocinando con Flow", 1, "Cocina", "Julio Chang", 15000);
        reelsTikTok.mostrarDetalles();

        // Mostrar Short de YouTube
        ShortYoutube shortYoutube = new ShortYoutube("Trucos de Magia", 2, "Magia", "Ana Gomez", 2500);
        shortYoutube.mostrarDetalles();
    }
}