using Microsoft.AspNetCore.Mvc.Rendering;

namespace EjemploControlesHTML.Models
{
    public class EjemploSelectList:Ejemplo
    {
        public List<SelectListItem> Anyos { get; set; }

        public int Anyo { get; set; }
    }
}
