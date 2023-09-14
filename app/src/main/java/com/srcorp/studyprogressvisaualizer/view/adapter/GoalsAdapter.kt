package com.srcorp.studyprogressvisaualizer.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.srcorp.studyprogressvisaualizer.R
import com.srcorp.studyprogressvisaualizer.data.model.StudyGoalModel
import com.srcorp.studyprogressvisaualizer.databinding.GoalsAdapterItemBinding

class GoalsAdapter:RecyclerView.Adapter<GoalsAdapter.GoalViewHolder>() {
    var list= mutableListOf<StudyGoalModel>()
    fun updateGoalsAdapter(list: List<StudyGoalModel>){
        this.list=list.toMutableList()
        notifyDataSetChanged()
    }
    class GoalViewHolder (var binding:GoalsAdapterItemBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
     val binding=DataBindingUtil.inflate<GoalsAdapterItemBinding>(LayoutInflater.from(parent.context),
         R.layout.goals_adapter_item,parent,false)
        return GoalViewHolder(binding)
    }

    override fun getItemCount(): Int {
        list.let {
            return it.size
        }
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        val g=list[holder.adapterPosition]
        holder.binding.apply {

        }
    }
}