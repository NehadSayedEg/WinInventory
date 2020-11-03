package com.example.wininventory.Entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.util.*



@Entity(  tableName = "itemTypes" , foreignKeys = [ ForeignKey(entity = Item::class,
parentColumns = ["itemType_id"],
childColumns = ["itemType_id"],
onDelete = CASCADE)])


data class ItemTypes(
    @PrimaryKey(autoGenerate = true) var itemType_id :Int?,
    var itemType_name_ar :String,
    var itemType_name_en :String,
    var created_by :String, //in documentation Diagram int
    var created_date : Date,
    var updated_date : Date,
    var updated_by :String  //in documentation Diagram int

) {
}