package thedarkcolour.hardcoredungeons.block.properties

class HProperties private constructor() : Properties<HProperties>() {
    companion object : Factory<HProperties>() {
        override fun createProperties() = HProperties()
    }

    override fun getFactory() = Companion
}