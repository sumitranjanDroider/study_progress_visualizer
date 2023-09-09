package com.srcorp.studyprogressvisaualizer.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.srcorp.studyprogressvisaualizer.data.model.StudyGoalModel

class MainRepository constructor(private val application: Application) {
    var visualizerDao:StudyVisualizerDao
    var allGoals:LiveData<List<StudyGoalModel>>
    var db:VisualizerDatabase= VisualizerDatabase.getDatabase(application)
    init {
        visualizerDao=db.visualizerDao()
        allGoals=visualizerDao.getAllStudyGoal()
    }
    fun getAllStudyGoal():LiveData<List<StudyGoalModel>>{
        return allGoals
    }
    fun insertStudyGoals(studyGoalModel: StudyGoalModel){
        VisualizerDatabase.databaseWriteExecutor.execute{
            visualizerDao.insert(studyGoalModel)
        }
    }
    fun deleteGoal(studyGoalModel: StudyGoalModel){
        VisualizerDatabase.databaseWriteExecutor.execute {
            visualizerDao.insert(studyGoalModel)
        }
    }
}





















