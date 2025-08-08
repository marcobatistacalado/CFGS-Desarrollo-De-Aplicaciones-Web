using Newtonsoft.Json;
using System.Runtime.CompilerServices;

namespace SesiónEjemplo_3.Extensions
{
    public static class SessionExtension
    {

        public static void SetObject(this ISession sesion,string key,Object value)
        {
            string data = JsonConvert.SerializeObject(value);
            sesion.SetString(key, data);
        }

        public static T GetObject<T>(this ISession sesion,string key)
        {
            string data=sesion.GetString(key);
            if (data==null) 
                return default(T);
            return JsonConvert.DeserializeObject<T>(data);

        }
    }
}
