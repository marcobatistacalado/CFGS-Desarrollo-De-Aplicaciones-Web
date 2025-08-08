using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EjemploCifrado.Models
{
    [Table("Table")]
    public class Usuario
    {
        [Column("IdUsuario")]
        [Required] 
        public int IdUsuario { get; set; }

        [Column("nombre")]
        [Required]
        public String Nombre { get; set; }

        [Column("email")]
        [Key]
        [Required]
        public String Email { get; set; }

        [Column("password")]
        [Required]
        [MaxLength(16)]
        public byte[] Password { get; set; }

        [Column("SALT")]
        public string Salt { get; set; }


    }
}
