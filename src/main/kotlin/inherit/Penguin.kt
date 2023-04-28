package inherit

class Penguin(
    species: String,
    private val wingCount: Int
) : Animal(species, 2), Swimmable, Flyable {
    override fun move() {
        print("펭귄이 날아요~")
    }

    // override하기 위해서는 Animal에서 open 키워드가 필요
    override val legCount: Int
     get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }
}