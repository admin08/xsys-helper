package com.github.admin08.xsyshelper.services

import com.intellij.openapi.project.Project
import com.github.admin08.xsyshelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
