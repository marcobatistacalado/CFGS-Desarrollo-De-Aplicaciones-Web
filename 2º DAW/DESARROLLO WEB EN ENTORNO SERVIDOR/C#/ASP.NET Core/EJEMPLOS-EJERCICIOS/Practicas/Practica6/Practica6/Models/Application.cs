using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Practica6.Models
{
    [Table("Applications")]
    public class Application
    {
        [Column("Id")]
        [Key]
        [Required]
        public int IdApplication { get; set; }

        [Column("UserId")]
        [Required]
        public int UserId { get; set; }

        [Column("JobOfferId")]
        [Required]
        public int JobOfferId { get; set; }
    }
}
