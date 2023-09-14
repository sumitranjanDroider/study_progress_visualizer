package com.srcorp.studyprogressvisaualizer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subject_table")
data class SubjectModel(
    var studyGoalId:Int,
    @PrimaryKey(autoGenerate = true)
    var subjectId:Int,
    var subjectName:String
)
