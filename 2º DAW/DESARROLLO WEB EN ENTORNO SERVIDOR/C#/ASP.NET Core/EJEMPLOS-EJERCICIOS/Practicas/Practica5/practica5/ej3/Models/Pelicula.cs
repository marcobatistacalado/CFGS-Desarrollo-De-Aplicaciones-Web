using System.ComponentModel.DataAnnotations.Schema;
using System.ComponentModel.DataAnnotations;
using Microsoft.EntityFrameworkCore;

namespace ej3.Models
{
    [Table("Peliculas")]
    public class Pelicula
    {
        [Key]
        [Required]
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        [Column("IdPelicula")]
        public int IdPelicula { get; set; }

        [Column("Titulo")]
        [Required]
        [MaxLength(100)]
        public string Titulo { get; set; }

        [Column("FechaEstreno")]
        [Required]
        public DateTime FechaEstreno { get; set; }

        [Column("Genero")] //CLAVE FORANEA
        [Required]
        public string Genero { get; set; }

        [Column("Precio")]
        [Required]
      
        public double Precio { get; set; }

    }
}
