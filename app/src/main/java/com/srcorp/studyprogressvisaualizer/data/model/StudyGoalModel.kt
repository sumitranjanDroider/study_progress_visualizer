package com.srcorp.studyprogressvisaualizer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "study_goal_table")
data class StudyGoalModel(
    @PrimaryKey(autoGenerate = true)
    var studyGoalId:Int,
    var goalNo:Int,
    var priority:String,//Running ,Waiting
    var periodRange:String,
    var routineTiming:String,

)
