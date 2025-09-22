package com.example.calculatortrial

import android.R.attr.onClick
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.calculatortrial.ui.theme.CalculatorTrialTheme
import com.example.calculatortrial.ui.theme.LightGray
import com.example.calculatortrial.ui.theme.Orange


@Composable
fun Calculator(
    state : CalculatorState,
    buttonSpacing : Dp = 8.dp,
    modifier : Modifier = Modifier,
    onAction : (CalcActions) -> Unit
)
{
    Box(modifier = Modifier)
    {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        )
        {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 30.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            //first row start
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                //button start
                CalculatorButton(
                    "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                        onClick = {
                            onAction(CalcActions.Clear)
                        }
                )
                //button end
                CalculatorButton(
                    "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Delete)
                    }
                )
                //button start
                CalculatorButton(
                    "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalculatorOperations.Divide))
                    }
                )
                //button end
            }
            //first row end

            //second row start
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                //button start
                CalculatorButton(
                    "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(7))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(8))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(9))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalculatorOperations.Multiply))
                    }
                )
                //button end

            }
            //second row end

            //third row start
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                //button start
                CalculatorButton(
                    "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(4))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(5))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(6))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalculatorOperations.Subtract))
                    }
                )
                //button end

            }
            //third row end

            //forth row start
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                //button start
                CalculatorButton(
                    "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(1))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(5))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(3))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalculatorOperations.Add))
                    }
                )
                //button end

            }
            //forth row end

            //fifth row start
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                //button start
                CalculatorButton(
                    "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalcActions.Number(0))
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Decimal)
                    }
                )
                //button end

                //button start
                CalculatorButton(
                    "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Calculate)
                    }
                )
                //button end

            }
            //fifth row end
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CalculatorPreview() {

}