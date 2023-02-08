package com.study.compose

import com.study.compose.tdd.Money
import org.junit.Test

class CurrencyExampleTest {
//    @Test
//    fun testMultiplication() {
//        val five = Dollor(5)
//        assert(Dollor(10) == five.times(2))
//        five.times(3)
//        assert(Dollor(15) == five.times(3))
//
//        assert(Dollor(5) == Dollor(5))
////        assert(MyTest(5) == MyTest(5))
//    }
//    @Test
//    fun testMultiplicationFranc() {
//        val five = Franc(5)
//        assert(Franc(10) == five.times(2))
//        five.times(3)
//        assert(Franc(15) == five.times(3))
//    }
//
//    @Test
//    fun testBetweenDollorAndFranc() {
////        assert(Franc(5).equals(Dollor(5)))
//    }

    @Test
    fun testMultiplicationByFactory() {
        val five = Money.dollor(5)
        assert(Money.dollor(10) == five.times(2))
//        assert(Money.dollor(10).equals(Money.franc(10)))
    }

    @Test
    fun test9() {
        val five = Money.dollor(5)
        assert(Money.dollor(10) == five * 2)
        assert(Money.franc(10) == Money.franc(5) * 2)
        assert(Money.franc(10) == Money(2, "CHF") * 5)
    }

    @Test
    fun testSimpleAddition() {
        assert(Money.dollor(5) + Money.dollor(5) == Money.dollor(10))
    }
}
// 임시 변수를 없애면, 일련의 오퍼레이션이 아니라 참인 명제에 대한 단언들이므로 우리의 의도를 더 명확하게 이야기해준다.