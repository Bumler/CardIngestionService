package models

data class CardIngestionData(
    val setsToUpdate: Collection<String>,
    val ingestedCardInfo: Collection<IngestedCardInfo>
)