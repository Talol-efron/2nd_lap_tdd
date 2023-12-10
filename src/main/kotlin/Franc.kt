class Franc(amount: Int): Money(amount) {
    override fun times(multipiler: Int): Money{
        return Franc(amount * multipiler)
    }
}
