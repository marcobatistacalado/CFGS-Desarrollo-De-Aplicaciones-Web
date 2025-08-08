using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;

namespace ej4.Models
{
    [Table("InfoPeliculas")]
    public class InfoPelicula
    {
        [Key]
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IdInfo")]
        public int IdInfo { get; set; }

        [Required]
        [Column("IdPelicula")]
        public int IdPelicula { get; set; }

        [Column("Director")]
        [Required]
        [MaxLength(100)]
        public string Director { get; set; }

        [Column("Sinopsis")]
        [Required]
        public string Sinopsis { get; set; }

        [Column("ActorPrincipal")]
        [Required]
        [MaxLength(100)]
        public string ActorPrincipal { get; set; }

        [Column("ActrizPrincipal")]
        [Required]
        [MaxLength(100)]
        public string ActrizPrincipal { get; set; }

    }
}
