package ru.tensor.task3

class Folder(
    name: String,
    vararg childs: AbstractFileSystemNode
) : AbstractFileSystemNode(name) {
    val childs: MutableList<AbstractFileSystemNode>

    init {
        this.childs = childs.toMutableList()
        for (child in childs) {
            child.parent = this
        }
    }

    fun addChild(child: AbstractFileSystemNode) {
        childs += child
    }
}