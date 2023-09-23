fun main(args: Array<String>) {
    val str = readln();
    var i = 0;
    var count = 0;
    var itogStr = "";
    var currentChar = str[0];
    /*for(item in 1.. str.substring(1).length){
        if(currentChar == str[item]){
            count++;
        }
    }*/

    str.forEach {
        if(it == currentChar)
        {
            count++;
        }else{
            itogStr += currentChar;
            if(count > 1){
                itogStr += count;
            }
            i++;
            currentChar = it;
            count = 1;
        }
    }
    itogStr += currentChar;
    if(count > 1){
        itogStr += count;
    }
    itogStr.forEach { print(it) };

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
