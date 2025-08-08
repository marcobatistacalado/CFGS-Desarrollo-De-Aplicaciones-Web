using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;

namespace EjercicioTallerServicios.Services
{
    public class RepositorioTalleres : IRepositorioTalleres
    {
        public Talleres Taller { get; private set; }

        public RepositorioTalleres()
        {
            Taller = new Talleres
            {
                nombre = "Taller Marco SL.",
                direccion = new Direccion
                {
                    calle = "Calle Falsa",
                    numero = 123,
                    codPostal = 28000,
                    provincia = "Madrid",
                    poblacion = "Madrid"
                },
                telefono = "123-456-789",
                
                
            };
        }

        // Método para obtener el taller
        public Talleres getTaller()
        {
            return Taller;
        }
    }
}
