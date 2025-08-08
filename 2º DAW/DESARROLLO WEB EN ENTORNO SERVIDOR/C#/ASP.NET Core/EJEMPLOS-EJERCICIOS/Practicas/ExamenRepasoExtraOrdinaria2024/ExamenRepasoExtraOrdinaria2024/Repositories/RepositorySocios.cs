using ExamenRepasoExtraOrdinaria2024.Data;
using ExamenRepasoExtraOrdinaria2024.Helper;
using ExamenRepasoExtraOrdinaria2024.Interfaces;
using ExamenRepasoExtraOrdinaria2024.Models;

namespace ExamenRepasoExtraOrdinaria2024.Repositories
{
    public class RepositorySocios : IRepositorySocios
    {
        private ParkingContext _context;

        public RepositorySocios(ParkingContext context)
        {
            _context = context;
        }

        public Socio LogInUser(string dni, string password)
        {
            Socio socio = this._context.Socios.FirstOrDefault(z => z.Dni == dni);
            if (socio == null)
                return null;
            else
            {
                //RECUPERAMOS EL PASSWORD CIFRADO DE LA BBDD
                byte[] passUsuario = socio.Clave;
                //DEBEMOS CIFRAR DE NUEVO EL PASSWORD DE USUARIO
                //JUNTO A SU SALT UTILIZANDO LA MISMA TECNICA
                string salt = socio.Salt;
                byte[] temp = Cifrado.EncryptPassword(password, salt);
                //COMPARAMOS LOS DOS ARRAYS
                if (Cifrado.CompareArrays(passUsuario, temp))

                    return socio;
                else

                    return null;

            }
        }

        public async Task<bool> RegisterUser(string dni, string nombre, string password, string telefono, string matricula)
        {
            Socio socio = new Socio();
            socio.Dni = dni;
            socio.Nombre = nombre;
            socio.Telefono = telefono;
            socio.Matricula = matricula;
            socio.Fecha_alta = DateTime.Now;

            //CADA USUARIO TENDRA UN SALT DIFERENTE
            socio.Salt = Cifrado.GenerateSalt();
            //CIFRAMOS EL PASSWORD DEL USUARIO CON SU SALT
            socio.Clave = Cifrado.EncryptPassword(password, socio.Salt);
            this._context.Socios.Add(socio);

            // Buscar una plaza libre (sin coche asignado)
            var plazaLibre = this._context.Plazas.FirstOrDefault(p => p.Matricula == null);

            if (plazaLibre != null)
            {
                plazaLibre.Matricula = matricula;
                plazaLibre.Hora = DateTime.Now;
            }
            await this._context.SaveChangesAsync();
            // Retornamos true si se asignó una plaza, false si no había disponibles
            return plazaLibre != null;

        }

        public Socio FindSocio(string dni)
        {
            return this._context.Socios.FirstOrDefault<Socio>(u => u.Dni == dni);
        }
    }
}