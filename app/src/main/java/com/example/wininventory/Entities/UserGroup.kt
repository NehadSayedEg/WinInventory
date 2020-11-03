package com.example.wininventory.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(  tableName = "User_group")
class UserGroup(@PrimaryKey(autoGenerate = true) var usergroup_id :Int?,

                var created_by :String, //in documentation Diagram int
                var created_date : Date,
                var updated_date : Date,
                var updated_by :String , //in documentation Diagram int
                var sync_status : Int,
                var sync_update_status : Int
                ){
}