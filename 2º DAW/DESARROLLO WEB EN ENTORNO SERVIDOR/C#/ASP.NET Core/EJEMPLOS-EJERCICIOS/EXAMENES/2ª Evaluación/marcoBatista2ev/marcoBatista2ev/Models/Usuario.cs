using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace marcoBatista2ev.Models
{
    [Table("Usuarios")]
    public class Usuario
    {

        [Column("nombre")]
        [Required]
        public String Nombre { get; set; }

        [Column("email")]
        [Key]
        [Required]
        public String Email { get; set; }

        [Column("password")]
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public byte[] Password { get; set; }

        [Column("SALT")]
        public string Salt { get; set; }

        [Column("perfil")]
        [Required]
        [MinLength(1)]
        [MaxLength(1)]
        public String Perfil { get; set; }
    }
}
