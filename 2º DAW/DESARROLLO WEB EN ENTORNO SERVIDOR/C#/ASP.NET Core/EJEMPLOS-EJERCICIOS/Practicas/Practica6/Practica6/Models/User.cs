using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Practica6.Models
{
    [Table("Users")]
    public class User
    {
        [Column("Id")]
        [Key]
        [Required]
        public int IdUsuario { get; set; }

        [Column("Name")]
        [Required]
        public String Name { get; set; }

        [Column("Dni")]
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public String Dni { get; set; }

        [Column("Email")]
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public String Email { get; set; }

        [Column("Password")]
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public byte[] Password { get; set; }

        [Column("Salt")]
        public string Salt { get; set; }

        [Column("UserType")]
        [Required]
        public Role Rol { get; set; }
        public enum Role
        {
            Admin, //0
            Student //1
        }
    }
}



