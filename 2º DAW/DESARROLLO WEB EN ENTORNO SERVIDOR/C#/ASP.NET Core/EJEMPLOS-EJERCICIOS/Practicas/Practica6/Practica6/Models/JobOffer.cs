using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Practica6.Models
{
    [Table("JobOffers")]
    public class JobOffer
    {
        [Column("Id")]
        [Key]
        [Required]
        public int IdJobOffer { get; set; }

        [Column("Name")]
        [Required]
        public String Name { get; set; }

        [Column("Company")]
        [Required]
        public String Company { get; set; }

        [Column("Description")]
        [Required]
        public String Description { get; set; }

        [Column("CategoryId")]
        [Required]
        public int CategoryId { get; set; }


    }
}
