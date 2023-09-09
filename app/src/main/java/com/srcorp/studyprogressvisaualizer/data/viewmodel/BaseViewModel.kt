package com.srcorp.studyprogressvisaualizer.data.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.srcorp.studyprogressvisaualizer.data.MainRepository
import com.srcorp.studyprogressvisaualizer.data.model.StudyGoalModel


class BaseViewModel (application: Application):AndroidViewModel(application) {
    private var repository:MainRepository = MainRepository(application)
    private var getGoals:LiveData<List<StudyGoalModel>> = repository.getAllStudyGoal()

    fun getAllStudyGoals():LiveData<List<StudyGoalModel>>{
        return getGoals
    }
    fun insertGoals(studyGoalModel: StudyGoalModel){
        repository.insertStudyGoals(studyGoalModel)
    }
    fun deleteGoals(studyGoalModel: StudyGoalModel){
        repository.deleteGoal(studyGoalModel)
    }
}