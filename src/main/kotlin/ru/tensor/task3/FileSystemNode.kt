package ru.tensor.task3

interface FileSystemNode {
    val name: String
    var parent: FileSystemNode?
    val path: String
}