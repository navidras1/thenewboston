package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import  org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

private  val mock = MockBankDataSource()

class MockBankDataSourceTest{
    @Test
    fun `should provide a collection of banks`(){

        val banks = mock.getBanks()
        Assertions.assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provid some mock data`(){
        val banks = mock.getBanks()
        assertThat(banks).allMatch(){it.accountNumber.isNotBlank()}
    }


}