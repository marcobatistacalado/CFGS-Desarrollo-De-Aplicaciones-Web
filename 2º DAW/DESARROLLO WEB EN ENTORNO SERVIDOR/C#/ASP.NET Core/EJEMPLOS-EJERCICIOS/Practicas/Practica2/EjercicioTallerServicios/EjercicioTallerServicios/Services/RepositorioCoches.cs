using System;
using System.Collections.Generic;
using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;

namespace EjercicioTallerServicios.Services
{
    public class RepositorioCoches : IRepositorioCoches
    {
        private readonly List<Coche> coches;

        public RepositorioCoches()
        {
            /*METEMOS ASI LOS DUEÑOS Y LOS MECANICOS POR AHORA LO SUYO ES USAR OTRAS REPO POR LA BBDD...*/
            var dueno1 = new Dueno
            {
                nombre = "Carlos",
                apellidos = "López García",
                dni = "11111111A",
                email = "carlos.lopez@example.com",
                telefono = "600-111-222",
                direccion = new Direccion
                {
                    calle = "Calle Mayor",
                    numero = 45,
                    codPostal = 28001,
                    provincia = "Madrid",
                    poblacion = "Madrid"
                }
            };

            var dueno2 = new Dueno
            {
                nombre = "Ana",
                apellidos = "Martínez Torres",
                dni = "22222222B",
                email = "ana.martinez@example.com",
                telefono = "600-333-444",
                direccion = new Direccion
                {
                    calle = "Avenida Central",
                    numero = 12,
                    codPostal = 28002,
                    provincia = "Madrid",
                    poblacion = "Madrid"
                }
            };

            var mecanico1 = new Mecanico
            {
                nombre = "Juan",
                apellidos = "Pérez López",
                dni = "12345678A",
                email = "juan.perez@example.com",
                telefono = "600-123-456",
                fAlta = new DateTime(2020, 5, 10),
                foto = "1.jpg"
            };

            var mecanico2 = new Mecanico
            {
                nombre = "María",
                apellidos = "Gómez Sánchez",
                dni = "87654321B",
                email = "maria.gomez@example.com",
                telefono = "600-987-654",
                fAlta = new DateTime(2021, 3, 15),
                foto = "2.jpg"
            };

            coches = new List<Coche>
            {
                new Coche
                {
                    modelo = "Fiesta",
                    marca = "Ford",
                    matricula = "1234-ABC",
                    ano = 2015,
                    dueño = dueno1,
                    m = mecanico1
                },
                new Coche
                {
                    modelo = "Civic",
                    marca = "Honda",
                    matricula = "5678-DEF",
                    ano = 2018,
                    dueño = dueno2,
                    m = mecanico2
                }
            };
        }
        public List<Coche> getCoches()
        {
            return coches;
        }
    }
}
