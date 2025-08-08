using ej4.Interfaces;
using ej4.Models;
using ej4.Data;

namespace ej4.Repository
{
    public class RepositoryPeliculas : IRepositoryPeliculas

    {
        private VideoclubContext _context;

        public RepositoryPeliculas(VideoclubContext context)
        {
            _context = context;
        }

        public List<Pelicula> GetPeliculas()
        {
            return this._context.peliculas.ToList();
        }

        public Pelicula FindPelicula(string titulo)
        {
            return this._context.peliculas.FirstOrDefault<Pelicula>(c => c.Titulo == titulo);

        }

        public async Task AddPelicula(Pelicula pelicula)
        {
            this._context.peliculas.Add(pelicula);
            await this._context.SaveChangesAsync();

        }

        public Pelicula GetPeliculaById(int id)
        {
            return this._context.peliculas.FirstOrDefault<Pelicula>(c => c.IdPelicula == id);
        }

        public async Task UpdatePelicula(Pelicula pelicula)
        {
            var existingPelicula = _context.peliculas.FirstOrDefault(p => p.IdPelicula == pelicula.IdPelicula);
            if (existingPelicula != null)
            {
                existingPelicula.Precio = pelicula.Precio;
                _context.peliculas.Update(existingPelicula);
                await _context.SaveChangesAsync();
            }
        }

        public async Task DeletePelicula(int id)
        {
            var p = this._context.peliculas.FirstOrDefault<Pelicula>(p => p.IdPelicula == id);
            this._context.peliculas.Remove(p);
            await this._context.SaveChangesAsync();
        }

    }
}
