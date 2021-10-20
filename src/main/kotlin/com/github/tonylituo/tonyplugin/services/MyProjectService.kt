package com.github.tonylituo.tonyplugin.services

import com.intellij.openapi.project.Project
import com.github.tonylituo.tonyplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
