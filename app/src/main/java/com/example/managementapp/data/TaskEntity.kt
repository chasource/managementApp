package com.example.managementapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Memberi tahu Room bahwa class ini adalah ENTITY
@Entity(tableName = "table_tasks")

data class TaskEntity (
    //menambahkan primary key
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,

    //kolom tabel
    val mapel: String,
    val judulTugas: String,
    val deskripsi: String,
    val estTime: Int
)

class TaskEntity {
}