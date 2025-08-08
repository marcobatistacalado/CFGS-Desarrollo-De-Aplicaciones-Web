using System.ComponentModel.DataAnnotations;

namespace ExamenRepasoExtraOrdinaria2024.Models
{
    public class LoginViewModel
    {
        [Required]
        [MaxLength(9)]
        [MinLength(9)]
        public required string Dni { get; set; }


        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string PasswordLogin { get; set; }
    }
}
