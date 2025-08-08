using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ej1v2.Models
{
    [Table("Alumnos")]
    public class Alumno
    {

        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("Id")]
        public int IdAlumno { get; set; }

        [Key]
        [Required]
        [Column("DNI")]
        [MaxLength(9)]
        public required string DNI { get; set; } //si queremos quitar el warning ponemos required

        [Required]
        [MaxLength(80)]
        [Column("nombre")]
        public string Nombre { get; set; }


        [Required]
        [MaxLength(10)]
        [Column("ciclo")]

        public string CicloAlumno { get; set; }

        [Required]
        [Column("curso")]
        public int CursoAlumno { get; set; }

        [Required]
        [MaxLength(80)]
        [Column("apellidos")]
        public string Apellidos { get; set; }

        [Required]
        [Column("telefono")]
        [MaxLength(9)]
        public required string Telefono { get; set; }

        [Required]
        [Column("edad")]
        [MaxLength(9)]
        public required int edad { get; set; }
    }
}
