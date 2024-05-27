package com.example.schedule

import android.os.Bundle
import android.widget.AbsListView.RecyclerListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.schedule.ui.theme.ScheduleTheme

class MainActivity : ComponentActivity() {
    private lateinit var profile: Profile //using profile

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {
            ScheduleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileCardNewProfile()

                }
            }
        }
    }
    //my Components
    @Composable
    fun ProfileCardNewProfile(){
        Button(onClick = {
            //new profile window
        }) {
            Text(text = "new Profile")
        }
    }
    @Composable
    fun ProfilesListView(){
        val data = listOf("Item 1", "Item 2", "Item 3") //SQLite query
        LazyColumn {
            items(data.size) {
                index -> ListItem(text = data[index])
            }
        }
    }

    @Composable
    fun ListItem(text: String) {
        Text(text = text)
    }


}
