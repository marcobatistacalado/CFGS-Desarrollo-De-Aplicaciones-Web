using static Practica6.Models.User;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace Practica6.Models
{
    public class RegisterViewModel
    {

        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string NombreRegister { get; set; }

        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string DniRegister { get; set; }


        [Required]
        [EmailAddress]
        public required string EmailRegister { get; set; }



        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public required string PasswordRegister { get; set; }
        [Required]
        public required Models.User.Role RolRegister { get; set; }
    }
}
