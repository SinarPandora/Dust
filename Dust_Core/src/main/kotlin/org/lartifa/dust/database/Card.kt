package org.lartifa.dust.database

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.lartifa.dust.database.Card.primaryKey

/**
 * 卡片表
 *
 * Author: sinar
 * 2020/8/16 16:44
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object Card: Table() {
    /**
     * Returns the primary key of the table if present, `null` otherwise.
     *
     * Currently, it is initialized with existing keys defined by [Column.primaryKey] function for a backward compatibility,
     * but you have to define it explicitly by overriding that val instead.
     */
    override val primaryKey: PrimaryKey
        get() = PrimaryKey(id)

    val id = integer("id").autoIncrement().uniqueIndex()
    val name = text("name")
    val tags = text("tags")
    val type = integer("type")
    val info = text("info")
    val detail = text("detail")
    val objectKey = text("object_key")
    val characterId = (integer("character_id") references Character.id)
}
