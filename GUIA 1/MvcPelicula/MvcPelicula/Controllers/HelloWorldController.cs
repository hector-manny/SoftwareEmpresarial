using System.Web;
using System.Web.Mvc;

namespace MvcPelicula.Controllers
{
    public class HelloWorldController : Controller
    {
        //get:/HelloWorld/ 
        public ActionResult Index()
        {
            return View();
        }
        //GET:/HelloWorld/Welcolme
        public ActionResult Welcome(string nombre, int numVeces = 1)
        {
            ViewBag.Mensaje = "Hola" + nombre;
            ViewBag.NumVeces = numVeces;
            return View();
        }

    } 
}
