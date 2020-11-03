package com.example.wininventory.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(  tableName = "item")

data class Item( @PrimaryKey(autoGenerate = true) var item_id :Int?,
                 var item_name_ar :String,
                 var item_name_en :String,
                 var item_category :String ,//in documentation Diagram int
                 var item_type_id :ItemTypes,
                 var created_by :String, //in documentation Diagram int
                 var created_date : Date,
                 var updated_date : Date,
                 var updated_by :String  ,//in documentation Diagram int
                 var sync_updated_status :Boolean,
                 var sync_status :Boolean


                 )