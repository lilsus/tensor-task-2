package ru.tensor.task3

class File(
    name: String,
    val extension: String
) : AbstractFileSystemNode(name) {
    override val name: String
        get() = "${super.name}.$extension"
}