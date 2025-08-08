using Microsoft.AspNetCore.Mvc.RazorPages;

namespace EjercicioTallerServicios.Models { 

public class Dueno : Persona
{
    public Dueno() : base() { } // Llama al constructor de la clase Padre
    public Direccion direccion { get; set; }


    }
}