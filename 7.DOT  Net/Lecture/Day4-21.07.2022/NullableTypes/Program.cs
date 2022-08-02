using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NullableTypes
{
    class Program
    {
        static void Main()
        {
            int? i;
            //i = 10;
            i = null;
            //short? sh;
            //decimal? dec;

            int j;
            if (i != null)
                j = (int)i;
            else
                j = 0;

            if (i.HasValue)
                j = i.Value;
            else
                j = 0;

            j = i.GetValueOrDefault();
            j = i.GetValueOrDefault(10);

            j = i ?? 10; //null coalescing operator

            Console.WriteLine(j);
            Console.ReadLine();
        }
    }
}
