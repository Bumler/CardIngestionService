package controllers

import cardIngestors.CardIngestor
import libraryWriters.LibraryWriter
import models.SimpleResult
import setEligibility.SetEligibilityDeterminer

interface CardIngestionController{
    val setEligibilityDeterminer: SetEligibilityDeterminer
    val ingestor: CardIngestor
    val libraryWriter: LibraryWriter

    fun ingestCards() : SimpleResult{
        //use the set validator if it's valid keep going
        //else return failure

        //the card ingestion

        return SimpleResult( isSuccess = false )
    }
}