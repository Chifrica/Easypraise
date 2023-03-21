package ble.ble.easypraise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ble.ble.easypraise.ui.theme.EasypraiseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasypraiseTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Welcome()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EasypraiseTheme {
        Main()
    }
}