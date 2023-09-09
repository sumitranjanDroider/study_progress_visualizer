package com.srcorp.studyprogressvisaualizer.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.srcorp.studyprogressvisaualizer.data.model.StudyGoalModel

@Dao
interface StudyVisualizerDao {
    @Insert
    fun insert(studyGoalModel: StudyGoalModel)

    @Update
    fun updateStudyGoal(studyGoalModel: StudyGoalModel)

    @Delete
    fun deleteStudyGoal(studyGoalModel: StudyGoalModel)
    @Query("select * from study_goal_table")
    fun getAllStudyGoal():LiveData<List<StudyGoalModel>>
}