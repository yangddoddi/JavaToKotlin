package operator

data class KotlinMoeny(val amount : Long) {
    operator fun plus(other : KotlinMoeny) : KotlinMoeny {
        return KotlinMoeny(this.amount + other.amount)
    }
}
