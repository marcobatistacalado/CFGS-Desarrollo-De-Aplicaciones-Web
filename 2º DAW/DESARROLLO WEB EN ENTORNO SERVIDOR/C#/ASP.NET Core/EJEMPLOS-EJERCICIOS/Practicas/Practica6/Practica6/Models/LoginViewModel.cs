using System.ComponentModel.DataAnnotations;

namespace Practica6.Models
{
    public class LoginViewModel
    {
        [Required]
        [EmailAddress]
        public required string EmailLogin { get; set; }
        
        
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string PasswordLogin { get; set; }
    }
}
