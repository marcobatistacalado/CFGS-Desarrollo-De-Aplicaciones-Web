using marcoBatista2ev.Data;
using marcoBatista2ev.Interfaces;
using marcoBatista2ev.Models;
using Microsoft.EntityFrameworkCore;

namespace marcoBatista2ev.Repositories
{
    public class RepositoryTareas : IRepositoryTareas
    {
        private GestionTareasContext _context;

        public RepositoryTareas(GestionTareasContext context)
        {
            _context = context;
        }

        public List<Tarea> GetTareas(string email)
        {
            return _context.Tareas.Where(t => t.Email == email).ToList();
        }

        public Tarea? GetTareaById(int id) {
            return _context.Tareas.FirstOrDefault(t => t.Id == id);
        }

        public async Task DeleteTarea(int id)
        {
            var tar = this._context.Tareas.FirstOrDefault<Tarea>(t => t.Id == id);
            this._context.Tareas.Remove(tar);
            await this._context.SaveChangesAsync();
        }

        public async Task AddTarea(Tarea t)
        {
            _context.Tareas.Add(t); 
            await this._context.SaveChangesAsync();
        }

        public List<Tarea> GetTareasByEmail(string email) { 
            return this._context.Tareas.Where(t => t.Email == email).ToList();
        }

        public async Task UpdateEstadoTarea(int idt)
        {
            var tarea = this._context.Tareas.Find(idt);
            if (tarea.Estado == "Pendiente")
            {
                tarea.Estado = "En Progreso";
            }
            else if (tarea.Estado == "En Progreso")
            {
                tarea.Estado = "Completada";
            }

            await this._context.SaveChangesAsync();
            
        }

    }
}
