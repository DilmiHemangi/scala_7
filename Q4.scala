object Q4 extends App{
    val acc_1=new account(111,15000)
    val acc_2=new account(222,-2500)
    val acc_3=new account(333,45000)
    val acc_4=new account(444,-220)

    var Bank:List[account]=List(acc_1,acc_2,acc_3,acc_4)

    def checkNeg(List:List[account])={
        List.filter(x=>x.Balanace<0)
    }
    println("\nAccounts in negative balances: "+checkNeg(Bank)+"\n")

    SumAccount(Bank)
    Interest(Bank)

    def SumAccount(List:List[account])={
        var sum=List.foldLeft(0.0)((sum,y)=>sum+y.Balanace) 
        println("Sum of all account balances: "+sum+"\n")
    }

    def Interest(List:List[account])={
        List.map(x=>{
            if(x.Balanace>0){
                x.Balanace=x.Balanace+x.Balanace*0.05
                println("Final balance of account "+x.AcNo+"="+(x.Balanace))
            }
            else{
                x.Balanace=x.Balanace+x.Balanace*0.1     
                println("Final balance of account "+x.AcNo+"="+(x.Balanace))           
            }
        })
    }
}

class account(b:Int, c:Double){
    val AcNo:Int=b;
    var Balanace:Double=c

    override def toString ="["+AcNo +":"+ Balanace+"]"

}