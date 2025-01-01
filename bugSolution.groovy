```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (element == "stop") {
      return false //Returning false from eachWithIndex stops the iteration
    }
  }
  println "This will execute only if 'stop' is not encountered"
}

myMethod(['a', 'b', 'stop', 'c'])

//Alternative solution using find

def myMethod2(List<String> list){
  list.find{it == "stop"}
  println "This will execute only if 'stop' is not encountered"
}
myMethod2(['a','b','c'])
```