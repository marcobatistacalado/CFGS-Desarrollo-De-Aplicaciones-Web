namespace ej3.Models
{ 
    public class Persona
    {
        public string Nombre { get; set; } // Nombre de la persona
        public string Apellidos { get; set; } // Apellidos de la persona
        public int Edad { get; set; } // Edad de la persona
        public string Sexo { get; set; } // Género seleccionado (Masculino, Femenino, Otro)
        public string TemaInteres { get; set; } // Tema de interés seleccionado en el dropdown
        public List<string> Aficiones { get; set; } // Lista de aficiones seleccionadas (checkbox)
    }
}
