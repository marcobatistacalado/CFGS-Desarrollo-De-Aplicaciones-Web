

using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EjemploBBDDEF.Models
{
    [Table("Ciclos")]
    public class Ciclo
    {
        
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("Id")]
        public int IdCiclo { get; set; }

        [Column("especialidad")]
        [Required]
        [MaxLength(50)]
        public string? Especialidad { get; set; }
        
        [Key]
        [Column("siglas")]
        [Required]
        [MaxLength(10)]
        public string? Siglas { get; set; }

        [Column("nombre")]
        [Required]
        [MaxLength(80)]
        public string? Nombre { get; set;}
       
        [Column("num_cursos")]
        [Required]
        public int Numero_Cursos { get; set; }

    }
}
