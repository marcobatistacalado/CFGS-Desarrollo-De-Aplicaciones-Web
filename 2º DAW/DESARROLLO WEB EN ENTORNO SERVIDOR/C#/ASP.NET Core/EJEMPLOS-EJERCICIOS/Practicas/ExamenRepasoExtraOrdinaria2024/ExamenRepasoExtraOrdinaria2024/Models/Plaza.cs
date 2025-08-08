using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ExamenRepasoExtraOrdinaria2024.Models
{
    [Table("Plazas")]
    public class Plaza
    {
        [Column("Id")]
        [Key]
        [Required]
        public int Id { get; set; }

        [Column("matricula")]
        [Required]
        public String Matricula { get; set; }

        [Column("hora")]
        [Required]
        public DateTime Hora { get; set; }






    }
}
