```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { element, index ->
    println "Element at index $index: $element"
    if (element == "stop") {
      return // This will only exit the eachWithIndex loop
    }
  }
  println "This will always execute"
}

myMethod(['a', 'b', 'stop', 'c'])
```