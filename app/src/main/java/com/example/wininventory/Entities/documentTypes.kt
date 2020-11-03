package com.example.wininventory.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.DateTimeException
import java.util.*

@Entity(  tableName = "documentType")
data class documentTypes (@PrimaryKey(autoGenerate = true) var documentType_id :Int?,
                          var documentType_name_ar :String,
                          var documentType_name_en :String,
                          var created_by :String, //in documentation Diagram int
                          var created_date : Date,
                          var updated_date : Date,
                          var updated_by :String  //in documentation Diagram int

                          )


