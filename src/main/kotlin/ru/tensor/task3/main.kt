package ru.tensor.task3

fun main() {
    val text = File("text", "txt")
    val video1 = File("video1", "mp4")
    val video2 = File("video1", "mp4")
    val subfolder1 = Folder("Subfolder1", text)
    val subfolder2 = Folder("Subfolder2", video1, video2)
    val subfolder3 = Folder("Test")
    val root = Folder("Main folder", subfolder1, subfolder2, subfolder3)
    println(root.path)
    println(text.path)
    println(video1.path)
    println(subfolder3.path)
    println(video2.extension)
}