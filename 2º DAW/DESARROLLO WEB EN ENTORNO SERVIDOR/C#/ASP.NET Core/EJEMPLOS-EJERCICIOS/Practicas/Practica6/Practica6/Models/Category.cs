using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Practica6.Models
{
    [Table("Categories")]
    public class Category
    {
        [Column("Id")]
        [Key]
        [Required]
        public int IdCategory { get; set; }

        [Column("Name")]
        [Required]
        public String Name { get; set; }

        [Column("Code")]
        [Required]
        public String Code { get; set; }


    }
}
