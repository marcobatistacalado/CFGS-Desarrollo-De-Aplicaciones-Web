namespace EjemploServiciosTipo.Servicios
{
    public class ServicioLimitado
    {
        public ServicioLimitado()
        {
            ObtenerGuid = Guid.NewGuid();
        }

        public Guid ObtenerGuid { get; private set; }
    }
}
