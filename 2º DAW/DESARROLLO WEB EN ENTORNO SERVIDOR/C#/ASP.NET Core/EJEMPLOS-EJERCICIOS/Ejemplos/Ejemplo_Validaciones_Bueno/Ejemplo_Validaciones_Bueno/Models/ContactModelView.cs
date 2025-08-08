using System.ComponentModel.DataAnnotations;

namespace Ejemplo_Validaciones_Bueno.Models
{
    public class ContactModelView
    {
        [Required(ErrorMessage ="{0} es obligatorio")]
        [StringLength(maximumLength:50,MinimumLength =10,ErrorMessage ="La longitud de {0} ha de estar entre {2} y {1}")]
       
        public String Nombre { get; set; }

        [Required]
        [EmailAddress]
        public String Email { get; set; }


        [StringLength(maximumLength:200)]
        public String Mensaje { get; set; }
    }
}
