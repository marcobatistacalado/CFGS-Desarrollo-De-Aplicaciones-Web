using Microsoft.AspNetCore.Identity;

namespace ej1.Models
{
    public class Portfolio
    {
        public Persona Persona { get; set; }
        public List<Proyecto> Proyectos { get; set; }
    }
}
