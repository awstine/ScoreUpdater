package com.example.scoreupdater

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scoreupdater.ui.theme.ScoreUpdaterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoreUpdaterTheme {
                // A surface container using the 'background' color from the theme

                var team1Score by remember { mutableStateOf(0) }
                var team2Score by remember { mutableStateOf(0) }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "Manchester united: $team1Score | Arsenal: $team2Score",
                        //style = MaterialTheme.typography.h4
                    )

                    Button(
                        onClick = { team1Score++ },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Add Score to Team 1")
                    }

                    Button(
                        onClick = { team2Score++ },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Add Score to Team 2")
                    }

                    Button(
                        onClick = { team1Score = 0; team2Score = 0 },
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text("Reset Scores")
                    }
                }
            }
        }
    }
}