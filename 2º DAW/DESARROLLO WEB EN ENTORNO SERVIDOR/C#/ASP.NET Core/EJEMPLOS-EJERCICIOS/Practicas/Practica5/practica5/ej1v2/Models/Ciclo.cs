using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ej1v2.Models
{
    [Table("Ciclos")]
    public class Ciclo
    {
        [Key]
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("Id")]
        public int IdCiclo { get; set; }

        [Column("siglas")]
        [Required]
        [MaxLength(10)]
        public string Siglas { get; set; }

        [Column("nombre")]
        [Required]
        [MaxLength(80)]
        public string Nombre { get; set; }

        [Column("curso")]
        [Required]
        public int Num_Curso { get; set; }

    }
}
