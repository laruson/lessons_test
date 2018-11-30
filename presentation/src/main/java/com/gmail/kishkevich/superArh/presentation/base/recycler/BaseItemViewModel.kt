package com.gmail.kishkevich.superArh.presentation.base.recycler

abstract class BaseItemViewModel<Entity> {

    abstract fun bindItem(entity: Entity, position:Int)

    open fun onItemClick(){
    }


}