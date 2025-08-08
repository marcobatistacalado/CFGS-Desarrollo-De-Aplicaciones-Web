namespace EjemploServiciosTipo.Servicios
{

    
        public class ServicioUnico
        {
            public ServicioUnico()
            {
                ObtenerGuid = Guid.NewGuid();
            }

            public Guid ObtenerGuid { get; private set; }
        }




    
}
