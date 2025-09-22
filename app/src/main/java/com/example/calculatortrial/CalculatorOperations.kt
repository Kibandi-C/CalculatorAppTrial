package com.example.calculatortrial

open class CalculatorOperations (val symbol: String){
    object Add : CalculatorOperations("+")
    object Subtract : CalculatorOperations("-")
    object Multiply : CalculatorOperations("*")
    object Divide : CalculatorOperations("/")
}