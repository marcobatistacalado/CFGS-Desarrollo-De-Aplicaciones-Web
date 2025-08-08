namespace ej3.Models
{
    public class PeliculaInfoView
    {
        public Pelicula Pelicula { get; set; }
        public InfoPelicula Info { get; set; }
        public List<Genero>? Generos { get; set; } //IMPORTANTE LA ? pq claro yo al montar la vista puedo pero al devolverla vuelve null
    }
}
