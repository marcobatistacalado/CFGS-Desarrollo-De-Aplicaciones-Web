using ej4.Models;

namespace ej4.Interfaces
{
    public interface IRepositoryPeliculas
    {
        public List<Pelicula> GetPeliculas();
        public Pelicula FindPelicula(String peli);
        public Task AddPelicula(Pelicula pelicula);
        public Pelicula GetPeliculaById(int id);
        public Task UpdatePelicula(Pelicula pelicula);
        public Task DeletePelicula(int id);
    }
}
