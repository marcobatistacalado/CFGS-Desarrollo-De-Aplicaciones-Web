using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ej2.Exceptions
{
    public class ExceptionDatoErroneo : Exception
    {
        public ExceptionDatoErroneo(string? message) : base(message)
        {
        }
    }
}
