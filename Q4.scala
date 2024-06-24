object Q4 {
    def calculate(price2 : Array[Int] ): Unit = {

    val attendance=Array(0,0,0,0,0,0,0,0)
    val salary=Array(0,0,0,0,0,0,0,0)

    for(i<-price2.indices){
        attendance(i)=120 + (15-price2(i))/5*20
    }


    val attend=500
    for(i<-attendance.indices){
        salary(i)= attendance(i)*price2(i)-500-3*attendance(i)
    }
    
    display(salary,attendance,price2)

    }

  
    def display(salary: Array[Int] , attendance: Array[Int] , price2: Array[Int]) : Unit = {
    var max=salary(0);
    var k=0;
    for(i<- salary.indices){
        if(salary(i)>=max){
            max=salary(i)
            k=i;
        }
      }

    println("the higher profit is: " + max + " if attende " + attendance(k) + " and ticket price is " + price2(k) )

    }

  def main(args: Array[String]): Unit = {

    val price=Array(5,10,15,20,25,30,35,40)
    calculate(price)
  }
  
}
