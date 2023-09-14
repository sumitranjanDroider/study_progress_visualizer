package com.srcorp.studyprogressvisaualizer.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "topic_resource")
data class TopicResourceModel(
    var topicID:Int,
    @PrimaryKey(autoGenerate = true)
    var topicResourceId:Int,
    var topicResourceTitle:String,
    var topicResourceUrl:String
)
