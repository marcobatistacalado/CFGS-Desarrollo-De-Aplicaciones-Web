namespace EjercicioTallerServicios.Models
{
    public class Coche
    {
        public string modelo { get; set; }
        public string matricula { get; set; }
        public string marca { get; set; }
        public int ano { get; set; }
        public Dueno dueño { get; set; }

        public Mecanico m { get; set; }
    }
}
