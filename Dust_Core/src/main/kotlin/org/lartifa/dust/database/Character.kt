package org.lartifa.dust.database

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table
import org.lartifa.dust.database.Character.primaryKey

/**
 * 角色表
 *
 * Author: sinar
 * 2020/8/16 16:44
 */
@Suppress("MemberVisibilityCanBePrivate", "unused")
object Character: Table() {
    /**
     * Returns the primary key of the table if present, `null` otherwise.
     *
     * Currently, it is initialized with existing keys defined by [Column.primaryKey] function for a backward compatibility,
     * but you have to define it explicitly by overriding that val instead.
     */
    override val primaryKey: PrimaryKey
        get() = PrimaryKey(id)

    val id = integer("id").autoIncrement().uniqueIndex()
    val name = text("name").uniqueIndex()
    val codeName = text("code_name").uniqueIndex()
    val pro = integer("pro")
    val hp = integer("hp").default(6)
    val mp = integer("mp").default(10)
    val gender = integer("gender")
    val tags = text("tags")
    val info = text("info")
    val detail = text("detail")
    val camp = integer("camp")
    val objectKey = text("object_key")
}
