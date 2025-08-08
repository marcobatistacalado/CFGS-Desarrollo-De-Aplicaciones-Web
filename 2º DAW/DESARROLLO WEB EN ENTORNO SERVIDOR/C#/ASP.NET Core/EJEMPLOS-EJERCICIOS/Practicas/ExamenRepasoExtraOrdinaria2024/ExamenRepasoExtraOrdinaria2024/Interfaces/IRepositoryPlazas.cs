using ExamenRepasoExtraOrdinaria2024.Models;

namespace ExamenRepasoExtraOrdinaria2024.Interfaces
{
    public interface IRepositoryPlazas
    {
        Plaza FindPlazaLibre();
        Plaza FindPlazaByMatricula(string matricula);
        void UpdatePlaza(Plaza plaza);
    }
}
