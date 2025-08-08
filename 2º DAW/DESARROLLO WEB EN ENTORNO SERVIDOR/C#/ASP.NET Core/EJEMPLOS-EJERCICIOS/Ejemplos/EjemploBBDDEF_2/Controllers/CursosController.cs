using EjemploBBDDEF.Models;
using EjemploBBDDEF.Repository;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace EjemploBBDDEF.Controllers
{
    public class CursosController : Controller
    {

        private readonly RepositoryCursos dataCursos;
        private readonly RepositoryAlumnos dataAlumnos;
        private readonly RepositoryCiclo dataCiclos;

        public CursosController(RepositoryCursos dataCursos,RepositoryAlumnos dataAlumnos, RepositoryCiclo dataCiclos)
        {
            this.dataCursos = dataCursos;
            this.dataAlumnos = dataAlumnos;
            this.dataCiclos = dataCiclos;
        }




        // GET: CursosController/Details/5
        public ActionResult Details(string siglas)
        {
            CicloDetailView ciclo = new CicloDetailView()
            {
                ciclo = this.dataCiclos.FindCiclo(siglas),
                Cursos = this.dataCursos.getCursosCiclo(siglas),
               
                Alumnos = this.dataAlumnos.getAlumnosCicloByCurso(siglas)
            };          
            return View(ciclo);
        }

       

       
    }
}
