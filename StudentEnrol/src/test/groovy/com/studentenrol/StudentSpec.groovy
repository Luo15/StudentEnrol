package com.studentenrol

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when:"A Student has name, studentid and email"
        def student=new Student(name:'Jacky',
                                studentid:'b4038932',
                                email:'b4038932@my.shu.ac.uk')

        then:"the to String method will merge them."
        student.toString()=='Jacky,b4038932,b4038932@my.shu.ac.uk'
    }
}
