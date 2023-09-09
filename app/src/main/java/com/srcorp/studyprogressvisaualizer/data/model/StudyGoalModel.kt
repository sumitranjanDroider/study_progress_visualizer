package com.srcorp.studyprogressvisaualizer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "study_goal_table")
data class StudyGoalModel(
    @PrimaryKey(autoGenerate = true)
    var goalId:Int,
    var goalNo:Int,
    var priority:String,//High Low Medium
    var periodRange:String,
    var subjectName:String
    //var targetDateList: List<SelCalenderRangeModel>
)
