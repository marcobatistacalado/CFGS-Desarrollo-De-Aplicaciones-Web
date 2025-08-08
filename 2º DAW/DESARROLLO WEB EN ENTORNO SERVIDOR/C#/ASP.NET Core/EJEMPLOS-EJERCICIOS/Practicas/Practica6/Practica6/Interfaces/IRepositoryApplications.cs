using Practica6.Models;
namespace Practica6.Interfaces
{
    public interface IRepositoryApplications
        
    {
        public Task AddAplicattion(Application a);
        public bool ExistsApplication(int userId, int jobOfferId);
        public List<Application> GetAlumnosApplication(int jobOfferId);
    }
}
