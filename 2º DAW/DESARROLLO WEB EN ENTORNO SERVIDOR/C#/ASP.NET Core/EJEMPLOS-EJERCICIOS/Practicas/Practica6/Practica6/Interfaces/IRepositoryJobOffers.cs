using Microsoft.EntityFrameworkCore;
using Practica6.Models;

namespace Practica6.Interfaces
{
    public interface IRepositoryJobOffers
    {
        public List<JobOffer> GetJobOffersByCategory(int IdCategory);
        public int GetCategoryIdByJobOffer(int jobOfferId);

        public JobOffer GetOferta(int jobOfferId);
        public Task DeleteOferta(int id);
        public Task AddOferta(JobOffer jobOffer);

    }
}
