using System;
using System.Collections.Generic;
using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Models;

namespace EjercicioTallerServicios.Services
{
    public class RepositorioMecanicos : IRepositorioMecanicos
    {
        private List<Mecanico> mecanicos;
        public RepositorioMecanicos()
        {
            mecanicos = new List<Mecanico>
            {
                new Mecanico
                {
                    nombre = "Juan",
                    apellidos = "Pérez López",
                    dni = "12345678A",
                    email = "juan.perez@example.com",
                    telefono = "600-123-456",
                    fAlta = new DateTime(2020, 5, 10),
                    foto = "1.png"
                },
                new Mecanico
                {
                    nombre = "María",
                    apellidos = "Gómez Sánchez",
                    dni = "87654321B",
                    email = "maria.gomez@example.com",
                    telefono = "600-987-654",
                    fAlta = new DateTime(2021, 3, 15),
                    foto = "2.png"
                }
            };
        }

        public List<Mecanico> getMecanicos()
        {
            return mecanicos;
        }
    }
}
