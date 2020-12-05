package com.beans.notion

/**
 * Converts string to string containing only characters in [a-z], [0-9],
 * and '-'.
 * Can Therefore be used in urls without needing to escape characters.
 */
fun String.toSlug() = toLowerCase()
        .replace("\n", " ")
        .replace("[^a-z\\d\\s]".toRegex(), " ")
        .split(" ")
        .joinToString("-")
        .replace("-+".toRegex(), "-")