package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.thenewboston.model.Bank

@Repository
class MockBankDataSource : BankDataSource {
//    val banks = listOf(Bank("",1.0, 1))
    override fun getBanks(): Collection<Bank> = listOf(
    Bank("1213",3.14, 5),
    Bank("1010",17.1, 6),
    Bank("1213",18.2, 89),
    Bank("1213",19.3, 12),
    )

}