using Microsoft.VisualStudio.TestTools.UnitTesting;
using Notas;
using System;
using System.Configuration;

namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void CalculatesHighestGrade()
        {
            GradeBook book = new GradeBook();
            book.AddGrade(90f);
            book.AddGrade(50f);

            GradeStatistics stats = book.ComputeStatistics();
            Assert.AreEqual(90f, stats.HighestGrade);
        }

        [TestMethod]
        public void PassByValue()
        {
            GradeBook book = new GradeBook();
            book.Name= "Not Set";
            SetName(book);
            Assert.AreEqual("", book.Name);
        }

        private void SetName(GradeBook book)
        {
            book.Name = "Name set";
        }
    }
}
