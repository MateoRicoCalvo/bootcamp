package com.github.se.bootcamp.ui

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
