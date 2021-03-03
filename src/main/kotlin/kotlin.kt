package  ru.netology

fun main() {
    val itemFeeMin = 3_500
    val itemFee = 0.75
    val itemPercent = 100
    val moneyTransfer = 5_000_000
    val fee = moneyTransfer * itemFee / itemPercent
    val amount = fee + moneyTransfer
    val result = if (fee <= itemFeeMin )moneyTransfer + itemFeeMin else amount
    println("amount: $result")

}
