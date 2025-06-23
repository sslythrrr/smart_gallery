package com.sslythrrr.galeri.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "detected_texts",
    foreignKeys = [ForeignKey(
        entity = ScannedImage::class,
        parentColumns = ["uri"],
        childColumns = ["uri"],
        onDelete = ForeignKey.CASCADE
    )])
data class DetectedText(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "uri") val uri: String,
    @ColumnInfo(name = "text") val text: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "confidence") val confidence: Float,
    @ColumnInfo(name = "bounding_box") val boundingBox: String?
)
