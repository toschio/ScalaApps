object Codex {
   def main(args: Array[String]){
   val x = List(1,2,2,3,4,5)
   for(i <- x){
   val n = x.indexOf(i) 
   if(i == x(n)){
   print("element is same")}
   }
   }
  }