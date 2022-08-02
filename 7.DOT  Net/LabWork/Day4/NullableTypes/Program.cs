using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NullableTypes
{
    class Program
    {
        static void Main(string[] args)
        {
            int? i;
            i = 10;
           // i = null;

            int j;
            /* if (i != null)
                 j = (int)i;
             else j = 0;*/

            /* if (i.HasValue)
                 j = i.Value;
             else
                 j = 0;*/

            // j = i.GetValueOrDefault(20);

            j = i ?? 30; //null coalescing operator
            Console.WriteLine(j);
            Console.ReadLine();
        }
    }
}
