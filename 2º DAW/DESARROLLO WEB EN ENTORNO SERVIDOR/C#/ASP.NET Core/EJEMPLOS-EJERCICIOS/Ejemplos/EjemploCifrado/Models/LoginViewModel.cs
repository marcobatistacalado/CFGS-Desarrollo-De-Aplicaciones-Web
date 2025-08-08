using System.ComponentModel.DataAnnotations;

namespace EjemploCifrado.Models
{
    public class LoginViewModel
    {
        [Required]
        public required string Email { get; set; }
        
        
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string Password { get; set; }
    }
}
