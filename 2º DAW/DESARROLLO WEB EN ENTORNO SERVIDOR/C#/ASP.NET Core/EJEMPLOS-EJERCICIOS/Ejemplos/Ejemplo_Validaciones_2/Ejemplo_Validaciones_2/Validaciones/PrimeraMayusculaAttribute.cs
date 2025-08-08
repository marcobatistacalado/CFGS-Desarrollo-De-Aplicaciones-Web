using System.ComponentModel.DataAnnotations;

namespace Ejemplo_Validaciones_2.Validaciones
{
    public class PrimeraMayusculaAttribute: ValidationAttribute
    {
        protected override ValidationResult IsValid(object? value , ValidationContext validationContext)
        {
            if (value == null || string.IsNullOrEmpty(value.ToString()))
                return ValidationResult.Success;

            var primeraLeta=value.ToString()[0].ToString();
            if (primeraLeta != primeraLeta.ToUpper())
                return new ValidationResult("La primera en mayúsculas");
            return ValidationResult.Success;
            
        }
    }
}
