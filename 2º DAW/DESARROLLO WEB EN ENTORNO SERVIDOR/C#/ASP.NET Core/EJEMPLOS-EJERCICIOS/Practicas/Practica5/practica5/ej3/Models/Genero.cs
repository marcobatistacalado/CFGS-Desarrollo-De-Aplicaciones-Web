using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ej3.Models
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
