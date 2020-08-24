package setEligibility

import kotlin.collections.*

interface SetEligibilityDeterminer {
    fun determineIneligibleSets( overrides: Set<String> ) : Set<String>{
        val ineligibleSets = getPersistedSets();
        return ineligibleSets.filterTo(HashSet()) { !overrides.contains(it) }
    }

    fun getPersistedSets() : Set<String>
}