using System.ComponentModel.DataAnnotations;

namespace Ejemplo_Validaciones_3.Models
{
    public class Data:IValidatableObject
    {
        [Required(ErrorMessage ="El campo {0} es obligatorio")]
        public String Nombre{get;set;}


        [Required(ErrorMessage ="El campo {0} es obligatorio")]
        [Range(18,60,ErrorMessage ="El campo {0} debe estar entre{1} - {2}")]
        public int Edad { get; set; }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        {
            //IEnumerable<ValidationResult> listError = new List<ValidationResult>();
            if (Nombre != null && Nombre.Length > 0)
            {
                string primeraLetra = Nombre[0].ToString();
                if (primeraLetra != primeraLetra.ToUpper())
                    // listError.Append(new ValidationResult("La primera letra en mayúsculas", 
                    //    new[] { nameof(Nombre) }));
                    yield return new ValidationResult("La primera letra en mayúsculas",
                    new[] { nameof(Nombre) });
            }
            //Podría validar más atributos e ir añadiendo los posibles errores.
            //  return listError;
            }
        }
    }
