package ru.tensor.task2

class Card(
    val suit: Suit,
    val rank: Int
) : Comparable<Card> {
    companion object {
        fun compare(card1: Card, card2: Card): Int {
            return card1.compareTo(card2)
        }
    }

    fun fromStandardDeck(): Boolean {
        return (rank in 2..14) || (rank == 15 && (suit == Suit.CLUB || suit == Suit.SPADE))
    }

    fun strongerThan(other: Card): Boolean {
        return suit == other.suit && rank > other.rank
    }

    override fun toString(): String {
        val namedRank = when(rank) {
            11 -> "Jack"
            12 -> "Queen"
            13 -> "King"
            14 -> "Ace"
            15 -> "Joker"
            else -> rank
        }
        return "Suit: $suit Rank: $namedRank"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Card) return false

        return suit == other.suit && rank == other.rank
    }

    override fun hashCode(): Int {
        return 31 * suit.hashCode() + rank
    }

    override fun compareTo(other: Card): Int {
        return if (suit.ordinal != other.suit.ordinal)
            suit.ordinal - other.suit.ordinal
        else
            rank - other.rank
    }
}