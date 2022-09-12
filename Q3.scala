import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object Q3 extends App{

    printf("Money for transfer: ")
    val trans=readInt()
   
    val person1=new Account(25000)
    val person2=new Account(10000)

    person1.transfer(person2,trans)
    println("Sender's account balance: "+person1.Balance)
    println("Receiver's account balance: "+person2.Balance)

}

class Account(c:Double){
    var Balance:Double=c;
    override def toString ="["+ Balance+"]"

    def withdraw(transfer_amount:Double)=this.Balance-transfer_amount;
    def deposit(transfer_amount:Double)=this.Balance+transfer_amount;

    def transfer(acnt:Account,trans:Double) ={
        this.Balance = this.withdraw(trans)
        acnt.Balance=acnt.deposit(trans)
    }
}
