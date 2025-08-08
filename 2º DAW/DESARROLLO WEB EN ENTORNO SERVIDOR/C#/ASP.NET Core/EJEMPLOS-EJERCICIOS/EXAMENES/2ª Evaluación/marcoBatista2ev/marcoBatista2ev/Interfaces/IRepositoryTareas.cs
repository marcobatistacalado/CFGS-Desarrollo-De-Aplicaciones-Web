using marcoBatista2ev.Models;

namespace marcoBatista2ev.Interfaces
{
    public interface IRepositoryTareas
    {
        public List<Tarea> GetTareas(string email);
        public Tarea? GetTareaById(int id);
        public Task DeleteTarea(int id);
        public Task AddTarea(Tarea t);

        public List<Tarea> GetTareasByEmail(string email);
        public Task UpdateEstadoTarea(int t);
    }
}
