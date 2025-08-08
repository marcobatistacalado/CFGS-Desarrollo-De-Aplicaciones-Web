using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace ej4.Models
{
    public class UsuarioViewModel
    {
        [Required] 
        public required string Nombre {  get; set; }
        
        [Required]
        [EmailAddress]
        public required string Email { get; set; }
        
        
        
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string Password { get; set; }
        [Required]
        public required string Rol { get; set; }

    }
}
