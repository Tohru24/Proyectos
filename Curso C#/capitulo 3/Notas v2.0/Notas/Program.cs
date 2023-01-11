using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notas
{
    class Program
    {

       static void GiveBookAName(ref GradeBook book)
        {
            //book = new GradeBook();
            //book.Name = "The New Gradebook";
        }

       static void IncrementNumber(ref int number)
        {
            number = 42;
        }
       static void Main(string[] args)
        {
            //PassByValueAndRef();
            Array();
            Immutable();

          

            //GradeBook book = new GradeBook();
            //book.AddGrade(91f);
            //book.AddGrade(89.1f);
            //book.AddGrade(75f);

            //GradeStatistics stats = book.ComputeStatistics();
            //Console.WriteLine(stats.AverageGrade);
            //Console.WriteLine(stats.LowestGrade);
            //Console.WriteLine(stats.HighestGrade);
        }

        private static void Array()
        {
            float[] grades;
            grades = new float[3];

            AddGrades(grades);

            foreach (float grade in grades)
            {
                Console.WriteLine(grade);
            }
        }

        private static void AddGrades(float[] grades)
        {
            if (grades.Length >= 3)
            {
                grades[0] = 91f;
                grades[1] = 89.1f;
                grades[2] = 75f;
            }
        }

        private static void Immutable()
        {
            string name = " Scott ";
            name = name.Trim();

            DateTime date = new DateTime(2014, 1, 1);
            date = date.AddHours(25);

            Console.WriteLine(date);
            Console.WriteLine(name);
        }

        private static void PassByValueAndRef()
        {
            GradeBook g1 = new GradeBook();
            GradeBook g2 = g1;


            GiveBookAName(ref g2);
            Console.WriteLine(g2.Name);
            Console.WriteLine(g1.Name);
        }
    }
}
