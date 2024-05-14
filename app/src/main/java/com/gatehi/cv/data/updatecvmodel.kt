package com.gatehi.cv.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.gatehi.cv.navigation.ROUTE_LOGIN
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class updateviewmodel(var navController: NavHostController, var context: Context) {
    var authRepository: AuthViewModel
    var progress: ProgressDialog

    init {
        authRepository = AuthViewModel(navController, context)
        if (!authRepository.isLoggedIn()) {
            navController.navigate(ROUTE_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    class Cv(
        val editedFirstName: String,
        val editedLastName: String,
        val editedGitHubHandle: String,
        val editedSlackUsername: String,
        val editedBio: String,
    )

fun updateCv(
    editedFirstName: String,
    editedLastName: String,
    editedGitHubHandle: String,
    editedSlackUsername: String,
    editedBio: String
) {
    var currentUser = FirebaseAuth.getInstance().currentUser
    var userId = currentUser?.uid
    if (userId != null) {
        var cvData = uploadviewmodel.Cv(
            editedFirstName,
            editedLastName,
            editedGitHubHandle,
            editedSlackUsername,
            editedBio
        )
        var cvRef = FirebaseDatabase.getInstance().getReference()
            .child("User/$userId")
        progress.show()
        cvRef.setValue(cvData).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful) {
                Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "ERROR: ${it.exception!!.message}", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
}