package com.srcorp.studyprogressvisaualizer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.srcorp.studyprogressvisaualizer.data.model.StudyGoalModel
import java.util.concurrent.Executors

@Database(entities = [StudyGoalModel::class], version = 1, exportSchema = false)
abstract class VisualizerDatabase :RoomDatabase(){
      abstract fun visualizerDao():StudyVisualizerDao

      companion object{
          private var NUMBER_OF_THREADS =4
          val databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS)
          @Volatile
          private var INSTANCE:VisualizerDatabase?=null

          fun getDatabase(context: Context):VisualizerDatabase{
             return INSTANCE?: synchronized(this){
                 val instance = Room.databaseBuilder(
                     context.applicationContext,
                     VisualizerDatabase::class.java,
                     "study_visualizer"
                 ).build()
                 INSTANCE=instance
                 instance
             }
          }
      }
}






















