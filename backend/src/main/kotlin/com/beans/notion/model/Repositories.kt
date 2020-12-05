package com.beans.notion.model

import org.springframework.data.repository.CrudRepository

interface PageRepository : CrudRepository<Page, Long> {
    fun findBySlug(slug: String): Iterable<Page>?
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByUsername(username: String): User?
}