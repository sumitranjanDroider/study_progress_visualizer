package com.srcorp.studyprogressvisaualizer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "subject_topic")
data class SubjectTopicModel(
    var subjectId:Int,
    @PrimaryKey(autoGenerate = true)
    var topicID:Int,
    var topicTitle:String,
    var compleated:Boolean,
    var targetDate:String
)
