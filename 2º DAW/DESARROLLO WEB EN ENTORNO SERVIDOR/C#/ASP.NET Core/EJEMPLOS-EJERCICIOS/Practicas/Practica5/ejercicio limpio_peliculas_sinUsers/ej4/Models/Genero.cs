using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ej4.Models
{
    [Table("Generos")]
    public class Genero
    {

        [Key]
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("Genero")]
        public string NGenero { get; set; }

    }
}
