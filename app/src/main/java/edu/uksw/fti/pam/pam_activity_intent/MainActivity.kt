package edu.uksw.fti.pam.pam_activity_intent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_intentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity_intentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginForm()
                }
            }
        }
    }
}
internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val LContext = LocalContext.current
    var usernameInput by remember { mutableStateOf(value = "") }
    var passwordInput by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = usernameInput.toString(),
            onValueChange = {usernameInput = it},
            label = { Text(text = "Username")},
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = passwordInput.toString(),
            onValueChange = {passwordInput = it},
            label = { Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            val isAuthtenticated = doAuth(usernameInput, passwordInput)
            if (isAuthtenticated) {
                LContext.startActivity(
                    Intent(LContext, HomeActivity::class.java)
                        .apply {
                            putExtra("username", usernameInput)
                        }
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp)
        )
        {
            Text(text = "Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    PAM_Activity_intentTheme {
        LoginForm()
    }
}