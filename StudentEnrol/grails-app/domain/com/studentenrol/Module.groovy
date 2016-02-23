package com.studentenrol

class Module {
              String title
              String code
              String credits
              String lecturer
              String description

    String toString(){

      "$title, $code"      
}

    static constraints = {
              title()
              code()
              credits()
              lecturer()
              description()
              description maxSize:5000
    }
}
