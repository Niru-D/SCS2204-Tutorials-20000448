object Q03{

  def toUpper(pattern: String): String = pattern.toUpperCase()
  def toLower(pattern: String): String = pattern.toLowerCase()

  def formatNames(name: String) (f: String=>String) (indexes: Int*): String= {
    if(indexes.isEmpty){
      return f(name)
    }
    var name_string=""
    var index=0
    while(index<name.length()){
      if(indexes.contains(index))
        name_string = name_string+ f (name.charAt(index).toString)
      else
        name_string= name_string + name.charAt(index).toString
      index=index+1
    }
    name_string
  }

  def main(args:Array[String]):Unit ={
    println(formatNames("Benny") (toUpper) ())
    println(formatNames("Niroshan")(toUpper)(0,1))
    println(formatNames("Saman")(toLower)())
    println(formatNames("Kumara")(toUpper)(5))
  }
}


