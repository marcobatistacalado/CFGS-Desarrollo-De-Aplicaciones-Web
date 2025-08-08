using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2_real.Excepciones
{
    public class ExceptionCajasVacias : Exception
    {
        public ExceptionCajasVacias(string? message) : base(message)
        {
        }
    }
}
