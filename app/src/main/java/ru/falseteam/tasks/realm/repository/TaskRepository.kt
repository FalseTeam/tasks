package ru.falseteam.tasks.realm.repository

import io.realm.Realm
import ru.falseteam.tasks.realm.model.Task
import javax.inject.Inject


class TaskRepository @Inject constructor() {
    fun getAll() = Realm.getDefaultInstance().where(Task::class.java).findAll()
}