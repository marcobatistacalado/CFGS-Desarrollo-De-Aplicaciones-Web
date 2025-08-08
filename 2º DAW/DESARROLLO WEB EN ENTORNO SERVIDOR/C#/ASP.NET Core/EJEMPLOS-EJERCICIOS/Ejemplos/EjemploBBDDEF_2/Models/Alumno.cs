using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EjemploBBDDEF.Models
{
    [Table("Alumnos")]
    public class Alumno
    {

        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("Id")]
        public int IdAlumno { get; set; }

        [Required]
        [MaxLength(80)]
        [Column("nombre")]
        public string Nombre { get; set; }

        [Key]
        [Required]
        [Column("DNI")]
        [MaxLength(9)]
        public string DNI {  get; set; }

        [Required]
        [MaxLength(10)]
        [Column("ciclo")]

        public string CicloAlumno {  get; set; }

        [Required]
        [Column("curso")]
        public int CursoAlumno { get; set; }
    }

}
