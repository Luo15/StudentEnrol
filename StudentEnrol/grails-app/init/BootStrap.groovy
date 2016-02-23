import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
             def course1= new Course(
                                   title:'Interactive Media with Animation',
                                   department:'Computing',
                                   description:'''Lorem ipsum dolor sit amet, ad sea solum
                                   brute sensibus,te summo senserit vix,mel reque corpora vulputate ei.''',
                                   leader:'Joe Jojo',
                                   code:'IMA101',
                                   startDate:new Date('19/01/2015'),
                                   endDate:new Date('19/01/2020')).save()

             def student1= new Student(
                                   name:'Tom',
                                   studentid:'24038944',
                                   dob:'02/09/1992',
                                   email:'b4038944@my.shu.ac.uk',
                                   username:'b4038944',
                                   password:'ctxdpwnx',
                                   course:'Computing').save()

    }
    def destroy={
    }
}
