using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Xml.Serialization;

namespace WindowsFormsApplication1
{
    [Serializable]
    public class Class1  //:ISerializable
    {
        private int private_data;
        public int i;
        [XmlElement]
        public string P1
        {
            get;
            set;
        }
        private int mP2;
        [XmlAttribute]
        public int P2
        {
            get { return P2; }
            set { P2 = value; }
        }



        //public void GetObjectData(SerializationInfo info, StreamingContext context)
        //{
        //    info.AddValue("i", i);

        //}
    }
}
