using System.ComponentModel.DataAnnotations;
using static marcoBatista.Models.Enumerados;

namespace marcoBatista.Models
{
    public class Profesor : Usuario
    {
        [Required(ErrorMessage = "La especialidad es obligatoria.")]
        public EnumeradoEspecialidad Especialidad { get; set; }
    }

}
