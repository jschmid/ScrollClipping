package pro.schmid.ScrollClipping

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        // Uncomment this line to see clipping
                        //.verticalScroll(rememberScrollState()),
                ) {
                    MyCard()
                    Spacer(modifier = Modifier.size(10.dp))
                    MyCard()
                    Spacer(modifier = Modifier.size(10.dp))
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard() {
    Card(
        elevation = 8.dp
    ) {
        Text(
            text = "Hello World",
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(20.dp)
        )
    }
}
