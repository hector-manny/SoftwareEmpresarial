using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Persona.Models
{
    public class Persona
    {
        public int DUI { get; set; }
        public string Nombre { get; set; }
        public string Apellido { get; set; }
        public int FechadeNacimiento { get; set; }
        public string Direccion { get; set; }
        public string CorreoElectronico { get; set; }

    }
}