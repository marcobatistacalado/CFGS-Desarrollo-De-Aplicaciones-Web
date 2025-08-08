using Ejemplo_Validaciones_2.Validaciones;
using System.ComponentModel.DataAnnotations;

namespace Ejemplo_Validaciones_2.Models
{
    public class Data
    {
       
        [Required(ErrorMessage ="El campo {0} es obligatorio")]
        [PrimeraMayuscula]
       
        public String Nombre{get;set;}
        [Required(ErrorMessage ="El campo {0} es obligatorio")]
        [Range(18,60,ErrorMessage ="El campo {0} debe estar entre{1} - {2}")]
        public int Edad { get; set; }

       
    }
}
