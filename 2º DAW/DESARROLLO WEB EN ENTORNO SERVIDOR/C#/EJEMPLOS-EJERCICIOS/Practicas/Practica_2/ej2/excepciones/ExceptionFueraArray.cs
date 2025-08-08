using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace ejemploColecciones.excepciones
{
    public class ExceptionFueraArray : Exception
    {
        public ExceptionFueraArray(string? message) : base(message)
        {
        }
    }
}
