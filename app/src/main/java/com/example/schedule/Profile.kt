package com.example.schedule
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek

data class Profile (private val name: String, private var salaryMonth: Double, private var posts: MutableList<Post>, private var baseSalary: Int){
    public fun getName(): String {return name}
    public fun getSalary(): Double {return salaryMonth}
    public fun getPosts(): MutableList<Post> {return posts}

    private fun setMonthlySalary(salary: Double){ this.salaryMonth = salary}


    //adding new post
    public fun addPost(post: Post){
        posts.add(post)
    }
    //calculating monthly salary
    @RequiresApi(Build.VERSION_CODES.O)
    public fun calcSalary(){
        var salary = 0.0
        var bonus = 1.0
        for (post in posts){
            if(post.getDay().dayOfWeek == DayOfWeek.SUNDAY)
                bonus = 1.3 // if the day is sunday the bonus 1.3

            val workinghours =
                post.calcWorkingHrs()?.let { post.durationToNumber(it) }  // calculate the working hrs
            //calc working hours from 60 to 10

            //how much is after 6:00 pm?
            var after6pm = (post.getEnd().hour + post.getEnd().minute/60) - 6

            //calc the daily salary
        }
        setMonthlySalary(salary)
    }

}