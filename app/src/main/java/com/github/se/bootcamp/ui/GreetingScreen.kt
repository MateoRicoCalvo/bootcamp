package com.github.se.bootcamp.ui
/*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import com.github.se.bootcamp.ui.theme.BootcampTheme

object GreetingScreenTestTags {
  const val NAME_INPUT = "GreetingScreenNameInput"
  const val BUTTON = "GreetingScreenButton"
  const val GREETING_MESSAGE = "GreetingScreenGreetingMessage"
}

/**
 * GreetingScreen composable that displays a text field to input a name, a button to validate the
 * name and a greeting message.
 */
@Composable
fun GreetingScreen() {
  Text("Implement the GreetingScreen composable!", modifier = Modifier.testTag("ExampleTestTag"))
}

// Switch to the `Split` view to see the preview alongside the code.
@Preview
@Composable
fun GreetingScreenPreview() {
  BootcampTheme { GreetingScreen() }
}
*/
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview

fun GreetingScreen() {
    var name by remember { mutableStateOf("") }
    var greetingMessage by remember { mutableStateOf("What's your name ?") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .testTag(GreetingScreenTestTags.NAME_INPUT)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                greetingMessage = if (name.isNotBlank()) "Hi, $name" else "What's your name ?"
            },
            modifier = Modifier
                .fillMaxWidth()
                .testTag(GreetingScreenTestTags.BUTTON)
        ) {
            Text("Greet")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = greetingMessage,
            modifier = Modifier.testTag(GreetingScreenTestTags.GREETING_MESSAGE)
        )
    }
}