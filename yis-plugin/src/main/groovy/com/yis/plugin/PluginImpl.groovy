package com.yis.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project> {

    void apply(Project project) {
        //利用Extension创建e1 e2 闭包，用于接受外部传递的参数值
//        project.extensions.create('e1', Extension1)
//        project.extensions.create('e2', Extension2)
            project.task('testTask') {
                println "Hello gradle plugin"
            }
    }
}