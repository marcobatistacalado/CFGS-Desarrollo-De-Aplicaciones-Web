using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej1.Exceptions
{
    public class ExceptionValidacionDatos : Exception
    {
        public ExceptionValidacionDatos(string? message) : base(message)
        {
        }
    }
}
