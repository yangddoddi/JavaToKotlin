package various_class

fun handleCountry(country: KotlinEnum) {
    when (country) {
        KotlinEnum.KOREA -> println("한국")
        KotlinEnum.USA -> println("미국")
    }
}

enum class KotlinEnum(
    name: String
) {
    KOREA("한국"),
    USA("미국"),
    JAPAN("일본");

    fun fromName(name: String): KotlinEnum {
        KotlinEnum.values()
            .map { enum -> if (name == enum.name) return enum }

        throw java.lang.IllegalArgumentException()
    }
}