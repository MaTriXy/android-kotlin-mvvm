package de.sevennerds.trackdefects.data.living_unit

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import de.sevennerds.trackdefects.data.floor.Floor

@Entity(tableName = "living_unit", foreignKeys = [
    (ForeignKey(entity = Floor::class,
            parentColumns = ["id"],
            childColumns = ["floor_id"],
            onDelete = ForeignKey.CASCADE))])
data class LivingUnit(@PrimaryKey(autoGenerate = true) val id: Long,
                      @ColumnInfo(name = "remote_id") val remoteId: Long,
                      @ColumnInfo(name = "floor_id") val floorId: Long,
                      @ColumnInfo(name = "number") val name: Int) {}