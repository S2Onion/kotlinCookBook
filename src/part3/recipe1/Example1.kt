package part3.recipe1

fun main() {
    val task1 = Task("test task", 0)
    println(task1.priority)

    val task2 = Task("test task")
    task2.priority = 10
    println(task2.priority)
}
