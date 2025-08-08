using static ExamenRepasoExtraOrdinaria2024.Models.Socio;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ExamenRepasoExtraOrdinaria2024.Models
{
    public class RegisterViewModel
    {


        [Required]
        public string NombreRegister { get; set; }

        [Required]
        [MaxLength(9)]
        public string DniRegister { get; set; }


        [Required]
        [MinLength(8)]
        public string ClaveRegister { get; set; }

        [Required]
        [MinLength(9)]
        [MaxLength(9)]
        public string TelefonoRegister { get; set; }

        [Required]
        public string MatriculaRegister { get; set; }
    }
}
