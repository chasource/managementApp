package com.example.managementapp.data

import androidx.room.DAO
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao{
    // simpan data tugas baru ke DB
    @insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskEntity)

    //Menampilkan data
    @Query(value="Select * From table_tasks" + "ORDER BY id DESC")
    fun getAllTask(): Flow<List<TaskEntity>>

    //Update data
    @Update
    suspend fun updateTask(task: TaskEntity)

    //hapus data
    @Delete
    suspend fun deleteTask(task: TaskEntity)
}



class TaskDAO {
}