using Microsoft.EntityFrameworkCore;
using Practica6.Data;
using Practica6.Interfaces;
using Practica6.Models;

namespace Practica6.Repositories
{
    public class RepositoryJobOffers : IRepositoryJobOffers
    {
        private BolsaTrabajoContext _context;

        public RepositoryJobOffers(BolsaTrabajoContext context)
        {
            _context = context;
        }
        public List<JobOffer> GetJobOffersByCategory(int IdCategory)
        {
            return _context.JobOffers.Where(j => j.CategoryId == IdCategory).ToList();
        }
        public int GetCategoryIdByJobOffer(int jobOfferId)
        {
            return _context.JobOffers
                           .Where(j => j.IdJobOffer == jobOfferId)
                           .Select(j => j.CategoryId)
                           .FirstOrDefault();
        }

        public JobOffer GetOferta(int jobOfferId)
        {
            return _context.JobOffers.FirstOrDefault<JobOffer>(j => j.IdJobOffer == jobOfferId);
        }

        public async Task DeleteOferta(int id)
        {
            var j = this._context.JobOffers.FirstOrDefault<JobOffer>(j => j.IdJobOffer == id);
            this._context.JobOffers.Remove(j);
            await this._context.SaveChangesAsync();
        }

        public async Task AddOferta(JobOffer jobOffer)
        {
            _context.JobOffers.Add(jobOffer);
            await _context.SaveChangesAsync();
        }

    }
}
