using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace marcoBatista2ev.Models
{
    [Table("Tareas")]
    public class Tarea
    {
        [Column("Id")]
        [Key]
        [Required]
        public int Id { get; set; }


        [Column("email")]
        [Required]
        [EmailAddress]
        public String Email { get; set; }

        [Column("titulo")]
        [Required]
        public String Titulo { get; set; }

        [Column("descripcion")]
        [Required]
        public String Descripcion { get; set; }

        [Column("estado")]
        [Required]
        public String Estado { get; set; }

    }
}
