using Microsoft.EntityFrameworkCore;
using Practica6.Models;

namespace Practica6.Interfaces
{
    public interface IRepositoryCategorias
    {
        public List<Category> GetCategories();
    }

}
