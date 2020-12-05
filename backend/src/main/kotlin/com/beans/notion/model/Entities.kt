package com.beans.notion.model

import com.beans.notion.toSlug
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Page(
        var title: String,
        @ManyToOne var author: User,
        var content: String,
        var slug: String = title.toSlug(),
        var createdDate: LocalDateTime = LocalDateTime.now(),
        @Id @GeneratedValue var id: Long? = null
)

@Entity
class User(
        var username: String,
        var firstname: String,
        var lastname: String,
        var description: String? = null,
        @Id @GeneratedValue var id: Long? = null
)