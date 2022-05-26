package com.github.mlymark.mvparmstemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.mlymark.mvparmstemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
