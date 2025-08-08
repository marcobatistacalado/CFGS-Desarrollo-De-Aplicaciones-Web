using System.ComponentModel.DataAnnotations;
using static marcoBatista.Models.Enumerados;

namespace marcoBatista.Models
{
    public class Alumno : Usuario
    {
        [Required(ErrorMessage = "El ciclo es obligatorio.")]
        public EnumeradoCiclo Ciclo { get; set; }

        [Required(ErrorMessage = "El curso es obligatorio.")]
        [Range(1, 2, ErrorMessage = "El curso debe ser 1 o 2.")]
        public int Curso { get; set; }

        [Required(ErrorMessage = "Los idiomas son obligatorios.")]
        public string Idiomas { get; set; } // Idiomas como cadena separada por comas

        public List<string> lIdiomas { get; set; } = new List<string>();
    }
}
