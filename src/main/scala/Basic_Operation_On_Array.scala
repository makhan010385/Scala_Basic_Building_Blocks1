import Array._
object Basic_Operation_On_Array {
  def main(args: Array[String]): Unit = {
                                         //  Accessing array elements

//    var Name_Mtech_Stu = Array("Somesh", "Tuusheet", "KAPIL",
//      "PANKAJ KUMAR", "Shubham", "SHAZIA ",
//      "Mahak" )



//    println("second element of an array is: ")
//
//    // Accessing an array element
//    println(Name_Mtech_Stu(1) )

                                          //    Updating an element in array:

//    Name_Mtech_Stu(1)="XYZ"
//    println("After updation array elements are: ")
//
//    for ( m1 <-Name_Mtech_Stu )
//    {
//      println(m1 )
//    }

                                                   //    Adding elements in an array:

//    var Mtech_Stu = new Array[String](4)
//
//    // Adding element in an array
//    Mtech_Stu(0)="Mtech1"
//    Mtech_Stu(1)="Mtech2"
//    Mtech_Stu(2)="Mtech3"
//    Mtech_Stu(3)="Mtech4"
//    println("After adding array elements : ")
//    for ( m1 <-Mtech_Stu )
//    {
//      println(m1 )
//    }
                                                          //    Concatenate Arrays

//    var arr1 = Array(1, 2, 3, 4)
//    var arr2 = Array(5, 6, 7, 8)
//
//    var arr3 = concat( arr1, arr2)
//    for ( x <- arr3 )
//    {
//      println( x )
//    }

                                                  //    Multidimensional Arrays

    val rows = 2
    val cols = 3
    val Mtech_Stu = Array.ofDim[String](rows, cols)
    Mtech_Stu(0)(0) = "Somesh"
    Mtech_Stu(0)(1) = "Tuusheet"
    Mtech_Stu(0)(2) = "KAPIL"
    Mtech_Stu(1)(0) = "PANKAJ KUMAR"
    Mtech_Stu(1)(1) = "Shubham"
    Mtech_Stu(1)(2) = "SHAZIA"

    for
    {
      i <- 0 until rows
      j <- 0 until cols
    }

    // Printing values
      println(s"($i)($j) = ${Mtech_Stu(i)(j)}")
  }



}
