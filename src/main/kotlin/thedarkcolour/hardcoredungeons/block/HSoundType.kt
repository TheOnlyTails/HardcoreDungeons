package thedarkcolour.hardcoredungeons.block

import net.minecraft.block.SoundType
import net.minecraft.util.SoundEvent
import java.util.function.Supplier

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class HSoundType(
    volumeIn: Float,
    pitchIn: Float,
    private val breakSoundIn: Supplier<SoundEvent>,
    private val stepSoundIn: Supplier<SoundEvent>,
    private val placeSoundIn: Supplier<SoundEvent>,
    private val hitSoundIn: Supplier<SoundEvent>,
    private val fallSoundIn: Supplier<SoundEvent>,
) : SoundType(volumeIn, pitchIn, null, null, null, null, null) {

    override fun getBreakSound() = breakSoundIn.get()

    override fun getStepSound() = stepSoundIn.get()

    override fun getPlaceSound() = placeSoundIn.get()

    override fun getHitSound() = hitSoundIn.get()

    override fun getFallSound() = fallSoundIn.get()
}