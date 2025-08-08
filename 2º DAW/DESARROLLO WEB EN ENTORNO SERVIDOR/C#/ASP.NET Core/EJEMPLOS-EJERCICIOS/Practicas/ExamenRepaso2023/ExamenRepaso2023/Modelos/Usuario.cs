using System.ComponentModel.DataAnnotations;

namespace ExamenRepaso2023.Modelos
{
    public class Usuario
    {
        [Required(ErrorMessage = "El campo 'Nick' es obligatorio.")]
        public string Nick { get; set; }

        [Required(ErrorMessage = "El campo 'Contraseña' es obligatorio.")]
        [MinLength(6, ErrorMessage = "La contraseña debe tener al menos 6 caracteres.")]
        public string Contraseña { get; set; }
        public string NombreCompleto { get; set; }

        [Required(ErrorMessage = "El campo 'Email' es obligatorio.")]
        [EmailAddress(ErrorMessage = "El formato del email no es válido.")]
        public string Email { get; set; }

    }

}
