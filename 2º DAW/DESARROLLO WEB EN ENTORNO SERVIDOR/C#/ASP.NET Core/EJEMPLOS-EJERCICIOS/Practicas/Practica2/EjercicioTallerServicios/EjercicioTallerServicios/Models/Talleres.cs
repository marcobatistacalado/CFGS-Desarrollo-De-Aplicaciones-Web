using EjercicioTallerServicios.Interfaces;
namespace EjercicioTallerServicios.Models
{
    public class Talleres
    {
        public List<Mecanico> Mecanicos { get; set; } = new List<Mecanico>();
        public List<Coche> Coches { get; set; } = new List<Coche>();
        public string nombre { get; set; }
        public Direccion direccion { get; set; }
        public string telefono { get; set; }

    }
}
