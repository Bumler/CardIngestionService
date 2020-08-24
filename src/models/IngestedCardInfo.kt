package models

import models.itemSubClasses.ImageURIs

/*
This is separate from the Card table class so that any GSON specific massaging is kept in the scope of this service
It also means we don't have to worry about fields like price in Card effecting our deserialization.
 */
data class IngestedCardInfo(
    val ingestorId: String,
    val manaCost: String,
    val loyalty: String,
    val name: String,
    val power: String,
    val toughness: String,
    val oracleText: String,
    val typeLine: String,
    val setName: String,
    val imageURIs: ImageURIs
)