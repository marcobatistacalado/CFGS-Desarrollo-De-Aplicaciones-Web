namespace EjemploServiciosTipo.Servicios
{

        public class ServicioTransitorio
        {
            public ServicioTransitorio()
            {
                ObtenerGuid = Guid.NewGuid();
            }

            public Guid ObtenerGuid { get; private set; }
        }
    
}
