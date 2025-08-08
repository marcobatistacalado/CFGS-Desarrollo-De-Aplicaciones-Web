using ej1.Models;
using ej1.Repository;
using Microsoft.AspNetCore.Mvc;

namespace ej1.Controllers
{
    public class CiclosController : Controller
    {
        private readonly RepositoryCiclos data;
        public CiclosController(RepositoryCiclos r)
        {
            this.data = r;
        }
        
    }
}
