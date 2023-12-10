
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MoneyTest {
    @Nested
    inner class MultiDollarCurrency {
        val target = Money.dollar(5)

        @Test
        fun `5$掛ける2で$10になる`() {
            target.times(2).amount() shouldBeEqualTo Money.dollar(10).amount()
        }

        @Test
        fun `5$掛ける3で$15になる`() {
            target.times(3).amount() shouldBeEqualTo Money.dollar(15).amount()
        }
    }
    @Test
    fun 異なるインスタンスが等しい場合trueを返す() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertTrue(Money.franc(5).equals(Money.franc(5)))
    }
    @Test
    fun 異なるインスタンスが等しくない場合falseを返す() {
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertFalse(Money.franc(5).equals(Money.franc(6)))
        assertFalse(Money.dollar(5).equals(Money.franc(5)))
    }
    @Nested
    inner class MultiFrancCurrency {
        val target = Franc(5)
        @Test
        fun `5franc掛ける2で10francになる`() {
            target.times(2).amount() shouldBeEqualTo Money.franc(10).amount()
        }
        @Test
        fun `5franc掛ける3で15francになる`() {
            target.times(3).amount() shouldBeEqualTo Money.franc(15).amount()
        }
    }
}