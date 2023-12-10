abstract class Money(protected val amount: Int) {
    abstract fun times(multiplier: Int): Money
    fun equals(money: Money): Boolean {
        return amount == money.amount && this::class == money::class
    }
    fun amount(): Int{
        return amount
    }
    companion object {
        fun dollar(amount: Int): Money {
            return Dollar(amount)
        }
        fun franc(amount: Int): Money {
            return Franc(amount)
        }
    }
}