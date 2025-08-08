using Practica6.Data;
using Practica6.Interfaces;
using Practica6.Models;

namespace Practica6.Repositories
{
    public class RepositoryAplicattions : IRepositoryApplications
    {
        private BolsaTrabajoContext _context;

        public RepositoryAplicattions(BolsaTrabajoContext context)
        {
            _context = context;
        }

        public async Task AddAplicattion(Application a)
        {
            this._context.Applications.Add(a);
            await this._context.SaveChangesAsync();

        }

        public bool ExistsApplication(int userId, int jobOfferId)
        {
            return _context.Applications.Any(a => a.UserId == userId && a.JobOfferId == jobOfferId);
        }

        public List<Application> GetAlumnosApplication(int jobOfferId) { 
            return _context.Applications.Where(a => a.JobOfferId == jobOfferId).ToList();
        }



    }
}
