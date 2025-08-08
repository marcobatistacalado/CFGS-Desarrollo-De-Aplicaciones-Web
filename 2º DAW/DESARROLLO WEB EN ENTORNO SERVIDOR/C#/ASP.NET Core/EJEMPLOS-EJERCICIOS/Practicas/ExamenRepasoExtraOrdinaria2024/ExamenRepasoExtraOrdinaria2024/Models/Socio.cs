using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ExamenRepasoExtraOrdinaria2024.Models
{
    [Table("Socios")]
    public class Socio
    {
        [Column("Id")]
        [Key]
        [Required]
        public int Id { get; set; }  

        [Column("dni")]
        [Required]
        [MinLength(9)]
        public String Dni { get; set; }

        [Column("nombre")]
        [Required]
        public String Nombre { get; set; }

        [Column("clave")]
        [Required]
        [MinLength(8)]
        [MaxLength(16)]
        public byte[] Clave { get; set; }

        [Column("SALT")]
        public string Salt { get; set; }

        [Column("telefono")]
        [Required]
        [MinLength(9)]
        public String Telefono { get; set; }

        [Column("matricula")]
        [Required]
        public String Matricula { get; set; }

        [Column("fecha_alta")]
        [Required]
        public DateTime Fecha_alta { get; set; }





    
    }
}
